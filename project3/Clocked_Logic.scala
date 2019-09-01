package mylib

import spinal.core._
import spinal.lib._

import scala.util.Random

//Hardware definition
class Clocked_Logic extends Component {
  
  val i = new Bundle {
    val Switch_1 = in Bool
  }

  val o = new Bundle {
    val LED_1 = out Bool
  }

  var r_LED_1 = Reg(False)
  val r_Switch_1 = Reg(False)

  r_Switch_1 := i.Switch_1

  when(i.Switch_1  && r_Switch_1) {
    r_LED_1 := !r_LED_1
  }

  o.LED_1 := r_LED_1
  
}

object MyTopLevelVerilog {
  def main(args: Array[String]) {
    SpinalVerilog(ClockDomain.external("", withReset = false)(new Clocked_Logic))
  }
}