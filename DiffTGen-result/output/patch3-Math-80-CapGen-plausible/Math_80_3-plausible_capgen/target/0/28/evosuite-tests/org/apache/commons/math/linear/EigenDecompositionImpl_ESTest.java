/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 16:18:59 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.BlockRealMatrix;
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
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-2621.7473842);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector1);
      ArrayRealVector arrayRealVector2 = arrayRealVector1.add(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
      int int0 = 0;
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(1260);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1260
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-2621.7163445273654);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector1);
      ArrayRealVector arrayRealVector2 = arrayRealVector1.add(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
      ArrayRealVector arrayRealVector3 = new ArrayRealVector(arrayRealVector0);
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      double double1 = eigenDecompositionImpl0.getDeterminant();
      double double2 = eigenDecompositionImpl0.getDeterminant();
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-80));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -80
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-2621.7473842);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector1);
      ArrayRealVector arrayRealVector2 = arrayRealVector1.add(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getV();
      try { 
        eigenDecompositionImpl0.getEigenvector(2441);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2441
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(488, 488);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 1.0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(2.2250738585072014E-308);
      doubleArray0[0] = double0;
      Double double1 = new Double((double) doubleArray0[0]);
      doubleArray0[1] = double1;
      Double double2 = new Double(2.2250738585072014E-308);
      doubleArray0[2] = double2;
      Double double3 = new Double(483.0);
      doubleArray0[3] = double3;
      Double double4 = new Double(2.2250738585072014E-308);
      doubleArray0[4] = double4;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (double) doubleArray0[1]);
      double[] doubleArray1 = new double[5];
      boolean boolean0 = Double.isFinite((-2108.767366046));
      doubleArray1[0] = (double) doubleArray0[2];
      doubleArray1[1] = (double) doubleArray0[0];
      doubleArray1[2] = 483.0;
      doubleArray1[3] = 483.0;
      doubleArray1[4] = 703.535356;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 108.01180691046);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.add(openMapRealVector1);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray1);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 480.9816077113973);
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 1158.067078185;
      doubleArray1[1] = (-2631.1305);
      doubleArray1[2] = 7584.146055958367;
      doubleArray1[3] = 0.0;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.copy();
      int int0 = 0;
      array2DRowRealMatrix0.copySubMatrix(0, 0, 0, 0, doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x4 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 3;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(3, 3);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 0.0);
      String string0 = openMapRealMatrix0.toString();
      double[] doubleArray0 = eigenDecompositionImpl0.getImagEigenvalues();
      boolean boolean0 = openMapRealMatrix0.isSquare();
      try { 
        eigenDecompositionImpl0.getEigenvector(3);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 872.1);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 11;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(11, 11);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 11);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getD();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      int int1 = (-3663);
      OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.subtract(realMatrix1);
      try { 
        eigenDecompositionImpl0.getEigenvector((-3663));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3663
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 278.0;
      doubleArray0[2] = 4.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-2244.66363);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = (-141.493276888);
      doubleArray0[7] = 1.0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // a 8x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 188.5);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-2621.7473842);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector1);
      ArrayRealVector arrayRealVector2 = arrayRealVector1.add(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
      try { 
        eigenDecompositionImpl0.getEigenvector(2441);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2441
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-31.01592918);
      doubleArray0[1] = 3497.040886;
      doubleArray0[2] = 4.0;
      doubleArray0[3] = 166.79161;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 3497.040886);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-4140.13695437);
      doubleArray0[3] = (-4248.533874381704);
      doubleArray0[4] = 348.48;
      doubleArray0[5] = 0.9999999999999998;
      doubleArray0[6] = 54.9562;
      doubleArray0[7] = 1.01;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(2, 2);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-2619.65));
      // Undeclared exception!
      try { 
        array2DRowRealMatrix0.preMultiply((RealVector) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      doubleArray0[1] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, Double.POSITIVE_INFINITY);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 464.30286150853004);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[0][6];
      Array2DRowRealMatrix array2DRowRealMatrix0 = null;
      try {
        array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one row
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(3.0);
      doubleArray0[0] = double0;
      Double double1 = new Double(Double.NEGATIVE_INFINITY);
      doubleArray0[1] = double1;
      Double double2 = new Double((double) doubleArray0[0]);
      doubleArray0[2] = double2;
      Double double3 = new Double((double) doubleArray0[1]);
      doubleArray0[3] = double3;
      Double double4 = new Double(349040.39837557555);
      doubleArray0[4] = double4;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 3623.6);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-348.7739890101005));
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-2620.127504371468);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
      try { 
        eigenDecompositionImpl0.getEigenvector(2441);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2441
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(2.2250738585072014E-308);
      doubleArray0[0] = double0;
      Double double1 = new Double((double) doubleArray0[0]);
      doubleArray0[1] = double1;
      Double double2 = new Double(2.2250738585072014E-308);
      doubleArray0[2] = double2;
      Double double3 = new Double(483.0);
      doubleArray0[3] = double3;
      Double double4 = new Double(2.2250738585072014E-308);
      boolean boolean0 = Double.isFinite(2.2250738585072014E-308);
      doubleArray0[4] = double4;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (double) doubleArray0[1]);
      double[] doubleArray1 = new double[5];
      boolean boolean1 = Double.isFinite((-2108.767366046));
      doubleArray1[0] = (double) doubleArray0[2];
      doubleArray1[1] = (double) doubleArray0[0];
      doubleArray1[2] = 483.0;
      doubleArray1[3] = 483.0;
      doubleArray1[4] = 703.535356;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 108.01180691046);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.add(openMapRealVector1);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray1);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 480.9816077113973);
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2754.7);
      doubleArray0[1] = (-2754.7);
      doubleArray0[2] = 1251.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 846.83088143117);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1173.55;
      doubleArray0[1] = Double.NaN;
      doubleArray0[2] = 602.057;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, Double.NaN);
      } catch(RuntimeException e) {
         //
         // a 3x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }
}
