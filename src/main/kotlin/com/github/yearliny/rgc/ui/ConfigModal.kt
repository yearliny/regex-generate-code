package com.github.yearliny.rgc.ui

import com.intellij.openapi.ui.DialogPanel
import com.intellij.ui.dsl.builder.RowLayout
import com.intellij.ui.dsl.builder.panel


fun configPanel(): DialogPanel {
    return panel {

        collapsibleGroup("Panel.collapsibleGroup") {
            row("Panel.collapsibleGroup row:") {
                textField()
            }.rowComment("Panel.collapsibleGroup adds collapsible panel with independent grid, title and some vertical " +
                    "space before/after the group")
        }

        row("Row4:") {
            textField()
            label("Rows 3 and 4 are in common parent grid")
        }.layout(RowLayout.PARENT_GRID)
    }
}
