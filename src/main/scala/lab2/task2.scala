package lab2
import chisel3._
import chisel3.util._
class catti extends Module{
    val io = IO(new Bundle{
        val x=Input(UInt(2.W))
        val y=Input(UInt(2.W))
        val z=Output(UInt(4.W))
        
    })
    io.z:=Cat(io.x,io.y)
}