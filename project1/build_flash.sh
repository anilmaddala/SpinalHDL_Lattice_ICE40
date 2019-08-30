yosys -p 'read_verilog Switches_To_LEDs.v; synth_ice40 -blif Switches_To_LEDs.blif'
arachne-pnr -d 1k --package vq100 -p ../Go_Board_Constraints.pcf -o Switches_To_LEDs.txt Switches_To_LEDs.blif
icepack Switches_To_LEDs.txt Switches_To_LEDs.bin
iceprog Switches_To_LEDs.bin