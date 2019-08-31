/*
 * SpinalHDL
 * Copyright (c) Dolu, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */

package mylib

import spinal.core._
import spinal.lib._

import scala.util.Random

//Hardware definition
class Switches_To_LEDs extends Component {
  
  val i = new Bundle {
    val Switch_1 = in Bool
    val Switch_2 = in Bool
    val Switch_3 = in Bool
    val Switch_4 = in Bool
  }

  val o = new Bundle {
    val LED_1 = out Bool
    val LED_2 = out Bool
    val LED_3 = out Bool
    val LED_4 = out Bool
  }

  o.LED_1 := i.Switch_1
  o.LED_2 := i.Switch_2
  o.LED_3 := i.Switch_3
  o.LED_4 := i.Switch_4
}

//Generate the Switches_To_LEDs's Verilog
object MyTopLevelVerilog {
  def main(args: Array[String]) {
    SpinalVerilog(new Switches_To_LEDs)
  }
}