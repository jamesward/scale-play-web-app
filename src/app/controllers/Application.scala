package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  val approx20kString = (1 to 200).mkString("Play is based on a lightweight, stateless, web-friendly architecture and features predictable and minimal resource consumption.")
  
  def index(length: Int) = Action {
    val s = length max 1 min approx20kString.length
    Ok(approx20kString.substring(0, s)).as("text/plain")
  }
  
}