package com.example.shaded.psi.impl

import com.intellij.lang.ASTNode

class MyReferenceLiteral(node: ASTNode) : MyPropertyValue<String>(node) {
    override val value: String
        get() = text
}