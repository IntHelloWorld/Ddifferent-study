/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 15:07:44 GMT 2020
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-2185.0);
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3442.791837703);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-149.2227085816);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.preMultiply((RealMatrix) openMapRealMatrix0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 290.0);
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
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-757.0));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(1705, 744);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 744);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // a 7x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.transpose();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0);
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x7 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 0.0);
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
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 3442.791837703;
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3442.791837703);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-3738.6);
      doubleArray0[1] = 1.0;
      doubleArray0[2] = 3442.6690187908;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1543.93562));
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double(1937.824909);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[0];
      doubleArray0[5] = doubleArray0[3];
      doubleArray0[6] = double0;
      Double double1 = new Double(Double.POSITIVE_INFINITY);
      doubleArray0[7] = double1;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 3241.461858395824);
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-3738.6);
      doubleArray0[2] = 3442.6690187908;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1543.93562));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double(1937.824909);
      doubleArray0[0] = double0;
      Double double1 = new Double(2098.234221493036);
      doubleArray0[1] = double1;
      doubleArray0[2] = double0;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = double1;
      doubleArray0[5] = double1;
      doubleArray0[6] = doubleArray0[2];
      doubleArray0[7] = doubleArray0[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 3241.461858395824);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.preMultiply((RealMatrix) openMapRealMatrix0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1.0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 758.864577206239);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(40, 40);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1.1102230246251565E-14);
      // Undeclared exception!
      eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(7, 7);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 548.624);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3442.791837703);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1.0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 758.864577206239);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(208);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 208
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3442.791837703);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-27));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -27
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3442.791837703);
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
  }
}
