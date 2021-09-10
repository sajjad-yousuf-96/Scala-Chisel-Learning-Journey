package example
import org.scalatest._
import chisel3._
import chiseltest._

class notgatetest extends FreeSpec with ChiselScalatestTester {
    "Not Gate Test" in {
        test(new Notgate()){ c =>
        c.io.a.poke(1.U)
        c.clock.step(1)
        c.io.b.expect(0.U)
        }
    }

}