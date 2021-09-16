package lab2
import org.scalatest._
import chisel3._
import chiseltest._

class Mux_2to1Test extends FreeSpec with ChiselScalatestTester {
    "Mux_2to1Test" in {
        test(new Mux_2to1()){ c =>
        c.io.a.poke(1.U)
        c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.sel.poke(1.B)
        c.io.out.expect(0.U)
        }
    }

}