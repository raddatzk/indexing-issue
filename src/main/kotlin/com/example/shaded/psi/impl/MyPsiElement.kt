package com.example.shaded.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode

open class MyPsiElement(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun toString(): String {
        return this.javaClass.simpleName
    }
}
