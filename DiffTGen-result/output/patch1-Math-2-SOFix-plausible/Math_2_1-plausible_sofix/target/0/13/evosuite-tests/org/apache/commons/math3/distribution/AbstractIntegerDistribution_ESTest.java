/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:29:00 GMT 2020
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.GeometricDistribution;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.distribution.PoissonDistribution;
import org.apache.commons.math3.distribution.UniformIntegerDistribution;
import org.apache.commons.math3.distribution.ZipfDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegerDistribution_ESTest extends AbstractIntegerDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(245, 4175);
      // Undeclared exception!
      try { 
        uniformIntegerDistribution0.sample((-569));
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-569)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(211, Double.NaN);
      int int0 = binomialDistribution0.solveInverseCumulativeProbability(Integer.MIN_VALUE, 0, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      int int0 = hypergeometricDistribution0.solveInverseCumulativeProbability(1, 1, 59);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      int int0 = hypergeometricDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 123;
      Well44497a well44497a0 = new Well44497a(intArray0);
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well44497a0, (-1569), 941);
      int int0 = uniformIntegerDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(0, 82);
      double double0 = uniformIntegerDistribution0.cumulativeProbability((-1223), 1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(well512a0, 308, 308);
      // Undeclared exception!
      zipfDistribution0.solveInverseCumulativeProbability((-2647.773151), 0, 308);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(9.223372036854776E18, 9.223372036854776E18, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        poissonDistribution0.solveInverseCumulativeProbability(9.999778782798785E-13, Integer.MIN_VALUE, 820);
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction convergents failed to converge (in less than -2,147,483,648 iterations) for value 9,223,372,036,854,776,000
         //
         verifyException("org.apache.commons.math3.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Well512a well512a0 = new Well512a(831L);
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(well512a0, 494, 1.0E-6);
      // Undeclared exception!
      binomialDistribution0.sample(494);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2589, 455.750951987);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution((RandomGenerator) null, 0, 0);
      // Undeclared exception!
      try { 
        binomialDistribution0.reseedRandomGenerator(0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2.0, (-1214));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(1.0E-12);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,214) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, (-975));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(Integer.MIN_VALUE, 615);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-975) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0E-12, 10000000);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0584469687624562E-7);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.inverseCumulativeProbability(1.0E-12);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(9.223372036854776E18, 9.223372036854776E18, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample(0);
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(10000000);
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well19937a0, (-2298), 10000000);
      int int0 = uniformIntegerDistribution0.solveInverseCumulativeProbability(2.0582268590356215E-7, Integer.MIN_VALUE, (-1221));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(965.8279692174781, 965.8279692174781);
      int int0 = poissonDistribution0.inverseCumulativeProbability(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1020, 1, 1);
      int[] intArray0 = hypergeometricDistribution0.sample(1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(1.0E-12);
      int int0 = geometricDistribution0.inverseCumulativeProbability(1.0E-12);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a((int[]) null);
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(well1024a0, 0, 1);
      int int0 = binomialDistribution0.inverseCumulativeProbability(1L);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.inverseCumulativeProbability(0.0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2, 0.0);
      try { 
        binomialDistribution0.inverseCumulativeProbability(2);
      } catch(IllegalArgumentException e) {
         //
         // 2 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2.0, (-1214));
      try { 
        poissonDistribution0.inverseCumulativeProbability((-1791.3669503921));
      } catch(IllegalArgumentException e) {
         //
         // -1,791.367 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1290.9291796, 5628);
      try { 
        poissonDistribution0.cumulativeProbability(5628, 0);
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (5,628) must be less than or equal to upper endpoint (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(0, 82);
      double double0 = uniformIntegerDistribution0.cumulativeProbability(82, 82);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      binomialDistribution0.reseedRandomGenerator(0L);
  }
}