package lab1
import org.scalatest._
import chisel3._
import chiseltest._

import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation

class CounterTest4 extends FreeSpec with ChiselScalatestTester{
    "Counter Test4" in {
        test(new Counter4(3)).withAnnotations(Seq(VerilatorBackendAnnotation)) { c =>
        //c.io.record.poke(4.U)
        c.io.record.poke(true.B)
        c.clock.step(30)
        
        }
    }
}   