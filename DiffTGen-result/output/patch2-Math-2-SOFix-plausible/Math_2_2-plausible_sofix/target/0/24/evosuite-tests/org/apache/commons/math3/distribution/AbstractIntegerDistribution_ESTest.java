/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:25:07 GMT 2020
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
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegerDistribution_ESTest extends AbstractIntegerDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution((RandomGenerator) null, 2, 0.0);
      int int0 = pascalDistribution0.solveInverseCumulativeProbability(0.0, 2, 2267);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(1);
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well19937c0, 1, 10000000);
      int int0 = uniformIntegerDistribution0.solveInverseCumulativeProbability(1825.12214, 10000000, 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(384, 0, 0);
      int int0 = hypergeometricDistribution0.solveInverseCumulativeProbability(384, 0, 4781);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(3.7734658676841284E20, 0.0);
      int int0 = poissonDistribution0.solveInverseCumulativeProbability(1.0E-12, (-2038), (-2564));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(2, 1069);
      double double0 = uniformIntegerDistribution0.cumulativeProbability(2, 447);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(634.8663300891, 634.8663300891);
      // Undeclared exception!
      poissonDistribution0.sample(583);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(4091, 0.18909792043211637);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a((-1));
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(well44497a0, 1057.52300252, (-1690.68623), (-1));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability((-1), 1775);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(well19937a0, 1.0E-12);
      // Undeclared exception!
      try { 
        geometricDistribution0.sample((-2564));
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-2,564)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(well512a0, 0, 0);
      int[] intArray0 = binomialDistribution0.sample(448);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a();
      PascalDistribution pascalDistribution0 = new PascalDistribution(well1024a0, 10000000, 1.0E-12);
      int int0 = pascalDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(2, 1069);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(well512a0, 0, 0);
      int int0 = binomialDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution((RandomGenerator) null, 2, 0.0);
      int int0 = pascalDistribution0.inverseCumulativeProbability(0.2515811888258428);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-3935), (-1525));
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(1.0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution((RandomGenerator) null, 2, 0.0);
      int int0 = pascalDistribution0.inverseCumulativeProbability(0.0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN);
      try { 
        poissonDistribution0.inverseCumulativeProbability(521);
      } catch(IllegalArgumentException e) {
         //
         // 521 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(mersenneTwister0, 4310, 4310);
      try { 
        zipfDistribution0.inverseCumulativeProbability((-224.603658103941));
      } catch(IllegalArgumentException e) {
         //
         // -224.604 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a(86);
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(well1024a0, 2651, 86, 86);
      try { 
        hypergeometricDistribution0.cumulativeProbability(2651, 1061);
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (2,651) must be less than or equal to upper endpoint (1,061)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(0L);
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(mersenneTwister0, 0, 0);
      double double0 = binomialDistribution0.cumulativeProbability(0, 0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(well19937a0, 10000000, 8.006778743052707E-8);
      int int0 = binomialDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(well19937a0, 1.0E-12);
      geometricDistribution0.reseedRandomGenerator((-2564));
  }
}