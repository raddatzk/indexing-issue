package com.example.shaded.psi.impl

import com.example.shaded.grammar.MyLanguage
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.StubElement

abstract class MyStubElementType<StubT : StubElement<*>, PsiT : PsiElement>(debugName: String) :
    IStubElementType<StubT, PsiT>(debugName, MyLanguage) {

    abstract fun createElement(node: ASTNode): PsiElement

    override fun toString(): String {
        return this::class.java.simpleName
    }

    override fun getExternalId(): String {
        return "my.${super.toString()}"
    }
}