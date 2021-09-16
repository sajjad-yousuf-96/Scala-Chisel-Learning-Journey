package lab2
import org.scalatest._
import chiseltest._
import chisel3._

class Mux5x1Test extends FreeSpec with ChiselScalatestTester{
  "Task 1 Test" in {
    test(new Mux_5to1()){ c =>
      c.io.s0.poke(1.B)
      c.io.s1.poke(1.B)
      c.io.s2.poke(0.B)
      c.clock.step(1)
      c.io.sel.poke("b011".U)
      c.io.out.expect(24.U)
    }
  }
}