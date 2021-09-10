package example
import org.scalatest._
import chisel3._
import chiseltest._

class Muxtest extends FreeSpec with ChiselScalatestTester {
    "٘Mux Gate Test" in {
        test(new Mux()){ c =>
        c.io.a.poke(1.U)
        c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.sel.poke(1.U)
        c.io.c.expect(0.U)
        }
    }

}