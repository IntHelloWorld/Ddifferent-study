/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:18:19 GMT 2020
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
import org.apache.commons.math3.random.Well1024a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegerDistribution_ESTest extends AbstractIntegerDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(3.141592653589793, (-1002));
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
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, 2083);
      int int0 = poissonDistribution0.solveInverseCumulativeProbability(Double.NaN, 2083, 1353);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.cumulativeProbability((-2899), 166);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(296, 296);
      int int0 = zipfDistribution0.solveInverseCumulativeProbability(212, (-1185), 0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.solveInverseCumulativeProbability(3.0, 330, 3764);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0);
      int int0 = poissonDistribution0.solveInverseCumulativeProbability(0.0, (-1305), (-1164));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-3180), 4470);
      int int0 = uniformIntegerDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.cumulativeProbability(0, 0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(Double.NaN);
      // Undeclared exception!
      geometricDistribution0.solveInverseCumulativeProbability(1.0, Integer.MAX_VALUE, Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((RandomGenerator) null, 1098.32021, 1098.32021, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.solveInverseCumulativeProbability(0.0, 0, 1383);
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction convergents failed to converge (in less than 0 iterations) for value 1,098.32
         //
         verifyException("org.apache.commons.math3.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(4.9E-324);
      // Undeclared exception!
      geometricDistribution0.sample(289);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution((RandomGenerator) null, 2762, 0.9105097071630506);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(490);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(693, 693);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a(2147483648L);
      PascalDistribution pascalDistribution0 = new PascalDistribution(well1024a0, 2381, Double.NaN);
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
  public void test14()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution((RandomGenerator) null, 2362, Double.NaN);
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
  public void test15()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) null, 2437, 34, 113);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.reseedRandomGenerator(2437);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(417, 417);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(1.3018591370778052E-7);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.6476961374282837);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.6476961374282837);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, 2083);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-1469));
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1,469)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int[] intArray0 = binomialDistribution0.sample(2);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(0, 1);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      int int0 = zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-711), 3340);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(5.005103745740068E-8);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 0, 1);
      int int0 = hypergeometricDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, 2083);
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
  public void test25()  throws Throwable  {
      GeometricDistribution geometricDistribution0 = new GeometricDistribution(4.9E-324);
      int int0 = geometricDistribution0.inverseCumulativeProbability(4.9E-324);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(0, 1);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, 2083);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2.9802437808251447, 2.9802437808251447);
      try { 
        poissonDistribution0.inverseCumulativeProbability(2.9802437808251447);
      } catch(IllegalArgumentException e) {
         //
         // 2.98 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-711), 3340);
      try { 
        uniformIntegerDistribution0.inverseCumulativeProbability((-3281.12));
      } catch(IllegalArgumentException e) {
         //
         // -3,281.12 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution(0, 1);
      try { 
        uniformIntegerDistribution0.cumulativeProbability(1, 0);
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (1) must be less than or equal to upper endpoint (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-711), 3340);
      uniformIntegerDistribution0.reseedRandomGenerator((-3318L));
  }
}
