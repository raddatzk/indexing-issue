package com.example.shaded.grammar

import com.intellij.psi.tree.IElementType

object MyTokenTypes {
    @JvmField
    val EQUALS: IElementType = MyTokenType("=")

    @JvmField
    val ID: IElementType = MyTokenType("ID")

    @JvmField
    val L_CURLY: IElementType = MyTokenType("{")

    @JvmField
    val NUMBER: IElementType = MyTokenType("NUMBER")

    @JvmField
    val R_CURLY: IElementType = MyTokenType("}")
}
