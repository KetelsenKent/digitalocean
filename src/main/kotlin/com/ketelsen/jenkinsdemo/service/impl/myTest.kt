package com.ketelsen.jenkinsdemo.service.impl

import java.io.File

class myTest {
    fun runThis() {
        var newFile = File("auth/debug-service-account.json")
        println(newFile.absolutePath)
        println(newFile.isFile)
    }
}