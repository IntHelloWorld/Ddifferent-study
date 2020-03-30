/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:26:58 GMT 2020
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
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomAdaptor;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well44497b;
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
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-772), 0);
      int int0 = uniformIntegerDistribution0.solveInverseCumulativeProbability(0.0, 399, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(879.8092149, 1.0, 1355);
      int int0 = poissonDistribution0.solveInverseCumulativeProbability(1.0, 1355, 1355);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom((-2646L));
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(iSAACRandom0, 2, 0, 0);
      int int0 = hypergeometricDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(1, 2259);
      double double0 = uniformIntegerDistribution0.cumulativeProbability(1, 1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-772), 0);
      double double0 = uniformIntegerDistribution0.cumulativeProbability(Integer.MIN_VALUE, 13);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((RandomGenerator) null, 223.0997850703694, 0.0, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.solveInverseCumulativeProbability(539.0, 0, 188);
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction convergents failed to converge (in less than 0 iterations) for value 223.1
         //
         verifyException("org.apache.commons.math3.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(715);
      RandomAdaptor randomAdaptor0 = new RandomAdaptor(mersenneTwister0);
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(randomAdaptor0, 715, 0.1840830447512476);
      // Undeclared exception!
      binomialDistribution0.sample(715);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution((RandomGenerator) null, 742, 0.1840830447512476);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(742);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b();
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(well44497b0, 175, 175);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(100, Double.NaN);
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
  public void test11()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) null, 243, 2, 0);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.reseedRandomGenerator(2);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-772), 0);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(0.6947608480368394);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-772), 0);
      // Undeclared exception!
      try { 
        uniformIntegerDistribution0.sample((-772));
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-772)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-772), 0);
      int int0 = uniformIntegerDistribution0.solveInverseCumulativeProbability(0, Integer.MIN_VALUE, 70);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(10, 3959.020996923772);
      zipfDistribution0.reseedRandomGenerator(4294967295L);
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(1.0E-12);
      int int0 = geometricDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(1.0E-12);
      int int0 = geometricDistribution0.inverseCumulativeProbability(0.5462392458293341);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(10, 10);
      int[] intArray0 = zipfDistribution0.sample(10);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-772), 0);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(Double.NaN);
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,823
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(879.8092149, 1.0, 1355);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-772), 0);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(0.0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(1.0E-12);
      try { 
        geometricDistribution0.inverseCumulativeProbability(10);
      } catch(IllegalArgumentException e) {
         //
         // 10 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(879.8092149, 1.0, 1355);
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
  public void test24()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(342, 477);
      try { 
        uniformIntegerDistribution0.cumulativeProbability(342, (-1400));
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (342) must be less than or equal to upper endpoint (-1,400)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(1.0);
      // Undeclared exception!
      geometricDistribution0.cumulativeProbability(43, Integer.MAX_VALUE);
  }
}