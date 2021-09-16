package lab2
import org.scalatest._
import chisel3._
import chiseltest._

class muxcasetest extends FreeSpec with ChiselScalatestTester {
    "MuxCAse" in {
        test(new MuxCase_ex()){ c =>
        c.io.in0.poke(0.B)
        c.io.in1.poke(1.B)
        c.io.in2.poke(0.B)
        c.io.in3.poke(0.B)
        c.io.in4.poke(1.B)
        c.io.in5.poke(0.B)
        c.io.in6.poke(0.B)
        c.io.in7.poke(0.B)
        c.clock.step(1)
        c.io.sel.poke(6.U)
        c.io.out.expect(0.B)
        }
    }

}