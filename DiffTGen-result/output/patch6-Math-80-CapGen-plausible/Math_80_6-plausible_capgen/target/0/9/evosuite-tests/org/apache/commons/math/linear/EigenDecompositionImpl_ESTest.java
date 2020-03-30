/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 15:49:46 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.08325);
      try { 
        eigenDecompositionImpl0.getEigenvector(306);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 306
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = 6.283185307179586;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 2.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, doubleArray0, (-500.148034));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-1700.0));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(2644, 2644);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // a 6x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.transpose();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-731.03979685575));
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x9 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, (-396.9685179));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 2182.8311534628588);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 3065.142638266611);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double((-1826.37765));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      Double double1 = new Double(1506.0);
      doubleArray0[2] = double1;
      doubleArray0[3] = double0;
      doubleArray0[4] = double0;
      Double double2 = new Double(2.0);
      doubleArray0[5] = double2;
      Double double3 = new Double((-1491.093));
      doubleArray0[6] = double3;
      doubleArray0[7] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1411.61073221452));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double((-1826.37765));
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      Double double1 = new Double(1506.0);
      doubleArray0[2] = double1;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray0[2];
      Double double2 = new Double(2.0);
      doubleArray0[5] = double2;
      doubleArray0[6] = double1;
      doubleArray0[7] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1411.61073221452));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = 566.32651748073;
      doubleArray0[5] = 1525.145265755;
      doubleArray0[7] = 566.32651748073;
      double[] doubleArray1 = new double[8];
      doubleArray1[4] = 276.678893;
      doubleArray1[5] = 1257.0;
      doubleArray1[6] = 1525.145265755;
      doubleArray1[7] = 1257.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2.0;
      doubleArray0[4] = (-788.7421509);
      doubleArray0[5] = (-2700.7);
      doubleArray0[6] = 2.0;
      doubleArray0[7] = 9.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 0.0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = 566.32651748073;
      doubleArray0[5] = 1525.145265755;
      doubleArray0[6] = 1257.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[3] = 2.2250738585072014E-308;
      doubleArray1[4] = 276.678893;
      doubleArray1[5] = 1257.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = 566.32651748073;
      doubleArray0[5] = 1525.145265755;
      double[] doubleArray1 = new double[8];
      doubleArray1[3] = 2.2250738585072014E-308;
      doubleArray1[4] = 276.678893;
      doubleArray1[5] = 1257.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2.0;
      doubleArray0[4] = (-788.7421509);
      doubleArray0[5] = (-2700.7);
      doubleArray0[7] = 9.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 0.0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      doubleArray1[4] = 276.678893;
      doubleArray1[5] = 1257.0;
      doubleArray1[6] = 1525.145265755;
      doubleArray1[7] = 1257.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[0];
      Double double1 = new Double(403.2495189942085);
      doubleArray0[3] = double1;
      doubleArray0[4] = double1;
      doubleArray0[5] = doubleArray0[4];
      Double double2 = new Double(2.0);
      doubleArray0[6] = double2;
      doubleArray0[7] = double1;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2.2250738585072014E-308);
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2.0;
      doubleArray0[4] = (-788.7421509);
      doubleArray0[7] = 9.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 2360.679165699093;
      doubleArray0[2] = (-2901.03423973337);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-2901.03423973337));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-3464.955458250697);
      doubleArray0[1] = 2360.679165699093;
      doubleArray0[2] = (-2901.03423973337);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-2901.03423973337));
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = Double.NaN;
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = 566.32651748073;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = Double.NaN;
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(9, 9);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 9);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.08325);
      try { 
        eigenDecompositionImpl0.getEigenvector(306);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 306
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      try { 
        eigenDecompositionImpl0.getEigenvector((-238));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -238
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(9, 9);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 9);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(9, 9);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 9);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 3.5456097231071253E-305;
      doubleArray0[1] = 2.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 0.0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-2901.03423973337));
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 0.0);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(11);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-3005));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3005
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
  }
}
