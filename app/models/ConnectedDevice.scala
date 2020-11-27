package models

import java.util.UUID

trait ConnectedDevice{
  val id: UUID
  val name: String
  val allowedAnimations: List[Animation]
}

case class JabberinJack(name: String) extends ConnectedDevice {
  override val id: UUID = UUID.fromString("JabberinJack")
  override val allowedAnimations = List(IdlePumpkin)
}