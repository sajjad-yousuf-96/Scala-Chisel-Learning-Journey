package lab1
import chisel3 . _
class Counter2 ( size : Int , maxValue : Int ) extends Module {
val io = IO ( new Bundle {
val result = Output ( Bool () )
})
// ' genCounter ' with counter size 'n '
def genCounter (n: Int ,max :Int) = {
val count = RegInit(0.S(n.W ))

when ( count === max.asSInt ) { //count cant be chhhanged to other type
count := 0.S
} .otherwise{
count := count + 1.S // count+max.asUInt
}
count
}
// genCounter instantiation
val counter1 = genCounter (size,maxValue )
io.result := counter1(size-1)
}

