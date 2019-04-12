package com.company.library

import java.time.format.DateTimeFormatter

class TimeStamp {
  def returnTime: String = {
    val formatter = DateTimeFormatter.ofPattern("dd-mm-yy HH:mm")
    val newTime = java.time.LocalDateTime.now.plusDays(3)
    newTime.format(formatter)
  }

}
