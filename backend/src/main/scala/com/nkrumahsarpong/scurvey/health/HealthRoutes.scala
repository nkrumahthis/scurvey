package com.nkrumahsarpong.scurvey.health

import zio._
import zio.http._

object HealthRoutes {
  def apply(): Routes[Any, Response] =
    Routes(
      // GET /health
      Method.GET / "health" -> handler { (req: Request) =>
        ZIO.succeed(Response.text("Healthy"))
      }
    )
}
