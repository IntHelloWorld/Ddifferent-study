/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 16:11:25 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
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
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double((-882.777447351395));
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      Double double1 = new Double((-1135.3728297660623));
      doubleArray0[2] = double1;
      doubleArray0[3] = doubleArray0[1];
      doubleArray0[4] = double0;
      doubleArray0[5] = doubleArray0[2];
      doubleArray0[6] = double1;
      doubleArray0[7] = doubleArray0[4];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = 1521.9656552;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 2.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 27.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double((-882.777447351395));
      doubleArray0[0] = double0;
      Double double1 = new Double((-1135.3728297660623));
      doubleArray0[1] = double1;
      doubleArray0[2] = double1;
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = double0;
      doubleArray0[5] = doubleArray0[2];
      doubleArray0[6] = doubleArray0[0];
      doubleArray0[7] = doubleArray0[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-2090));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2090
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(1083, 1083);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.5);
      } catch(RuntimeException e) {
         //
         // a 5x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(1467, 4496);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 0.9999999999999998);
      } catch(RuntimeException e) {
         //
         // row index 1,467 out of allowed range [0, 1,466]
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, (-1412.9916935929957));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 814.34084);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double((-882.777447351395));
      doubleArray0[0] = double0;
      Double double1 = new Double((-1135.3728297660623));
      doubleArray0[1] = double1;
      doubleArray0[2] = double0;
      doubleArray0[3] = double1;
      doubleArray0[4] = double1;
      doubleArray0[5] = doubleArray0[1];
      doubleArray0[6] = doubleArray0[4];
      doubleArray0[7] = double1;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[2];
      Double double1 = new Double(27.515194260208858);
      doubleArray0[5] = double1;
      Double double2 = new Double((-3812.294509363656));
      doubleArray0[6] = double2;
      Double double3 = new Double(258.4);
      doubleArray0[7] = double3;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (double) doubleArray0[3]);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray0[0];
      Double double1 = new Double(27.0);
      doubleArray0[5] = double1;
      Double double2 = new Double((-3812.294509363656));
      doubleArray0[6] = double2;
      Double double3 = new Double(258.4);
      doubleArray0[7] = double3;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (double) doubleArray0[3]);
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = Double.NaN;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, Double.NaN);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray0[0];
      Double double1 = new Double(27.0);
      doubleArray0[5] = double1;
      Double double2 = new Double((-3812.294509363656));
      doubleArray0[6] = double2;
      doubleArray0[7] = double1;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (double) doubleArray0[3]);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[3];
      Double double1 = new Double(27.0);
      doubleArray0[5] = double1;
      doubleArray0[6] = doubleArray0[5];
      doubleArray0[7] = doubleArray0[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (double) doubleArray0[3]);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double((-882.777447351395));
      doubleArray0[0] = double0;
      Double double1 = new Double((-1135.3728297660623));
      doubleArray0[1] = double1;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = double0;
      doubleArray0[5] = doubleArray0[0];
      doubleArray0[6] = doubleArray0[0];
      doubleArray0[7] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(17, 17);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 17);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(17, 17);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 17);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(17, 17);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 17);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(17, 17);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 17);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1463.889149;
      double[][] doubleArray1 = new double[2][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray1);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(17, 17);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 17);
      double[] doubleArray0 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, false);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue((-736));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -736
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double((-882.777447351395));
      doubleArray0[0] = double0;
      Double double1 = new Double((-1135.3728297660623));
      doubleArray0[1] = double1;
      doubleArray0[2] = double1;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = double0;
      doubleArray0[5] = doubleArray0[0];
      doubleArray0[6] = double1;
      doubleArray0[7] = doubleArray0[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      double double2 = eigenDecompositionImpl0.getImagEigenvalue(0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(17, 17);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 17);
      double[] doubleArray0 = eigenDecompositionImpl0.getImagEigenvalues();
  }
}