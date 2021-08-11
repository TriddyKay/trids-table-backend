package com.dinner.club.tridstable.resource

import com.dinner.club.tridstable.service.EchoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("trial")
class EchoResource(
  private val echoService: EchoService
) {

  @GetMapping("/new-area-of-url")
  fun echo(): String {
    return echoService.echo()
  }
}



