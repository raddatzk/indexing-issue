package com.example.shaded.grammar

import com.intellij.psi.tree.IElementType

class MyTokenType(debugName: String) : IElementType(debugName, MyLanguage)

open class MyElementType(debugName: String) : IElementType(debugName, MyLanguage)
