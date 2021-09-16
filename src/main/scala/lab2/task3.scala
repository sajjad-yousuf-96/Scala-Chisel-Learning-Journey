package lab2
import chisel3._
// Mux IO interface class
class Mux_2to1_IO extends Bundle {
    val a= Input ( UInt (32. W ) )
    val b= Input ( UInt (32. W ) )
    val sel = Input ( Bool () )
    val out= Output ( UInt () )
}
// 2 to 1 Mux implementation
class Mux_2to1 extends Module {
val io = IO ( new Mux_2to1_IO )
// update the output
io.out := Mux(io.sel,io.b,io.a)
//            1       0     1        answer will be 0 because seee
}