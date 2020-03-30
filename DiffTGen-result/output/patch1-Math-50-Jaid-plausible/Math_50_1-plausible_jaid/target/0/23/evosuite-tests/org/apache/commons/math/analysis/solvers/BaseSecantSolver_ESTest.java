/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:38:58 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Acosh;
import org.apache.commons.math.analysis.function.Atanh;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sqrt;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2275.995931, 2275.995931, 2275.995931);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(4168, (UnivariateRealFunction) log10_0, (-2013.0), 1.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.3577871194071213);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(345, (UnivariateRealFunction) cos0, (-2920.078869176), 196.0, 2.3841857910019882E-8, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0, 1.0, 1.0);
      Rint rint0 = new Rint();
      double double0 = illinoisSolver0.solve(214, (UnivariateRealFunction) rint0, 1.0, 0.0, 479.249686235178);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3420.7));
      Gaussian gaussian0 = new Gaussian((-3420.7), (-3420.7), 4157);
      UnivariateRealFunction univariateRealFunction0 = gaussian0.derivative();
      double double0 = regulaFalsiSolver0.solve(4157, univariateRealFunction0, (double) 4157, (-3420.7), (-3420.7));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, (-202.459391468933));
      Floor floor0 = new Floor();
      pegasusSolver0.setup(909, floor0, 0.0, 909, 0.0);
      double double0 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian();
      regulaFalsiSolver0.setup(3766, gaussian0, 3766, 3766, 3766);
      double double0 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-159), (UnivariateRealFunction) sqrt0, 128.1530045, (-1.0), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-159) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) null, (double) 0, (-496.4277), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-242), (UnivariateRealFunction) sin0, (-1756.653768116447), (double) (-242), (-723.5144), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-242) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1269, (UnivariateRealFunction) floor0, 3073.07051, (-265.5352984777), 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,073.071, -265.535]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-4035), (UnivariateRealFunction) null, (-2682.447), (-1686.0827), (-2682.447), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1833.48249));
      Ceil ceil0 = new Ceil();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(5, (UnivariateRealFunction) ceil0, (double) 5, (-3186.217), 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [5, -3,186.217]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.5, 0.1538461446762085, 0.5);
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.3577871194071213);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(345, (UnivariateRealFunction) cos0, 0.0, 1465.5535460956917, 0.07692307692307693, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2.957007209750105E-8));
      Cos cos0 = new Cos();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(345, (UnivariateRealFunction) cos0, 0.07692307692307693, 3721.5, 1.0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (345) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.3577871194071213);
      Cos cos0 = new Cos();
      double double0 = regulaFalsiSolver0.solve(345, (UnivariateRealFunction) cos0, 0.07692307692307693, 3721.5, 1.0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1269, (UnivariateRealFunction) floor0, (-787.409050482878), 147.903583436, 3073.07051, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, (-1996.323073195246), 0.0);
      Atanh atanh0 = new Atanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(835, (UnivariateRealFunction) atanh0, 0.0, (-1861.518321), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1025, (UnivariateRealFunction) cbrt0, (double) 1025, (double) 1025, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,025, 1,025]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1246.390643327), (-1246.390643327));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(3430, (UnivariateRealFunction) tan0, (-1090.88625), 0.0, (-1246.390643327), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0, 0.0);
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(52, (UnivariateRealFunction) sinc0, 0.0, 5390.2662025284);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (52) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Acosh acosh0 = new Acosh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2005, (UnivariateRealFunction) acosh0, (-3108.1), 1.0E-6, (-3108.1));
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-3,108.1, 0], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }
}