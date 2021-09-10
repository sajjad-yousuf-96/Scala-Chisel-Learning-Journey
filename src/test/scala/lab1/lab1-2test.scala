package lab1
import org.scalatest._
import chisel3._
import chiseltest._

import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation

class CounterTest2 extends FreeSpec with ChiselScalatestTester{
    "Counter Test" in {
        test(new Counter2(4,4)).withAnnotations(Seq(VerilatorBackendAnnotation)) { c =>
        c.clock.step(30)
        }
    }
}  
