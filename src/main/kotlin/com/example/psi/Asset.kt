package com.example.psi

import com.example.shaded.psi.impl.MyIndex
import com.example.shaded.psi.impl.MyStubElementType
import com.example.shaded.psi.impl.MyStubIndexKeys.ASSET_INDEX
import com.example.shaded.psi.impl.asset.AssetPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.stubs.*

class AssetIndex : StringStubIndexExtension<AssetPsiElement>() {
    override fun getKey(): StubIndexKey<String, AssetPsiElement> = ASSET_INDEX

    companion object : MyIndex<AssetPsiElement>(ASSET_INDEX, AssetPsiElement::class)
}

interface AssetStub : StubElement<AssetPsiElement> {
    val name: String
}

class AssetStubImpl(
    parent: StubElement<out PsiElement>,
    elementType: AssetElementType,
    override val name: String,
) : StubBase<AssetPsiElement>(parent, elementType), AssetStub

class AssetElementType : MyStubElementType<AssetStub, AssetPsiElement>("ASSET") {

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<out PsiElement>): AssetStub {
        return AssetStubImpl(parentStub, this, dataStream.readName()!!.string)
    }

    override fun createStub(psi: AssetPsiElement, parentStub: StubElement<*>): AssetStub {
        return AssetStubImpl(parentStub, this, psi.name)
    }

    override fun createElement(node: ASTNode): PsiElement {
        return AssetPsiElement(node)
    }

    override fun createPsi(stub: AssetStub): AssetPsiElement {
        return AssetPsiElement(stub, this)
    }

    override fun indexStub(stub: AssetStub, sink: IndexSink) {
        sink.occurrence(ASSET_INDEX, stub.name)
    }

    override fun serialize(stub: AssetStub, dataStream: StubOutputStream) {
        dataStream.writeName(stub.name)
    }
}