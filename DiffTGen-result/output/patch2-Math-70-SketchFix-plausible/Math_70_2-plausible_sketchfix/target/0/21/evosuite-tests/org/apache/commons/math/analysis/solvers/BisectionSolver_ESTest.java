/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:45:37 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-159.93842), 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-767.4224);
      doubleArray0[5] = (-722.952968234);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-722.952968234), 1507.473);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve(0.0, 0.5, 0.5);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve((-985.0), 0.0, (-355.3828230042));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve(0.0, 1886.34);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve((-66.9270953585), 0.0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, 915.7788967864, 0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [915.779, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[9];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-3983.110556735796), 1.0, (-616.98545571116));
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, 2406.7344, Double.POSITIVE_INFINITY, (-4309.5));
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, 0.0, 2019.072006998635, 2019.072006998635);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, 3805.23797283883, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,805.238, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.5, 1518.62102253);
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 957.0;
      doubleArray0[1] = 2465.12348001;
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[1];
      PolynomialSplineFunction polynomialSplineFunction0 = new PolynomialSplineFunction(doubleArray0, polynomialFunctionArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialSplineFunction0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialSplineFunction0, 1.0, 1628.7220976413);
      } catch(Exception e) {
         //
         // Argument 1 outside domain [957 ; 2,465.123]
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-4420.9173605), 1.0E-14, (-729.4));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-957.84669990175), 1651.7328933968518);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
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
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 696.6927;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-722.952968234), 1507.473);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-4.986457180865109E-7), 1168.7);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = 1483.31273311286;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 1.0E-14, 1.0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      try { 
        bisectionSolver0.solve(0.0, Double.POSITIVE_INFINITY);
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(0.0, 0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(304.3829807455, 304.3829807455);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [304.383, 304.383]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}
