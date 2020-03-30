/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:33:22 GMT 2020
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
import org.apache.commons.math3.random.RandomGenerator;
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
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(iSAACRandom0, 532.55248, 532.55248, (-959));
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-1829));
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1,829)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[0];
      Well19937a well19937a0 = new Well19937a(intArray0);
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(well19937a0, 2097150, 2097150);
      zipfDistribution0.reseedRandomGenerator(0L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(iSAACRandom0, 1380, 187);
      int int0 = zipfDistribution0.solveInverseCumulativeProbability(1380, (-1640), 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.solveInverseCumulativeProbability(0, 1497, 296);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[5];
      MersenneTwister mersenneTwister0 = new MersenneTwister(intArray0);
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(mersenneTwister0, 555, 747);
      int int0 = uniformIntegerDistribution0.solveInverseCumulativeProbability(747, 1, (-342));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[0];
      Well19937a well19937a0 = new Well19937a(intArray0);
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(well19937a0, 2097150, 2097150);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0L);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Well512a well512a0 = new Well512a(115L);
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(well512a0, Double.NaN, Double.NaN, (-460));
      double double0 = poissonDistribution0.cumulativeProbability((-460), (-460));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[2];
      ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(iSAACRandom0, 1380, 187);
      // Undeclared exception!
      zipfDistribution0.solveInverseCumulativeProbability(1380, (-1640), 9);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(3.0, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.solveInverseCumulativeProbability(0, 0, 305);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Well512a well512a0 = new Well512a(115L);
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(well512a0, Double.NaN, Double.NaN, (-460));
      // Undeclared exception!
      poissonDistribution0.sample(2172);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution((RandomGenerator) null, 2.220446049250313E-16);
      // Undeclared exception!
      try { 
        geometricDistribution0.sample(1496);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1554, 1.768819808959961);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution((RandomGenerator) null, 2.220446049250313E-16);
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
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[2];
      ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(iSAACRandom0, 1380, 187);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(2.2715163083830703E-13);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[2];
      ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(iSAACRandom0, 1380, 187);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(80, 187);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(94.144, 781.718972, (-1505));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability((-1505), 0);
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction convergents failed to converge (in less than -1,505 iterations) for value 94.144
         //
         verifyException("org.apache.commons.math3.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution((RandomGenerator) null, 2.220446049250313E-16);
      // Undeclared exception!
      try { 
        geometricDistribution0.sample(0);
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(3.637756762486788E-12, (-16));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(3.637756762486788E-12);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-16) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution((RandomGenerator) null, 2.220446049250313E-16);
      int int0 = geometricDistribution0.inverseCumulativeProbability(2.220446049250313E-16);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(4, 0, 0);
      int[] intArray0 = hypergeometricDistribution0.sample(16);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(2.910360841212878E-11);
      int int0 = geometricDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(618, 0.0);
      // Undeclared exception!
      pascalDistribution0.sample(1276);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(253, 253, 0);
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability(253);
      } catch(IllegalArgumentException e) {
         //
         // 253 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(5417.63);
      try { 
        poissonDistribution0.inverseCumulativeProbability((-2324.520257));
      } catch(IllegalArgumentException e) {
         //
         // -2,324.52 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a((long) 1);
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(well44497a0, 1772, 40.0, 103);
      try { 
        poissonDistribution0.cumulativeProbability(1, (-87));
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (1) must be less than or equal to upper endpoint (-87)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(2.910360841212878E-11);
      double double0 = geometricDistribution0.cumulativeProbability(0, 92);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(207, Double.NaN);
      int int0 = binomialDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution((RandomGenerator) null, 2.220446049250313E-16);
      // Undeclared exception!
      try { 
        geometricDistribution0.reseedRandomGenerator((-1698L));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }
}
