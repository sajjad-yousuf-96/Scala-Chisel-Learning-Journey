package example
import org.scalatest._
import chisel3._
import chiseltest._

class xorgatetest extends FreeSpec with ChiselScalatestTester {
    "XOr Gate Test" in {
        test(new xorgate()){ c =>
        c.io.a.poke(1.U)
        c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.c.expect(1.U)
        }
    }

}