package com.dinner.club.tridstable.domain

data class Restaurant (
  var name: String,
  var location: String,
  var rating: Int
) {
  companion object {
    fun from(name: String, location: String, rating: Int): Restaurant {
      return Restaurant(name, location, rating)
    }
  }
}