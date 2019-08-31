module And_Gate_Project
  (input i_Switch_1,  
   input i_Switch_2,
   output o_LED_1,
   output o_LED_2,
   output o_LED_3,
   output o_LED_4);
       
assign o_LED_1 = i_Switch_1 & i_Switch_2;
 
endmodule