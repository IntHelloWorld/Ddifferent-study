/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 01:34:59 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Abs;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sinh;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(420, (UnivariateRealFunction) sinh0, 4006.719, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      double double0 = regulaFalsiSolver0.solve(1104, (UnivariateRealFunction) sinh0, 0.0, 3541.57726, 3541.57726);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-3417.13645671358));
      Gaussian gaussian0 = new Gaussian();
      double double0 = illinoisSolver0.solve(157, (UnivariateRealFunction) gaussian0, (-521.202464472191), 1482.83763, 459.0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sigmoid sigmoid0 = new Sigmoid((-1957.5169998795018), 2572.09447501197);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2414, (UnivariateRealFunction) sigmoid0, (-1957.5169998795018), 0.0, allowedSolution0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3135.85, 1.1921056801463227E-8, 1752.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) atan0, 0.37377718422698364, 1.2675934823758863E-8, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Abs abs0 = new Abs();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(743, (UnivariateRealFunction) abs0, (double) 743, (double) 743, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [743, 743]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cosh cosh0 = new Cosh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2, (UnivariateRealFunction) cosh0, (double) 2, (double) 0, (double) 2, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0), (-1.0));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(11, (UnivariateRealFunction) null, (-1.0), (double) 11, (-1.0), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(380.648, 380.648, 380.648);
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(655, (UnivariateRealFunction) sinc0, 0.0, (-379.8381), 380.648);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -379.838]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(20, (UnivariateRealFunction) sinh0, (double) 20, 709.17333669, 334.7435710311053);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [20, 709.173], values: [242,582,597.705, 48,869,381,406,480,320,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, (-1934.7523107564678));
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
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(981.72004843, (-1213.665243808899), 981.72004843);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-3368.104), (-3368.104), (-3368.104));
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(5, univariateRealFunction0, (-1640.7850408732495), 1420.982, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3322.018527991), 1905.595563603469);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2144661724, (UnivariateRealFunction) atan0, (-3322.018527991), 1790.3150954506, (-4258.27350651), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(981.72004843, (-1213.665243808899), 981.72004843);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-3368.104), (-3368.104), (-3368.104));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(5, (UnivariateRealFunction) harmonicOscillator0, (-1640.7850408732495), 1420.982, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(981.72004843, (-1213.665243808899), 981.72004843);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-3368.104), (-3368.104), (-3368.104));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(835, (UnivariateRealFunction) harmonicOscillator0, (-2.602977207477E-18), 78.04804819, (-3261.9600543284087), allowedSolution0);
      double double1 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3322.018527991), 946.496017139269);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2144661724, (UnivariateRealFunction) atan0, (-3322.018527991), 1790.3150954506, (-4258.27350651), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(380.648, 380.648, 380.648);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(655, (UnivariateRealFunction) sinc0, (-698.0634), (-408.1686446), (-698.0634), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3322.018527991), (-631.504964338696));
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2144661724, (UnivariateRealFunction) atan0, (-3322.018527991), 96.37755553412, (-4258.27350651), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3135.85, 1.1921056801463227E-8, 1752.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1490, (UnivariateRealFunction) atan0, (-2830.222694926271), 0.99, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1585.252157), (-750.9588));
      Atan atan0 = new Atan();
      double double0 = regulaFalsiSolver0.solve(4685, (UnivariateRealFunction) atan0, (-1585.252157), 2897.3783213644, (double) 4685);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      Log10 log10_0 = new Log10();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(5, (UnivariateRealFunction) log10_0, 0.0, 1790.3150954506, 0.0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (5) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(4, (UnivariateRealFunction) inverse0, (-2863.01729292), (double) 4, 0.0, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (4) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3322.018527991), (-631.504964338696));
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2144661724, (UnivariateRealFunction) atan0, (-3322.018527991), 1790.3150954506, (-4258.27350651), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(981.72004843, (-1213.665243808899), 981.72004843);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-3368.104), (-3368.104), (-3368.104));
      double double0 = regulaFalsiSolver0.solve(5, (UnivariateRealFunction) harmonicOscillator0, (-793.0), 981.72004843, 981.72004843);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) null, 0.0, 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3135.85, 1.1921056801463227E-8, 1752.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1490, (UnivariateRealFunction) atan0, (-2830.222694926271), 0.99, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Minus minus0 = new Minus();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1749, (UnivariateRealFunction) minus0, (double) 1749, 0.0, (double) 1749, allowedSolution0);
      double double1 = regulaFalsiSolver0.doSolve();
  }
}
