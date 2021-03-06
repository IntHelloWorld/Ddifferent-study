/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:21:02 GMT 2020
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.distribution.PascalDistribution;
import org.apache.commons.math3.distribution.PoissonDistribution;
import org.apache.commons.math3.distribution.UniformIntegerDistribution;
import org.apache.commons.math3.distribution.ZipfDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.SynchronizedRandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegerDistribution_ESTest extends AbstractIntegerDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[9];
      Well44497b well44497b0 = new Well44497b(intArray0);
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well44497b0, (-2063), 0);
      // Undeclared exception!
      try { 
        uniformIntegerDistribution0.sample(Integer.MIN_VALUE);
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-2,147,483,648)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0.0);
      int int0 = binomialDistribution0.solveInverseCumulativeProbability(1.0E-6, 0, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well19937c0, 156, 1962);
      uniformIntegerDistribution0.reseedRandomGenerator((-2550L));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0.0);
      int int0 = binomialDistribution0.solveInverseCumulativeProbability(1.0E-6, (-319), 0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(925, 925, 925);
      int int0 = hypergeometricDistribution0.solveInverseCumulativeProbability(1416.4791565629, (-901), 925);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well19937c0, 156, 1962);
      double double0 = uniformIntegerDistribution0.cumulativeProbability(1, 4218);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(214);
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(well19937c0, 772733731, 772733731);
      // Undeclared exception!
      zipfDistribution0.solveInverseCumulativeProbability(214, 214, 302);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) null, 2, 0, 2);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.sample(1020);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1960, 34.79109504849737);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) null, 2, 0, 2);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.sample();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) null, 2, 0, 2);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.627601030656471);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a();
      SynchronizedRandomGenerator synchronizedRandomGenerator0 = new SynchronizedRandomGenerator(well1024a0);
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(synchronizedRandomGenerator0, Double.POSITIVE_INFINITY, 1.0, 78);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(Double.NaN);
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction diverged to NaN for value \u221E
         //
         verifyException("org.apache.commons.math3.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well19937c0, 156, 1962);
      int[] intArray0 = uniformIntegerDistribution0.sample(1962);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well19937c0, 156, 1962);
      // Undeclared exception!
      try { 
        uniformIntegerDistribution0.sample(0);
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-1032), 389);
      int int0 = uniformIntegerDistribution0.solveInverseCumulativeProbability((-1032), (-1685684224), (-1032));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well19937c0, 156, 1962);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(0.9026297667469598);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(221);
      PascalDistribution pascalDistribution0 = new PascalDistribution(well19937a0, 221, 0.9197227264479477);
      // Undeclared exception!
      pascalDistribution0.sample(221);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well19937c0, 156, 1962);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(0.5378399674206926);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(221, 0.0);
      int int0 = pascalDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.inverseCumulativeProbability(1.0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.inverseCumulativeProbability(0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well19937c0, 1809, 4292);
      try { 
        uniformIntegerDistribution0.inverseCumulativeProbability(1809);
      } catch(IllegalArgumentException e) {
         //
         // 1,809 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a();
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(well1024a0, 3884.37382855, 3884.37382855, 0);
      try { 
        poissonDistribution0.inverseCumulativeProbability((-1.0));
      } catch(IllegalArgumentException e) {
         //
         // -1 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(221, 0.0);
      try { 
        pascalDistribution0.cumulativeProbability(221, (-3));
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (221) must be less than or equal to upper endpoint (-3)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.cumulativeProbability(0, 0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) null, 2, 0, 2);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.reseedRandomGenerator(6402373705728000L);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }
}
