/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 07:56:33 GMT 2020
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
import org.apache.commons.math.random.MersenneTwister;
import org.apache.commons.math.random.UncorrelatedRandomVectorGenerator;
import org.apache.commons.math.random.UniformRandomGenerator;
import org.apache.commons.math.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math.random.Well19937a;
import org.apache.commons.math.random.Well19937c;
import org.apache.commons.math.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianFitter_ESTest extends GaussianFitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(103.0, 3.0, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-520.07889765), Double.NaN, (-1705.9126255563756));
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
  public void test01()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[6];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-292.128633), (-292.128633), (-292.128633));
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-292.128633), (-292.128633), 0.0);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      weightedObservedPointArray0[4] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(0.0, 406.190482628345, (-1603.30483744));
      weightedObservedPointArray0[5] = weightedObservedPoint2;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[5];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(1.0E-9, 1.0E-9, 1.0E-9);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(200.67, (-2742.7989294661634), (-8909.56565601));
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(200.67, 200.67, 0.0);
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      weightedObservedPointArray0[4] = weightedObservedPoint2;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0, false);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
      double[] doubleArray1 = gaussianFitter0.fit(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((VectorialPointValuePair) null, (VectorialPointValuePair) null, (VectorialPointValuePair) null, (VectorialPointValuePair) null, (VectorialPointValuePair) null).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(0, 0, 0, 0, 0).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      double[] doubleArray0 = new double[9];
      Well44497b well44497b0 = new Well44497b((-1682L));
      UniformRandomGenerator uniformRandomGenerator0 = new UniformRandomGenerator(well44497b0);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(doubleArray0, doubleArray0, uniformRandomGenerator0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 3927, uncorrelatedRandomVectorGenerator0);
      GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      // Undeclared exception!
      gaussianFitter0.fit(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((VectorialPointValuePair) null, (VectorialPointValuePair) null, (VectorialPointValuePair) null, (VectorialPointValuePair) null, (VectorialPointValuePair) null).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(0, 0, 0, 0, 0).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      double[] doubleArray0 = new double[1];
      Well19937a well19937a0 = new Well19937a((long) 374);
      UniformRandomGenerator uniformRandomGenerator0 = new UniformRandomGenerator(well19937a0);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(doubleArray0, doubleArray0, uniformRandomGenerator0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 374, uncorrelatedRandomVectorGenerator0);
      GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
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
      double[] doubleArray0 = new double[4];
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0, false);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn((-1), (-358), (-1548), 2147483646, (-1548)).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 822, unitSphereRandomVectorGenerator0);
      GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      // Undeclared exception!
      try { 
        gaussianFitter0.fit(doubleArray0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-2570.241), 0.0, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, 0.0, 0.0);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
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
  public void test09()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[5];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(1263.96570974133, 0.0, 0.0);
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, 0.0, 0.0);
      weightedObservedPointArray0[4] = weightedObservedPoint1;
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
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[6];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-292.128633), (-292.128633), (-292.128633));
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-292.128633), (-292.128633), 0.0);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      weightedObservedPointArray0[4] = weightedObservedPoint0;
      weightedObservedPointArray0[5] = weightedObservedPointArray0[4];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-2570.241), 0.0, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-979.303540845), (-2570.241), (-979.303540845));
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 1.0, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, 2.147483647E9, 1.0);
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 1.0, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      weightedObservedPointArray0[3] = weightedObservedPointArray0[2];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      double[] doubleArray1 = gaussianFitter_ParameterGuesser0.guess();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((VectorialPointValuePair) null).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(0).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      Well19937c well19937c0 = new Well19937c();
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator((-1032), well19937c0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 2019, unitSphereRandomVectorGenerator0);
      GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        gaussianFitter0.fit(doubleArray0);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.random.UnitSphereRandomVectorGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister((-1203L));
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0, mersenneTwister0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 2541, unitSphereRandomVectorGenerator0);
      GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
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