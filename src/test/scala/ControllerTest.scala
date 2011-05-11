package com.example

import org.scalatest.Suite
import com.borachio.MockFactory
import scala.math.{Pi, sqrt}

class MockFunctionTest extends Suite with MockFactory {
  
  val mockTurtle = mock[Turtle]
  val controller = new Controller(mockTurtle)

  def testDrawLine() {
    inSequence {
      mockTurtle expects 'getPosition returning (0.0, 0.0)
      mockTurtle expects 'getAngle returning 0.0
      mockTurtle expects 'penUp
      mockTurtle expects 'turn withArgs (~(Pi / 4))
      mockTurtle expects 'forward withArgs (~sqrt(4.0))
      mockTurtle expects 'getAngle returning Pi / 4
      mockTurtle expects 'turn withArgs (~(-Pi / 4))
      mockTurtle expects 'penDown
      mockTurtle expects 'forward withArgs (1.0)
    }
    
    controller.drawLine((1.0, 1.0), (2.0, 1.0))
  }
}
