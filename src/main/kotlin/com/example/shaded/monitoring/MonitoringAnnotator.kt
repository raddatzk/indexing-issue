package com.example.shaded.monitoring

import com.example.psi.AssetIndex
import com.example.shaded.psi.impl.MyBlockId
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement

class MonitoringAnnotator : Annotator {
    override fun annotate(psi: PsiElement, holder: AnnotationHolder) {
        if (psi is MyBlockId<*>) {
            println(AssetIndex.getAllKeys(psi.project))
        }
    }
}