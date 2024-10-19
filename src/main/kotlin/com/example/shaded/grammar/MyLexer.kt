package com.example.shaded.grammar

import com.intellij.lexer.FlexAdapter

class MyLexer : FlexAdapter(_MyLexer()) {

    companion object {
        private const val JFLEX_STATE_MASK: Int = 0xFF
    }

    override fun getFlex(): _MyLexer {
        return super.getFlex() as _MyLexer
    }

    override fun getState(): Int {
        var state = super.getState()
        assert(state and (JFLEX_STATE_MASK.inv()) == 0) { "State outside JFLEX_STATE_MASK ($JFLEX_STATE_MASK) should not be used by JFLex lexer" }
        state = state and JFLEX_STATE_MASK
        return state
    }
}
