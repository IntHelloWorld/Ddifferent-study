/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 17:01:37 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnivariateRealSolverUtils_ESTest extends UnivariateRealSolverUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.5;
      doubleArray0[1] = 1.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = PolynomialFunctionLagrangeForm.evaluate(doubleArray0, doubleArray0, 1.0);
      double double1 = PolynomialFunctionLagrangeForm.evaluate(doubleArray0, doubleArray0, 1.0);
      double[] doubleArray1 = polynomialFunctionLagrangeForm0.getCoefficients();
      double double2 = 0.0;
      double double3 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-4472.3014044961), 0.0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, 1.0, (-4472.3014044961), (-2281));
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -2,281
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = 2615.1;
      double double1 = 1469.0;
      double double2 = UnivariateRealSolverUtils.midpoint(2615.1, 1469.0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2615.1;
      doubleArray0[1] = 1469.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double3 = 0.5;
      double double4 = 0.5;
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      PolynomialFunction polynomialFunction2 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction2.derivative();
      PolynomialFunction polynomialFunction3 = polynomialFunction2.subtract(polynomialFunction0);
      String string0 = polynomialFunction2.toString();
      PolynomialFunction polynomialFunction4 = polynomialFunction2.negate();
      PolynomialFunction polynomialFunction5 = polynomialFunction2.subtract(polynomialFunction1);
      String string1 = polynomialFunction2.toString();
      String string2 = polynomialFunction2.toString();
      PolynomialFunction polynomialFunction6 = polynomialFunction2.negate();
      PolynomialFunction polynomialFunction7 = polynomialFunction0.add(polynomialFunction2);
      double double5 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-1845.6424486996), 0.5, 0.5);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.5, 0.5, 2042.05);
      } catch(Exception e) {
         //
         // number of iterations=2,042, maximum iterations=2,147,483,647, initial=0.5, lower bound=0.5, upper bound=2,042.05, final a value=0.5, final b value=2,042.05, f(a)=3,349.6, f(b)=3,002,386.55
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1030.15060253933;
      doubleArray0[1] = 1.0;
      doubleArray0[2] = (-1094.47);
      doubleArray0[3] = 1.0;
      doubleArray0[4] = Double.POSITIVE_INFINITY;
      doubleArray0[5] = (-445.85886267);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, (-445.85886267), 1.0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-781.599253);
      doubleArray0[2] = (-1432.2827236047863);
      doubleArray0[3] = (-1.0);
      doubleArray0[4] = 1448.797118298903;
      doubleArray0[5] = 0.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-497.64), 3299.267);
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 5 and 5
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2863.8324;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1102.341272);
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      doubleArray0[4] = (-3216.04985023207);
      doubleArray0[5] = 1955.43656396803;
      doubleArray0[6] = 207.2678731466271;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-2372.924961562042), (-3216.04985023207), 0.0, 4169);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-371.96823387);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.5;
      doubleArray0[3] = (-1.0);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, 2318.9147104, 653.4367637643533);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 132.728605, 0.5, 1519);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=132.729,  initial=0, upper bound=0.5
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-3218.59043387);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      PolynomialFunctionLagrangeForm.verifyInterpolationArray(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-3218.59043387), 0.0, (-1.0), 7);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=-3,218.59, upper bound=-1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = null;
      double double0 = (-1558.9060283318);
      double double1 = (-1286.985582613876);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, (-1558.9060283318), (-1558.9060283318), (-1286.985582613876), (-1));
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = 290.9894960757938;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = 0.0;
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, (-1.0), 0.0, (-2747));
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -2,747
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1708.066469;
      doubleArray0[1] = 0.5;
      doubleArray0[2] = 0.5;
      doubleArray0[3] = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, Double.POSITIVE_INFINITY, 3376);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      doubleArray0[2] = (-626.0729);
      doubleArray0[3] = (-1936.16842083);
      doubleArray0[4] = 1.0;
      doubleArray0[5] = 2027.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction2 = polynomialFunction1.polynomialDerivative();
      PolynomialFunction polynomialFunction3 = polynomialFunction0.subtract(polynomialFunction1);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, 0.0, Double.POSITIVE_INFINITY, 1393.507709);
      double double1 = UnivariateRealSolverUtils.midpoint(3159.637568084004, 1.0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.0;
      double double0 = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      double double1 = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 4778.15588056;
      double double2 = 0.0;
      doubleArray0[5] = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double3 = 0.5;
      int int0 = 273;
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 0.5, 273);
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=273, initial=0, lower bound=0, upper bound=0.5, final a value=0, final b value=0.5, f(a)=1, f(b)=299.635
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1.0;
      doubleArray0[6] = 0.5;
      doubleArray0[7] = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.5, (-245.13086846), 1.0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-199.7909);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = 814.0;
      doubleArray0[4] = (-786.5679329947643);
      double double0 = 0.5;
      doubleArray0[5] = 0.5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve(univariateRealFunction0, 1.0, (-3686.99188613), (-1.0));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1, -3,686.992]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, (-1.0), 321.499701);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, 851.961271997, 321.499701, (-1.0));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [851.961, 321.5]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 1.0;
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 3153.68239, 0.0, 3153.68239);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(1.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = (-2369.32);
      doubleArray0[0] = (-2369.32);
      doubleArray0[1] = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double1 = polynomialFunction0.value(1.0);
      double double2 = 747.52539469046;
      double double3 = polynomialFunction0.value((-1350.866));
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-2369.32), (-2369.32), 747.52539469046, 0);
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = 0.0;
      doubleArray0[0] = 0.0;
      double double1 = 87.6;
      doubleArray0[1] = 87.6;
      double double2 = (-1.0);
      doubleArray0[2] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      String string0 = polynomialFunction0.toString();
      PolynomialFunction polynomialFunction1 = polynomialFunction0.negate();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 2263.35, (-1.0), 0.0);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-1,  initial=2,263.35, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = 0.0;
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 327.56;
      doubleArray0[2] = 3029.012767048431;
      double double1 = 1.0;
      doubleArray0[3] = 1.0;
      doubleArray0[4] = 1916.08429707;
      double double2 = 0.5;
      doubleArray0[5] = 0.5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      String string0 = polynomialFunction0.toString();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, 348.6335569322, 1.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [348.634, 1]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint((-2253.17170622), (-2253.17170622));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-2253.17170622);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-2253.17170622), (-2253.17170622), (-2375.970824875803), Integer.MAX_VALUE);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-2,253.172,  initial=-2,253.172, upper bound=-2,375.971
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 1.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, 1.0, 0.0, 0);
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double double0 = 1093.62200723;
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, 1093.62200723, 1093.62200723, 1093.62200723);
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-972.3523329374);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve(univariateRealFunction0, (-1.0), 0.0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-1, 0], Values: [-972.352, -972.352]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, (-1459.7748399172), 5929.01337);
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-699.11439861);
      double double0 = 9.97535868016E9;
      doubleArray0[1] = 9.97535868016E9;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double1 = 9.96551755536E9;
      double double2 = UnivariateRealSolverUtils.midpoint(9.96551755536E9, 9.97535868016E9);
      double double3 = (-2.060430989937973);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.negate();
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-2.060430989937973), (-699.11439861), 9.97535868016E9);
      double double4 = polynomialFunction0.value(2026.5);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 9.97535868016E9, 9.97535868016E9, (-4550.80187), (-1982));
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -1,982
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(1339.96, Double.POSITIVE_INFINITY);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      doubleArray0[2] = 1339.96;
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = Double.POSITIVE_INFINITY;
      doubleArray1[1] = Double.POSITIVE_INFINITY;
      doubleArray1[2] = Double.POSITIVE_INFINITY;
      doubleArray1[3] = Double.POSITIVE_INFINITY;
      doubleArray1[4] = Double.POSITIVE_INFINITY;
      doubleArray1[5] = Double.POSITIVE_INFINITY;
      doubleArray1[6] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray1);
      PolynomialFunction polynomialFunction2 = polynomialFunction0.multiply(polynomialFunction1);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1775.546);
      doubleArray0[1] = 0.0;
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[0] = polynomialFunction0;
      PolynomialSplineFunction polynomialSplineFunction0 = new PolynomialSplineFunction(doubleArray0, polynomialFunctionArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialSplineFunction0.derivative();
      double double0 = 0.0;
      int int0 = 1;
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 1);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = null;
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[7];
      PolynomialFunction polynomialFunction0 = null;
      try {
        polynomialFunction0 = new PolynomialFunction((double[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double double0 = 0.0;
      double double1 = UnivariateRealSolverUtils.midpoint(2676.29, 0.0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1338.145;
      doubleArray0[1] = 2676.29;
      doubleArray0[2] = 2676.29;
      doubleArray0[3] = 1338.145;
      doubleArray0[4] = 0.0;
      double double2 = 0.0;
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, 2676.29, 1.0, 1.002456430416E10, (-3540));
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-3365.1896613);
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[1] = polynomialFunction0;
      PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[2] = polynomialFunction1;
      PolynomialFunction polynomialFunction2 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[3] = polynomialFunction2;
      PolynomialFunction polynomialFunction3 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[4] = polynomialFunction3;
      PolynomialFunction polynomialFunction4 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[5] = polynomialFunction4;
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction3, 1341.945572003283, 1341.945572003283, 2227.3, 3);
      } catch(Exception e) {
         //
         // number of iterations=3, maximum iterations=3, initial=1,341.946, lower bound=1,341.946, upper bound=2,227.3, final a value=1,341.946, final b value=1,344.946, f(a)=-3,365.19, f(b)=-3,365.19
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(352.3426492, (-775.028895));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-2691.859255708);
      doubleArray0[1] = (-151.9615488904);
      doubleArray0[2] = (-4092.551286250967);
      doubleArray0[3] = (-2793.9);
      doubleArray0[4] = 3809.1429570891;
      double double0 = 0.5;
      doubleArray0[5] = 0.5;
      doubleArray0[6] = (-1320.2184489);
      double double1 = (-2.284173369);
      doubleArray0[7] = (-2.284173369);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        polynomialFunction1.add((PolynomialFunction) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.5603818903539707;
      doubleArray0[1] = 1.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = PolynomialFunctionLagrangeForm.evaluate(doubleArray0, doubleArray0, 1.0);
      double double1 = PolynomialFunctionLagrangeForm.evaluate(doubleArray0, doubleArray0, 1.0);
      PolynomialFunctionLagrangeForm.verifyInterpolationArray(doubleArray0, doubleArray0);
      double double2 = PolynomialFunctionLagrangeForm.evaluate(doubleArray0, doubleArray0, 2907.584);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, 0.0, 1.5);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, 1.0, (-4472.3014044961), (-2281));
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -2,281
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      double double0 = 1.0;
      doubleArray0[0] = 1.0;
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[0] = polynomialFunction0;
      PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction2 = polynomialFunction0.negate();
      polynomialFunctionArray0[1] = polynomialFunction1;
      String string0 = polynomialFunction0.toString();
      PolynomialFunction polynomialFunction3 = polynomialFunction0.negate();
      double double1 = 1.0;
      int int0 = 275;
      double double2 = 1.0;
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1.0, 1.0, 2002.6140332035);
      } catch(Exception e) {
         //
         // number of iterations=2,002, maximum iterations=2,147,483,647, initial=1, lower bound=1, upper bound=2,002.614, final a value=1, final b value=2,002.614, f(a)=1, f(b)=1
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }
}
