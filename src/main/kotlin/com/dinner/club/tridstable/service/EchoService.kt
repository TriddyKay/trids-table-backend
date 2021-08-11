package com.dinner.club.tridstable.service

import com.dinner.club.tridstable.dao.EchoDAO
import org.springframework.stereotype.Service

@Service
class EchoService(
  private val echoDAO: EchoDAO
) {
  fun echo(): String {
    return echoDAO.echo()
  }
}