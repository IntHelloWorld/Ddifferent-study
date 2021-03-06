/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:51:21 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Acosh;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sqrt;
import org.apache.commons.math.analysis.function.Tan;
import org.apache.commons.math.analysis.function.Ulp;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1001.0002232617095));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(691, (UnivariateRealFunction) sin0, 382.0502508361, 0.0, 4236.606, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sigmoid sigmoid0 = new Sigmoid(0.0, (-3139.444101));
      double double0 = regulaFalsiSolver0.solve(27, (UnivariateRealFunction) sigmoid0, (-1.9841269659586505E-4), (-3139.444101), (-1.9841269659586505E-4));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1001.0002232617095));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(691, (UnivariateRealFunction) sin0, (double) 691, 1264.2927545, allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Ulp ulp0 = new Ulp();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) ulp0, (double) 0, (double) 0, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1001.0002232617095));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Sqrt sqrt0 = new Sqrt();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2599, (UnivariateRealFunction) sqrt0, 4457.266347052709, (-101.6128), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4,457.266, -101.613]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(7, (UnivariateRealFunction) null, (double) 7, (double) 7, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.008333333333329196);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.008333333333329196, (-680.06670989823), (-680.06670989823));
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) harmonicOscillator0, (-680.06670989823), 0.008333333333329196, (-680.06670989823), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(885.5211116025, 885.5211116025, 3.141592653589793);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(24, (UnivariateRealFunction) inverse0, (-3721.80040734432), (-3721.80040734432), 2710.014323558439, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-3,721.8, -3,721.8]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Acosh acosh0 = new Acosh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(8388607, (UnivariateRealFunction) acosh0, 0.0, (double) 8388607, (double) 8388607, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 8,388,607], values: [\uFFFD, 16.636]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 2085.81004);
      Logit logit0 = new Logit(0.0, 2085.81004);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) logit0, 2085.81004, 0.0, 2085.81004);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2437.2782433382);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) null, 0.0, 0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-699.27131));
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
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), 1577.91802393);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 3826;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      regulaFalsiSolver0.setup(10, polynomialFunction0, (-844.5788), (-4973.591194467), 0.0);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-844.579, -4,973.591]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-993.97));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(691, (UnivariateRealFunction) sin0, (-993.97), 1264.2927545, (-993.97), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1001.0002232617095));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(691, (UnivariateRealFunction) sin0, (double) 691, 1264.2927545, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-993.97));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2599, (UnivariateRealFunction) sin0, (-1543.66), (double) 2599, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1001.0002232617095));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2599, (UnivariateRealFunction) sin0, 1.0E-6, (double) 2599, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1001.0002232617095));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2599, (UnivariateRealFunction) sin0, 1.0E-6, (double) 2599, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1001.0002232617095));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(2599, (UnivariateRealFunction) sin0, 1.0E-6, (double) 2599, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      double double0 = regulaFalsiSolver0.solve(1016, (UnivariateRealFunction) atan0, (-1417.8415180084), 1.0E-6, 318.9179564754);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.10526403784751892, 0.10526403784751892);
      Tan tan0 = new Tan();
      double double0 = illinoisSolver0.solve(2041, (UnivariateRealFunction) tan0, 0.10526403784751892, (double) 2041);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1001.0002232617095));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(691, (UnivariateRealFunction) sin0, (-1001.0002232617095), 1264.2927545, (-1001.0002232617095), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1001.0002232617095));
      Sqrt sqrt0 = new Sqrt();
      double double0 = pegasusSolver0.solve(19, (UnivariateRealFunction) sqrt0, 0.0, 808.457945020751, 3427.0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1001.0002232617095));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(691, (UnivariateRealFunction) sin0, (double) 691, 0.0, allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(408.421, (-984.5852420794154));
      Log10 log10_0 = new Log10();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1509, (UnivariateRealFunction) log10_0, (double) 1509, (-984.5852420794154), (-984.5852420794154));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,509, -984.585]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(195, 195, 0.11764700710773468);
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(195, univariateRealFunction0, 202.64026183, 9.754863178295939E166, allowedSolution0);
  }
}
