/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:45:41 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      bisectionSolver0.setAbsoluteAccuracy(0.0);
      double double0 = bisectionSolver0.solve(1792.39383192114, 2673.6393589);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-666.2), 0.0, 1250.684);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve((-2300.7782), (double) 1755, (-1.0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve((-2033.92), 0.0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, 1767.786, (-2136.93840351), (-773.0));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,767.786, -2,136.938]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-495.366);
      doubleArray0[1] = 1.0E-6;
      doubleArray0[2] = 553.31680381928;
      doubleArray0[3] = 199.955564316865;
      doubleArray0[4] = (-973.72006832);
      doubleArray0[5] = (-1123.53352328);
      doubleArray0[6] = (-4813.095477959172);
      doubleArray0[7] = (-1.0);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-973.72006832), 2103.546033, (-973.72006832));
      double double1 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, 369.430541);
      double double2 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-973.72006832), (-1.0));
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 1.0E-6, 2172.0, 0.5);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[5];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-3301.9), Double.POSITIVE_INFINITY, 0.0);
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, 2381.5, Double.POSITIVE_INFINITY, 6055.449376098792);
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-495.366);
      doubleArray0[1] = 1.0E-6;
      doubleArray0[2] = 553.31680381928;
      doubleArray0[3] = 199.955564316865;
      doubleArray0[4] = (-973.72006832);
      doubleArray0[5] = (-1123.53352328);
      doubleArray0[6] = (-4813.095477959172);
      doubleArray0[7] = (-1.0);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-973.72006832), 2103.546033, (-973.72006832));
      double double1 = bisectionSolver0.solve((-3.0974583082325973E-6), 3604.888, (-3.0974583082325973E-6));
      double double2 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, 369.430541);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-973.72006832), (-1.0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, (-688.918770919077), 559.011436524368);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-495.366);
      doubleArray0[1] = 1.0E-6;
      doubleArray0[2] = 553.31680381928;
      doubleArray0[3] = 199.955564316865;
      doubleArray0[4] = (-973.72006832);
      doubleArray0[5] = (-1123.53352328);
      doubleArray0[6] = (-4813.095477959172);
      doubleArray0[7] = (-1.0);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-973.72006832), 2103.546033, (-973.72006832));
      double double1 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, 369.430541);
      double double2 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-973.72006832), (-1.0));
      // Undeclared exception!
      bisectionSolver0.solve(0.0, 928.71502, 1.0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      bisectionSolver0.setMaximalIterationCount(6);
      try { 
        bisectionSolver0.solve(0.0, 377.1182278166768, (-2973.255597538));
      } catch(Exception e) {
         //
         // Maximal number of iterations (6) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(1.0, 1082.5995040608182, 1082.5995040608182);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BisectionSolver bisectionSolver0 = null;
      try {
        bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) null);
      } catch(IllegalArgumentException e) {
         //
         // function to solve cannot be null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (-2757.86916);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      double double0 = bisectionSolver0.solve(univariateRealFunction0, (-1723.492886), 2848.8538485);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      bisectionSolver0.setMaximalIterationCount(1);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-1723.492886), 2848.8538485);
      } catch(Exception e) {
         //
         // Maximal number of iterations (1) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-495.366);
      doubleArray0[1] = 1.0E-6;
      doubleArray0[2] = 553.31680381928;
      doubleArray0[3] = 199.955564316865;
      doubleArray0[4] = (-973.72006832);
      doubleArray0[5] = (-1123.53352328);
      doubleArray0[6] = (-4813.095477959172);
      doubleArray0[7] = (-1.0);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-973.72006832), 2103.546033, (-973.72006832));
      // Undeclared exception!
      bisectionSolver0.solve(553.31680381928, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      bisectionSolver0.setMaximalIterationCount(6);
      try { 
        bisectionSolver0.solve(1792.39383192114, 2673.6393589);
      } catch(Exception e) {
         //
         // Maximal number of iterations (6) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, (-2385.986362706855), 1.0, 474.8736);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(3358.6, 3358.6, 353.5670981);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,358.6, 3,358.6]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-1340.59447771697), 0.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}