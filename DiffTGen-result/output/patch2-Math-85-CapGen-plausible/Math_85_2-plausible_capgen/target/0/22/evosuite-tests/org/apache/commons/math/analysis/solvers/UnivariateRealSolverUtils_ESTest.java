/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 15:14:57 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnivariateRealSolverUtils_ESTest extends UnivariateRealSolverUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, Double.NaN, (-1110.3165877732), (-1185.533101629));
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-1,110.317,  initial=\uFFFD, upper bound=-1,185.533
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.5, Double.POSITIVE_INFINITY, 2202.3338486479, (-4868));
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -4,868
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.5;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, Double.POSITIVE_INFINITY, 0.0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, 1875.7475491, 2319.1, (-246.87568216));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[0] = polynomialFunction0;
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionArray0[0], (-1556.5), 0.5, 0.0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-179.01);
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      doubleArray0[2] = (-1.0);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-179.01), 0.0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 2522.265931069;
      doubleArray0[2] = (-571.209005157266);
      doubleArray0[3] = (-958.6770790703);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-958.6770790703), 1456.447293371363);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint((-2568.291105871099), 0.0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, 1728.85194, 1728.85194, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1217.246969152212;
      doubleArray0[1] = (-2442.92);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-875.9835503501264), (-4934.79524128741), 0.0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-3378.66);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-2361.6621762), (-3378.66), 2.563175595711103E18, 31);
      } catch(Exception e) {
         //
         // number of iterations=31, maximum iterations=31, initial=-2,361.662, lower bound=-3,378.66, upper bound=2,563,175,595,711,103,000, final a value=-2,392.662, final b value=-2,330.662, f(a)=-3,378.66, f(b)=-3,378.66
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1.0, 0.0, 1.0, 267);
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=267, initial=1, lower bound=0, upper bound=1, final a value=0, final b value=1, f(a)=0, f(b)=0
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-3396.030083116);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, Double.NaN, Double.NaN, (-3396.030083116), 2659);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, 3209.002313885, 1161.85, 2359);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=3,209.002,  initial=0, upper bound=1,161.85
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 2168.9800148887, 0.0, (-2584.42), 32);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=2,168.98, upper bound=-2,584.42
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, 0.5, 2278.446, (-287.0), (-1));
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, 0.0, 556.6647144);
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.negate();
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction1, (-167.764764), (-167.764764), (double) 267, 267);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 1217.246969152212;
      doubleArray0[4] = 1.300943634800502;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-869.5177926919971), (-4934.79524128741), 0.0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1217.246969152212;
      doubleArray0[1] = 1217.246969152212;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-869.5177926919971), (-4934.79524128741), 0.0);
      } catch(Exception e) {
         //
         // number of iterations=869, maximum iterations=2,147,483,647, initial=-869.518, lower bound=-4,934.795, upper bound=0, final a value=-1,738.518, final b value=-0.518, f(a)=-2,114,988.267, f(b)=586.965
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1.0, 1.0, 1.0, 267);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,  initial=1, upper bound=1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 1.0, (-1712.5419849638), 0);
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, Double.POSITIVE_INFINITY, 0.0);
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-1230.7), 893.8802202);
  }
}
