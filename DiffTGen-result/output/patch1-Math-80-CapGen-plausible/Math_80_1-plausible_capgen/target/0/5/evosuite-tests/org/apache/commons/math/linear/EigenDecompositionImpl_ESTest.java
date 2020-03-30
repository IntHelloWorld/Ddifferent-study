/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 13:57:26 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.BlockRealMatrix;
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
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 6.283185307179586;
      doubleArray0[2] = 12.566370614359172;
      doubleArray0[3] = 6.283185307179586;
      doubleArray0[4] = (-1927.600873799);
      doubleArray0[5] = (-300.5435618176716);
      doubleArray0[6] = (-1381.6597);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 6.283185307179586;
      doubleArray1[1] = (-1927.600873799);
      doubleArray1[2] = 0.0;
      doubleArray1[3] = (-1927.600873799);
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1927.600873799));
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 25;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(25, 25);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1008.7199);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      // Undeclared exception!
      eigenDecompositionImpl0.getEigenvector(25);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1924.0;
      doubleArray0[1] = 4.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 2.2250738585072014E-308;
      doubleArray0[2] = 2546.91289;
      doubleArray0[5] = Double.NaN;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      Array2DRowRealMatrix array2DRowRealMatrix1 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix1, 1924.0);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 2;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2, 2);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1008.7199);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      try { 
        eigenDecompositionImpl0.getEigenvector(2);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 24;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(24, 24);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (-2528.989708));
      // Undeclared exception!
      eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(2123.4993805);
      doubleArray0[0] = double0;
      Double double1 = new Double(0.0);
      doubleArray0[1] = double1;
      Double double2 = new Double((double) doubleArray0[0]);
      doubleArray0[2] = double2;
      doubleArray0[3] = double0;
      Double double3 = new Double(0.0);
      doubleArray0[4] = double3;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 608.621294);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      double double4 = Double.min(1.0E-12, 1.0E-12);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 713.34005768);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1824.570447451163);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      double double0 = array2DRowRealMatrix0.getFrobeniusNorm();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1055.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      double[][] doubleArray1 = new double[3][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      array2DRowRealMatrix0.data = doubleArray1;
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(20);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 2508;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2508, 2508);
      int int1 = 5;
      RealMatrix realMatrix0 = openMapRealMatrix0.getColumnMatrix(5);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 2508);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0, 0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.mapRintToSelf();
      RealMatrix realMatrix0 = openMapRealVector1.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix4 = eigenDecompositionImpl0.getVT();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix5 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix6 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix7 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix8 = eigenDecompositionImpl0.getVT();
      double double0 = eigenDecompositionImpl0.getImagEigenvalue(0);
      RealMatrix realMatrix9 = eigenDecompositionImpl0.getVT();
      double double1 = eigenDecompositionImpl0.getRealEigenvalue(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 559.85401489367);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 12;
      int int1 = 15;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(12, 15);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 12);
      } catch(RuntimeException e) {
         //
         // row index 12 out of allowed range [0, 11]
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-3438.4390795875493);
      doubleArray0[1] = 1991.83;
      doubleArray0[2] = 2991.0;
      doubleArray0[3] = 1.0;
      doubleArray0[4] = (-3697.3);
      doubleArray0[5] = 790.276208233;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarMultiply((-3438.4390795875493));
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 235.1068578879163);
      } catch(RuntimeException e) {
         //
         // a 6x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = 6.283185307179586;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      double[][] doubleArray1 = new double[2][6];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      array2DRowRealMatrix0.data = doubleArray1;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 2.0);
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 6.283185307179586;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 12.566370614359172;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-1927.600873799);
      doubleArray0[5] = (-300.5435618176716);
      doubleArray0[6] = (-1381.6597);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (-1927.600873799);
      doubleArray1[2] = 0.0;
      doubleArray1[3] = (-1927.600873799);
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1927.600873799));
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      doubleArray0[1] = 1004.729474;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, Double.NEGATIVE_INFINITY);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 0.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 6.283185307179586);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 1775.403;
      doubleArray0[0] = doubleArray1;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      DefaultRealMatrixPreservingVisitor defaultRealMatrixPreservingVisitor0 = new DefaultRealMatrixPreservingVisitor();
      double double0 = blockRealMatrix0.walkInColumnOrder((RealMatrixPreservingVisitor) defaultRealMatrixPreservingVisitor0);
      boolean boolean0 = blockRealMatrix0.equals("T:$[{u/oJsP<#mIsA");
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 2045.805);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      try { 
        blockRealMatrix0.setColumnMatrix(1188, realMatrix0);
      } catch(RuntimeException e) {
         //
         // column index 1,188 out of allowed range [0, 0]
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = 11;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(11, 11);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1008.7199);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      try { 
        eigenDecompositionImpl0.getEigenvector(11);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 735.8;
      doubleArray0[1] = 268.109343529852;
      doubleArray0[2] = (-1827.938711);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 851.10425233;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 0.0;
      doubleArray0[8] = 1.5;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 268.109343529852);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1362.68589336);
      doubleArray0[1] = 1.0E-12;
      doubleArray0[2] = 12.566370614359172;
      doubleArray0[3] = 1.1102230246251565E-16;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarMultiply(4118.109);
      try { 
        array2DRowRealMatrix0.multiplyEntry(16, (-1141), 12.566370614359172);
      } catch(RuntimeException e) {
         //
         // no entry at indices (16, -1,141) in a 4x1 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 1248;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(1248, 1248);
      DefaultRealMatrixPreservingVisitor defaultRealMatrixPreservingVisitor0 = new DefaultRealMatrixPreservingVisitor();
      try { 
        blockRealMatrix0.walkInRowOrder((RealMatrixPreservingVisitor) defaultRealMatrixPreservingVisitor0, 1248, (-3500), (-2259), 1248);
      } catch(RuntimeException e) {
         //
         // row index 1,248 out of allowed range [0, 1,247]
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 972;
      doubleArray0[2] = (double) 20;
      doubleArray0[3] = (double) 20;
      doubleArray0[4] = (double) 972;
      doubleArray0[5] = (double) 972;
      doubleArray0[6] = (double) 972;
      doubleArray0[7] = (double) 9;
      doubleArray0[8] = (double) 9;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1.1102230246251565E-16);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(2123.4993805);
      doubleArray0[0] = double0;
      Double double1 = new Double(0.0);
      doubleArray0[1] = double1;
      Double double2 = new Double((double) doubleArray0[0]);
      doubleArray0[2] = double2;
      Double double3 = new Double(Double.POSITIVE_INFINITY);
      doubleArray0[3] = double3;
      Double double4 = new Double(0.0);
      doubleArray0[4] = double4;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 608.621294);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      double double5 = Double.min((-3242.21), 1.0E-12);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 713.34005768);
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }
}
