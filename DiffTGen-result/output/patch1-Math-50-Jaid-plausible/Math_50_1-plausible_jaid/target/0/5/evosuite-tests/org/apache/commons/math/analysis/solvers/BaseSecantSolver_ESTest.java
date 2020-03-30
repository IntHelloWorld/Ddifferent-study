/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:34:13 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Abs;
import org.apache.commons.math.analysis.function.Acosh;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Constant;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Log1p;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Tan;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(4, (UnivariateRealFunction) log1p0, (double) 4, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-4140.5547), (-2789.49845963489), 1749.6852);
      Sigmoid sigmoid0 = new Sigmoid();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(248, (UnivariateRealFunction) sigmoid0, (-2789.49845963489), (-2789.49845963489), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Abs abs0 = new Abs();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1159, (UnivariateRealFunction) abs0, 1086.4359840786312, 0.0, (-552.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3659.204144, 3698.6149197980985);
      Logistic logistic0 = new Logistic(195, 3698.6149197980985, 3698.6149197980985, 195, 3659.204144, 3659.204144);
      UnivariateRealFunction univariateRealFunction0 = logistic0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(195, univariateRealFunction0, (-2006.0), 3659.204144, 3698.6149197980985, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-519.0524975808412), 0.0);
      Ceil ceil0 = new Ceil();
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) ceil0, (-0.23932206770729245), (-519.0524975808412), 0.0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1909, (UnivariateRealFunction) log10_0, (double) 1909, (double) 1909, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,909, 1,909]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1028.26316813671, 1028.26316813671, 1028.26316813671);
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1626, (UnivariateRealFunction) ceil0, 0.2, 1263.992643285498, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.2, 1,263.993], values: [1, 1,264]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Logit logit0 = new Logit(0.0, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1978, (UnivariateRealFunction) logit0, 0.5, 0.0, 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // 0.5 out of [0, 0] range
         //
         verifyException("org.apache.commons.math.analysis.function.Logit", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-519.0524975808412), 0.0);
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(64, (UnivariateRealFunction) ceil0, 1094.887251331269, 3853.1735401, 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1,094.887, 3,853.174], values: [1,095, 3,854]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-519.0524975808412), 0.0);
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(5, (UnivariateRealFunction) tan0, (-519.0524975808412), 2541.99424269, 0.0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (5) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1644.40595223, 1644.40595223, 1644.40595223);
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(5, (UnivariateRealFunction) tan0, 1644.40595223, (double) 5, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,644.406, 5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Abs abs0 = new Abs();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3, (UnivariateRealFunction) abs0, 1086.4359840786312, (double) 1159, (-1956.4564265269));
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1,086.436, 1,159], values: [1,086.436, 1,159]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, 0.0);
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
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-858.178509065), (-1368.0));
      Log1p log1p0 = new Log1p();
      regulaFalsiSolver0.setup(939, log1p0, 1.0, 1.0, 1.0E-6);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2014.17980209598);
      Constant constant0 = new Constant(204);
      regulaFalsiSolver0.setup(Integer.MAX_VALUE, constant0, 204, 2417.26825892, 1894.2705613);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [204, 2,417.268], values: [204, 204]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 1317.9534636437968);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(4, (UnivariateRealFunction) log10_0, 0.5, (double) 4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1909, (UnivariateRealFunction) log10_0, 0.149823, (double) 1909, 1.0, allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4069.739);
      Atan atan0 = new Atan();
      regulaFalsiSolver0.setup(1922690058, atan0, (-1473.0), 2.596097939855523, (-1473.0));
      double double0 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 4339.448938919, 1317.9534636437968);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(4, (UnivariateRealFunction) log10_0, 0.5, (double) 4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 4339.448938919, 1317.9534636437968);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(4, (UnivariateRealFunction) log10_0, 0.5, (double) 4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-15.865118730529819));
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(27, (UnivariateRealFunction) sinh0, (-15.865118730529819), (double) 27, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (27) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(36, (UnivariateRealFunction) log10_0, 0.5, (double) 36, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-519.0524975808412), 0.0);
      Tan tan0 = new Tan();
      double double0 = pegasusSolver0.solve(76, (UnivariateRealFunction) tan0, (-519.0524975808412), 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-519.0524975808412), 0.0);
      Ceil ceil0 = new Ceil();
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) ceil0, 0.0, (-519.0524975808412), 0.0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 4339.448938919, 1317.9534636437968);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(4, (UnivariateRealFunction) log10_0, 0.5, (double) 4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Log10 log10_0 = new Log10();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1738.130549385099, 1738.130549385099, 1738.130549385099);
      double double0 = illinoisSolver0.solve(199, (UnivariateRealFunction) log10_0, 0.0, 1738.130549385099, 1.3777821907798407);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      Acosh acosh0 = new Acosh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) acosh0, (double) 0, 0.0, 0.0, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1909, (UnivariateRealFunction) log10_0, 0.14982303977012634, (double) 1909, 1.0, allowedSolution0);
  }
}
