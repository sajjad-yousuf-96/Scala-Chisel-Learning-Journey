package example
import org.scalatest._
import chisel3._
import chiseltest._

class Mux4x1test extends FreeSpec with ChiselScalatestTester {
    "4x1 Gate Test" in {
        test(new Mux4x1()){ c =>
        c.io.a.poke(1.U)
        c.io.b.poke(1.U)
        c.io.c.poke(0.U)
        c.io.d.poke(1.U)
        c.clock.step(1)
        c.io.sel1.poke(1.U)
        c.io.sel2.poke(0.U)
        c.io.out.expect(0.U)
        }
    }

}