/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:36:38 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Abs;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Log1p;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Sqrt;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.11113807559, (-61.9614224356), (-61.9614224356));
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(3, (UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 4417.3, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Sigmoid sigmoid0 = new Sigmoid();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(4, (UnivariateRealFunction) sigmoid0, (-2532.6), 0.0, (double) 4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.008333333333333333, 0.0, 0.0);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.0, 0.0, (-1635.868));
      double double0 = pegasusSolver0.solve(853, (UnivariateRealFunction) harmonicOscillator0, (double) 853, (-1635.868), 1.0E-14);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1025, (UnivariateRealFunction) sqrt0, 0.0, 0.0, allowedSolution0);
      double double1 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.0, 1.1730463525082348E-7, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(20, (UnivariateRealFunction) harmonicOscillator0, (double) 20, 0.0, allowedSolution0);
      double double1 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 1258.86219, 0.0);
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1998), (UnivariateRealFunction) polynomialFunction0, 1.4456468917292502E-16, 0.0, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,998) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(369.2024661384184, 369.2024661384184, 369.2024661384184);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(940, (UnivariateRealFunction) sinh0, 369.2024661384184, 3705.39951734103, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [369.202, 3,705.4], values: [11,004,333,742,547,450,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1891.2900896);
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2441, (UnivariateRealFunction) log1p0, (-1429.9745), (-1429.9745), 1.9868161777724352E-8, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1,429.975, -1,429.975]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(3662, (UnivariateRealFunction) asinh0, 1.0, 1358.4, 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1, 1,358.4], values: [0.881, 7.907]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 1330.1837560187068, 1.997844754509471E-9);
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) inverse0, 3585.1740227, 0.0, 1.997844754509471E-9);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) null, (double) 0, (double) 0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-849.197), (-849.197), (-849.197));
      Tanh tanh0 = new Tanh();
      illinoisSolver0.setup(3261, tanh0, (-635.2885128803), (-635.2885128803), (-0.09088450866185192));
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-635.289, -635.289]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(10.0, 0.5);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(3098, (UnivariateRealFunction) inverse0, (-726.8809842422), 346.561376, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.5, 10.0, 10.0);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1001, (UnivariateRealFunction) inverse0, (-894.08612), 0.0, (-894.08612), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,001) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(10.0, 0.5);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1001, (UnivariateRealFunction) inverse0, (-894.08612), 1978.124303, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Gaussian gaussian0 = new Gaussian(0, 15);
      UnivariateRealFunction univariateRealFunction0 = gaussian0.derivative();
      double double0 = illinoisSolver0.solve(15, univariateRealFunction0, (double) 15, 0.0, 3078.23);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1289.85), (-1289.85));
      Gaussian gaussian0 = new Gaussian();
      double double0 = regulaFalsiSolver0.solve(27, (UnivariateRealFunction) gaussian0, (-1289.85), 828.0, (double) 27);
      double double1 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(10.0, 0.5);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(828, (UnivariateRealFunction) inverse0, (-726.8809842422), 346.561376, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-259.9720650995112), (-397.00406446), (-259.9720650995112));
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1473, (UnivariateRealFunction) signum0, (double) 1473, (-3283.94698502806), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,473, -3,283.947]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0));
      Abs abs0 = new Abs();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1258, (UnivariateRealFunction) abs0, (double) 1258, (-819.521417), (-819.521417));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,258, -819.521]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }
}
