package com.knoldus

import org.scalatest.FlatSpec

class JenkinSpec extends FlatSpec{

  val obj = new Jenkin
  "Sum method" should "return the sum of two numbers" in {
    val result = obj.sum(5,4)
    assert(result === 9)
  }

  "Mul method" should "return the product of two numbers" in {
    val result = obj.mul(6,4)
    assert(result === 24)
  }
}
