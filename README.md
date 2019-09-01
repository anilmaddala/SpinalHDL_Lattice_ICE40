# SpinalHDL Lattice ICE40

The following project is a SpinalHDL implementation of the NandLand (https://www.youtube.com/channel/UCsdA-aNqtMA1_2T15aXePWw) projects.

The constraint file is for NandLand GoBoard (https://www.nandland.com/goboard/introduction.html)

Dependencies:
1) SpinalHDL
2) Yosys
3) IceStorm
4) NextPnR

Sample Build File:
```
sbt "runMain mylib.MyTopLevelVerilog"
yosys -p 'read_verilog And_Gate_Project.v; synth_ice40 -json And_Gate_Project.json'
nextpnr-ice40 --hx1k --package vq100 --json And_Gate_Project.json --pcf ../Go_Board_Constraints.pcf --asc And_Gate_Project.asc
icepack And_Gate_Project.asc And_Gate_Project.bin
iceprog And_Gate_Project.bin
```

SpinalHDl generates Verilog files from Scala file. Yosis consumes the Verilog files to generate synthesis output.
NextPnR is a portable FPGA place and route tool which takes the PCF (Pin Config File) as input to generate ASCII (.asc) file. icepack program converts such an .asc file to an iCE40 .bin file. iceprog is a small driver program for the FTDI-based programmer which programs the .bin file onto the iCE40 FPGA.
