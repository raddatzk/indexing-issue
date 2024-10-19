package com.example.shaded.psi

import com.example.shaded.grammar.MyElementTypes
import com.example.shaded.psi.impl.MyBlockName
import com.example.shaded.psi.impl.MyPropertyKey
import com.example.shaded.psi.impl.MyReferenceLiteral
import com.example.shaded.psi.impl.MyStubElementType
import com.example.shaded.psi.impl.asset.AssetIdPsiElement
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement

object PsiFactory {

    fun createElement(node: ASTNode): PsiElement {
        return when (val type = node.elementType) {
            is MyStubElementType<*, *> -> type.createElement(node)

            MyElementTypes.BLOCK_NAME -> MyBlockName(node)

            MyElementTypes.ASSET_ID -> AssetIdPsiElement(node)

            MyElementTypes.PROPERTY_KEY -> MyPropertyKey(node)
            MyElementTypes.REFERENCE_LITERAL -> MyReferenceLiteral(node)

            MyElementTypes.ERROR -> ASTWrapperPsiElement(node)
            else -> ASTWrapperPsiElement(node)
        }
    }
}