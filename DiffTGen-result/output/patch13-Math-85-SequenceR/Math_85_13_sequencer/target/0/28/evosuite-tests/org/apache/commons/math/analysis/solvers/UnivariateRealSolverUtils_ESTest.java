/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 15:00:26 GMT 2020
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
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.5, 409.09639, 0.0, 0);
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 886.984, (-2692.674863284843));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2356.293134447572;
      doubleArray0[2] = Double.POSITIVE_INFINITY;
      doubleArray0[3] = (-1218.9);
      doubleArray0[4] = 1287.0440428289971;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 613.150904089833, Double.POSITIVE_INFINITY, 1287.0440428289971);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-1.0), 709.0, 1.3599420129356065E23);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-169.0874);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-169.0874), 0.0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 459.6828807888135;
      doubleArray0[7] = (-983.34);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 2971.3517);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1034.715038695;
      doubleArray0[1] = 1034.715038695;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-1194.690547), 1.0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(1034.715038695, 1034.715038695);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint((-1.0), 0.0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 613.150904089833, Double.POSITIVE_INFINITY, 1287.0440428289971);
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = 1792.26;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-1735.0854968), (-1735.0854968), 1966.30609, 2017606944);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1034.715038695;
      doubleArray0[4] = 1034.715038695;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 1034.715038695);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 886.3599177516792;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, (-2784.936336277), 0.5, 504);
      } catch(Exception e) {
         //
         // number of iterations=504, maximum iterations=504, initial=0, lower bound=-2,784.936, upper bound=0.5, final a value=-504, final b value=0.5, f(a)=886.36, f(b)=886.36
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, (-1573.748), 0.0, 3);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 894.0909900481162;
      doubleArray0[2] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, (-2784.936336277), 0.5, 504);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-906.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 2.0, 0.5, 184.107420611123, Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.5, 0.0, 0.0, 1380);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0.5, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-482.584719422), (-482.584719422), (-482.584719422), 32);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-482.585,  initial=-482.585, upper bound=-482.585
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, 2412.1939, 2412.1939, 0.0, 0);
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, (-1656.267024), (-1656.267024), (-1656.267024));
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1034.715038695;
      doubleArray0[2] = (-1194.690547);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 1034.715038695);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1034.715038695;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 1034.715038695);
      } catch(Exception e) {
         //
         // number of iterations=1,035, maximum iterations=2,147,483,647, initial=0, lower bound=0, upper bound=1,034.715, final a value=0, final b value=1,034.715, f(a)=1,034.715, f(b)=1,034.715
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-482.584719422), (-482.584719422), (-482.584719422));
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-482.585,  initial=-482.585, upper bound=-482.585
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-4049.75229226), 643.17, (-879.0), 2);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=643.17,  initial=-4,049.752, upper bound=-879
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 968.5, 0.0, 968.5, (-248));
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -248
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, 0.5, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.5, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}
