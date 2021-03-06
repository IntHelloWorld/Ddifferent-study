/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:18:10 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Constant;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Signum;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver(443.69603493, 443.69603493, 0.0);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(443.69603493, 443.69603493, 403.854958920884);
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(24, univariateRealFunction0, 0.15, (double) 24, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Asin asin0 = new Asin();
      double double0 = illinoisSolver0.solve(5, (UnivariateRealFunction) asin0, (double) 5, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-1160.58), 808.0, (-0.02849680429651181));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1152.0714929855094));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-20.284842968132494), (double) 336, allowedSolution0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-1733.68888569367));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Cbrt cbrt0 = new Cbrt();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1514), (UnivariateRealFunction) cbrt0, (-3727.0), 1.0E-6, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,514) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.7168146928204135), 731.398761569498);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3060, (UnivariateRealFunction) inverse0, (double) 3060, (-2044.8122471698166), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,060, -2,044.812]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.008333333333329196, 0.0, 0.0);
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-3652), (UnivariateRealFunction) signum0, 0.0, 0.0, 0.0, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,652) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-725.0), 0.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1748, (UnivariateRealFunction) atan0, (-725.0), (-2545.8), (-725.0), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-725, -2,545.8]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Constant constant0 = new Constant(4);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(4, (UnivariateRealFunction) constant0, (-2767.575), (double) 4, (double) 4, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-2,767.575, 4], values: [4, 4]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(808.0);
      Cbrt cbrt0 = new Cbrt();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-4029), (UnivariateRealFunction) cbrt0, 24.473419336197082, (double) (-4029), 24.473419336197082);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-4,029) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(134, (UnivariateRealFunction) asinh0, 1.25, 1.25, 1.25);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1.25, 1.25]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, (-2550.0));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) null, (-2550.0), (-2550.0), (double) 0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3633.643302545947);
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
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1421.441392477), (-882.541783));
      Rint rint0 = new Rint();
      illinoisSolver0.setup(2944, rint0, 2944, 2944, (-1421.441392477));
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,944, 2,944]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1160.58), 808.0, (-1160.58));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-0.16624879837036133), (double) 336, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-20.284842968132494), (double) 336, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-20.284842968132494), (double) 336, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(808.0, 808.0, (-1160.58));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-20.284842968132494), (double) 336, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1160.58), 808.0, (-1160.58));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(5571, (UnivariateRealFunction) cbrt0, (-0.16624879837036133), 808.0, 1.067178E-6, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1160.58));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-20.284842968132494), (double) 336, allowedSolution0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1160.58));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-20.284842968132494), (double) 336, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1160.58), (-1160.58), 808.0);
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-20.284842968132494), (double) 336, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1160.58), 808.0, (-1160.58));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-0.16624879837036133), (double) 336, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-1733.68888569367));
      Minus minus0 = new Minus();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1094, (UnivariateRealFunction) minus0, (-1733.68888569367), 1362.139, allowedSolution0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-1733.68888569367));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Atan atan0 = new Atan();
      double double0 = illinoisSolver0.solve(1094, (UnivariateRealFunction) atan0, 1362.139, 0.0, 1362.139, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-20.284842968132494), (double) 336, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-1160.58), 1.0E-6, 0.0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-1733.68888569367));
      Minus minus0 = new Minus();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1094, (UnivariateRealFunction) minus0, 0.0, (-1733.68888569367), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, (-860.083111675772));
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1025, (UnivariateRealFunction) asin0, (-3873.0), 1.570796251296997, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-3,873, 1.571], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1160.58));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(336, (UnivariateRealFunction) cbrt0, (-20.284842968132494), (double) 336, allowedSolution0);
  }
}
