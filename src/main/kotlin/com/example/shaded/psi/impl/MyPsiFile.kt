package com.example.shaded.psi.impl

import com.example.shaded.grammar.MyFileType
import com.example.shaded.grammar.MyLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.stubs.PsiFileStub
import com.intellij.psi.tree.IStubFileElementType

class MyFileElementType : IStubFileElementType<PsiFileStub<MyPsiFile>>("TaraFile", MyLanguage) {
    override fun getExternalId(): String {
        return "tara.FILE"
    }
}

class MyPsiFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, MyLanguage), NavigatablePsiElement {

    override fun getFileType(): FileType {
        return MyFileType.INSTANCE
    }

    override fun toString(): String {
        return "TARA file: $name"
    }
}

