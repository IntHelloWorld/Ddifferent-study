/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:18:40 GMT 2020
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
import org.apache.commons.math3.distribution.ZipfDistribution;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegerDistribution_ESTest extends AbstractIntegerDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1000, 0, 0);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.sample(0);
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(iSAACRandom0, 0.5128576270106031);
      int int0 = geometricDistribution0.inverseCumulativeProbability(0.5128576270106031);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.solveInverseCumulativeProbability(0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0);
      int int0 = poissonDistribution0.solveInverseCumulativeProbability((-1.0), 1, 19650218);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(5425.0, 5425.0);
      int int0 = poissonDistribution0.solveInverseCumulativeProbability(823L, 0, (-1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(60, 0.0);
      int int0 = binomialDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(292, 292, 292);
      double double0 = hypergeometricDistribution0.cumulativeProbability((-2535), 292);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution((RandomGenerator) null, 1, 1);
      // Undeclared exception!
      pascalDistribution0.solveInverseCumulativeProbability(0.04767347127199173, Integer.MAX_VALUE, Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, (-1.0), 2);
      // Undeclared exception!
      try { 
        poissonDistribution0.solveInverseCumulativeProbability(0.0, 1, 27);
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 14
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN);
      double double0 = poissonDistribution0.probability(1);
      // Undeclared exception!
      poissonDistribution0.sample(1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1042, 1042);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      PascalDistribution pascalDistribution0 = new PascalDistribution(iSAACRandom0, 2473, Double.NaN);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample();
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,823
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution((RandomGenerator) null, 1, 1);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((RandomGenerator) null, 0.5, (-1221.912), 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.reseedRandomGenerator(876L);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2.147483647E9, 2.147483647E9, (-694));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(0, 2270);
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction convergents failed to converge (in less than -694 iterations) for value 2,147,483,647
         //
         verifyException("org.apache.commons.math3.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2271, 2271, 2271);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(1.0E-12);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(2473, 0.0);
      int int0 = pascalDistribution0.inverseCumulativeProbability(1.0E-9);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2271, 2271, 2271);
      int[] intArray0 = hypergeometricDistribution0.sample(943);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(87.19421, 87.19421);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample(Integer.MIN_VALUE);
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-2,147,483,648)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(mersenneTwister0, 0.9679330764334764, 0.9679330764334764, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0.9679330764334764);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2271, 2271, 2271);
      int int0 = hypergeometricDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      PascalDistribution pascalDistribution0 = new PascalDistribution(iSAACRandom0, 2473, Double.NaN);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(3926);
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,823
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(iSAACRandom0, 1.0E-9);
      int int0 = geometricDistribution0.inverseCumulativeProbability(1.0E-9);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution((RandomGenerator) null, 1, 1);
      int int0 = pascalDistribution0.inverseCumulativeProbability(1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(iSAACRandom0, 1.0E-9);
      int int0 = geometricDistribution0.inverseCumulativeProbability(0.0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      try { 
        zipfDistribution0.inverseCumulativeProbability(1000.0);
      } catch(IllegalArgumentException e) {
         //
         // 1,000 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(260, 0.0);
      try { 
        binomialDistribution0.inverseCumulativeProbability((-1.0));
      } catch(IllegalArgumentException e) {
         //
         // -1 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2271, 2271, 2271);
      try { 
        hypergeometricDistribution0.cumulativeProbability(2271, 611);
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (2,271) must be less than or equal to upper endpoint (611)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(iSAACRandom0, 1.0E-9);
      double double0 = geometricDistribution0.cumulativeProbability(3926, 3926);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(3926, 0.0);
      pascalDistribution0.reseedRandomGenerator(1345L);
  }
}
