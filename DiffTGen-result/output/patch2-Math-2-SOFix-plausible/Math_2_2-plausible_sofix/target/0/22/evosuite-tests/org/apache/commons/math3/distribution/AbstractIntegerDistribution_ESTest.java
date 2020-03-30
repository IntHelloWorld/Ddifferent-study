/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:22:58 GMT 2020
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
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegerDistribution_ESTest extends AbstractIntegerDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b(Integer.MIN_VALUE);
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well44497b0, (-581655560), (-2206));
      // Undeclared exception!
      try { 
        uniformIntegerDistribution0.sample((-2206));
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-2,206)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-2335), 0);
      uniformIntegerDistribution0.reseedRandomGenerator((-1975L));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0);
      int int0 = poissonDistribution0.solveInverseCumulativeProbability((-1244.677131), 0, 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(186, 0.0);
      int int0 = pascalDistribution0.solveInverseCumulativeProbability(0.0, 186, 186);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(186, 0.0);
      int int0 = pascalDistribution0.solveInverseCumulativeProbability(0.0, (-1900), 186);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-2335), 0);
      int int0 = uniformIntegerDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a(0);
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(well44497a0, 0, 143);
      double double0 = uniformIntegerDistribution0.cumulativeProbability(0, 0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(140, 2090.636098);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(9, 9, 9);
      int[] intArray0 = hypergeometricDistribution0.sample(9);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 0);
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
  public void test11()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(9.854154449263851E-34);
      int int0 = geometricDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(186, 0.8198475362602582);
      // Undeclared exception!
      pascalDistribution0.sample(186);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(well19937a0, 0, 0);
      int int0 = binomialDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(186, 0.0);
      // Undeclared exception!
      pascalDistribution0.sample(186);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 1.0, 1);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(well19937a0, 0, 0);
      int int0 = binomialDistribution0.inverseCumulativeProbability(0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(424.9241149, 1773);
      try { 
        poissonDistribution0.inverseCumulativeProbability(424.9241149);
      } catch(IllegalArgumentException e) {
         //
         // 424.924 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-2335), 0);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(3.060737220976933E-278);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-2335), 0);
      try { 
        uniformIntegerDistribution0.inverseCumulativeProbability(Double.NEGATIVE_INFINITY);
      } catch(IllegalArgumentException e) {
         //
         // -\u221E out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-2335), 0);
      try { 
        uniformIntegerDistribution0.cumulativeProbability(2, 0);
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (2) must be less than or equal to upper endpoint (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-2335), 0);
      double double0 = uniformIntegerDistribution0.cumulativeProbability((-2150), 0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution((RandomGenerator) null, 296, 1356.66330877);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(296);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution((RandomGenerator) null, 296, 1356.66330877);
      // Undeclared exception!
      try { 
        zipfDistribution0.reseedRandomGenerator((-1023L));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }
}
