/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:20:55 GMT 2020
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
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegerDistribution_ESTest extends AbstractIntegerDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1763.652197110177);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-588458087));
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-588,458,087)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1725.85648859);
      int int0 = poissonDistribution0.solveInverseCumulativeProbability(0.0, (-1), 10000000);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(iSAACRandom0, 1718.709116511, 1718.709116511, 408);
      int int0 = poissonDistribution0.solveInverseCumulativeProbability(0.0, 1, 111);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.solveInverseCumulativeProbability(0, 0, (-2505));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(3876, 0, 254);
      int int0 = hypergeometricDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-3), 2397);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1505, 0.0);
      double double0 = binomialDistribution0.cumulativeProbability((-6700), 10000000);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(40.0, 0.0, 2386);
      // Undeclared exception!
      try { 
        poissonDistribution0.solveInverseCumulativeProbability(0, 0, 10000000);
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction convergents failed to converge (in less than 2,386 iterations) for value 40
         //
         verifyException("org.apache.commons.math3.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c((-647));
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(well19937c0, 4346, 4346);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution((RandomGenerator) null, 0, 0);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.12980841898165818, (-274));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0.12980841898165818);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-274) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(0);
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(0, 23);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(1.4122417557484554E-8);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.6619024276733398, 0.6619024276733398);
      int int0 = poissonDistribution0.inverseCumulativeProbability(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(43, 2397);
      int[] intArray0 = uniformIntegerDistribution0.sample(43);
      Well44497a well44497a0 = new Well44497a(intArray0);
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(well44497a0, 43, 0, 0);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.3502066612121719);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(4.9E-324);
      // Undeclared exception!
      geometricDistribution0.sample(298);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-1036), 576);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(43, 2397);
      try { 
        uniformIntegerDistribution0.inverseCumulativeProbability(9.223372036854776E18);
      } catch(IllegalArgumentException e) {
         //
         // 9,223,372,036,854,776,000 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(2, 139);
      try { 
        uniformIntegerDistribution0.inverseCumulativeProbability((-503.56));
      } catch(IllegalArgumentException e) {
         //
         // -503.56 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1764.1923217809726, 4);
      try { 
        poissonDistribution0.cumulativeProbability(0, (-426));
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (0) must be less than or equal to upper endpoint (-426)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(43, 2397);
      int[] intArray0 = uniformIntegerDistribution0.sample(43);
      Well44497a well44497a0 = new Well44497a(intArray0);
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(well44497a0, 43, 0, 0);
      double double0 = hypergeometricDistribution0.cumulativeProbability(0, 0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(2053L);
      PascalDistribution pascalDistribution0 = new PascalDistribution(well19937a0, 9375001, 1.0E-12);
      int int0 = pascalDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1763.652197110177);
      poissonDistribution0.reseedRandomGenerator(1678);
  }
}
