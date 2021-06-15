package com.ketelsen.jenkinsdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JenkinsdemoApplication

fun main(args: Array<String>) {
	runApplication<JenkinsdemoApplication>(*args)
}
