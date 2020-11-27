package models.dao

import models.{IdlePumpkin, JabberinJack}
import javax.inject.Singleton

/*
Will call out to database to get user information
 */
@Singleton
object UserDao{
  private val inMemoryStore = Map("claire@gmail.com" -> ("claire@gmail.com", "pass001", List(JabberinJack("claire's jabberin jack")), List(IdlePumpkin)))
}