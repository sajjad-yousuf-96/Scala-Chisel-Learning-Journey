package lab2
import chisel3._
import chisel3.util._
class LM_IO_Interface2 extends Bundle {
    val s0 = Input (Bool())
    val s1 = Input (Bool())
    val s2 = Input (Bool())
    val sel= Input (UInt(8.W))
    val out= Output (UInt(32.W))
}
class Mux_5to1 extends Module {
    val io = IO ( new LM_IO_Interface2 )
    val except = BitPat("b1??")
    io.out := MuxCase ( false.B , Array (
        (io.sel==="b000".U) -> 0.U,
        (io.sel==="b001".U) -> 8.U,
        (io.sel==="b010".U) -> 16.U,
        (io.sel==="b011".U) -> 24.U,
        (io.sel=== except)  -> 32.U,
        ))
}   

