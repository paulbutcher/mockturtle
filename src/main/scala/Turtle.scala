package com.example

trait Turtle {
  def penUp()
  def penDown()
  def forward(distance: Double)
  def turn(angle: Double)
  def getAngle: Double
  def getPosition: (Double, Double)
}
