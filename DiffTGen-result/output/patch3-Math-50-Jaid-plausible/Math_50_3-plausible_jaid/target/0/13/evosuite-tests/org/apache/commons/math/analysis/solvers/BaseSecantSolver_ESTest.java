/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 01:34:57 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Abs;
import org.apache.commons.math.analysis.function.Acos;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Power;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinc;
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
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-4179.182670278));
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(8, (UnivariateRealFunction) ceil0, (-4179.182670278), (double) 8, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Abs abs0 = new Abs();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(405, (UnivariateRealFunction) abs0, 0.0, (double) 405, 452.3, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian(4, 4, 4);
      double double0 = regulaFalsiSolver0.solve(4, (UnivariateRealFunction) gaussian0, 485.72219, 0.0, 1913.3926452346618);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1902.118371));
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-3369), (UnivariateRealFunction) rint0, (double) (-3369), (double) (-3369), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,369) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(709, (-1.0), 709);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(709, (UnivariateRealFunction) harmonicOscillator0, 2541.75924603, 2541.75924603, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,541.759, 2,541.759]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(10.99555233, 979.7738924);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(820, (UnivariateRealFunction) null, 3642.9752, 10.99555233, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(8388608, (UnivariateRealFunction) ceil0, (double) 8388608, 442.0148208429, 442.0148208429, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [8,388,608, 442.015]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) null, 3211.1578852070184, (-4496.9), (double) 0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(29, (UnivariateRealFunction) tanh0, (-53.45976390513967), (double) 29, (double) 29, (AllowedSolution) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-0.0013888888689039883), 1142.89043523);
      Sigmoid sigmoid0 = new Sigmoid();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1638), (UnivariateRealFunction) sigmoid0, (-0.0013888888689039883), (-0.0013888888689039883), (double) (-1638));
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,638) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0), (-1.0), 0.0);
      Acos acos0 = new Acos();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(3261, (UnivariateRealFunction) acos0, (-799.0), 0.0, 0.333333333333333);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-799, 0], values: [\uFFFD, 1.571]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1381.7236, (-1643.9497099127), 1381.7236);
      Sqrt sqrt0 = new Sqrt();
      pegasusSolver0.setup(27787985, sqrt0, 2651.6482862958023, (-498.84547221461554), 485.855);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,651.648, -498.845]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(12, (UnivariateRealFunction) tanh0, (-53.45976390513967), (double) 12, (double) 12, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.6698476875540135, 0.6698476875540135);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(62, (UnivariateRealFunction) tanh0, (-32.0), (double) 62, (double) 62, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(29, (UnivariateRealFunction) tanh0, (-58.737186833581056), (double) 29, (double) 29, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(68, (UnivariateRealFunction) tanh0, (-53.45976390513967), (double) 68, (double) 68, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(62, (UnivariateRealFunction) tanh0, (-32.0), (double) 62, (double) 62, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(58, (UnivariateRealFunction) tanh0, (-32.0), (double) 58, (double) 58, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(29, (UnivariateRealFunction) tanh0, (-53.45976390513967), (double) 29, (double) 29, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(29, (UnivariateRealFunction) tanh0, (-53.45976390513967), (double) 29, (double) 29, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(62, (UnivariateRealFunction) tanh0, (-32.0), (double) 62, (double) 62, allowedSolution0);
      double double1 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(62, (UnivariateRealFunction) tanh0, (-32.0), (double) 62, (double) 62, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      double double0 = pegasusSolver0.solve(224, (UnivariateRealFunction) sin0, (double) 224, 448.10339292);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(26.822968989955786);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(24, (UnivariateRealFunction) sinc0, 0.0, (double) 24, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(29, (UnivariateRealFunction) tanh0, (-53.45976390513967), (double) 29, (double) 29, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, 0.0);
      Ceil ceil0 = new Ceil();
      double double0 = pegasusSolver0.solve(1120, (UnivariateRealFunction) ceil0, 0.0, (-1.0), 0.0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, 0.0);
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1120, (UnivariateRealFunction) ceil0, (-1205.8896), 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1085.9971660033132, (-617.471694));
      Power power0 = new Power(0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(Integer.MIN_VALUE, (UnivariateRealFunction) power0, 1085.9971660033132, 0.0, 1085.9971660033132, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,147,483,648) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, 0.0);
      Ceil ceil0 = new Ceil();
      double double0 = pegasusSolver0.solve(1120, (UnivariateRealFunction) ceil0, (-1308.4807), 1.0E-6, (-1205.8896));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Log log0 = new Log();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(5, (UnivariateRealFunction) log0, (double) 5, (-161.0180428601406), 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [5, -161.018]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }
}