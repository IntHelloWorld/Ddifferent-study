/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:36:44 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Acosh;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Atanh;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinc;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, (-1582.0));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(18, (UnivariateRealFunction) asinh0, 0.0, (-1582.0), 1.3245471311735498E-8, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(931.666849073, 931.666849073);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(3085, (UnivariateRealFunction) sin0, 0.0, 0.0, allowedSolution0);
      double double1 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Gaussian gaussian0 = new Gaussian();
      double double0 = pegasusSolver0.solve(928, (UnivariateRealFunction) gaussian0, (-367.730832), 0.0, 0.0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2080.74426795013, 2080.74426795013);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) tanh0, (double) 0, 1251.9159665273, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-551.81925516));
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(326, (UnivariateRealFunction) signum0, (double) 326, (double) 326, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [326, 326]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-442.609291679));
      Acosh acosh0 = new Acosh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(4, (UnivariateRealFunction) acosh0, (-442.609291679), (-71.5983708033), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-442.609, -71.598], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2934.10486), (-1672.826574842238));
      Logit logit0 = new Logit((-1672.826574842238), 0.0);
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(5, univariateRealFunction0, 0.0, (double) 5, (-1672.826574842238), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (5) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-265.921759), (-265.921759), (-265.921759));
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2127, (UnivariateRealFunction) ceil0, (double) 2127, (double) 2127, (double) 2127, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,127, 2,127]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(4, (UnivariateRealFunction) sinc0, (-3505.469809669), 419.5705863408037, 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-3,505.47, 419.571], values: [-0, -0.002]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) tanh0, (double) 0, (double) 0, (-133.1));
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2523.300366066567), (-2036.0301020983081));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(889, (UnivariateRealFunction) null, (-2036.0301020983081), (-2523.300366066567), 0.0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atanh atanh0 = new Atanh();
      double double0 = pegasusSolver0.solve(4, (UnivariateRealFunction) atanh0, 809.39778540675, 0.0, 0.0);
      double double1 = pegasusSolver0.computeObjectiveValue(809.39778540675);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (4) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      pegasusSolver0.setup(342, signum0, 342, 342, (-953.6));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [342, 342]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(928, (UnivariateRealFunction) signum0, (-953.6), (double) 342, (-2897.2306500365), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(931.666849073, 931.666849073, 931.666849073);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(3085, (UnivariateRealFunction) sin0, 931.666849073, (double) 3085, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1672.826574842238));
      Logit logit0 = new Logit((-1672.826574842238), 786843000);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(786843000, (UnivariateRealFunction) logit0, (-1672.826574842238), (double) 786843000, (-1672.826574842238), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(928, (UnivariateRealFunction) signum0, (-953.6), (double) 342, (-2897.2306500365), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(931.666849073, 931.666849073);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(612406985, (UnivariateRealFunction) sin0, 931.666849073, (double) 612406985, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(342, (UnivariateRealFunction) gaussian0, 0.0, 361.5028465085068, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(931.666849073, 931.666849073);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(3085, (UnivariateRealFunction) sin0, 931.666849073, (double) 3085, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(57.2957763671875, (-1749.75));
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(606, (UnivariateRealFunction) gaussian0, (-1749.75), (double) 606, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-946.7363013045252), 0.0);
      Logit logit0 = new Logit((-2099.308259), (-2099.308259));
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1442, (UnivariateRealFunction) logit0, (double) 1442, (-680.161385), (-2918.0));
      } catch(IllegalArgumentException e) {
         //
         // 1,442 out of [-2,099.308, -2,099.308] range
         //
         verifyException("org.apache.commons.math.analysis.function.Logit", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Gaussian gaussian0 = new Gaussian();
      double double0 = pegasusSolver0.solve(928, (UnivariateRealFunction) gaussian0, (double) 928, (double) 928, (double) 928);
      double double1 = pegasusSolver0.doSolve();
  }
}
