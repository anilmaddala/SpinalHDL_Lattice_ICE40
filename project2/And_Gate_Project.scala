package mylib

import spinal.core._
import spinal.lib._

import scala.util.Random

//Hardware definition
class And_Gate_Project extends Component {
  
  val i = new Bundle {
    val Switch_1 = in Bool
    val Switch_2 = in Bool
  }

  val o = new Bundle {
    val LED_1 = out Bool
    val LED_2 = out Bool
    val LED_3 = out Bool
    val LED_4 = out Bool
  }

  o.LED_1 := i.Switch_1 & i.Switch_2
  o.LED_2 := False
  o.LED_3 := False
  o.LED_4 := False
}

object MyTopLevelVerilog {
  def main(args: Array[String]) {
    SpinalVerilog(new And_Gate_Project)
  }
}