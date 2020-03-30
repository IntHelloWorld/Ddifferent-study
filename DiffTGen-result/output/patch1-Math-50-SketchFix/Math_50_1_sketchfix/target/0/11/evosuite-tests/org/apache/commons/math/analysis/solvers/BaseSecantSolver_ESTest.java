/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:53:20 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Constant;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Logit;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver((-14.6396581), (-14.6396581), (-14.6396581));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(797, (UnivariateRealFunction) cbrt0, (-14.6396581), 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.6666666269302368);
      Tanh tanh0 = new Tanh();
      double double0 = illinoisSolver0.solve(127, (UnivariateRealFunction) tanh0, (-2872.0), 1.0E-6, 0.625);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1399.13));
      Exp exp0 = new Exp();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(18, (UnivariateRealFunction) exp0, (-1894.01675071), 4082.46, 4082.46, allowedSolution0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4029.32, 4839.81);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) null, (double) 0, (-742.3), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1265.0), (-1265.0));
      Sigmoid sigmoid0 = new Sigmoid();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1885), (UnivariateRealFunction) sigmoid0, (-1265.0), (double) (-1885), 1604.044724740934, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,885) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, 0.0);
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2097, (UnivariateRealFunction) identity0, (double) 2097, (double) 2097, 2227.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,097, 2,097]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-848.0), (-848.0));
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-720), (UnivariateRealFunction) null, (double) (-720), 2332.0, (double) (-720), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2277.7351));
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1935), (UnivariateRealFunction) sinc0, 1.225743062930824E-8, 0.7249995199969751, (double) (-1935));
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,935) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1070.2627));
      Cbrt cbrt0 = new Cbrt();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1024, (UnivariateRealFunction) cbrt0, (double) 1024, 0.5, (-1070.2627));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,024, 0.5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(3521.4, 3521.4);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) null, (double) 0, 2004.587672196842, 460.22652986152);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, (-1.0));
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
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-848.0));
      Logit logit0 = new Logit();
      regulaFalsiSolver0.setup(10, logit0, 0.0, (-848.0), 0.0);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // -848 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.analysis.function.Logit", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.7049953805093242);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(127, (UnivariateRealFunction) tanh0, (-280.3726206), 65.4955373, (double) 127, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.384185791015625E-7);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(127, (UnivariateRealFunction) tanh0, (-280.3726206), (double) 127, (double) 127, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.384185791015625E-7);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(125, (UnivariateRealFunction) tanh0, (-280.3726206), 37.51961935032749, (double) 125, allowedSolution0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(4214.627, (-1883.96139));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(2010.0, 2010.0, 2010.0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(293565823, (UnivariateRealFunction) harmonicOscillator0, (-1743.6), 242.086278856589, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.384185791015625E-7);
      Tanh tanh0 = new Tanh();
      double double0 = illinoisSolver0.solve(127, (UnivariateRealFunction) tanh0, (-2872.0), 1.0E-6, 0.625);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.384185791015625E-7);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(125, (UnivariateRealFunction) tanh0, (-280.3726206), 2.384185791015625E-7, (double) 125, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.384185791015625E-7, 2.384185791015625E-7);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(127, (UnivariateRealFunction) tanh0, (-284.52218288902094), 65.4955373, (double) 127, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.384185791015625E-7);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(127, (UnivariateRealFunction) tanh0, (-280.3726206), 2.384185791015625E-7, (double) 127, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.384185791015625E-7);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(125, (UnivariateRealFunction) tanh0, (-280.3726206), 37.51961935032749, (double) 125, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.384185791015625E-7);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(127, (UnivariateRealFunction) tanh0, (-280.3726206), 65.4955373, (double) 127, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-27.085976009213038));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(127, (UnivariateRealFunction) tanh0, (-280.3726206), 65.4955373, (double) 127, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.384185791015625E-7);
      Tanh tanh0 = new Tanh();
      double double0 = illinoisSolver0.solve(127, (UnivariateRealFunction) tanh0, (-0.9418988204070736), 1.0E-6, 0.625);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(6.145777621609173, (-978.594), 6.145777621609173);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(12, (UnivariateRealFunction) sinh0, (-3432.743669028872), 1.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-16.932990496479032), (-16.932990496479032), (-16.932990496479032));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(125, (UnivariateRealFunction) tanh0, (-280.3726206), 65.4955373, (double) 125, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, (-978.594), 0.0);
      Sinh sinh0 = new Sinh();
      double double0 = regulaFalsiSolver0.solve(12, (UnivariateRealFunction) sinh0, (-3432.743669028872), 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-848.0), (-848.0));
      Logit logit0 = new Logit((-848.0), (-848.0));
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      regulaFalsiSolver0.setup(10, univariateRealFunction0, 0.0, (-848.0), 0.0);
      double double0 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-473.1477), (-473.1477));
      Constant constant0 = new Constant((-1.0));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(42, (UnivariateRealFunction) constant0, (double) 42, 1.0E-6, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [42, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, (-978.594), 0.0);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(12, (UnivariateRealFunction) sinh0, (-3432.743669028872), 904.35, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (12) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(127, (UnivariateRealFunction) tanh0, (-280.3726206), 2.384185791015625E-7, (double) 127, allowedSolution0);
  }
}