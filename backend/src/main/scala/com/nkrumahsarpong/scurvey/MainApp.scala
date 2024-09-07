package com.nkrumahsarpong.scurvey

import zio._
import java.io.IOException


object MainApp extends ZIOAppDefault {
  def run:IO[IOException, Unit] = Console.printLine("Hello, World!")
}