package lab2
import org.scalatest._
import chisel3._
import chiseltest._

class MuxLookupTest extends FreeSpec with ChiselScalatestTester {
    "MuxLookupTest" in {
        test(new muxlookup()){ c =>
        c.io.in0.poke(1.B)  //10000001
        c.io.in1.poke(0.B)
        c.io.in2.poke(0.B)
        c.io.in3.poke(0.B)
        c.io.in4.poke(0.B)
        c.io.in5.poke(0.B)
        c.io.in6.poke(0.B)
        c.io.in7.poke(1.B)
        c.clock.step(1)
        c.io.sel.poke("b000".U)
        c.io.out.expect(1.B)
        }
    }

}