package lab2
import org.scalatest._
import chisel3._
import chiseltest._

class catclass extends FreeSpec with ChiselScalatestTester {
    "concatenate +" in {
        test(new catti()){ c =>
        c.io.x.poke(2.U)
        c.io.y.poke(2.U)
        c.clock.step(1)
        c.io.z.expect(10.U)
        }
    }
}