package example
import org.scalatest._
import chisel3._
import chiseltest._

class bitadder2gatetest extends FreeSpec with ChiselScalatestTester {
    "adder-2 Gate Test" in {
        test(new bitadder()){ c =>
        c.io.a.poke(0.U)
        c.io.b.poke(1.U)
        c.io.c.poke(0.U)
        c.io.d.poke(1.U)
        c.clock.step(1)
        c.io.e.expect(0.U)
        c.io.f.expect(1.U)
        c.io.g.expect(0.U)
        c.io.h.expect(1.U)
        }
    }

}