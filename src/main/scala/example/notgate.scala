package example
import chisel3._

class Notgate extends Module{
    val io =IO(new Bundle{
        val a =Input(UInt(1.W))
        val b =Output(UInt(1.W))
    })
    io.b := ~(io.a)
}