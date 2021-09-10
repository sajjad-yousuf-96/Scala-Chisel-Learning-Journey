package example
import chisel3._


class addergate extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(1.W))
        val b = Input(UInt(1.W))

        val c = Output(UInt(1.W))
        val d = Output(UInt(1.W))
    })
   /// half adder 

    io.c := (io.a & io.b)  
    io.d := io.a ^ io.b

}