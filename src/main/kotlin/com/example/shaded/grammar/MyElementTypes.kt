package com.example.shaded.grammar

import com.example.psi.AssetElementType

object MyElementTypes {

    val ERROR: MyElementType = MyElementType("ERROR")

    val ASSET: AssetElementType = MyStubElementTypes.ASSET
    val ASSET_ID: MyElementType = MyElementType("ASSET ID")

    val BLOCK_NAME = MyElementType("BLOCK NAME")
    val BLOCK = MyElementType("BLOCK")

    val PROPERTY_KEY = MyElementType("PROPERTY KEY")
    val REFERENCE_LITERAL = MyElementType("REFERENCE LITERAL")
}