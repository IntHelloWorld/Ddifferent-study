/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 12:56:45 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.BlockRealMatrix;
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
      double[] doubleArray0 = new double[0];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      double double0 = 27.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 27.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1071, 0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.mapLogToSelf();
      OpenMapRealVector openMapRealVector3 = openMapRealVector1.mapCbrt();
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector1.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (-3148.09));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[2][9];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-367.94);
      doubleArray1[1] = (-801.1669);
      doubleArray1[2] = 2.0;
      doubleArray1[3] = 1507.727068;
      doubleArray1[4] = 881.5768042976836;
      doubleArray1[5] = 1.0;
      doubleArray1[6] = 21.61988;
      doubleArray1[7] = 4.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = 1.0;
      doubleArray2[1] = 2.0;
      doubleArray2[2] = 2.2250738585072014E-308;
      doubleArray2[3] = 2.0;
      doubleArray2[4] = 881.5768042976836;
      doubleArray2[5] = 2.0;
      doubleArray2[6] = 1068.8972995305;
      doubleArray2[7] = 1507.727068;
      doubleArray0[1] = doubleArray2;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, (-151.287689659053));
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 6;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(6, 6);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 6);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      double[] doubleArray0 = new double[0];
      try { 
        blockRealMatrix0.operate(doubleArray0);
      } catch(IllegalArgumentException e) {
         //
         // vector length mismatch: got 0 but expected 6
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(2298, 2298);
      int[] intArray0 = new int[2];
      intArray0[0] = 46;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 2298);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double(Double.POSITIVE_INFINITY);
      doubleArray0[0] = double0;
      Double double1 = new Double((double) doubleArray0[0]);
      doubleArray0[1] = double1;
      Double double2 = Double.valueOf((double) doubleArray0[1]);
      doubleArray0[2] = double2;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-759.04));
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (double) doubleArray0[2];
      doubleArray1[1] = 1.0E-12;
      doubleArray1[2] = 1.0E-12;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, (-1423.6734892512002));
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (-759.04));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 1.0E-12;
      doubleArray0[3] = 27.0;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 27.0;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 1.0E-12;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 27.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getVT();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver2 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getV();
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      DecompositionSolver decompositionSolver3 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver4 = eigenDecompositionImpl0.getSolver();
      RealVector realVector1 = eigenDecompositionImpl0.getEigenvector(0);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
      RealMatrix realMatrix4 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix5 = eigenDecompositionImpl0.getV();
      double double1 = eigenDecompositionImpl0.getImagEigenvalue(0);
      RealMatrix realMatrix6 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-961.1);
      doubleArray0[1] = (-1519.0);
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-961.1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1519.0));
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
      double double1 = eigenDecompositionImpl0.getRealEigenvalue(0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1670.08;
      doubleArray0[1] = 2.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-2801.3747216);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarAdd((-230.6117436));
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // a 6x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(16, 16);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 16);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1063.4284687843);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 0.0;
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (-1.0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver2 = eigenDecompositionImpl0.getSolver();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      int int0 = 3322;
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(3322);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3322
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
      doubleArray0[0] = (-1238.895);
      doubleArray0[1] = 294.2121079051;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 2334.424);
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
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-420.0);
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-1051.13846428));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1987.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-226.27544002037);
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      doubleArray0[4] = (-1482.5718390357822);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, (double[]) null, (-1482.5718390357822));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 3.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.563;
      doubleArray0[3] = (-2043.9516277143);
      doubleArray0[4] = 2649.992852615;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 0.0;
      doubleArray1[3] = (-2043.9516277143);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 842.018791725;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 842.018791725);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = 4;
      int int1 = 0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = null;
      try {
        array2DRowRealMatrix0 = new Array2DRowRealMatrix(4, 0);
      } catch(IllegalArgumentException e) {
         //
         // invalid column dimension 0 (must be positive)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, doubleArray0, 0.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = Double.NaN;
      doubleArray1[2] = (-1255.787);
      doubleArray1[3] = 0.0;
      doubleArray1[4] = 6710.600365238;
      doubleArray1[5] = (-1930.0);
      doubleArray1[6] = (-1382.5614033578);
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.copy();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.NaN);
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x7 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }
}
