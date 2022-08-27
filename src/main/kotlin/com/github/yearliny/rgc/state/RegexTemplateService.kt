package com.github.yearliny.rgc.state

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.util.xmlb.XmlSerializerUtil

@State(name = "regexTemplateService")
class RegexTemplateService : PersistentStateComponent<RegexTemplateService> {

    data class State(val regexTemplateList: List<RegexTemplate>)

    var configState: State = State(listOf())



    override fun loadState(state: RegexTemplateService) {
        XmlSerializerUtil.copyBean(state, this);
    }

    override fun getState(): RegexTemplateService {
        return this
    }

}
