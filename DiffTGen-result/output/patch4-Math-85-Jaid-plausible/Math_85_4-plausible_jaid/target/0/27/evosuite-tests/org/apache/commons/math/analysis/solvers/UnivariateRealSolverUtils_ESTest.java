/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 23:44:40 GMT 2020
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
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 3193.0311532812, 0.0, 0);
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1583.2);
      doubleArray0[2] = (-1.0);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-557.552777003771), 0.0, (-557.552777003771));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 0.5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, (-4978.535327), 1.0, 276.0064267);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1029.8906551834166);
      doubleArray0[1] = (-658.7);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-1029.8906551834166), 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 2935.899);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-801.0);
      doubleArray0[2] = 140.6;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0, 140.6);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(2783.212446, 0.5);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-993.30878);
      doubleArray0[1] = 196.663541;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-574.6), (-993.30878), 639.4586540666277);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-91.77448339581), 1363.5, 0.0);
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-1983.112029623131), (-1.0));
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 140.6;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 140.6, 84.5279073123, 2289.74415917, 1895);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 909.94;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 3225.908, 0.0, 3225.908);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1.0, (-840.2291247416691), 0.0, 1895);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-840.229,  initial=1, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-0.5), (-0.5), (-0.5), 3);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-0.5,  initial=-0.5, upper bound=-0.5
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-801.0);
      doubleArray0[2] = 140.6;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 140.6, 0.0, 2289.74415917, 1895);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4252.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 0.5, 921);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-801.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 140.6, 84.5279073123, 2289.74415917, 1895);
      } catch(Exception e) {
         //
         // number of iterations=1,895, maximum iterations=1,895, initial=140.6, lower bound=84.528, upper bound=2,289.744, final a value=84.528, final b value=2,035.6, f(a)=-67,706.854, f(b)=-1,630,515.6
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 1.0, 0.0, (-122.77554140331));
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=1, upper bound=-122.776
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-325.512), 1.630275902025681E32, 1.630275902025681E32, 31);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=163,027,590,202,568,100,000,000,000,000,000,  initial=-325.512, upper bound=163,027,590,202,568,100,000,000,000,000,000
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1.998298100537703E12, 1553.999759616, 0.0, (-2141941672));
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -2,141,941,672
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, 1.5, 1.5, 1.5, 94);
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-820.1), (-1831.539812), 1462.38885);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-820.1, -1,831.54]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint((-1.0), 0.0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, (-1910.02262185839), (-1910.02262185839));
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}
