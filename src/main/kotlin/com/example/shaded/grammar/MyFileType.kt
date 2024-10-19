package com.example.shaded.grammar

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class MyFileType : LanguageFileType(MyLanguage) {

    companion object {
        val INSTANCE = MyFileType()
    }

    override fun getName(): String {
        return "TARA"
    }

    override fun getDescription(): String {
        return "MyDescription"
    }

    override fun getDefaultExtension(): String {
        return "tara"
    }

    override fun getIcon(): Icon {
        return AllIcons.Hierarchy.Subtypes
    }
}