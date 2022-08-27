package com.github.yearliny.rgc.action


import com.github.yearliny.rgc.ui.ConfigDialogWrapper
import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.ui.GotItMessage
import com.intellij.ui.components.JBTabbedPane

class ConfigDialogAction : AnAction() {


    override fun actionPerformed(e: AnActionEvent) {
        val message = GotItMessage.createMessage("Title test", "Message test")
        val notification = Notification("Database", "Hello world!", NotificationType.INFORMATION)
        Notifications.Bus.notify(notification)

        ConfigDialogWrapper().showAndGet()
    }

}
