/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 04:31:20 GMT 2020
 */

package org.apache.commons.math.optimization.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.fitting.GaussianFitter;
import org.apache.commons.math.optimization.fitting.WeightedObservedPoint;
import org.apache.commons.math.random.UncorrelatedRandomVectorGenerator;
import org.apache.commons.math.random.UniformRandomGenerator;
import org.apache.commons.math.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math.random.Well19937a;
import org.apache.commons.math.random.Well44497a;
import org.apache.commons.math.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianFitter_ESTest extends GaussianFitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(3845.6040381084, Double.NaN, Double.NEGATIVE_INFINITY);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(Double.NaN, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(Double.NEGATIVE_INFINITY, (-1445.9703995162), Double.NaN);
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(0.0, 451.445121942829, 0.0);
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint((-758.8834), (-2451.84099132), 0.0);
      weightedObservedPointArray0[4] = weightedObservedPoint4;
      WeightedObservedPoint weightedObservedPoint5 = new WeightedObservedPoint((-758.8834), (-1445.9703995162), Double.NEGATIVE_INFINITY);
      weightedObservedPointArray0[5] = weightedObservedPoint5;
      weightedObservedPointArray0[6] = weightedObservedPoint0;
      weightedObservedPointArray0[7] = weightedObservedPointArray0[2];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(3.0, 3.0, 777.2);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(545.4293521973094, Double.NEGATIVE_INFINITY, (-3937.59067));
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint((-3937.59067), 777.2, (-3937.59067));
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair((double[]) null, (double[]) null, false);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
      double[] doubleArray0 = gaussianFitter0.fit((double[]) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
      double[] doubleArray1 = gaussianFitter0.fit(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn((-2140782959), (-2140782959), 1083, 2144876099, 2144876099).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      Well512a well512a0 = new Well512a(18);
      UniformRandomGenerator uniformRandomGenerator0 = new UniformRandomGenerator(well512a0);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(0, uniformRandomGenerator0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 18, uncorrelatedRandomVectorGenerator0);
      GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      double[] doubleArray1 = new double[1];
      double[] doubleArray2 = gaussianFitter0.fit(doubleArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GaussianFitter gaussianFitter0 = new GaussianFitter((DifferentiableMultivariateVectorialOptimizer) null);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        gaussianFitter0.fit(doubleArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.fitting.CurveFitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((VectorialPointValuePair) null).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(0).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      int[] intArray0 = new int[4];
      Well44497a well44497a0 = new Well44497a(intArray0);
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator((-1006), well44497a0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 2410, unitSphereRandomVectorGenerator0);
      GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      // Undeclared exception!
      try { 
        gaussianFitter0.fit((double[]) null);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.random.UnitSphereRandomVectorGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(3.0, 3.0, 777.2);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-3937.59067), 777.2, (-3937.59067));
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      // Undeclared exception!
      try { 
        gaussianFitter_ParameterGuesser0.guess();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[1];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = null;
      try {
        gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      } catch(RuntimeException e) {
         //
         // 1 is smaller than the minimum (3)
         //
         verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((VectorialPointValuePair) null).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(0).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      int[] intArray0 = new int[9];
      Well19937a well19937a0 = new Well19937a(intArray0);
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(140, well19937a0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 140, unitSphereRandomVectorGenerator0);
      GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      gaussianFitter0.fit(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(3845.6040381084, Double.NaN, Double.NEGATIVE_INFINITY);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(Double.NEGATIVE_INFINITY, (-1445.9703995162), Double.NaN);
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      weightedObservedPointArray0[3] = weightedObservedPointArray0[0];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      // Undeclared exception!
      try { 
        gaussianFitter_ParameterGuesser0.guess();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(3845.6040381084, Double.NaN, Double.NEGATIVE_INFINITY);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, 451.445121942829, 0.0);
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      weightedObservedPointArray0[4] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[5] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[6] = weightedObservedPointArray0[2];
      weightedObservedPointArray0[7] = weightedObservedPointArray0[0];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, Double.POSITIVE_INFINITY, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, (-1495.428463), 0.0);
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(0.0, (-1495.428463), Double.POSITIVE_INFINITY);
      weightedObservedPointArray0[3] = weightedObservedPoint2;
      weightedObservedPointArray0[4] = weightedObservedPointArray0[1];
      weightedObservedPointArray0[5] = weightedObservedPoint2;
      weightedObservedPointArray0[6] = weightedObservedPointArray0[0];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[9];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(99.014018737, 99.014018737, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, 99.014018737, 99.014018737);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      weightedObservedPointArray0[2] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      weightedObservedPointArray0[4] = weightedObservedPoint1;
      weightedObservedPointArray0[5] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[6] = weightedObservedPointArray0[4];
      weightedObservedPointArray0[7] = weightedObservedPoint1;
      weightedObservedPointArray0[8] = weightedObservedPointArray0[1];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, Double.POSITIVE_INFINITY, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[2] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[3] = weightedObservedPointArray0[2];
      weightedObservedPointArray0[4] = weightedObservedPointArray0[2];
      weightedObservedPointArray0[5] = weightedObservedPoint0;
      weightedObservedPointArray0[6] = weightedObservedPointArray0[0];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      double[] doubleArray1 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = null;
      try {
        gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser((WeightedObservedPoint[]) null);
      } catch(RuntimeException e) {
         //
         // null is not allowed: input array
         //
         verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GaussianFitter gaussianFitter0 = new GaussianFitter((DifferentiableMultivariateVectorialOptimizer) null);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(1555.82275608024, 0L, (-1912));
      gaussianFitter0.addObservedPoint(weightedObservedPoint0);
      gaussianFitter0.addObservedPoint((double) (-1912), (double) (-1912));
      gaussianFitter0.addObservedPoint((double) 0L, (double) 0L, 2.0);
      // Undeclared exception!
      try { 
        gaussianFitter0.fit();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.fitting.CurveFitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
      // Undeclared exception!
      try { 
        gaussianFitter0.fit();
      } catch(RuntimeException e) {
         //
         // 0 is smaller than the minimum (3)
         //
         verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
      }
  }
}
