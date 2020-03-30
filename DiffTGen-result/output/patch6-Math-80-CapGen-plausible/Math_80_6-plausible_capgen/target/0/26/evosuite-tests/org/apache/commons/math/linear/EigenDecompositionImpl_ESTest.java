/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 15:55:21 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor;
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
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(12, 12, 1.0E-12);
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(12, 12);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 12);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(550);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 550
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-3338.0);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = Double.NaN;
      doubleArray0[3] = (-711.2655);
      doubleArray0[5] = 0.333;
      doubleArray0[6] = 3275.78715218074;
      doubleArray0[7] = (-1.0);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 3275.78715218074;
      doubleArray1[1] = 3275.78715218074;
      doubleArray1[2] = Double.NaN;
      doubleArray1[3] = 1665.0;
      doubleArray0[2] = 0.25;
      doubleArray1[5] = 0.0;
      doubleArray1[6] = 3275.78715218074;
      doubleArray1[2] = 3275.78715218074;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2685.69268326594));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (double) 259;
      doubleArray0[2] = (double) 259;
      doubleArray0[3] = 194.2;
      doubleArray0[4] = 1897.0;
      doubleArray0[5] = (-311.171287);
      doubleArray0[6] = (double) 259;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 194.2;
      doubleArray1[1] = (double) 259;
      doubleArray1[2] = (double) 259;
      doubleArray1[3] = 1897.0;
      doubleArray1[4] = 194.2;
      doubleArray1[5] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 194.2);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-3338.0);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = Double.NaN;
      doubleArray0[3] = (-711.2655);
      doubleArray0[4] = 1665.0;
      doubleArray0[5] = 0.333;
      doubleArray0[6] = 3275.78715218074;
      doubleArray0[7] = (-1.0);
      doubleArray0[8] = 0.25;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 3275.78715218074;
      doubleArray1[1] = 3275.78715218074;
      doubleArray1[2] = Double.NaN;
      doubleArray1[3] = 1665.0;
      doubleArray1[4] = 0.25;
      doubleArray1[5] = 0.0;
      doubleArray1[6] = 3275.78715218074;
      doubleArray1[7] = 3275.78715218074;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2685.69268326594));
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (-2571.913);
      doubleArray1[1] = 4652.278628177312;
      doubleArray0[0] = doubleArray1;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 2.2250738585072014E-308);
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x2 matrix
         //
         verifyException("org.apache.commons.math.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2290, 2290);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 2290);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-617.68483468937));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 16;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(16, 16);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 52);
      DefaultRealMatrixChangingVisitor defaultRealMatrixChangingVisitor0 = new DefaultRealMatrixChangingVisitor();
      int int1 = 0;
      int int2 = 0;
      try { 
        blockRealMatrix0.setEntry((-2), (-6), 451.600713659);
      } catch(RuntimeException e) {
         //
         // no entry at indices (-2, -6) in a 16x16 matrix
         //
         verifyException("org.apache.commons.math.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.333);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 1.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-1302.4);
      doubleArray0[2] = (-529.79979058);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 707.9683629565;
      doubleArray0[5] = 738.0396635;
      doubleArray0[6] = 2158.794566016144;
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
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2786.335036);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-228.0363723986);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-2786.335036));
      } catch(RuntimeException e) {
         //
         // a 3x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 0.333);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 1455.764291;
      doubleArray0[3] = 0.5;
      doubleArray0[4] = 736.0675095311993;
      doubleArray0[5] = (-1614.5336671);
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-127.847744934);
      doubleArray0[8] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-2356.452));
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 3976.407;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 3976.407;
      doubleArray1[1] = 341.553346397;
      doubleArray1[2] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-854.9172);
      doubleArray0[1] = (-128.18);
      doubleArray0[2] = (-1.0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-1.0));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, (-1886.5944685));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1755.81);
      doubleArray0[1] = (-41.627894);
      doubleArray0[2] = 1479.438428176169;
      doubleArray0[3] = (-1226.3781446972105);
      doubleArray0[4] = Double.NEGATIVE_INFINITY;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 2681.5895;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 528.3681893);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      double double0 = 2929.643839619;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2929.643839619;
      doubleArray0[1] = 2929.643839619;
      doubleArray0[2] = 2929.643839619;
      doubleArray0[3] = 2929.643839619;
      doubleArray0[4] = 2929.643839619;
      doubleArray0[5] = 2929.643839619;
      doubleArray0[6] = 2929.643839619;
      doubleArray0[7] = 2929.643839619;
      doubleArray0[8] = 2929.643839619;
      int[] intArray0 = new int[9];
      intArray0[0] = (-1124);
      intArray0[1] = (-56);
      intArray0[2] = (-1134);
      intArray0[3] = 0;
      intArray0[4] = 17;
      intArray0[5] = 46;
      intArray0[6] = 327;
      intArray0[7] = 15;
      intArray0[8] = (-377);
      try { 
        array2DRowRealMatrix0.getSubMatrix(intArray0, intArray0);
      } catch(RuntimeException e) {
         //
         // row index -1,124 out of allowed range [0, -1]
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(12);
      double[][] doubleArray0 = new double[5][1];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) 12;
      doubleArray1[1] = (double) 12;
      doubleArray1[2] = 1.0E-12;
      doubleArray1[3] = 1.0E-12;
      doubleArray1[4] = (double) 12;
      doubleArray1[5] = 1.0E-12;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[1];
      doubleArray2[0] = 1.0E-12;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = (double) 550;
      doubleArray3[1] = 1.0E-12;
      doubleArray3[2] = 1.0E-12;
      doubleArray3[3] = 1.0E-12;
      doubleArray3[4] = 1.0E-12;
      doubleArray3[5] = 1.0E-12;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[1];
      doubleArray4[0] = 1835.5436564;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[4];
      doubleArray5[0] = 1835.5436564;
      doubleArray5[1] = 1.0E-12;
      doubleArray5[2] = 1.0E-12;
      doubleArray5[3] = (double) 12;
      doubleArray0[4] = doubleArray5;
      Array2DRowRealMatrix array2DRowRealMatrix0 = null;
      try {
        array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      } catch(IllegalArgumentException e) {
         //
         // some rows have length 6 while others have length 1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = (-17);
      double[] doubleArray0 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-617.68483468937));
      int int0 = (-2204);
      try { 
        array2DRowRealMatrix0.getSubMatrix((-2204), (-2204), (-2385), 263);
      } catch(RuntimeException e) {
         //
         // row index -2,204 out of allowed range [0, 0]
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }
}
