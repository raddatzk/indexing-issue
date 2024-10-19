package com.example.shaded.psi.impl.asset

import com.example.psi.AssetElementType
import com.example.psi.AssetStub
import com.example.shaded.psi.impl.MyStubPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.util.PsiTreeUtil

class AssetPsiElement : MyStubPsiElement<AssetStub, AssetPsiElement> {

    constructor(stub: AssetStub, type: AssetElementType) : super(stub, type)

    constructor(node: ASTNode) : super(node)

    override fun getName(): String {
        return stub?.name ?: id
    }

    override val id: String
        get() = idField.value

    override val idField: AssetIdPsiElement
        get() = PsiTreeUtil.findChildOfType(this, AssetIdPsiElement::class.java)!!
}