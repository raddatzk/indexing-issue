package com.example.shaded.psi.impl

import com.intellij.lang.ASTNode

abstract class MyBlockId<PsiT : MyStubPsiElement<*, *>>(node: ASTNode) : MyPsiElement(node) {

    val value: String
        get() = text
}