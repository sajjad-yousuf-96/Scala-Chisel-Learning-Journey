package lab2
import chisel3._
class Arithmetic extends Module{
    val io = IO(new Bundle{
        val x=Input(UInt(5.W))
        val y=Input(UInt(5.W))
        val z=Output(UInt())        
    })
    // io.z := io.x + io.y // OR
    //io.z := io.x +% io.y
//Addition with width expansion
    io.z := io.x +& io.y
// // Subtraction without width expansion
    // io.z := io.x - io.y // OR
    // io.z := io.x -% io.y
// // Subtraction with width expansion
// io.z = io.x -& io.y
}