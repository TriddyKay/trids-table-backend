package com.dinner.club.tridstable

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class TridsTableApplication {
	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			SpringApplication.run(TridsTableApplication::class.java, *args)
		}
	}
}
