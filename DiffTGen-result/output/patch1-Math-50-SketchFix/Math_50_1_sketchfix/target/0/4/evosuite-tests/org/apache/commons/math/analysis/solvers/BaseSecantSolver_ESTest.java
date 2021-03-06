/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:51:17 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Acosh;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinh;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(3, (UnivariateRealFunction) sigmoid0, (-3482.876858697), (double) 3, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-193.9600329));
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1047, (UnivariateRealFunction) sinh0, (-193.9600329), 0.0, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0, 1.0);
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(128, (UnivariateRealFunction) gaussian0, 852.2286472845, 852.2286472845, 3.814697265625E-6, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(3, (UnivariateRealFunction) sigmoid0, 0.9941897820954182, (-3482.876858697), 677.186, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.0, 0.0, 63.311514118888);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-140), (UnivariateRealFunction) harmonicOscillator0, (-425.2784552926577), 0.0, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-140) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2049.874859706723), 0.0);
      Logit logit0 = new Logit();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3649, (UnivariateRealFunction) logit0, (-1315.3241400967854), 1823.146688, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // -1,315.324 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.analysis.function.Logit", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-131), (UnivariateRealFunction) null, 0.0, 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-4343), (UnivariateRealFunction) log0, 0.0, (-1347.37), (double) (-4343), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-4,343) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2500, (UnivariateRealFunction) log10_0, 0.0, (-2561.9), (-2561.9), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -2,561.9]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3147.644143), (-1932.0));
      Acosh acosh0 = new Acosh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) acosh0, (-3147.644143), (-2296.70172309), (-1283.9699));
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Gaussian gaussian0 = new Gaussian();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(369, (UnivariateRealFunction) gaussian0, 0.0, 0.0, (double) 369);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sqrt sqrt0 = new Sqrt();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(31, (UnivariateRealFunction) sqrt0, (-2002.72964), (double) 31, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-2,002.73, 31], values: [\uFFFD, 5.568]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-744.3419819294661));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) null, 472.0, 0.0, (double) 0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-744.3419819294661));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1202, (UnivariateRealFunction) sin0, (double) 1202, 3617.43, allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-744.3419819294661));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1202, (UnivariateRealFunction) sin0, (double) 1202, 3617.43, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(716.8571, 0.0, (-1747.6058490180767));
      Cos cos0 = new Cos();
      double double0 = pegasusSolver0.solve(2079, (UnivariateRealFunction) cos0, (-1422.16308595), 0.0, Double.NEGATIVE_INFINITY);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 1.0, 7.0);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(31, (UnivariateRealFunction) tan0, (double) 31, 1354.68023231, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.2599210498948732, 1.2599210498948732, 1.2599210498948732);
      Minus minus0 = new Minus();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(791, (UnivariateRealFunction) minus0, (double) (-2670), 677.186, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.2599210498948732, 1.2599210498948732, 1.2599210498948732);
      Minus minus0 = new Minus();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(791, (UnivariateRealFunction) minus0, (double) (-2670), 677.186, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-744.3419819294661));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1202, (UnivariateRealFunction) sin0, (double) 1202, 3617.43, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.2599210498948732, 1.2599210498948732, 1.2599210498948732);
      Minus minus0 = new Minus();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(791, (UnivariateRealFunction) minus0, (double) (-2670), 677.186, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 7.0);
      Floor floor0 = new Floor();
      double double0 = pegasusSolver0.solve(31, (UnivariateRealFunction) floor0, 1.0, 7.698713488935028E-11, 8.0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 7.0);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(31, (UnivariateRealFunction) tan0, (double) 31, 1354.68023231, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Ceil ceil0 = new Ceil();
      double double0 = pegasusSolver0.solve(1798, (UnivariateRealFunction) ceil0, 0.0, 0.0, 0.0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.5, 0.5);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 3692;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      illinoisSolver0.setup(3692, polynomialFunction0, 3692.0, 1.0, 0.5);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,692, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0875862700108075);
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
}
