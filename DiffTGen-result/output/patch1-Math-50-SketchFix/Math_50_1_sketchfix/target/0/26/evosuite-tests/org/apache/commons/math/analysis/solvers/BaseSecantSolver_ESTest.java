/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:57:34 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Acos;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sqrt;
import org.apache.commons.math.analysis.function.Tan;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) tan0, (-1.7168146928204135), (-2.2250738585072014E-308), (-4267.63564479694), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 1.27913513404514E27, 1.27913513404514E27);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(661, (UnivariateRealFunction) cos0, (-2954.7), 1.27913513404514E27, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-5462.7233604));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.0, (-2653.32), 2);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2, (UnivariateRealFunction) harmonicOscillator0, (-5462.7233604), 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(538.458351271353, (-1.7976931348623157E308));
      Gaussian gaussian0 = new Gaussian((-1.7976931348623157E308), 538.458351271353, 2);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2, (UnivariateRealFunction) gaussian0, 826.0021319346789, Double.NEGATIVE_INFINITY, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1283.0), 0.0);
      Sin sin0 = new Sin();
      double double0 = pegasusSolver0.solve(1916, (UnivariateRealFunction) sin0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Logit logit0 = new Logit((-3306.0), (-3306.0));
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      double double0 = regulaFalsiSolver0.solve(903, univariateRealFunction0, 0.2857142686843872, 2.3620841400298745E12, (-3306.0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Logit logit0 = new Logit((-3306.0), (-3306.0));
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      regulaFalsiSolver0.setup(903, univariateRealFunction0, 903, (-3306.0), 903);
      double double0 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-3348), (UnivariateRealFunction) sqrt0, (double) (-3348), (double) (-3348), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,348) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-6, 1.0E-6);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2403, (UnivariateRealFunction) log10_0, 1.0E-6, 1.0E-6, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3319.278594405708);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(15, (UnivariateRealFunction) tan0, 0.008336750013465571, 1.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.008, 1], values: [0.008, 1.557]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, (-70.1));
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 1046;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1046, univariateRealFunction0, 0.0, 0.0, 631.1085689134661, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-691.5));
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(808, (UnivariateRealFunction) sqrt0, (-691.5), (double) 808, (double) 808, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-691.5, 808], values: [\uFFFD, 28.425]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1283.0), 0.0);
      Sin sin0 = new Sin();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2047, (UnivariateRealFunction) sin0, (double) 1916, (-1529.835), (-1.0));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,916, -1,529.835]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1233.2862609946021);
      Acos acos0 = new Acos();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2015, (UnivariateRealFunction) acos0, 1.0E-6, 1172.62327, (double) 2015);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 1,172.623], values: [1.571, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), (-1.0));
      Tan tan0 = new Tan();
      pegasusSolver0.setup(5, tan0, 5, (-1.0), 0.0);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [5, -1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0000000900634047, 2778.0);
      Sigmoid sigmoid0 = new Sigmoid(1.0000000900634047, (-7.800414592973399E-9));
      pegasusSolver0.setup(Integer.MAX_VALUE, sigmoid0, 2303.255369318, 2778.0, 2778.0);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [2,303.255, 2,778], values: [-0, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0));
      Tan tan0 = new Tan();
      pegasusSolver0.setup(601320169, tan0, (-1.7168146928204135), (-1.0), 0.0);
      double double0 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-70.772), (-70.772), (-70.772));
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3, (UnivariateRealFunction) signum0, (-241.5920628), 2930.059, (-241.5920628), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (3) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 1.997844754509471E-9);
      Minus minus0 = new Minus();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(2107, (UnivariateRealFunction) minus0, (-533.0), 113.74651199448, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) tan0, (-1.0), 0.0, 0.0, allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1283.0), 0.0);
      Sin sin0 = new Sin();
      double double0 = pegasusSolver0.solve(2047, (UnivariateRealFunction) sin0, (-141.73727282662463), (-1.0), (double) 1916);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1691.919473543149);
      Logistic logistic0 = new Logistic(1691.919473543149, (-461), (-461), 2116.9035532, (-461), 1.0);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-461), (UnivariateRealFunction) logistic0, (-93.25076208991659), (-6.0), (-1.5574077246549023));
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-461) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
}
