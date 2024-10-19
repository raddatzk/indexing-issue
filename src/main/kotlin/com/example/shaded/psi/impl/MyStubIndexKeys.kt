package com.example.shaded.psi.impl

import com.example.shaded.psi.impl.asset.AssetPsiElement
import com.intellij.psi.stubs.StubIndexKey
import com.intellij.psi.stubs.StubIndexKey.createIndexKey

object MyStubIndexKeys {

    val ASSET_INDEX: StubIndexKey<String, AssetPsiElement> = createIndexKey("my.asset.index")
}