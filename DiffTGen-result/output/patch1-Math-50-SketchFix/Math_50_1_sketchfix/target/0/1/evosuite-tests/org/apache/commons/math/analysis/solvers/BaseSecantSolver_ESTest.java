/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:51:21 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Acos;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sin;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Tan tan0 = new Tan();
      double double0 = pegasusSolver0.solve(127, (UnivariateRealFunction) tan0, 0.0, 0.0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.10526403784751892, 0.10526403784751892, (-926.361485));
      Sin sin0 = new Sin();
      double double0 = pegasusSolver0.solve(670, (UnivariateRealFunction) sin0, 0.10526403784751892, (double) 670, 0.10526403784751892);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-739.0), (-739.0));
      Identity identity0 = new Identity();
      illinoisSolver0.setup(2539, identity0, (-739.0), 2539, (-739.0));
      double double0 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-3855), (UnivariateRealFunction) signum0, (double) (-3855), 2985.272170336, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,855) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Acos acos0 = new Acos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1748, (UnivariateRealFunction) acos0, (double) 1748, (double) 1748, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,748, 1,748]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3, (UnivariateRealFunction) null, 0.0, (-788.3845), allowedSolution0);
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
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) atan0, 1919.5206960651121, (-1.0635304119899214E-19), (-1690.359), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 1.0, 1.0);
      Cosh cosh0 = new Cosh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(917, (UnivariateRealFunction) cosh0, 1831.3702, 1.0, 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,831.37, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1023, (UnivariateRealFunction) null, (double) 1023, (double) 1023, 149.3967277, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sigmoid sigmoid0 = new Sigmoid(1.0E-14, (-3446));
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-3446), (UnivariateRealFunction) sigmoid0, 1.0E-14, 1.0E-14, (double) (-3446));
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,446) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.5, 0.0);
      Sigmoid sigmoid0 = new Sigmoid(0.5, (-1.0));
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(5, (UnivariateRealFunction) sigmoid0, (double) 5, (double) 5, (-1.0));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [5, 5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(598.0447148032, 598.0447148032);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 6;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(6, (UnivariateRealFunction) polynomialFunction0, 0.0, 598.0447148032, 1822.4203804904296);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 598.045], values: [6, 6]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
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
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log10 log10_0 = new Log10();
      regulaFalsiSolver0.setup(2146309277, log10_0, 0.5, 1.0E-15, 0.0);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.5, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1004.0, 1004.0, 1004.0);
      Logit logit0 = new Logit(0.5, 2944);
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      regulaFalsiSolver0.setup(2944, univariateRealFunction0, 1.0, 2944, 1004.0);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1, 2,944], values: [2, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(666, (UnivariateRealFunction) signum0, (-816.7626466983166), 1.1727049984872255, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(655, (UnivariateRealFunction) signum0, (-816.8), 3.145894820876798E-6, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-6.0629103804), 32.19530103865841);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(894, (UnivariateRealFunction) atan0, (-1134.773758265283), 1580.54091, (-1134.773758265283), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(655, (UnivariateRealFunction) signum0, (-816.7626466983166), 3.145894820876798E-6, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(655, (UnivariateRealFunction) signum0, (-816.7626466983166), 3.145894820876798E-6, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(884, (UnivariateRealFunction) atan0, (-1134.773758265283), 1580.540906124378, (-1134.773758265283), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(655, (UnivariateRealFunction) signum0, (-816.7626466983166), 1.1803214526640364, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-6.0629103804), 0.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(894, (UnivariateRealFunction) atan0, (-1134.773758265283), 1580.540906124378, (-1134.773758265283), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(884, (UnivariateRealFunction) atan0, (-1134.773758265283), 1580.540906124378, (-1134.773758265283), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-6.0629103804), 0.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(894, (UnivariateRealFunction) atan0, (-1134.773758265283), 1580.540906124378, (-1134.773758265283), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1025, (UnivariateRealFunction) signum0, (double) 1025, 0.0, (double) 1025, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0E-6, 0.0, 0.0);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(3, (UnivariateRealFunction) tan0, 0.0, 1.0E-6, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1150, (UnivariateRealFunction) atan0, (-338.096679326), 1.0, allowedSolution0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2311.21819628666, 2428.93429, 1.176342548272881E-8);
      Logistic logistic0 = new Logistic(62, 2311.21819628666, 2311.21819628666, 62, 0.0, 57.2957763671875);
      UnivariateRealFunction univariateRealFunction0 = logistic0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(62, univariateRealFunction0, 2546.0, (-1020.8389677), 784.6606729988, allowedSolution0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atan atan0 = new Atan();
      double double0 = illinoisSolver0.solve(1150, (UnivariateRealFunction) atan0, (-338.096679326), 2439.9585047, 2207.0);
  }
}
