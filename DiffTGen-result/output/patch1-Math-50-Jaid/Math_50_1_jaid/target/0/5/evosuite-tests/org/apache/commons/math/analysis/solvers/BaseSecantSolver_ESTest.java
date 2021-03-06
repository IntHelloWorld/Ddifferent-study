/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 10:42:35 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Constant;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.function.Ulp;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-209.205900170162));
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(12, (UnivariateRealFunction) gaussian0, 219.1326, 12.0, 2696.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      Logistic logistic0 = new Logistic(0.0, (-848.3814909674273), 27, 27, (-848.3814909674273), 0.167);
      double double0 = regulaFalsiSolver0.solve(27, (UnivariateRealFunction) logistic0, (double) 27, 0.0, (double) 27);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-223.73843), (-223.73843), 231.72458379141);
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(750, (UnivariateRealFunction) gaussian0, (-982.45381122), 2972.02, 0.10526403784751892, allowedSolution0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-811.02541322), 1.0, 1.0);
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(230, (UnivariateRealFunction) asinh0, 2462.15324557072, 424.0234281, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,462.153, 424.023]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1696.67468521, 1696.67468521);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(22, (UnivariateRealFunction) inverse0, (double) 22, 574.5483259226, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [22, 574.548], values: [0.045, 0.002]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Constant constant0 = new Constant(0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) constant0, (double) 0, (double) 0, 1.125, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 2058.9511744596234, 1.0);
      Minus minus0 = new Minus();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(42, (UnivariateRealFunction) minus0, 3965.957885155919, 1.0E-6, 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,965.958, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Ulp ulp0 = new Ulp();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(795, (UnivariateRealFunction) ulp0, 0.0, 0.6299605249474366, (-181.0), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 0.63], values: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.0, 428.1, (-1.0));
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1025, (UnivariateRealFunction) harmonicOscillator0, 4086.35053, 4086.35053, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4,086.351, 4,086.351]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0E-6);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3174, (UnivariateRealFunction) null, (-1382.81), (-1382.81), (-52.1740495617816));
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cosh cosh0 = new Cosh();
      regulaFalsiSolver0.setup(1401, cosh0, 0.0, (-0.010714690733195933), 0.0);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -0.011]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(3082.992776);
      Tanh tanh0 = new Tanh();
      double double0 = pegasusSolver0.solve(33, (UnivariateRealFunction) tanh0, (-2560.671633889497), (double) 33, 79.40900490438784);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), 1548.9074381984794, (-1.0));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(88, (UnivariateRealFunction) expm1_0, (-1404.88419991), 83.3864, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-811.02541322), 1.0, 1.0);
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(115, (UnivariateRealFunction) asinh0, (-1215.6392027976), 1360.87, allowedSolution0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-811.02541322), 1.0, 1.0);
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(230, (UnivariateRealFunction) asinh0, (-811.02541322), 430.16721916084026, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-1.0));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(88, (UnivariateRealFunction) expm1_0, (-1404.88419991), 75.03216227197099, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (88) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-1.0));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(99, (UnivariateRealFunction) asinh0, (-637.247239), 53.73416682057278, (-255.39399), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-1.0));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(88, (UnivariateRealFunction) expm1_0, (-1404.88419991), 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-1.0));
      Expm1 expm1_0 = new Expm1();
      double double0 = regulaFalsiSolver0.solve(99, (UnivariateRealFunction) expm1_0, 0.0, 0.0, (double) 99);
      double double1 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-811.02541322), 1.0, 1.0);
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(115, (UnivariateRealFunction) asinh0, (-1198.9250312420447), 1360.87, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-811.02541322), 1.0, 1.0);
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) asinh0, 1052.5765736538, (double) 0, 430.16721916084026);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
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
}
