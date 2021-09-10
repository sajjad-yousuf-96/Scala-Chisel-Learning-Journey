package example
import org.scalatest._
import chisel3._
import chiseltest._

class xnorgatetest extends FreeSpec with ChiselScalatestTester {
    "XNOr Gate Test" in {
        test(new xnorgate()){ c =>
        c.io.a.poke(1.U)
        c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.c.expect(0.U)
        }
    }

}