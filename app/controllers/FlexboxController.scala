package controllers

import play.api.mvc.{Action, Controller}

/**
  * Created by andy on 17/06/17.
  */
class FlexboxController extends Controller {

  def fb = Action {
    Ok(views.html.flexbox())
  }

}
