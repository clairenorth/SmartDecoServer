package models

import java.util.UUID

import org.joda.time.Seconds

trait Animation{
  val id: UUID
  val duration: Seconds
}

case object IdlePumpkin extends Animation {
  val id = UUID.fromString("IdlePumpkin")
  val duration: Seconds = Seconds.seconds(90)
}
