/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:54:47 GMT 2020
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
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1527.67687291;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      bisectionSolver0.setAbsoluteAccuracy(0.0);
      double double0 = bisectionSolver0.solve(715.1, 2288.2, 715.1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1719.44769464);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-1719.44769464), 417.3, 0.0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 658.11014;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-1.0), 658.11014);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve((-1827.201), (-1.0), 0.0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve(776.214436703, 2022.3832);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve((-2465.48647991), 0.0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, 1.0E-15, 0.0, 1.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      bisectionSolver0.setAbsoluteAccuracy(0.0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 1.7049312591552735E-4, 0.0218231201171875);
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, (-3253.2855), 0.0, (-3253.2855));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[2];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 319.9876239, 57.7262893752441);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [319.988, 57.726]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-1.0), 0.0);
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, 0.0, 1.0E-6);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(1462.1824023334393, 1.0, 1.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,462.182, 1]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(1.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      try { 
        bisectionSolver0.solve((-2017.229659), (-385.7203));
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      try { 
        bisectionSolver0.solve(1.0E-6, Double.POSITIVE_INFINITY);
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      bisectionSolver0.setAbsoluteAccuracy(0.0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-470.95), 1.1799113813407538E-19);
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 715.1, (-1710.488170337));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1527.67687291;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-470.95), 1.1799113813407538E-19);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setMaximalIterationCount((-1));
      try { 
        bisectionSolver0.solve((-2865.4806196110303), 1.0, 1.0);
      } catch(Exception e) {
         //
         // Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      try { 
        bisectionSolver0.solve((-564.5215484955224), 1413.5339774848903, 0.0);
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[2];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-1719.44769464), 417.3, 0.0);
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-2865.4806196110303), 1.0, 1.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-1799.176219326), (-414.83183344));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
