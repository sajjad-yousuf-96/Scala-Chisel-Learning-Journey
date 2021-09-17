package lab2
import chisel3._
import chisel3.util._
class barrel_shift extends Module {
    val io = IO(new Bundle {
        val in = Vec(4,Input( Bool()))
        val sel1 = Input(Bool())
        val sel2 = Input(Bool())
        val shift_type = Input(Bool())
        val out0 = Output(Bool())
        val out1 = Output(Bool())
        val out2 = Output(Bool())
        val out3 = Output(Bool())
        
    })
    val sel=Cat(io.sel2,io.sel1)
    io.out0:=MuxCase(false.B,Array(
    (sel==="b00".U) -> io.in(0),
    (sel==="b01".U) -> io.in(1),
    (sel==="b10".U) -> io.in(2),
    (sel==="b11".U) -> io.in(3),
    ))
    io.out1:=MuxCase(false.B,Array(
    (sel==="b00".U) -> io.in(1),
    (sel==="b01".U) -> io.in(2),
    (sel==="b10".U) -> io.in(3),
    (sel==="b11".U) -> Mux(io.shift_type,io.in(0),0.U),
    ))
    io.out2:=MuxCase(false.B,Array(
    (sel==="b00".U) -> io.in(2),
    (sel==="b01".U) -> io.in(3),
    (sel==="b10".U) -> Mux(io.shift_type,io.in(0),0.U),
    (sel==="b11".U) -> Mux(io.shift_type,io.in(1),0.U),
    ))
    io.out3:=MuxCase(false.B,Array(
    (sel==="b00".U) -> io.in(3),
    (sel==="b01".U) -> Mux(io.shift_type,io.in(0),0.U),
    (sel==="b10".U) -> Mux(io.shift_type,io.in(1),0.U),
    (sel==="b11".U) -> Mux(io.shift_type,io.in(2),0.U),
    ))
    
}