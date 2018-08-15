package controllers

import com.gu.mediaservice.lib.argo.ArgoHelpers
import play.api.mvc.{BaseController, ControllerComponents}

class ImportFromS3Controller extends BaseController with ArgoHelpers {
  override protected def controllerComponents: ControllerComponents = ???

  def importFromS3 = ???
}
