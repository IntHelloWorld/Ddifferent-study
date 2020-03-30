/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 15:12:45 GMT 2020
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
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, Double.NaN, 3631.4886330057857, 0.0, 2147481038);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=3,631.489,  initial=\uFFFD, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-1430.8323), 3665.199, (-5207.24), 0);
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 3144.55964;
      doubleArray0[1] = 2.8554971637441252E26;
      doubleArray0[3] = 1.0;
      doubleArray0[4] = 1541.9694176665744;
      doubleArray0[5] = (-3095.3939025145996);
      doubleArray0[6] = (-169.89351659);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, Double.NaN, 894.84652695616);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = Double.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 114.1, (-671.0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-1.0);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-1.0), 0.0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 517.0;
      doubleArray0[1] = 0.5;
      doubleArray0[2] = 3957.731907;
      doubleArray0[3] = 1893.97371874;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-3061.0), Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.5, 0.5);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint((-4876.4800976933), (-4876.4800976933));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1697.7932);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1012.97, (-2488.6554622267436), 3927.365);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve(univariateRealFunction0, (-773.1), 0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-773.1, 0], Values: [-1, -1]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 1.0, 65.9736072185, 2597.6872141695);
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
      doubleArray0[2] = (-845.822080622);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 2322.0, 0.0, 2322.0, 4280);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-4695.8339);
      doubleArray0[1] = (-1708.0253557);
      doubleArray0[2] = (-488.299144);
      doubleArray0[3] = (-2080.8188);
      doubleArray0[5] = (-1264.89918915);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-2080.8188), (-2516.7471424997), (-1264.89918915));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 477.3746311681012);
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=2,147,483,647, initial=0, lower bound=0, upper bound=477.375, final a value=0, final b value=1, f(a)=0, f(b)=0
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-1352.657), 0.0, 1295.647897, 3);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=-1,352.657, upper bound=1,295.648
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, 0.0, 1.0, 1.0, 31);
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, 1.0, 1.0);
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 0.5;
      doubleArray0[2] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0, (-574.5646), 1.0, 735);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-792.523909346);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 239.0, 1.0, 995.0, 3442);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-1.0), (-1.0), (-1.0), 3);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-1,  initial=-1, upper bound=-1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-1245.04), (-2170.231), (-2170.231), 32);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-2,170.231,  initial=-1,245.04, upper bound=-2,170.231
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1.0E-14, 992.714, 790.0576213949);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=992.714,  initial=0, upper bound=790.058
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[3] = polynomialFunction0;
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionArray0[3], 982.0, 0.5, 974.0, (-701));
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -701
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 239.0, 1.0, 995.0, 3442);
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=3,442, initial=239, lower bound=1, upper bound=995, final a value=238, final b value=240, f(a)=0, f(b)=0
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-1245.04), 0.0, (-1245.04));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-1597.0258364380427), 0.0);
  }
}