/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 08:37:07 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixPreservingVisitor;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2.2250738585072014E-308;
      doubleArray0[1] = 2.2250738585072014E-308;
      doubleArray0[3] = (-2878.636771517804);
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-2878.636771517804);
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = (-1.0);
      doubleArray1[2] = 2.2250738585072014E-308;
      doubleArray1[3] = 2.2250738585072014E-308;
      doubleArray1[4] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1466.179579995427));
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2.2250738585072014E-308;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-2878.636771517804);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = Double.NEGATIVE_INFINITY;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 2.2250738585072014E-308;
      doubleArray1[3] = 2.2250738585072014E-308;
      doubleArray0[0] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1466.179579995427));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getD();
      try { 
        eigenDecompositionImpl0.getEigenvector((-2486));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2486
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2.2250738585072014E-308;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 2.2250738585072014E-308;
      doubleArray1[1] = (-1.0);
      doubleArray1[2] = 2.2250738585072014E-308;
      doubleArray1[3] = 2.2250738585072014E-308;
      doubleArray1[1] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1466.179579995427));
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2.2250738585072014E-308;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 2.2250738585072014E-308;
      doubleArray1[1] = (-1.0);
      doubleArray1[2] = 2.2250738585072014E-308;
      doubleArray1[3] = 2.2250738585072014E-308;
      doubleArray1[4] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1466.179579995427));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      try { 
        eigenDecompositionImpl0.getEigenvector((-2486));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2486
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2.2250738585072014E-308;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-2878.636771517804);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = Double.NEGATIVE_INFINITY;
      doubleArray1[2] = 2.2250738585072014E-308;
      doubleArray1[3] = 2.2250738585072014E-308;
      doubleArray1[4] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1466.179579995427));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      try { 
        eigenDecompositionImpl0.getEigenvector((-2486));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2486
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2.2250738585072014E-308;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 2.2250738585072014E-308;
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-2878.636771517804);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = Double.NEGATIVE_INFINITY;
      doubleArray0[4] = (-1.0);
      doubleArray1[2] = 2.2250738585072014E-308;
      doubleArray1[3] = 2.2250738585072014E-308;
      doubleArray1[4] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1466.179579995427));
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2.220446049250313E-16;
      doubleArray0[1] = 6.283185307179586;
      doubleArray0[2] = 1130.0564319990135;
      doubleArray0[3] = (-531.043744);
      doubleArray0[4] = Double.NEGATIVE_INFINITY;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 1.0;
      doubleArray1[1] = 6.283185307179586;
      doubleArray1[2] = (-531.043744);
      doubleArray1[3] = 2.220446049250313E-16;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1146.040992403);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 7;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(7, 7);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 7);
      DefaultRealMatrixPreservingVisitor defaultRealMatrixPreservingVisitor0 = new DefaultRealMatrixPreservingVisitor();
      int int1 = 123;
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      int int2 = 2;
      try { 
        array2DRowRealMatrix0.walkInColumnOrder((RealMatrixPreservingVisitor) defaultRealMatrixPreservingVisitor0, 2, 123, 2, 2);
      } catch(RuntimeException e) {
         //
         // row index 123 out of allowed range [0, 6]
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = (-1206.812);
      doubleArray0[4] = 2.2250738585072014E-308;
      doubleArray0[5] = (-485.164);
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 1.232595164407831E-28;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-485.164);
      doubleArray1[1] = (-485.164);
      doubleArray1[2] = 0.0;
      doubleArray1[3] = (-1206.812);
      doubleArray1[4] = 0.0;
      doubleArray1[5] = (-485.164);
      doubleArray1[6] = 2.2250738585072014E-308;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.POSITIVE_INFINITY);
      double double0 = eigenDecompositionImpl0.getImagEigenvalue(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(32, 2860);
      OpenMapRealMatrix openMapRealMatrix1 = new OpenMapRealMatrix(openMapRealMatrix0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix1, 0.0);
      } catch(RuntimeException e) {
         //
         // row index 32 out of allowed range [0, 31]
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 54.0;
      doubleArray0[1] = 0.0;
      double double0 = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-112.851);
      doubleArray0[6] = 0.0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 54.0);
      } catch(RuntimeException e) {
         //
         // a 7x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 0.08325);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, (-1530.066));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-1351.7);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 335.597);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1860.007;
      doubleArray0[1] = (-3806.915);
      doubleArray0[2] = (-1091.0574937348);
      doubleArray0[3] = 929.6;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1207.8872528929758);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getD();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(671);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 671
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 550.4712484724;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 550.4712484724);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(3);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(3, 3, 1.0E-12);
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.mapTan();
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1.0E-12);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(1845, Integer.MAX_VALUE);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1845);
      } catch(RuntimeException e) {
         //
         // row index 1,845 out of allowed range [0, 1,844]
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      doubleArray0[0] = (-2412.116778560283);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 2043.92123);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.618033988750085;
      doubleArray0[0] = 0.0;
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-2878.6368);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = Double.NEGATIVE_INFINITY;
      doubleArray0[2] = (-1.0);
      doubleArray1[2] = 1.618033988750085;
      doubleArray1[3] = 1.618033988750085;
      doubleArray1[4] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1466.179579995427));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      try { 
        eigenDecompositionImpl0.getEigenvector((-2486));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2486
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2.2250738585072014E-308;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-2878.636771517804);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = Double.NEGATIVE_INFINITY;
      doubleArray1[1] = (-1.0);
      doubleArray1[2] = 2.2250738585072014E-308;
      doubleArray1[3] = 2.2250738585072014E-308;
      doubleArray1[4] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1466.179579995427));
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[][] doubleArray0 = new double[4][4];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, true);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 4.280654721622961E-5);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-346.63);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[1] = 906.55302554612;
      doubleArray2[1] = 906.55302554612;
      doubleArray2[2] = (double) 0;
      doubleArray2[3] = 3322.1676491709945;
      doubleArray2[4] = 906.55302554612;
      doubleArray2[5] = (double) 0;
      doubleArray2[6] = (double) 3217;
      doubleArray2[7] = (-346.63);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[0];
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[8];
      doubleArray4[0] = (double) 0;
      doubleArray4[1] = (double) 0;
      doubleArray4[2] = (double) 0;
      doubleArray4[3] = 3322.1676491709945;
      doubleArray4[4] = (double) 3217;
      doubleArray4[5] = 3322.1676491709945;
      doubleArray4[6] = (double) 3217;
      doubleArray4[7] = (-346.63);
      doubleArray0[3] = doubleArray4;
      Array2DRowRealMatrix array2DRowRealMatrix1 = null;
      try {
        array2DRowRealMatrix1 = new Array2DRowRealMatrix(doubleArray0);
      } catch(IllegalArgumentException e) {
         //
         // some rows have length 1 while others have length 8
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}