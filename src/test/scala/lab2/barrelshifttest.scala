package lab2
import org.scalatest._
import chiseltest._
import chisel3._

class barrelshiftTest extends FreeSpec with ChiselScalatestTester{
    "TASK2lab2" in {
    test(new barrel_shift()){ c =>
    c.io.in(0).poke(0.B)
    c.io.in(1).poke(1.B)
    c.io.in(2).poke(0.B)
    c.io.in(3).poke(1.B)
    c.io.shift_type.poke(1.B)
    c.io.sel1.poke(0.B)
    c.io.sel2.poke(1.B)
    c.io.out0.expect(0.B)
    c.io.out1.expect(1.B)
    c.io.out2.expect(0.B)
    c.io.out3.expect(1.B)
}}
}