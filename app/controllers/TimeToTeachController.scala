package controllers

import play.api.mvc.{Action, Controller}

class TimeToTeachController extends Controller {

  def tttDashboard = Action {
    Ok(views.html.ttt("Andy"))
  }

}
