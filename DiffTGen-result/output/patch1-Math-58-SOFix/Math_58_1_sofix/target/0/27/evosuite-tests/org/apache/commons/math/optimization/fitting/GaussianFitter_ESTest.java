/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 07:58:44 GMT 2020
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
import org.apache.commons.math.random.GaussianRandomGenerator;
import org.apache.commons.math.random.MersenneTwister;
import org.apache.commons.math.random.UncorrelatedRandomVectorGenerator;
import org.apache.commons.math.random.UnitSphereRandomVectorGenerator;
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
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-4673.60944), (-4673.60944), (-4673.60944));
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, 0.0, (-4673.60944));
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      weightedObservedPointArray0[2] = weightedObservedPointArray0[1];
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      weightedObservedPointArray0[4] = weightedObservedPointArray0[3];
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(0.0, (-4673.60944), 1.0);
      weightedObservedPointArray0[5] = weightedObservedPoint2;
      weightedObservedPointArray0[6] = weightedObservedPointArray0[3];
      weightedObservedPointArray0[7] = weightedObservedPoint1;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0, false);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
      double[] doubleArray1 = gaussianFitter0.fit(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(188, 2555, 2555, 188, 2555).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 797, unitSphereRandomVectorGenerator0);
      GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      double[] doubleArray1 = new double[7];
      double[] doubleArray2 = gaussianFitter0.fit(doubleArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((VectorialPointValuePair) null).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(0).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      Well512a well512a0 = new Well512a(1674L);
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2971, well512a0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 2971, unitSphereRandomVectorGenerator0);
      GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      gaussianFitter0.fit(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((VectorialPointValuePair) null, (VectorialPointValuePair) null, (VectorialPointValuePair) null, (VectorialPointValuePair) null, (VectorialPointValuePair) null).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(0, 0, 0, 0, 0).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 797, unitSphereRandomVectorGenerator0);
      GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        gaussianFitter0.fit(doubleArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0, true);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(1929, 613, 906).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      GaussianRandomGenerator gaussianRandomGenerator0 = new GaussianRandomGenerator(mersenneTwister0);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(doubleArray0, doubleArray0, gaussianRandomGenerator0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 3, uncorrelatedRandomVectorGenerator0);
      GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      // Undeclared exception!
      try { 
        gaussianFitter0.fit(doubleArray0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[6];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(3023.926393, 3023.926393, 3023.926393);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(3023.926393, 3023.926393, 862.9440468892637);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      weightedObservedPointArray0[3] = weightedObservedPoint0;
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
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[0];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = null;
      try {
        gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      } catch(RuntimeException e) {
         //
         // 0 is smaller than the minimum (3)
         //
         verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1944.6829266780119), 1.0, Double.NaN);
      weightedObservedPointArray0[4] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, 1.0, 0.0);
      weightedObservedPointArray0[7] = weightedObservedPoint1;
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
  public void test10()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-4673.60944), 0.0, 0.0);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-314.449743072591), 0.0, 0.0);
      weightedObservedPointArray0[6] = weightedObservedPoint1;
      weightedObservedPointArray0[7] = weightedObservedPoint0;
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
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, (-40.61768054), (-40.61768054));
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(1.0, 1972.75903004, 0.0);
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      weightedObservedPointArray0[3] = weightedObservedPointArray0[1];
      weightedObservedPointArray0[4] = weightedObservedPoint1;
      weightedObservedPointArray0[5] = weightedObservedPointArray0[1];
      weightedObservedPointArray0[6] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[7] = weightedObservedPointArray0[4];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-4673.60944), (-4673.60944), (-4673.60944));
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[2] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[3] = weightedObservedPointArray0[2];
      weightedObservedPointArray0[4] = weightedObservedPointArray0[0];
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, (-4673.60944), 1.0);
      weightedObservedPointArray0[5] = weightedObservedPoint1;
      weightedObservedPointArray0[6] = weightedObservedPointArray0[3];
      weightedObservedPointArray0[7] = weightedObservedPointArray0[2];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[6];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(3023.926393, 3023.926393, 3023.926393);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(3023.926393, 3023.926393, 862.9440468892637);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      weightedObservedPointArray0[2] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      weightedObservedPointArray0[4] = weightedObservedPoint1;
      weightedObservedPointArray0[5] = weightedObservedPointArray0[1];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[5];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 0.0, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-296.7337861838471), (-296.7337861838471), 0.0);
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(2.220446049250313E-16, (-1.0), 2.220446049250313E-16);
      weightedObservedPointArray0[4] = weightedObservedPoint2;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-2379.473272268725), (-999.190276780335), (-999.190276780335));
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      weightedObservedPointArray0[2] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[3] = weightedObservedPointArray0[0];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      double[] doubleArray1 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair((double[]) null, (double[]) null, true);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      double[] doubleArray0 = new double[9];
      GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
      double[] doubleArray1 = gaussianFitter0.fit(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
