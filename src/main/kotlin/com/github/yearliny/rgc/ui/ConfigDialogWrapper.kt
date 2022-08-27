package com.github.yearliny.rgc.ui

import com.github.yearliny.rgc.state.RegexTemplate
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.components.JBList
import com.intellij.ui.components.JBTabbedPane
import com.intellij.ui.dsl.builder.panel
import com.intellij.ui.table.JBTable
import com.intellij.util.ui.components.BorderLayoutPanel
import javax.swing.JComponent
import javax.swing.JPanel

@Suppress("UnstableApiUsage")
class ConfigDialogWrapper() : DialogWrapper(true) {

    init {
        title = "Regex Generate Code Config"
        init()
    }


    override fun createCenterPanel(): JComponent {
        val windowPanel = JPanel()

        JBTable()
        val listCell = JBList<RegexTemplate>(RegexTemplate("regex", "template"), RegexTemplate("regex2", "template2"))
        windowPanel.add(listCell, BorderLayoutPanel.CENTER_ALIGNMENT)

        val subPanel = JBTabbedPane()
        subPanel.add(panel {
            row("编辑21212") {
                text("编辑页面000")
            }
        })
        subPanel.add(panel {
            row("预览") {
                text("预览页面111")
            }
        })
        windowPanel.add(subPanel, BorderLayoutPanel.CENTER_ALIGNMENT)
        return windowPanel
    }
}
