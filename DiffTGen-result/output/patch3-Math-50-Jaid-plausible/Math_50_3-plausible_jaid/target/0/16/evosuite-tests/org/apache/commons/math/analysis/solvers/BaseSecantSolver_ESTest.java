/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 01:37:08 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Atanh;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Signum;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Rint rint0 = new Rint();
      double double0 = regulaFalsiSolver0.solve(4, (UnivariateRealFunction) rint0, 0.0, (double) 4, (-1878.49), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2145.94698, 0.5);
      Gaussian gaussian0 = new Gaussian();
      double double0 = pegasusSolver0.solve(94, (UnivariateRealFunction) gaussian0, (double) 2383, (-0.010714690733195933), 0.0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Signum signum0 = new Signum();
      double double0 = regulaFalsiSolver0.solve(27, (UnivariateRealFunction) signum0, 0.0, 0.0, 0.0);
      double double1 = regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2145.94698, 0.5);
      Gaussian gaussian0 = new Gaussian();
      double double0 = pegasusSolver0.solve(2383, (UnivariateRealFunction) gaussian0, (double) 2383, 2145.94698);
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2.356194490192345, 2.356194490192345, 2.356194490192345);
      Cos cos0 = new Cos();
      double double0 = pegasusSolver0.solve(235, (UnivariateRealFunction) cos0, (-1299.193), (double) 235, (-1904.58));
      double double1 = pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(12, (UnivariateRealFunction) expm1_0, (double) 12, (double) 12, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [12, 12]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) null, (double) 0, (-2540.678937058099), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(857.050167254652, 857.050167254652, 0.0);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) cos0, 0.0, 857.050167254652, 0.0, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-241.2702), (-241.2702));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2, (UnivariateRealFunction) expm1_0, 145.321612142212, 145.321612142212, 145.321612142212, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [145.322, 145.322]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1152.0952);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(11, (UnivariateRealFunction) null, (double) 11, (double) 11, 1152.0952, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2695.963));
      Sigmoid sigmoid0 = new Sigmoid();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) sigmoid0, (double) 0, 204.20795, (double) 2);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Cos cos0 = new Cos();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(347, (UnivariateRealFunction) cos0, 0.0, 0.0, (-501.274));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, (-456.7121951499865));
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(526, (UnivariateRealFunction) null, 0.0, 0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, 0.0);
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
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atanh atanh0 = new Atanh();
      pegasusSolver0.setup(4, atanh0, 4, 4, 4);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4, 4]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-927.83057911755), 1.0);
      Sigmoid sigmoid0 = new Sigmoid();
      pegasusSolver0.setup(159, sigmoid0, (-308.47187), 1.569282216659978, (-927.83057911755));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-308.472, 1.569], values: [0, 0.828]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(3045, (UnivariateRealFunction) atan0, (-590.35993), 478.479, 1178.5357, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(478.479, 628.4069, 478.479);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(3045, (UnivariateRealFunction) atan0, (-1800.5), 478.479, 1178.5357, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-7.207646867296959));
      Cos cos0 = new Cos();
      double double0 = pegasusSolver0.solve(235, (UnivariateRealFunction) cos0, (-1299.193), (double) 235, (-1904.58));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(478.479, 478.479, 478.479);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(3045, (UnivariateRealFunction) atan0, (-0.0028537403757966802), 478.479, (double) 3045, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(478.479, 628.4069, 478.479);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(3067, (UnivariateRealFunction) atan0, (-1800.5), 478.479, 1178.5357, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(3045, (UnivariateRealFunction) atan0, (-1800.5), 478.479, (double) 3045, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-7.207646867296959));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(363, (UnivariateRealFunction) cbrt0, (-1.0), 0.08533209796122378, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, (-456.7121951499865));
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(526, (UnivariateRealFunction) asin0, (-889.4912), 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2695.963));
      Sigmoid sigmoid0 = new Sigmoid();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2, (UnivariateRealFunction) sigmoid0, (-2695.963), 204.20795, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(478.479, 628.4069, 478.479);
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(249, (UnivariateRealFunction) rint0, (-1685.02158), 1187.7888, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2088.366802));
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(11, (UnivariateRealFunction) signum0, (-2088.366802), (double) 11, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (11) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}
