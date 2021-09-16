package lab2
import org.scalatest._
import chisel3._
import chiseltest._

class LM_IO_InterfaceTest extends FreeSpec with ChiselScalatestTester {
    "LM_IO_InterfaceTest" in {
        test(new LM()){ c =>
        c.io.in.poke(10000001.U)
        //c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.s0.poke(0.B)
        c.io.s1.poke(0.B)
        c.io.s2.poke(1.B)
        c.io.out.expect(0.B)
        }
    }

}