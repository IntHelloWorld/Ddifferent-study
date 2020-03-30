/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 21:50:14 GMT 2020
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
      double[][] doubleArray0 = new double[1][3];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-231.9477);
      doubleArray0[0] = doubleArray1;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, (-231.9477));
      try { 
        eigenDecompositionImpl0.getEigenvector((-11));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -11
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 3453.945076252366);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = 2.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2.0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2.0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 615.013272505734;
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4599.6);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(31, 31);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 31);
      // Undeclared exception!
      eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(31, 31);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 31);
      // Undeclared exception!
      eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 94.8573592378);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(640, 640);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 640);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 100.0);
      } catch(RuntimeException e) {
         //
         // a 2x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.transpose();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.POSITIVE_INFINITY);
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x6 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 3.753486333318236E-306);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-119.212354647046));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2.0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2.0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 615.013272505734;
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4599.6);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 3603.885;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4599.6);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4599.6);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4599.6);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4599.6);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4599.6);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4599.6);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(18, 18);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 18);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4599.6);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2.0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2.0);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(1, 1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-4671.10647));
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(1);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(18, 18);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 18);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-517));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -517
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(18, 18);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 18);
      double[] doubleArray0 = eigenDecompositionImpl0.getImagEigenvalues();
  }
}
