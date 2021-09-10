package example
import org.scalatest._
import chisel3._
import chiseltest._

class addergatetest extends FreeSpec with ChiselScalatestTester {
    "adder Gate Test" in {
        test(new addergate()){ c =>
        c.io.a.poke(1.U)
        c.io.b.poke(1.U)
        c.clock.step(1)
        c.io.c.expect(1.U)
        c.io.d.expect(0.U)
        }
    }

}