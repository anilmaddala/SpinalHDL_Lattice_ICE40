sbt "runMain mylib.MyTopLevelVerilog"
yosys -p 'read_verilog And_Gate_Project.v; synth_ice40 -json And_Gate_Project.json'
nextpnr-ice40 --hx1k --package vq100 --json And_Gate_Project.json --pcf ../Go_Board_Constraints.pcf --asc And_Gate_Project.asc
icepack And_Gate_Project.asc And_Gate_Project.bin
iceprog And_Gate_Project.bin