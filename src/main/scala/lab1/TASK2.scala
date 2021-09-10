package lab1
import chisel3._
import chisel3.util._
import java.io.File

class Counter4 (n: Int ) extends Module {
val io = IO ( new Bundle {
val record=Input(Bool())    
val result = Output(Bool())
})
//val count = RegInit (0.U(16.W))
val counter = RegInit (0.U(n.W))
val max_count = RegInit (6.U(n.W))
val main = RegInit (false.B)

when(main===true.B){
    when(counter===max_count){
    io.result:= 1.B
    main:=false.B
    }.otherwise{
    counter:=counter +1.U
    }
}
.otherwise{
    when(counter===0.U){
    io.result:= 1.B
    main:=true.B
    }.otherwise{
    counter:=counter -1.U
    }
}
io.result:=counter(0.U)  
}
