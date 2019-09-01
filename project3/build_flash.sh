sbt "runMain mylib.MyTopLevelVerilog"
yosys -p 'read_verilog Clocked_Logic.v; synth_ice40 -json Clocked_Logic.json'
nextpnr-ice40 --hx1k --package vq100 --freq 40 --json Clocked_Logic.json --pcf ../Go_Board_Constraints.pcf --asc Clocked_Logic.asc
icepack Clocked_Logic.asc Clocked_Logic.bin
iceprog Clocked_Logic.bin