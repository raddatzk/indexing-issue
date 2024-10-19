package com.example.shaded.psi.impl

import com.intellij.extapi.psi.StubBasedPsiElementBase
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.StubBasedPsiElement
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.StubElement

abstract class MyStubPsiElement<StubT : StubElement<*>, PsiT : PsiElement> : StubBasedPsiElementBase<StubT>,
    StubBasedPsiElement<StubT> {

    constructor(stub: StubT, type: IStubElementType<StubT, PsiT>) : super(stub, type)

    constructor(node: ASTNode) : super(node)

    override fun toString(): String {
        return this.javaClass.simpleName
    }

    abstract val id: String
    abstract val idField: MyBlockId<*>
}
