// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.example.shaded.grammar

import com.example.shaded.psi.PsiFactory
import com.example.shaded.psi.impl.MyFileElementType
import com.example.shaded.psi.impl.MyPsiFile
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

internal fun createLexer(): MyLexer {
    return MyLexer()
}

class MyParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): MyLexer {
        return createLexer()
    }

    override fun createParser(project: Project): PsiParser {
        return MyParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getCommentTokens(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createElement(node: ASTNode): PsiElement = PsiFactory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return MyPsiFile(viewProvider)
    }

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

    companion object {
        val FILE: IFileElementType = MyFileElementType()
    }
}
