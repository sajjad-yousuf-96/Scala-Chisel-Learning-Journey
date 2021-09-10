package example
import chisel3._


class bitadder extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(1.W))
        val b = Input(UInt(1.W))
        val c = Input(UInt(1.W))
        val d = Input(UInt(1.W))
///   2 bit adder 4 input and 4 output  ^^^^^^^^^   //////

        val e = Output(UInt(1.W))
        val f = Output(UInt(1.W))
        val g = Output(UInt(1.W))
        val h = Output(UInt(1.W))

    })

   ////  a=0 b=1 c=0 d=1
    io.e := (io.a & io.b) // carry      
    io.f := (io.a ^ io.b) // sum
    io.g := (io.c & io.d)  // carry
    io.h := (io.c ^ io.d)  // sum
    

}