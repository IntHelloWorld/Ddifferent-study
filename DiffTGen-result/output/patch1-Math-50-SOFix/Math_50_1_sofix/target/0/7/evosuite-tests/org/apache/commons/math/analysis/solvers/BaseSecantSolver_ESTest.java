/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:18:16 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Atanh;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sinh;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(3782.286059);
      Sigmoid sigmoid0 = new Sigmoid(1122.043655, 0.0);
      double double0 = regulaFalsiSolver0.solve(1139, (UnivariateRealFunction) sigmoid0, 3782.286059, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Sigmoid sigmoid0 = new Sigmoid(1.9699272335463627E-8, 1.9699272335463627E-8);
      UnivariateRealFunction univariateRealFunction0 = sigmoid0.derivative();
      double double0 = illinoisSolver0.solve(134, univariateRealFunction0, (-499.06), 1297.458135098905, 1.0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-597.558158433), 686.0);
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(1028, (UnivariateRealFunction) ceil0, 0.0, 686.0, (double) 1028, allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2532.475);
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2115), (UnivariateRealFunction) rint0, 0.0, 0.0, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,115) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, 0.0);
      Sigmoid sigmoid0 = new Sigmoid(425.241341851745, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(90, (UnivariateRealFunction) sigmoid0, 0.0, 15.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 15], values: [212.621, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2531, (UnivariateRealFunction) sinh0, (double) 2531, 0.08371849358081818, 0.06666666666666667, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,531, 0.084]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(955.384001222986, 955.384001222986, 3343.66);
      Sigmoid sigmoid0 = new Sigmoid(955.384001222986, (-174.1));
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(206, (UnivariateRealFunction) sigmoid0, (-174.1), 0.0, 3343.66, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-174.1, 0], values: [955.384, 390.642]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2595.692082903808), (-2595.692082903808), (-2595.692082903808));
      Minus minus0 = new Minus();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-43), (UnivariateRealFunction) minus0, (double) 1394, (-2595.692082903808), 0.5);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-43) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-865.66345747));
      Gaussian gaussian0 = new Gaussian(276, 3881.047779);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(276, (UnivariateRealFunction) gaussian0, 0.0, (-865.66345747), 3881.047779);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -865.663]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1636, 0.0, (-768.032581));
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1636, (UnivariateRealFunction) harmonicOscillator0, 1.225743062930824E-8, 1.25, 1.25);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 1.25], values: [141.864, 141.864]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3063.9306623092766), 0.3333333134651184);
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
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(405, (UnivariateRealFunction) cos0, (-3465.10737491), 1.465290917835144, (-1.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cbrt cbrt0 = new Cbrt();
      regulaFalsiSolver0.setup(832, cbrt0, (-361.52), 832, 832);
      double double0 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(709, (UnivariateRealFunction) sinc0, 1.0E-6, 864.599, (double) 0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(405, (UnivariateRealFunction) tanh0, (-3465.10737491), 490.46249947229, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(405, (UnivariateRealFunction) tanh0, (-3465.10737491), 490.46249947229, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(405, (UnivariateRealFunction) tanh0, (-3465.10737491), 490.46249947229, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      Cos cos0 = new Cos();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(405, (UnivariateRealFunction) cos0, (-3465.10737491), 1.25, (-1.0), allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (405) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(955.384001222986, 955.384001222986, 3343.66);
      Logit logit0 = new Logit();
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      double double0 = pegasusSolver0.solve(639, univariateRealFunction0, 0.0, (double) 639);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(405, (UnivariateRealFunction) tanh0, (-3465.10737491), (double) 405, allowedSolution0);
      double double1 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(405, (UnivariateRealFunction) tanh0, (double) 405, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Atanh atanh0 = new Atanh();
      double double0 = regulaFalsiSolver0.solve(1024, (UnivariateRealFunction) atanh0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0), (-553.8));
      Log log0 = new Log();
      illinoisSolver0.setup(227, log0, 6.645902179413375E-6, 1.7029898543501842E-8, (-6.663542893624021E-14));
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2595.692082903808), (-2595.692082903808), (-2595.692082903808));
      Minus minus0 = new Minus();
      double double0 = illinoisSolver0.solve(1394, (UnivariateRealFunction) minus0, (-2595.692082903808), (double) 1394, (-2595.692082903808));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sigmoid sigmoid0 = new Sigmoid((-1047.739), 214);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(214, (UnivariateRealFunction) sigmoid0, (double) 214, (double) 214, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [214, 214]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }
}
