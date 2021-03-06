/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:33:20 GMT 2020
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.GeometricDistribution;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.distribution.PascalDistribution;
import org.apache.commons.math3.distribution.PoissonDistribution;
import org.apache.commons.math3.distribution.UniformIntegerDistribution;
import org.apache.commons.math3.distribution.ZipfDistribution;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegerDistribution_ESTest extends AbstractIntegerDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2522, 1854.005410661451);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(0);
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(40.6642);
      double double0 = poissonDistribution0.cumulativeProbability(97, 97);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(iSAACRandom0, 1.0);
      int int0 = geometricDistribution0.solveInverseCumulativeProbability(1.0, (-1217), 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(2764, 0.33681793003152305);
      int int0 = pascalDistribution0.solveInverseCumulativeProbability(0.33681793003152305, 2147102279, 4749);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2.220446049250313E-16, 0.0);
      int int0 = poissonDistribution0.solveInverseCumulativeProbability(0.0, (-414), 4178);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(40.6642);
      double double0 = poissonDistribution0.cumulativeProbability(1, 667);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(well512a0, 3120.850941241, (-201.908593), 268);
      // Undeclared exception!
      try { 
        poissonDistribution0.solveInverseCumulativeProbability((-2.9287), 268, 979);
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction convergents failed to converge (in less than 268 iterations) for value 3,120.851
         //
         verifyException("org.apache.commons.math3.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.POSITIVE_INFINITY);
      // Undeclared exception!
      poissonDistribution0.sample(2009);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution((RandomGenerator) null, 0.4199758219222387);
      // Undeclared exception!
      try { 
        geometricDistribution0.sample(480);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2782, 2782);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution((RandomGenerator) null, 0.4199758219222387);
      // Undeclared exception!
      try { 
        geometricDistribution0.sample();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(3446, 3446);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(0.9339136447412228);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(306);
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(well19937c0, 2938, 701.91853);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(52, 154);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(3106.519565, (-937));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability((-937), 282);
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction convergents failed to converge (in less than -937 iterations) for value 3,106.52
         //
         verifyException("org.apache.commons.math3.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.9818136405368061, 2664);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.23000961219396654);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(0L);
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well19937c0, 0, 103);
      // Undeclared exception!
      try { 
        uniformIntegerDistribution0.sample((-596));
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-596)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b(0);
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(well44497b0, 221, 0);
      int[] intArray0 = binomialDistribution0.sample(177);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(0L);
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well19937c0, 0, 103);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(0.9339136447412228);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(35, 1.0E-12);
      int int0 = zipfDistribution0.inverseCumulativeProbability(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b(0);
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(well44497b0, 221, 0);
      int int0 = binomialDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, (-0.5), 97);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      PascalDistribution pascalDistribution0 = new PascalDistribution(well19937c0, 275, 1.0E-12);
      int int0 = pascalDistribution0.inverseCumulativeProbability(0.0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      PascalDistribution pascalDistribution0 = new PascalDistribution(well19937c0, 275, 1.0E-12);
      try { 
        pascalDistribution0.inverseCumulativeProbability(27);
      } catch(IllegalArgumentException e) {
         //
         // 27 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.9818136405368061, 22);
      try { 
        poissonDistribution0.inverseCumulativeProbability((-1772.17696493112));
      } catch(IllegalArgumentException e) {
         //
         // -1,772.177 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      try { 
        hypergeometricDistribution0.cumulativeProbability(1, 0);
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (1) must be less than or equal to upper endpoint (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(2764, 0.33681793003152305);
      int int0 = pascalDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.9818136405368061, 2664);
      poissonDistribution0.reseedRandomGenerator(2090L);
  }
}
