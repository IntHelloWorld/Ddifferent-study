/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 01:32:32 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Abs;
import org.apache.commons.math.analysis.function.Acosh;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Constant;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sqrt;
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
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1628.197761185, 1628.197761185);
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(3291, (UnivariateRealFunction) sqrt0, 5.669184079525E-24, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1628.197761185, 1628.197761185);
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(276, (UnivariateRealFunction) sqrt0, (double) 1, 0.0, 1628.197761185, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Exp exp0 = new Exp();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(174, (UnivariateRealFunction) exp0, (-1.0), (-1685.62306453), (-1.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(63.5, 63.5);
      Sigmoid sigmoid0 = new Sigmoid();
      UnivariateRealFunction univariateRealFunction0 = sigmoid0.derivative();
      double double0 = regulaFalsiSolver0.solve(2, univariateRealFunction0, (-390.998874011), (-390.998874011), (-456.6731));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(4, (UnivariateRealFunction) rint0, 2.384185791015625E-7, (-4.503599627370496E15), allowedSolution0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-128.9601733441195));
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(2832, (UnivariateRealFunction) gaussian0, (-128.9601733441195), (double) 2832, allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1628.197761185, 1628.197761185);
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1, (UnivariateRealFunction) sqrt0, 0.0, (double) 3291, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1800.29660194285));
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(712, (UnivariateRealFunction) null, (double) 712, (double) 712, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(3546.245, 983.0, 0.5);
      Cos cos0 = new Cos();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2062, (UnivariateRealFunction) cos0, 0.5, 3546.245, (AllowedSolution) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(565.6775258, 0.0, 0.625);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      Acosh acosh0 = new Acosh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) acosh0, 0.625, 1.2958646899018938E-9, (double) 0, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Logit logit0 = new Logit(0, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1653, (UnivariateRealFunction) logit0, 0.0, 0.0, 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      Sqrt sqrt0 = new Sqrt();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3705, (UnivariateRealFunction) sqrt0, (-2799.762891), (-1.0), 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-2,799.763, -1], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-791.2894532902084), (-791.2894532902084));
      Abs abs0 = new Abs();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(4, (UnivariateRealFunction) abs0, 0.008336750013465571, 1.0E-6, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.008, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      Constant constant0 = new Constant(1.0);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(4, (UnivariateRealFunction) constant0, 0.0, 1.0, (-445.479556395));
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 1], values: [1, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
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
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(3.9736429850260626E-8, 3.9736429850260626E-8);
      Ceil ceil0 = new Ceil();
      pegasusSolver0.setup(1728824112, ceil0, 1728824112, 3.9736429850260626E-8, 1728824112);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,728,824,112, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4044.666);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1018, (UnivariateRealFunction) sin0, (double) 1018, 4044.666, (-0.49999999999999994), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(3546.245, 983.0, 0.293560983422936);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2062, (UnivariateRealFunction) cos0, 0.293560983422936, 3546.245, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4044.666);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1018, (UnivariateRealFunction) sin0, (double) 1018, 4044.666, (-1.017154131497424), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4043.677993772749);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1018, (UnivariateRealFunction) sin0, (double) 1018, 4043.677993772749, (-0.49999999999999994), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4043.677993772749);
      Sin sin0 = new Sin();
      double double0 = regulaFalsiSolver0.solve(1018, (UnivariateRealFunction) sin0, (-0.49999999999999994), (double) 1018, 1018.0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(3546.245, 983.0, 0.5);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2062, (UnivariateRealFunction) cos0, 0.5, 3546.245, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2062, (UnivariateRealFunction) cos0, 0.5, 3516.45949224276, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian(0.5, 1781.25);
      UnivariateRealFunction univariateRealFunction0 = gaussian0.derivative();
      double double0 = regulaFalsiSolver0.solve(1500, univariateRealFunction0, (-706.7268), (double) 1500);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4044.666);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1018, (UnivariateRealFunction) sin0, (double) 1018, 4044.666, (-0.49999999999999994), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4045.3954955296776);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1018, (UnivariateRealFunction) sin0, (double) 1018, 4045.3954955296776, (-916.866), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Identity identity0 = new Identity();
      double double0 = pegasusSolver0.solve(615, (UnivariateRealFunction) identity0, 0.7853981633974483, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4044.666);
      Sin sin0 = new Sin();
      double double0 = regulaFalsiSolver0.solve(1018, (UnivariateRealFunction) sin0, 0.0, (double) 1018, 4044.666);
      double double1 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(615, (UnivariateRealFunction) identity0, 2.384185791015625E-7, (-6.032174644509064E-23), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) asinh0, (double) 0, (double) 0, (-1562.8539456355));
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}
