package com.example.shaded.psi.impl

import com.intellij.openapi.project.Project
import com.intellij.psi.stubs.StubIndex
import com.intellij.psi.stubs.StubIndexKey
import kotlin.reflect.KClass

abstract class MyIndex<PsiT : MyStubPsiElement<*, *>>(private val key: StubIndexKey<String, PsiT>, private val target: KClass<PsiT>) {

    fun getAllKeys(project: Project): Collection<String> {
        return StubIndex.getInstance().getAllKeys(key, project).sortedBy { it.split("-").last().toInt() }
    }

}