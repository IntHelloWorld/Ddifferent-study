/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 12:23:55 GMT 2020
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
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 280.91;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-3776.680575267479);
      doubleArray0[5] = 2.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      int int0 = (-2183);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      Double[] doubleArray1 = new Double[3];
      doubleArray1[1] = (Double) 0.0;
      doubleArray1[2] = (Double) 280.91;
      RealMatrix realMatrix2 = arrayRealVector0.outerProduct(arrayRealVector0);
      double double0 = arrayRealVector0.getDistance(arrayRealVector0);
      double double1 = arrayRealVector0.getDistance(arrayRealVector0);
      try { 
        eigenDecompositionImpl0.getEigenvector((-2183));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2183
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0, 0);
      RealMatrix realMatrix0 = openMapRealVector1.outerProduct((RealVector) openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.mapExpm1ToSelf();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 3314.83142226);
      OpenMapRealVector openMapRealVector3 = openMapRealVector1.ebeDivide((RealVector) openMapRealVector0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      OpenMapRealVector openMapRealVector4 = openMapRealVector1.mapCbrt();
      double double1 = eigenDecompositionImpl0.getImagEigenvalue(0);
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getD();
      double double2 = eigenDecompositionImpl0.getImagEigenvalue(0);
      double double3 = eigenDecompositionImpl0.getImagEigenvalue(0);
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
      double double4 = eigenDecompositionImpl0.getDeterminant();
      RealMatrix realMatrix4 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix5 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 1015;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(1015, 1015);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 54.0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-786.1779834);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 2655.3682721994;
      doubleArray0[3] = (-731.409911);
      doubleArray0[4] = 3923.271152208;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-786.1779834);
      doubleArray1[1] = (-786.1779834);
      doubleArray1[2] = 0.0;
      doubleArray1[3] = (-786.1779834);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-786.1779834));
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-126));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -126
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double(0.25);
      doubleArray0[0] = double0;
      Double double1 = new Double(0.25);
      doubleArray0[1] = double1;
      Double double2 = new Double((double) doubleArray0[0]);
      doubleArray0[2] = double2;
      Double double3 = new Double((double) doubleArray0[0]);
      doubleArray0[3] = double3;
      Double double4 = new Double(0.25);
      doubleArray0[4] = double4;
      Double double5 = new Double((double) doubleArray0[3]);
      doubleArray0[5] = double5;
      Double double6 = new Double((double) doubleArray0[3]);
      doubleArray0[6] = double6;
      Double double7 = new Double(0.0);
      doubleArray0[7] = double7;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector1.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (double) doubleArray0[6]);
      double double8 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1918.0637045246806);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(10, 10);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 10);
      OpenMapRealMatrix openMapRealMatrix1 = new OpenMapRealMatrix(10, 10);
      OpenMapRealMatrix openMapRealMatrix2 = openMapRealMatrix0.subtract(openMapRealMatrix1);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      try { 
        eigenDecompositionImpl0.getEigenvector(10);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 856.5135;
      doubleArray1[1] = 2.0;
      doubleArray1[2] = 0.0;
      doubleArray1[3] = (-1.0);
      doubleArray1[4] = 0.0;
      doubleArray1[5] = Double.NaN;
      doubleArray1[6] = (-987.0009);
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, true);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-1.0));
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x7 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 2.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-2543.1);
      doubleArray0[1] = 280.91;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-3776.680575267479);
      doubleArray0[5] = 2.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      int int0 = (-2183);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      Double[] doubleArray1 = new Double[3];
      doubleArray1[0] = (Double) 2.0;
      doubleArray1[1] = (Double) 0.0;
      doubleArray1[2] = (Double) 280.91;
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray1);
      try { 
        arrayRealVector0.outerProduct(arrayRealVector1);
      } catch(IllegalArgumentException e) {
         //
         // vector length mismatch: got 6 but expected 3
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(9, 9);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 2.2250738585072014E-308);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealVector realVector0 = blockRealMatrix0.getRowVector(0);
      blockRealMatrix0.setColumnVector(0, realVector0);
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getD();
      double[] doubleArray0 = eigenDecompositionImpl0.getRealEigenvalues();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(9);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 988.8);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 100.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1.05;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1303.7029638);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 1.0;
      doubleArray0[3] = 2.2250738585072014E-308;
      doubleArray0[4] = (-2410.8375558673);
      doubleArray0[5] = 4341.755152;
      doubleArray0[6] = 0.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2.2250738585072014E-308);
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-185.941055767503);
      doubleArray0[1] = (-2980.79865472);
      doubleArray0[2] = 1.232595164407831E-28;
      doubleArray0[3] = 1.0E-12;
      doubleArray0[4] = 1.232595164407831E-28;
      doubleArray0[5] = (-1188.99954341161);
      doubleArray0[6] = 0.333;
      doubleArray0[7] = 2.0;
      doubleArray0[8] = Double.NEGATIVE_INFINITY;
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
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-2543.1);
      doubleArray0[1] = 280.91;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-3776.680575267479);
      doubleArray0[5] = 2.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      int int0 = (-2183);
      double double0 = realMatrix0.getFrobeniusNorm();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      Double[] doubleArray1 = new Double[3];
      doubleArray1[0] = (Double) 2.0;
      doubleArray1[1] = (Double) 0.0;
      try { 
        eigenDecompositionImpl0.getEigenvector((-2183));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2183
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-637.406201596);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 695.424893262;
      doubleArray0[4] = 1741.7858152;
      doubleArray0[5] = 2303.82642;
      doubleArray0[6] = 27.0;
      doubleArray0[7] = 2321.0440340059736;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1741.7858152);
      } catch(RuntimeException e) {
         //
         // a 8x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      intArray0[1] = 0;
      double[][] doubleArray0 = new double[0][1];
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, (-893.922));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2595.47889210192;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 1.1102230246251565E-16;
      doubleArray0[3] = 2.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-862.957002337906);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, (-2557.44));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      doubleArray0[1] = (-1043.79283);
      doubleArray0[2] = (-3601.874089953812);
      doubleArray0[3] = 2044.13825447936;
      doubleArray0[4] = 9.0;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = Double.NEGATIVE_INFINITY;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = 40;
      intArray0[2] = (-1606);
      intArray0[3] = 722;
      intArray0[4] = (-2834);
      intArray0[5] = 0;
      intArray0[6] = (-885);
      intArray0[7] = 0;
      try { 
        array2DRowRealMatrix0.getSubMatrix(intArray0, intArray0);
      } catch(RuntimeException e) {
         //
         // row index 0 out of allowed range [0, -1]
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = null;
      try {
        array2DRowRealMatrix0 = new Array2DRowRealMatrix(0, 0);
      } catch(IllegalArgumentException e) {
         //
         // invalid row dimension 0 (must be positive)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}
