/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 19:47:29 GMT 2020
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
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.7965759386741198, 0.7965759386741198, (-792.009352070953), (-795));
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -795
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 1819.7430382895632, 574.71847);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-17.647472);
      doubleArray0[1] = 79.82217619548;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-17.647472), 1.0, (-399.60633));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 90.6139267146397;
      doubleArray0[2] = 749.578217663;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, (-1125.8204986419246), 0.0, (-2308.91906534993));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 1172.1566568);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-2641.6963606279764), 3377.7254);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.5);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-2036.5332);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve(univariateRealFunction0, (-329.2977634373), 0.0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-329.298, 0], Values: [-2,036.533, -2,036.533]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0E-6;
      doubleArray0[1] = (-1858.480024);
      doubleArray0[3] = 4646.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1.0E-15, (-1858.480024), 1.0E-6, 895);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1.0E-15, 0.0, 1173.026822876, 895);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 714.90535;
      doubleArray0[1] = 1952.1528603311892;
      doubleArray0[2] = 2015.3038439898176;
      doubleArray0[3] = (-494.82040354985);
      doubleArray0[4] = 1957.263;
      doubleArray0[5] = (-2122.12047684);
      doubleArray0[6] = (-2930.3468802847055);
      doubleArray0[7] = 1264.593514;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 714.90535, (-1204.42570213383), 1957.263);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1135.318227399604);
      doubleArray0[1] = 1.0E-6;
      doubleArray0[2] = 154.7153726388983;
      doubleArray0[3] = (-2672.5);
      doubleArray0[4] = (-1128.7538885456);
      doubleArray0[5] = 2.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-1.0), (-1.0), 0.5, 787);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      doubleArray0[2] = Double.POSITIVE_INFINITY;
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      doubleArray0[4] = Double.POSITIVE_INFINITY;
      doubleArray0[5] = Double.POSITIVE_INFINITY;
      doubleArray0[6] = Double.POSITIVE_INFINITY;
      doubleArray0[7] = Double.POSITIVE_INFINITY;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, Double.POSITIVE_INFINITY, 0.0, Double.POSITIVE_INFINITY, 73);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1357.319397;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1093.1, 0.0, 1173.31, 2775);
      } catch(Exception e) {
         //
         // number of iterations=1,094, maximum iterations=2,775, initial=1,093.1, lower bound=0, upper bound=1,173.31, final a value=0, final b value=1,173.31, f(a)=1,357.319, f(b)=1,357.319
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 481.0, 1688.973066892, 1.0, 3);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,688.973,  initial=481, upper bound=1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1.0, 0.0, 0.0, 838);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=1, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 1435.72776;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      try { 
        UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, (-1.0), 0.0);
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=2,147,483,647, initial=0, lower bound=-1, upper bound=0, final a value=-1, final b value=0, f(a)=1,435.728, f(b)=1,435.728
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (-792.009352070953);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-792.009352070953), (-792.009352070953), 296.988);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-3249.4506098), (-3249.4506098), (-3249.4506098), 94);
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-3,249.451,  initial=-3,249.451, upper bound=-3,249.451
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1000.7, 224.1736656265, (-1.0));
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=224.174,  initial=1,000.7, upper bound=-1
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
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-792.009352070953), (-792.009352070953), (-792.009352070953), 0);
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, (-308.78509), (-308.78509), (-1.0), (-3194));
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, 1.0, 0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint((-792.009352070953), (-792.009352070953));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, (-329.2977634373), 0.0);
  }
}