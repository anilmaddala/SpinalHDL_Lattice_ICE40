sbt "runMain mylib.MyTopLevelVerilog"
yosys -p 'read_verilog And_Gate_Project.v; synth_ice40 -blif And_Gate_Project.blif'
arachne-pnr -d 1k --package vq100 -p ../Go_Board_Constraints.pcf -o And_Gate_Project.txt And_Gate_Project.blif
icepack And_Gate_Project.txt And_Gate_Project.bin
iceprog And_Gate_Project.bin