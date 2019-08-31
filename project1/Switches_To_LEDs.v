// Generator : SpinalHDL v1.3.5    git head : f0505d24810c8661a24530409359554b7cfa271a
// Date      : 31/08/2019, 13:10:52
// Component : Switches_To_LEDs


module Switches_To_LEDs (
      input   i_Switch_1,
      input   i_Switch_2,
      input   i_Switch_3,
      input   i_Switch_4,
      output  o_LED_1,
      output  o_LED_2,
      output  o_LED_3,
      output  o_LED_4);
  assign o_LED_1 = i_Switch_1;
  assign o_LED_2 = i_Switch_2;
  assign o_LED_3 = i_Switch_3;
  assign o_LED_4 = i_Switch_4;
endmodule

