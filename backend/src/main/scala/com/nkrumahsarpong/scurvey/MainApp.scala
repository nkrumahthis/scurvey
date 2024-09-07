package com.nkrumahsarpong.scurvey

import zio._
import java.io.IOException
import zio.http._

import com.nkrumahsarpong.scurvey.health.HealthRoutes

object MainApp extends ZIOAppDefault {
  def run =
    Server
     .serve(
      HealthRoutes()
     ).provide(
        Server.defaultWithPort(8080)
     )
}