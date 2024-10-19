package com.example.shaded.grammar

import com.example.shaded.grammar.MyElementTypes.BLOCK
import com.example.shaded.grammar.MyElementTypes.BLOCK_NAME
import com.example.shaded.grammar.MyElementTypes.PROPERTY_KEY
import com.example.shaded.grammar.MyElementTypes.REFERENCE_LITERAL
import com.example.shaded.grammar.MyTokenTypes.EQUALS
import com.example.shaded.grammar.MyTokenTypes.ID
import com.example.shaded.grammar.MyTokenTypes.L_CURLY
import com.example.shaded.grammar.MyTokenTypes.R_CURLY
import com.intellij.lang.ASTNode
import com.intellij.lang.LightPsiParser
import com.intellij.lang.PsiBuilder
import com.intellij.lang.PsiParser
import com.intellij.lang.parser.GeneratedParserUtilBase.*
import com.intellij.psi.tree.IElementType

class MyLookup {
    private val stack = mutableListOf<String>()

    fun enter(key: String) {
        stack.add(key)
    }

    fun exit() {
        stack.removeLast()
    }

    fun getKeywordAndType(marker: PsiBuilder.Marker): Pair<String, IElementType> {
        val key = marker.toString().removeSuffix("\u2026").trim()
        return key to getType(key)
    }

    fun getType(marker: PsiBuilder.Marker): IElementType {
        val key = marker.toString().removeSuffix("\u2026").trim()
        return getType(key)
    }

    fun getType(key: String): IElementType {
        val lookup = mutableListOf<String>()
        lookup.addAll(this.stack)
        lookup.add(key)
        return getType(lookup)
    }

    private fun getType(lookup: MutableList<String>): IElementType {
        val lookupString = lookup.joinToString(".")
        return when (lookupString) {
            "asset" -> MyElementTypes.ASSET
            "asset.blockId" -> MyElementTypes.ASSET_ID

            else -> MyElementTypes.ERROR
        }
    }
}

class MyParser : PsiParser, LightPsiParser {
    private val lookup = MyLookup()

    override fun parse(t: IElementType, b: PsiBuilder): ASTNode {
        parseLight(t, b)
        return b.treeBuilt
    }

    override fun parseLight(t: IElementType, b: PsiBuilder) {
        val b = adapt_builder_(t, b, this, arrayOf())
        val m = enter_section_(b, 0, _COLLAPSE_, null)
        val r = parseRoot(b, 0)
        exit_section_(b, 0, m, t, r, true, TRUE_CONDITION)
    }

    private fun parseRoot(b: PsiBuilder?, l: Int): Boolean {
        return root(b, l + 1)
    }

    /* ********************************************************** */ // root_element*
    private fun root(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "root")) return false
        while (true) {
            val c = current_position_(b)
            if (!rootElement(b, l + 1)) break
            if (!empty_element_parsed_guard_(b, "root", c)) break
        }
        return true
    }

    /* ********************************************************** */ // block_outer | property_outer
    private fun rootElement(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "rootElement")) return false
        var r: Boolean
        r = blockOuter(b, l + 1)
        if (!r) r = propertyOuter(b, l + 1)
        return r
    }

    /* ********************************************************** */ // block_name block_id? block
    private fun blockOuter(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "blockOuter")) return false
        val m = enter_section_(b)
        var r = blockName(b, l + 1)
        val (key, elementType) = lookup.getKeywordAndType(m)
        try {
            lookup.enter(key)
            blockId(b, l + 1)
            r = r && block(b, l + 3)
        } finally {
            lookup.exit()
        }
        exit_section_(b, m, elementType, r)
        return r
    }

    /* ********************************************************** */ // identifier
    private fun blockName(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "blockName")) return false
        return identifier(b, l + 1, BLOCK_NAME)
    }

    /* ********************************************************** */ // string_literal
    private fun blockId(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "blockId")) return false
        val type = lookup.getType("blockId")
        val r = identifier(b, l + 1, type)
        return r
    }

    /* ********************************************************** */ // '{' object_element* '}'
    private fun block(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "block")) return false
        if (!nextTokenIs(b, L_CURLY)) return false
        val p: Boolean
        val m = enter_section_(b, l, _NONE_, BLOCK, null)
        var r = consumeToken(b, L_CURLY)
        p = r
        r = r && report_error_(b, blockInner(b, l + 1))
        r = p && consumeToken(b, R_CURLY) && r
        exit_section_(b, l, m, r, p, null)
        return r || p
    }

    // object_element*
    private fun blockInner(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "blockInner")) return false
        while (true) {
            val c = current_position_(b)
            if (!objectElement(b, l + 1)) break
            if (!empty_element_parsed_guard_(b, "blockInner", c)) break
        }
        return true
    }

    /* ********************************************************** */ // (block_outer | property_outer)
    private fun objectElement(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "objectElement")) return false
        var r = blockOuter(b, l + 1)
        if (!r) r = propertyOuter(b, l + 1)
        return r
    }

    /* ********************************************************** */ // property_name '=' property
    private fun propertyOuter(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "propertyOuter")) return false
        val m = enter_section_(b)
        var r = propertyName(b, l + 1)
        val elementType = lookup.getType(m)

        r = r && property(b, l + 1, elementType)
        exit_section_(b, m, null, r)
        return r
    }

    private fun property(b: PsiBuilder?, l: Int, elementType: IElementType): Boolean {
        if (!recursion_guard_(b, l, "property")) return false
        if (!nextTokenIs(b, "<property>", EQUALS)) return false
        val m = enter_section_(b, l, _LEFT_, elementType, "<property>")
        var r: Boolean = assignment(b, l + 1)
        val p = r
        r = r && propertyValue(b, l + 1)
        exit_section_(b, l, m, elementType, r, p, null)
        return r || p
    }

    /* ********************************************************** */ // identifier
    private fun propertyName(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "propertyName")) return false
        return identifier(b, l + 1, PROPERTY_KEY)
    }

    // '='
    private fun assignment(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "assignment")) return false
        if (!nextTokenIs(b, "<property>", EQUALS)) return false
        return consumeToken(b, EQUALS)
    }

    /* ********************************************************** */ // Expression
    private fun propertyValue(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "propertyValue")) return false
        var r: Boolean
        val m = enter_section_(b, l, _COLLAPSE_, "<literal>")
        r = referenceLiteral(b, l + 1)
        exit_section_(b, l, m, r, false, null)
        return r
    }

    /* ********************************************************** */ // REFERENCE
    private fun referenceLiteral(b: PsiBuilder?, l: Int): Boolean {
        if (!recursion_guard_(b, l, "referenceLiteral")) return false
        if (!nextTokenIs(b, "<identifier>", ID)) return false
        val m = enter_section_(b, l, _NONE_, "<identifier>")
        val r = consumeToken(b, ID)
        exit_section_(b, l, m, REFERENCE_LITERAL, r, false, null)
        return r
    }

    /* ********************************************************** */ // ID
    private fun identifier(b: PsiBuilder?, l: Int, identifierType: IElementType): Boolean {
        if (!recursion_guard_(b, l, "identifier")) return false
        if (!nextTokenIs(b, "<identifier>", ID)) return false
        val m = enter_section_(b, l, _NONE_, "<identifier>")
        val r = consumeToken(b, ID)
        exit_section_(b, l, m, identifierType, r, false, null)
        return r
    }
}
