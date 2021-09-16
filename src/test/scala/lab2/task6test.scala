package lab2
import org.scalatest._
import chisel3._
import chiseltest._

class mux22 extends FreeSpec with ChiselScalatestTester {
    "mux22" in {
        test(new mux_onehot_4to1()){ c =>
        c.io.in0.poke(20.U)
        c.io.in1.poke(21.U)
        c.io.in2.poke(18.U)
        c.io.in3.poke(19.U)
        //c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.sel.poke(2.U)
        c.io.out.expect(21.U)
        }
    }

}