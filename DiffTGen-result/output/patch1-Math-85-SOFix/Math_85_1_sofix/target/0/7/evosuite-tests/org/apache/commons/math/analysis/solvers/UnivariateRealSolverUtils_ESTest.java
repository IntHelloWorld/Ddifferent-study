/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 07:22:52 GMT 2020
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
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double double0 = 0.0;
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 1.0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1.0, 1.0, 1.0);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,  initial=1, upper bound=1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 763.161981155;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-462.7676573);
      doubleArray0[5] = 0.5;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double[] doubleArray1 = polynomialFunctionLagrangeForm0.getCoefficients();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 1810.0, Double.POSITIVE_INFINITY);
      double double1 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-1265.106), 1.0E-6, (-1.0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.0;
      double double0 = (-1.0);
      doubleArray0[4] = (-1.0);
      double double1 = 763.161981155;
      doubleArray0[2] = 763.161981155;
      doubleArray0[3] = 1.0;
      doubleArray0[4] = (-462.7676573);
      doubleArray0[5] = 0.5;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 1810.0, Double.POSITIVE_INFINITY);
      } catch(Exception e) {
         //
         // Abscissa 1 is duplicated at both indices 3 and 3
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1110.0;
      doubleArray0[1] = 1110.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction1.derivative();
      String string0 = polynomialFunction1.toString();
      PolynomialFunction polynomialFunction2 = polynomialFunction0.subtract(polynomialFunction1);
      double double0 = polynomialFunction0.value(1110.0);
      double double1 = polynomialFunction0.value((-890.7));
      double double2 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-2133.0344828), 0.0);
      double double3 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction1, (-1893.6993505789942), 1110.0, (-1893.6993505789942));
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction1, 0.0, 1110.0, 4073.706);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,110,  initial=0, upper bound=4,073.706
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-2339.0958254347);
      doubleArray0[1] = (-955.1277005);
      doubleArray0[2] = (-2339.0958254347);
      doubleArray0[3] = (-1949.155379119054);
      doubleArray0[4] = 1005.0;
      doubleArray0[5] = 254.723289;
      doubleArray0[6] = Double.POSITIVE_INFINITY;
      doubleArray0[7] = 0.0;
      doubleArray0[8] = 0.0;
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[0];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-955.1277005), (-2070.577), 1005.0, 1545);
      } catch(Exception e) {
         //
         // Abscissa -955.128 is duplicated at both indices 1 and 8
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = (-2063.03);
      double double1 = UnivariateRealSolverUtils.midpoint(1.0, (-2063.03));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1031.015);
      doubleArray0[1] = (-2063.03);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double double2 = (-3037.577);
      try { 
        UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-3037.577), (-3037.577), (-2063.03));
      } catch(Exception e) {
         //
         // number of iterations=975, maximum iterations=2,147,483,647, initial=-3,037.577, lower bound=-3,037.577, upper bound=-2,063.03, final a value=-3,037.577, final b value=-2,063.03, f(a)=-2,063.03, f(b)=-2,063.03
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.5;
      doubleArray0[5] = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1777.0903698648083, 1777.0903698648083, 0.0, 565);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,777.09,  initial=1,777.09, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-1142.7638433);
      doubleArray0[2] = (-726.0178969411519);
      doubleArray0[3] = (-2626.4271);
      doubleArray0[4] = (-2201.45376007736);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-1142.7638433), 0.0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, (-1.0), (-2201.45376007736));
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-1,  initial=0, upper bound=-2,201.454
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1396.872238;
      doubleArray0[1] = (-1165.3071053);
      doubleArray0[2] = 0.0;
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      doubleArray0[4] = 1.0;
      doubleArray0[5] = 1769.80507501;
      doubleArray0[6] = 0.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 573.752682548, 953.37089314395, (-1165.3071053));
      } catch(Exception e) {
         //
         // Abscissa 1 is duplicated at both indices 4 and 6
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.0;
      double double0 = (-231.26891102789);
      doubleArray0[1] = (-231.26891102789);
      double double1 = 991.78927;
      doubleArray0[2] = 991.78927;
      doubleArray0[3] = 0.0;
      double double2 = 2652.326;
      doubleArray0[4] = 2652.326;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      PolynomialFunction polynomialFunction2 = polynomialFunction0.polynomialDerivative();
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      PolynomialFunction polynomialFunction3 = polynomialFunction1.add(polynomialFunction2);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 1752.56820389161);
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
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 2371.5825736128;
      doubleArray0[2] = 1776.847126;
      doubleArray0[3] = (-877.2863757246);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 2371.5825736128, (-216.6992922), 1776.847126, (-3028));
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -3,028
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = (-1.0);
      double double0 = (-1.0);
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = 1929.69254828;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double1 = 2089.6541688272;
      double double2 = 0.0;
      PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction2 = polynomialFunction1.add(polynomialFunction0);
      PolynomialFunction polynomialFunction3 = polynomialFunction2.multiply(polynomialFunction0);
      PolynomialFunction polynomialFunction4 = polynomialFunction0.add(polynomialFunction1);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 2089.6541688272, 0.0, 2089.6541688272);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-2196.39);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 1.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1509.072968858457;
      doubleArray0[6] = 466.554;
      doubleArray0[7] = (-1049.4108795449);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket(univariateRealFunction0, 575.01, (-1049.4108795449), 1743.9763826);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1333.0528307387;
      doubleArray0[1] = 1157.29814;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-56.057726273);
      doubleArray0[5] = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-2259.6), (-2134.599545114709), 1.0);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-2,134.6,  initial=-2,259.6, upper bound=1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 4262.553485403838;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-499.002209);
      doubleArray0[3] = (-531.0463);
      doubleArray0[4] = (-119.2);
      double double0 = 0.0;
      doubleArray0[5] = 0.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, (-499.002209), 4262.553485403838);
      } catch(Exception e) {
         //
         // Abscissa -119.2 is duplicated at both indices 4 and 5
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 3116.9;
      doubleArray0[2] = 6607.01569434569;
      doubleArray0[3] = (-918.6346437676);
      doubleArray0[4] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0, 3116.9, 6607.01569434569, 3220);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=3,116.9,  initial=1, upper bound=6,607.016
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, (-5304.623336), (-5304.623336), (-5304.623336));
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-2964.0);
      doubleArray0[3] = 110.621;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 0.0, 0);
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = null;
      int int0 = 0;
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, 0.0, 0.0, 0.0, 0);
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 763.161981155;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-462.7676573);
      doubleArray0[5] = 0.5;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 1810.0, Double.POSITIVE_INFINITY);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-1.0), 2385.758, 2178.92536, (-1185));
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -1,185
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint((-751.21165), 1153.6472);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-751.21165);
      doubleArray0[1] = (-751.21165);
      doubleArray0[2] = 1153.6472;
      doubleArray0[3] = (-751.21165);
      doubleArray0[4] = (-751.21165);
      doubleArray0[5] = 201.21777500000007;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double1 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-751.21165), 1153.6472, (-1098.263));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, (-417.4330402), (-417.4330402));
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.0);
      double double0 = 1257.7;
      doubleArray0[1] = 1257.7;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve(univariateRealFunction0, (-1.0), 919.5795003, (-1.0));
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-1, 919.58], Values: [1,257.7, 1,257.7]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(1727.846, 1727.846);
      double double1 = UnivariateRealSolverUtils.midpoint(1081.6119905932956, 1727.846);
      double double2 = UnivariateRealSolverUtils.midpoint(679.356, (-1668.1474164109436));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(1694.82, 1694.82);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = (-1006.92418282);
      doubleArray0[0] = (-1006.92418282);
      doubleArray0[1] = 2296.07741990516;
      doubleArray0[2] = 1521.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 2296.07741990516, (-130.99), 2296.07741990516, 2145178048);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-2196.39);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-2196.39);
      doubleArray0[3] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[5] = 1509.072968858457;
      doubleArray0[6] = 466.554;
      doubleArray0[7] = (-1049.4108795449);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket(univariateRealFunction0, 575.01, (-1049.4108795449), 1743.9763826);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 1.0E-6, (-2075.577));
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=-2,075.577
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = null;
      double double0 = 1902.511783;
      int int0 = (-1);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, (-4146.072512462843), (-4146.072512462843), 1902.511783, (-1));
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = null;
      double double0 = 1.0;
      double double1 = 4813.0;
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, 1.0, 4813.0);
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-2521.9586831);
      doubleArray0[0] = (-2521.9586831);
      doubleArray0[1] = (-224.25928);
      double double1 = (-2287.511052963001);
      doubleArray0[3] = (-2287.511052963001);
      double double2 = 0.0;
      doubleArray0[4] = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = (PolynomialFunction)polynomialFunction0.derivative();
      PolynomialFunction polynomialFunction2 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction3 = polynomialFunction2.multiply(polynomialFunction1);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction1, (-2287.511052963001), (-2842.7273088000443), (-2287.511052963001));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-2,287.511, -2,842.727]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-704.735285);
      doubleArray0[1] = 1.0;
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = 1.0;
      doubleArray0[4] = 1211.0;
      doubleArray0[5] = (-2024.9);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, (-1.0));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = 0.0;
      doubleArray0[0] = 0.0;
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[0] = polynomialFunction0;
      PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[1] = polynomialFunction1;
      PolynomialFunction polynomialFunction2 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[2] = polynomialFunction2;
      PolynomialFunction polynomialFunction3 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[3] = polynomialFunction3;
      PolynomialFunction polynomialFunction4 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[4] = polynomialFunction4;
      PolynomialFunction polynomialFunction5 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[5] = polynomialFunction5;
      PolynomialFunction polynomialFunction6 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[6] = polynomialFunction6;
      PolynomialFunction polynomialFunction7 = null;
      try {
        polynomialFunction7 = new PolynomialFunction((double[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double double0 = 1.0;
      double double1 = UnivariateRealSolverUtils.midpoint(1.0, 1.0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double double2 = (-3037.577);
      try { 
        UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-3037.577), (-3037.577), 1.0);
      } catch(Exception e) {
         //
         // number of iterations=3,039, maximum iterations=2,147,483,647, initial=-3,037.577, lower bound=-3,037.577, upper bound=1, final a value=-3,037.577, final b value=1, f(a)=1, f(b)=1
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 2371.5825736128;
      double double0 = 1776.847126;
      doubleArray0[2] = 2371.5825736128;
      doubleArray0[3] = (-877.2863757246);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double1 = (-216.6992922);
      int int0 = (-3028);
      PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, (-877.2863757246), (double) (-3028));
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-877.286,  initial=0, upper bound=-3,028
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}
