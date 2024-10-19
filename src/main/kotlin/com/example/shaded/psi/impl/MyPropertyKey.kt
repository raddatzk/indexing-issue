package com.example.shaded.psi.impl

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement

class MyPropertyKey(node: ASTNode) : MyPsiElement(node), PsiNamedElement {
    override fun setName(name: String): PsiElement = this
}

abstract class MyPropertyValue<T>(node: ASTNode) : MyPsiElement(node) {
    abstract val value: T
}