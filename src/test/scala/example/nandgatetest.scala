package example
import org.scalatest._
import chisel3._
import chiseltest._

class nandgatetest extends FreeSpec with ChiselScalatestTester {
    "Or Gate Test" in {
        test(new orgate()){ c =>
        c.io.a.poke(1.U)
        c.io.b.poke(1.U)
        c.clock.step(1)
        c.io.c.expect(1.U)
        }
    }

}