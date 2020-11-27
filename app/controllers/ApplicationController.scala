package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class ApplicationController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `POST` request with
   * a path of `/register`.
   */

  def register() = TODO


  def login(userName: String) = TODO

}
