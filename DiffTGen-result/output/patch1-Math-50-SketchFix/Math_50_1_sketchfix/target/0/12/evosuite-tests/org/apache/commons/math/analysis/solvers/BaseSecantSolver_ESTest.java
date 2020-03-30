/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:53:24 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sinh;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1989, (UnivariateRealFunction) rint0, (double) 1989, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1529.0670706418), 1870.9967816499677);
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1430, (UnivariateRealFunction) gaussian0, (-3873.60977431), 3.552580543376922E-4, (-1529.0670706418), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1843.0, 1843.0, 592.63869617);
      Sigmoid sigmoid0 = new Sigmoid();
      UnivariateRealFunction univariateRealFunction0 = sigmoid0.derivative();
      double double0 = illinoisSolver0.solve(1021, univariateRealFunction0, 1843.0, (-1337.4532187711034), (-1337.4532187711034));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-235.55034473189824), 1.0E-6);
      Logistic logistic0 = new Logistic(1.0E-6, (-1670.12524139), (-1113.0), 1.0E-6, (-2925.54898558792), 1.0E-6);
      double double0 = pegasusSolver0.solve(347, (UnivariateRealFunction) logistic0, (-2925.54898558792), 648.68991, (-1670.12524139));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Floor floor0 = new Floor();
      pegasusSolver0.setup(1989, floor0, 0.0, 1989, 1292.5263);
      double double0 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Gaussian gaussian0 = new Gaussian(5, 0.6366197723675814, 0.6366197723675814);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) gaussian0, 1411.1108185490841, (-1282.21675587946), 0.6366197723675814, allowedSolution0);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0, 0.0);
      Logit logit0 = new Logit(0.0, (-10.485410593963667));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1063, (UnivariateRealFunction) logit0, 0.0, 0.0, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // 0 out of [0, -10.485] range
         //
         verifyException("org.apache.commons.math.analysis.function.Logit", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-369), (UnivariateRealFunction) null, (double) 408, 1.0E-6, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0875862700108075, 0.0875862700108075);
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(22, (UnivariateRealFunction) sinc0, 0.058823529411764705, 1821.5337952874, (AllowedSolution) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1267.9451, 1267.9451, 1267.9451);
      int int0 = 394973;
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (double) 394973;
      doubleArray0[3] = (double) 394973;
      doubleArray0[7] = (-3.141592653589793);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(int0, univariateRealFunction0, doubleArray0[7], doubleArray0[2], doubleArray0[0], allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(5438, (UnivariateRealFunction) signum0, (double) 5438, (double) 5438, 2.7553817452272217E-6, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [5,438, 5,438]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      Logistic logistic0 = new Logistic(0.0, 0.0, 0.0, (-914.6635064), 1.0, 3729.46);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(16, (UnivariateRealFunction) logistic0, 1.0, 3729.46, (-914.6635064), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1, 3,729.46], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.494140625);
      Logit logit0 = new Logit();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(4, (UnivariateRealFunction) logit0, (-2770.40133), (-2770.40133), 1.494140625);
      } catch(IllegalArgumentException e) {
         //
         // -2,770.401 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.analysis.function.Logit", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.570796251296997, (-1572.635414933448));
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(644, (UnivariateRealFunction) null, 1.570796251296997, (double) 644, 1199.2901676260133);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
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
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.19999954120254515, 0.19999954120254515, 0.19999954120254515);
      Atan atan0 = new Atan();
      regulaFalsiSolver0.setup(15, atan0, 2302.10615589, 0.6299605249474366, 2302.10615589);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,302.106, 0.63]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0875862700108075);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(12, (UnivariateRealFunction) sinc0, 0.058823529411764705, 1821.5337952874, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.7042359689351296), (-1.7042359689351296));
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(22, (UnivariateRealFunction) sinc0, 0.058823529411764705, 1821.5337952874, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0875862700108075, 0.0875862700108075, 0.0875862700108075);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(12, (UnivariateRealFunction) sinc0, 0.058823529411764705, 1821.5337952874, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0875862700108075, 0.0875862700108075);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(22, (UnivariateRealFunction) sinc0, 0.058823529411764705, (double) 22, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(12, (UnivariateRealFunction) sinc0, 0.058823529411764705, 1821.5337952874, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(13, (UnivariateRealFunction) sinh0, (-1180.0), 254.912457268, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (13) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.494140625);
      Sinc sinc0 = new Sinc();
      double double0 = illinoisSolver0.solve(2534, (UnivariateRealFunction) sinc0, (-2770.40133), 0.0);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(12, (UnivariateRealFunction) sinc0, 0.058823529411764705, 1821.5337952874, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      double double0 = regulaFalsiSolver0.solve(5, (UnivariateRealFunction) tan0, (double) 5, 0.0, (double) 5);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(5, (UnivariateRealFunction) tan0, 0.0, 0.0, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1841, (UnivariateRealFunction) rint0, (-1916.049438539938), 1908.9968, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2132.395, (-1396.949905));
      Gaussian gaussian0 = new Gaussian();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) gaussian0, (-2663.319553), 1.0E-6, (-2278.0));
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(495.145, 0.0, (-7.44321345601866E-11));
      Logit logit0 = new Logit();
      regulaFalsiSolver0.setup(1981, logit0, 1.0E-6, 0.08371849358081818, 1981);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 0.084], values: [-13.816, -2.393]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1482.6));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-3948.2095282737346), (-1482.6), 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-4675), (UnivariateRealFunction) harmonicOscillator0, (-2023.6331625), 0.0, 0.0, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-4,675) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}