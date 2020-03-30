/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 03:58:07 GMT 2020
 */

package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractLeastSquaresOptimizer_ESTest extends AbstractLeastSquaresOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray1, doubleArray0);
      } catch(Exception e) {
         //
         // dimensions mismatch 3 != 2
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      gaussNewtonOptimizer0.cols = 60;
      try { 
        gaussNewtonOptimizer0.guessParametersErrors();
      } catch(Exception e) {
         //
         // no degrees of freedom (0 measurements, 60 parameters)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 100;
      gaussNewtonOptimizer0.residuals = doubleArray0;
      gaussNewtonOptimizer0.rows = 124;
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.getRMS();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 100;
      gaussNewtonOptimizer0.residuals = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double[][]) null).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(gaussNewtonOptimizer0.residuals).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[4];
      levenbergMarquardtOptimizer0.targetValues = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(levenbergMarquardtOptimizer0.targetValues).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray1 = new double[1];
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
      } catch(Exception e) {
         //
         // dimensions mismatch 4 != 1
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[12];
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[3][0];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(levenbergMarquardtOptimizer0.residuals).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      } catch(Exception e) {
         //
         // dimensions mismatch 3 != 12
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      gaussNewtonOptimizer0.rows = 1156;
      double[] doubleArray0 = new double[4];
      gaussNewtonOptimizer0.residuals = doubleArray0;
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.guessParametersErrors();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = (-1329);
      double double0 = levenbergMarquardtOptimizer0.getRMS();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      gaussNewtonOptimizer0.incrementIterationsCounter();
      int int0 = gaussNewtonOptimizer0.getIterations();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      VectorialConvergenceChecker vectorialConvergenceChecker0 = levenbergMarquardtOptimizer0.getConvergenceChecker();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.updateResidualsAndCost();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.updateJacobian();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      gaussNewtonOptimizer0.cols = (-2016);
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.guessParametersErrors();
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.getCovariances();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      VectorialConvergenceChecker vectorialConvergenceChecker0 = gaussNewtonOptimizer0.getConvergenceChecker();
      levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
      double[] doubleArray0 = new double[0];
      gaussNewtonOptimizer0.residuals = doubleArray0;
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      double[] doubleArray1 = new double[4];
      try { 
        gaussNewtonOptimizer0.optimize(differentiableMultivariateVectorialFunction0, gaussNewtonOptimizer0.residuals, doubleArray1, doubleArray1);
      } catch(Exception e) {
         //
         // dimensions mismatch 0 != 4
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      try { 
        gaussNewtonOptimizer0.guessParametersErrors();
      } catch(Exception e) {
         //
         // no degrees of freedom (0 measurements, 0 parameters)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double double0 = levenbergMarquardtOptimizer0.getChiSquare();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      double double0 = gaussNewtonOptimizer0.getRMS();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[3];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray1 = new double[10];
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
      } catch(Exception e) {
         //
         // dimensions mismatch 3 != 10
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[5];
      levenbergMarquardtOptimizer0.setMaxEvaluations(0);
      levenbergMarquardtOptimizer0.objective = doubleArray0;
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn((MultivariateMatrixFunction) null).when(differentiableMultivariateVectorialFunction0).jacobian();
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, levenbergMarquardtOptimizer0.objective, levenbergMarquardtOptimizer0.objective, levenbergMarquardtOptimizer0.objective);
      } catch(Exception e) {
         //
         // maximal number of evaluations (0) exceeded
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[2];
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[3][0];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(levenbergMarquardtOptimizer0.residuals).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      } catch(Exception e) {
         //
         // dimensions mismatch 3 != 2
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      gaussNewtonOptimizer0.setMaxIterations(0);
      try { 
        gaussNewtonOptimizer0.incrementIterationsCounter();
      } catch(Exception e) {
         //
         // maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      int int0 = gaussNewtonOptimizer0.getJacobianEvaluations();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
      int int0 = gaussNewtonOptimizer0.getEvaluations();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      int int0 = levenbergMarquardtOptimizer0.getMaxIterations();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      int int0 = gaussNewtonOptimizer0.getIterations();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      int int0 = levenbergMarquardtOptimizer0.getMaxEvaluations();
  }
}
