/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:28:57 GMT 2020
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
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
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
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(167.0, 167.0);
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
  public void test01()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a(0L);
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well44497a0, 0, 303);
      int int0 = uniformIntegerDistribution0.solveInverseCumulativeProbability(0, (-2179), 303);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2996.000708, (-2756.5585));
      int int0 = poissonDistribution0.solveInverseCumulativeProbability((-499.8898665978837), 1152, 0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(0, 1750);
      int int0 = uniformIntegerDistribution0.solveInverseCumulativeProbability((-2604.7001540269644), 0, 1750);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      int int0 = pascalDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(250, 303);
      double double0 = zipfDistribution0.cumulativeProbability(250, 250);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(mersenneTwister0, 1571, 1571);
      // Undeclared exception!
      zipfDistribution0.solveInverseCumulativeProbability(2.147483647E9, (-1), 1571);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(250, 303);
      // Undeclared exception!
      zipfDistribution0.sample(960);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((RandomGenerator) null, 17.9375, 2246.6908, 1996);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample(1996);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(939, Double.NaN);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution((RandomGenerator) null, 516, 1.0);
      // Undeclared exception!
      try { 
        zipfDistribution0.reseedRandomGenerator(516);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 3);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(3, 3);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (3) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(well19937c0, 1, 1);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.9026297667469598);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(0, 1750);
      int[] intArray0 = uniformIntegerDistribution0.sample(1750);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(695.227, 695.227, 454);
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
  public void test17()  throws Throwable  {
      Well512a well512a0 = new Well512a(0L);
      PascalDistribution pascalDistribution0 = new PascalDistribution(well512a0, 1, Double.NaN);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(1);
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,823
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(2147483639, 0.6478021978021978);
      int int0 = pascalDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Well512a well512a0 = new Well512a(0L);
      PascalDistribution pascalDistribution0 = new PascalDistribution(well512a0, 1, Double.NaN);
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
  public void test20()  throws Throwable  {
      Well512a well512a0 = new Well512a(0L);
      PascalDistribution pascalDistribution0 = new PascalDistribution(well512a0, 1, 0L);
      int int0 = pascalDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, 4532.89755145365, (-1));
      int int0 = poissonDistribution0.inverseCumulativeProbability(0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2713.3);
      try { 
        poissonDistribution0.inverseCumulativeProbability(2713.3);
      } catch(IllegalArgumentException e) {
         //
         // 2,713.3 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(12.0, 0.0, 250);
      try { 
        poissonDistribution0.inverseCumulativeProbability((-816));
      } catch(IllegalArgumentException e) {
         //
         // -816 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, 4532.89755145365, (-1));
      try { 
        poissonDistribution0.cumulativeProbability(2708, (-1));
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (2,708) must be less than or equal to upper endpoint (-1)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(695.227, 695.227, 454);
      double double0 = poissonDistribution0.cumulativeProbability(454, 1347);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(10000000, 10000000, 303);
      hypergeometricDistribution0.reseedRandomGenerator(250);
  }
}
