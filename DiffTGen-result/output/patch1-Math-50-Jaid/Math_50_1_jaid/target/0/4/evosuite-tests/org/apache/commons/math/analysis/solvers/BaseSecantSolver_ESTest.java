/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 10:42:37 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Sqrt;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), 0.7249995199969751, (-1.0));
      Sinh sinh0 = new Sinh();
      double double0 = pegasusSolver0.solve(2, (UnivariateRealFunction) sinh0, 0.0, 3189.73274684533, 0.7249995199969751);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian();
      double double0 = regulaFalsiSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) gaussian0, (-0.16624879837036133), 3097.0, (-2490.233185684602));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1953.7167043602517), 775.965892);
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(2379, (UnivariateRealFunction) cbrt0, 0.0, (double) 2379, (double) 2379, allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1), (UnivariateRealFunction) asinh0, (-985.903082314), 0.0, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0E-6);
      Logistic logistic0 = new Logistic(1.0E-6, 221, 1.0E-6, 0.0, 1.0E-6, 221);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(221, (UnivariateRealFunction) logistic0, 0.0, 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1953.7167043602517), 775.965892);
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2375, (UnivariateRealFunction) cbrt0, (-2751.54539896597), (-627.2984510164428), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-2,751.545, -627.298], values: [-14.013, -8.56]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1470.7473982, 1.997844754509471E-9);
      Gaussian gaussian0 = new Gaussian(0.087, 15.0, 2662.71363828);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) gaussian0, (-51.700376983069), (-2836.706689), (-2836.706689), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logistic logistic0 = new Logistic(3, 526.7561038694848, 526.7561038694848, 0.0, (-0.16666666666666666), 0.7249995199969751);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(31, (UnivariateRealFunction) logistic0, 0.08371849358081818, (double) 31, 499.3585868851, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.084, 31], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3775.92444, 3775.92444);
      Cos cos0 = new Cos();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) cos0, (double) 0, 3775.92444, (double) 0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Floor floor0 = new Floor();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2, (UnivariateRealFunction) floor0, (double) 2, (double) 2, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2, 2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2548.024219), (-2.6033824355191673E-8));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(274, (UnivariateRealFunction) null, (double) 274, 0.0, (-1289.270712033472));
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-78.83));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      pegasusSolver0.setup(4, asinh0, 4, (-89.63321), 11.705809567636178);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4, -89.633]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1953.7167043602517), 775.965892);
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) cbrt0, (-2751.54539896597), 775.965892, 2645.2, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1953.7167043602517), 775.965892);
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2379, (UnivariateRealFunction) cbrt0, (-1953.7167043602517), (double) 2379, (double) 2379, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1953.7167043602517), 775.965892);
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2379, (UnivariateRealFunction) cbrt0, (-2751.54539896597), 775.965892, 2645.2, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1953.7167043602517), (-1953.7167043602517));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2147477537, (UnivariateRealFunction) cbrt0, (-6416.4), 688.62346394, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1953.7167043602517), (-1953.7167043602517));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(2147477537, (UnivariateRealFunction) cbrt0, (-6416.4), 688.62346394, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1953.7167043602517), (-1953.7167043602517));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2379, (UnivariateRealFunction) cbrt0, (-1953.7167043602517), (double) 2379, (double) 2379, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1953.7167043602517), 775.965892);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(775.965892, (-1953.7167043602517), 775.965892);
      double double0 = pegasusSolver0.solve(1692607643, (UnivariateRealFunction) harmonicOscillator0, 775.965892, (double) 1692607643);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-414.1), (-414.1));
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(8, (UnivariateRealFunction) rint0, (-414.1), (double) 8, allowedSolution0);
      double double1 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1953.7167043602517), 775.965892);
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2375, (UnivariateRealFunction) cbrt0, 1604.0, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0), 499.203306929, 825.6185788436916);
      Tanh tanh0 = new Tanh();
      double double0 = illinoisSolver0.solve(981, (UnivariateRealFunction) tanh0, (-884.946958283), 5.0, 5.0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1952.917905754855), 775.965892);
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2379, (UnivariateRealFunction) cbrt0, (-1952.917905754855), (double) 2379, (double) 2379, allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(724.32193478209, 724.32193478209, 724.32193478209);
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(17, (UnivariateRealFunction) sqrt0, 818.0, 818.0, (double) 17, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [818, 818]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2147477537, (UnivariateRealFunction) cbrt0, (-6416.4), 688.62346394, allowedSolution0);
  }
}
