/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:24:43 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Abs;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Constant;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sqrt;
import org.apache.commons.math.analysis.function.Tan;
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
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(20, (UnivariateRealFunction) identity0, 0.0, (-1785.095973385716), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Abs abs0 = new Abs();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(94, (UnivariateRealFunction) abs0, (-1045.758006321564), 0.0, (-543.6875128226), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Cos cos0 = new Cos();
      double double0 = pegasusSolver0.solve(1240, (UnivariateRealFunction) cos0, 0.0, (double) 1240, 0.0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3642.0));
      Sqrt sqrt0 = new Sqrt();
      double double0 = illinoisSolver0.solve(2008, (UnivariateRealFunction) sqrt0, 0.0, 0.0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.19999954120254515);
      Constant constant0 = new Constant(0.0);
      double double0 = pegasusSolver0.solve(750, (UnivariateRealFunction) constant0, (-2626.2965173506), 0.0, (-2626.2965173506));
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-762), (UnivariateRealFunction) sigmoid0, (-0.16666666666666666), 0.0, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-762) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3147, (UnivariateRealFunction) log10_0, (double) 3147, 1448.28402, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,147, 1,448.284]
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
        illinoisSolver0.solve(328, (UnivariateRealFunction) null, 386.9509556512023, (double) 328, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1623.545875915879));
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(356, (UnivariateRealFunction) floor0, 2949.1, (-597.2635572057675), (double) 356, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,949.1, -597.264]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-353.43435163));
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(276, (UnivariateRealFunction) asin0, (-353.43435163), 302.010433974, 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-353.434, 302.01], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(21, (UnivariateRealFunction) cos0, 0.02376267663940076, (double) 21, (-1086.00496739323), (AllowedSolution) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-308.337778252), (-308.337778252));
      Abs abs0 = new Abs();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) abs0, 1180.055868, (-308.337778252), (double) 0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Cos cos0 = new Cos();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1240, (UnivariateRealFunction) cos0, 699.0043654237289, 0.0, (double) 1240);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [699.004, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) null, (double) 0, 1.0E-6, (-1.0));
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0), (-1.0), (-1.0));
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
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 1072.8, 0.0);
      Floor floor0 = new Floor();
      pegasusSolver0.setup(3711, floor0, 1072.8, (-871.91962745155), (-871.91962745155));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,072.8, -871.92]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Sigmoid sigmoid0 = new Sigmoid();
      pegasusSolver0.setup(296, sigmoid0, 0.0, 946.2, 946.2);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 946.2], values: [0.5, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-827.31502));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2549, (UnivariateRealFunction) tan0, 1196.1597236134098, (double) 2549, (-0.3614802723357513), allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.087, 1381.073, 0.087);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(720.08093468, 849.6328, 1.0E-15);
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(505970980, univariateRealFunction0, 756.5534162254, 1381.073, (double) 505970980, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.8014398509481988E16);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2549, (UnivariateRealFunction) tan0, (-4.558223913438166E-14), 0.049032280408679074, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.031);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2549, (UnivariateRealFunction) tan0, 1196.1597236134098, (double) 2549, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.087, 1381.073, 0.087);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(720.08093468, 849.6328, 1.0E-15);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(505970980, (UnivariateRealFunction) harmonicOscillator0, 756.5534162254, 1381.073, (double) 505970980, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.8014398509481984E16);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2549, (UnivariateRealFunction) tan0, 1196.1597236134098, (double) 2549, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(21, (UnivariateRealFunction) cos0, 0.02376267663940076, (double) 21, (-1086.00496739323), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(22, (UnivariateRealFunction) cos0, 0.02376267663940076, (double) 22, (-1086.00496739323), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(21, (UnivariateRealFunction) tanh0, (-1.0), (double) 21, (-1.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(21, (UnivariateRealFunction) tanh0, (-1.0), (double) 21, (-1.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(21, (UnivariateRealFunction) cos0, 0.02, (double) 21, (-1086.00496739323), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(21, (UnivariateRealFunction) cos0, 0.02376267663940076, (double) 21, (-1086.00496739323), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (21) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(23, (UnivariateRealFunction) cos0, 0.02376267663940076, (double) 23, (-1086.00496739323), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-813.32514799));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(5, (UnivariateRealFunction) sin0, (-813.32514799), 0.875, (-813.32514799), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (5) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(38, (UnivariateRealFunction) ceil0, (-3871.40454), (double) 38, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.8014398509481984E16);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2549, (UnivariateRealFunction) tan0, (-4.558223913438166E-14), 0.049032280408679074, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      double double0 = pegasusSolver0.solve(5339, (UnivariateRealFunction) tan0, 2277.88368, 0.0, 2519.408);
  }
}