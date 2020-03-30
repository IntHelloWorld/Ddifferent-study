/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:34:07 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Signum;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sigmoid sigmoid0 = new Sigmoid(2299, 8.881494566326834E-229);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(2299, (UnivariateRealFunction) sigmoid0, (double) 2299, (double) 2299, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0, 0.0);
      Logistic logistic0 = new Logistic(0.0, 714, 0.0, 0.1111111111111111, (-0.3058015757857271), 0.1111111111111111);
      UnivariateRealFunction univariateRealFunction0 = logistic0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(714, univariateRealFunction0, (-1851.41038477539), 0.0, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1771.6895723348234));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(11, (UnivariateRealFunction) asinh0, (-1771.6895723348234), 0.0, allowedSolution0);
      double double1 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sigmoid sigmoid0 = new Sigmoid(2299, 8.881494566326834E-229);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      UnivariateRealFunction univariateRealFunction0 = sigmoid0.derivative();
      double double0 = pegasusSolver0.solve(2158, univariateRealFunction0, (double) (-1365), 8.881494566326834E-229, allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(998.0, (-1.0));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3180, (UnivariateRealFunction) tan0, (double) 3180, 222.98903988923414, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,180, 222.989]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1515, 1515, 1515);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1515, (UnivariateRealFunction) harmonicOscillator0, (-1.0), 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1, 0], values: [1,515, 1,106.088]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0, 0.0);
      Logistic logistic0 = new Logistic(0.0, 714, 0.0, 0.1111111111111111, (-0.3058015757857271), 0.1111111111111111);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1610), (UnivariateRealFunction) logistic0, 0.0, (-1851.41038477539), 0.1111111111111111, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,610) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-0.010714690733195933), (-0.010714690733195933), (-0.010714690733195933));
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(17, (UnivariateRealFunction) signum0, 1024.0, 274.6912823, (-0.010714690733195933), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,024, 274.691]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1865.0268064, 535.12057409544);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) null, (-1.0), 2683.0, (-1.0), allowedSolution0);
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
      Minus minus0 = new Minus();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1513), (UnivariateRealFunction) minus0, (-1839.85324293), (-1839.85324293), (-1839.85324293));
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,513) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0, 1.0);
      Cosh cosh0 = new Cosh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(255, (UnivariateRealFunction) cosh0, 1310.9168, (double) 255, (-4383.1137));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,310.917, 255]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.7029898543501842E-8, 1.7029898543501842E-8);
      Floor floor0 = new Floor();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(496, (UnivariateRealFunction) floor0, 248.88334, 2.7801158238638378E110, (double) 496);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [248.883, 278,011,582,386,383,780,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000], values: [248, 278,011,582,386,383,780,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sqrt sqrt0 = new Sqrt();
      illinoisSolver0.setup(3, sqrt0, 117.60798969990184, (-673.0), (-414.7101881299835));
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [117.608, -673]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.570796251296997, 1.570796251296997, (-5022.7529654562));
      Cosh cosh0 = new Cosh();
      illinoisSolver0.setup(27, cosh0, (-5022.7529654562), 1030.6, 0.07692307692307693);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-5,022.753, 1,030.6], values: [\u221E, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1515, 1515, 1515);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1515, (UnivariateRealFunction) harmonicOscillator0, 0.0, (double) 1515, 9.219544613762692E-9, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1523, 1523, 1523);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(1523, (UnivariateRealFunction) harmonicOscillator0, 0.0, (double) 1523, 9.219544613762692E-9, allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, 0.0);
      Minus minus0 = new Minus();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2300, (UnivariateRealFunction) minus0, 453.607900567, 0.0, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, 0.0);
      Minus minus0 = new Minus();
      double double0 = regulaFalsiSolver0.solve(2300, (UnivariateRealFunction) minus0, 0.0, 0.0, 0.5);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3270.4498594));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(169, (UnivariateRealFunction) tan0, 0.5, (double) 169, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (169) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Floor floor0 = new Floor();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, (-3307.6056481), 394.8207566062);
      double double0 = regulaFalsiSolver0.solve(123, (UnivariateRealFunction) floor0, (-357.4421), (double) 1440, 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3446.294687655162), 0.8350974719478472);
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
  public void test21()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cos cos0 = new Cos();
      double double0 = illinoisSolver0.solve(255, (UnivariateRealFunction) cos0, (-1777.7983784), (-681.792137), 1.0);
  }
}