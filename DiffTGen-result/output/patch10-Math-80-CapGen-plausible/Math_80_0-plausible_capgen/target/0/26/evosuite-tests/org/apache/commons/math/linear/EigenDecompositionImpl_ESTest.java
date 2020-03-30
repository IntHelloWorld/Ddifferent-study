/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 12:56:41 GMT 2020
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double(4.0);
      doubleArray0[0] = double0;
      Double double1 = new Double((-825.2777319627397));
      doubleArray0[1] = double1;
      Double double2 = new Double((double) doubleArray0[1]);
      doubleArray0[2] = double2;
      Double double3 = new Double((double) doubleArray0[1]);
      doubleArray0[3] = double3;
      Double double4 = new Double((double) doubleArray0[3]);
      doubleArray0[4] = double4;
      Double double5 = new Double((double) doubleArray0[3]);
      doubleArray0[5] = double5;
      Double double6 = new Double(1.0E-12);
      doubleArray0[6] = double6;
      Double double7 = new Double(2.0);
      doubleArray0[7] = double7;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0, 0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector1.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(357, 357);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 52);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      double double0 = (-2006.9);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-2006.9));
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 2.2250738585072014E-308;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarMultiply((-607.314956591744));
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2.2250738585072014E-308);
      int int0 = 0;
      int int1 = (-140);
      try { 
        eigenDecompositionImpl0.getEigenvector((-140));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -140
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-113.461381325922);
      doubleArray0[1] = Double.NaN;
      doubleArray0[2] = Double.NEGATIVE_INFINITY;
      doubleArray0[3] = 2885.200616;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-113.461381325922);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 0.0;
      doubleArray1[3] = Double.NaN;
      doubleArray1[4] = 2885.200616;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 5565.26;
      doubleArray0[1] = 12.566370614359172;
      doubleArray0[2] = (-1038.5848588045894);
      doubleArray0[3] = 2852.8328571704237;
      doubleArray0[4] = (-1.0);
      doubleArray0[5] = 955.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      ArrayRealVector arrayRealVector2 = new ArrayRealVector(arrayRealVector1, true);
      RealMatrix realMatrix0 = arrayRealVector2.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 620.30987848);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 4720.449099;
      doubleArray1[2] = 343.6770243;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 4720.449099);
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x3 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 842.5361377;
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 842.5361377;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 842.5361377);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 1.1102230246251565E-16);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(2058, 2058);
      int int0 = (-621);
      try { 
        array2DRowRealMatrix0.createMatrix(2058, (-621));
      } catch(IllegalArgumentException e) {
         //
         // invalid column dimension -621 (must be positive)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 27.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 1238.657;
      doubleArray0[3] = 2.0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 2.0);
      } catch(RuntimeException e) {
         //
         // a 4x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0, 2611);
      try { 
        openMapRealVector1.outerproduct(openMapRealVector0);
      } catch(IllegalArgumentException e) {
         //
         // vector length mismatch: got 2,611 but expected 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      // Undeclared exception!
      try { 
        array2DRowRealMatrix0.scalarAdd(2.2250738585072014E-308);
      } catch(IllegalArgumentException e) {
         //
         // invalid row dimension 0 (must be positive)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = 2.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = (-923.0);
      doubleArray0[4] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 118.224);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      Double double1 = new Double(0.0);
      doubleArray0[1] = double1;
      Double double2 = new Double((-1038.5822818995932));
      doubleArray0[2] = double2;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, Double.POSITIVE_INFINITY);
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (-1038.5822818995932);
      doubleArray1[2] = Double.POSITIVE_INFINITY;
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }
}
