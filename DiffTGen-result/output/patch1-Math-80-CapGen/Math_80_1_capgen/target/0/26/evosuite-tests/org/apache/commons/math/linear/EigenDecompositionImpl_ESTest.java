/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 02:57:17 GMT 2020
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
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 361.8739;
      doubleArray0[2] = 1211.882;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1.5;
      doubleArray0[6] = 0.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1211.882;
      doubleArray1[1] = 1.5;
      doubleArray1[2] = 1211.882;
      doubleArray1[3] = 361.8739;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 361.8739;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1211.882);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      try { 
        eigenDecompositionImpl0.getEigenvector(110);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 110
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 361.8739;
      doubleArray0[2] = 1212.0182730915524;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1.5;
      doubleArray0[6] = 0.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1212.0182730915524;
      doubleArray1[1] = 1.5;
      doubleArray1[2] = 1212.0182730915524;
      doubleArray1[3] = 361.8739;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 361.8739;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1212.0182730915524);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-1288.6);
      doubleArray0[2] = (-1364.1811156581566);
      doubleArray0[3] = (-774.81);
      doubleArray0[4] = 1794.993453036;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 1794.993453036;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      double double0 = openMapRealVector0.getNorm();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.232595164407831E-28);
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 361.8739;
      doubleArray0[2] = 1211.882;
      doubleArray0[3] = 3657.588697187;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1.5;
      doubleArray0[6] = 0.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1211.882;
      doubleArray1[1] = 1.5;
      doubleArray1[2] = 1211.882;
      doubleArray1[3] = 361.8739;
      doubleArray1[4] = 3657.588697187;
      doubleArray1[5] = 361.8739;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1211.882);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = (-1288.6);
      doubleArray0[2] = (-1364.1811156581566);
      doubleArray0[3] = (-774.81);
      doubleArray0[4] = 1794.993453036;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-481.62777255765);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = (OpenMapRealMatrix)openMapRealVector0.outerProduct(doubleArray0);
      double double0 = openMapRealVector0.getNorm();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1.232595164407831E-28);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapUlp();
      int int0 = 0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      try { 
        openMapRealMatrix0.createMatrix(0, 1107);
      } catch(IllegalArgumentException e) {
         //
         // invalid row dimension 0 (must be positive)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 1211.882;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1.5;
      doubleArray0[6] = 0.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1211.882;
      doubleArray1[1] = 1.5;
      doubleArray1[2] = 1211.882;
      doubleArray1[3] = 0.0;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1211.882);
      try { 
        eigenDecompositionImpl0.getEigenvector(2326);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2326
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 361.8739;
      doubleArray0[2] = 1211.882;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1.5;
      doubleArray0[6] = 0.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1211.882;
      doubleArray1[1] = 1.5;
      doubleArray1[2] = 1211.882;
      doubleArray1[3] = 361.8739;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 361.8739;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1211.882);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-2350));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2350
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-1288.6);
      doubleArray0[2] = 0.0;
      doubleArray0[6] = (-782.7374604799884);
      doubleArray0[4] = 1794.993453036;
      doubleArray0[5] = 0.08325;
      doubleArray0[6] = 0.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      double double0 = openMapRealVector0.getNorm();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.232595164407831E-28);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapUlp();
      int int0 = 0;
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      int int1 = 0;
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      try { 
        openMapRealVector0.setSubVector(10, doubleArray1);
      } catch(RuntimeException e) {
         //
         // index 10 out of allowed range [0, 7]
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 361.8739;
      doubleArray0[2] = 1211.882;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1.5;
      doubleArray0[6] = 0.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1211.882;
      doubleArray1[1] = 1.5;
      doubleArray1[2] = 1211.882;
      doubleArray1[3] = 361.8739;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 361.8739;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1211.882);
      try { 
        eigenDecompositionImpl0.getEigenvector(2147483364);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2147483364
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-1288.6);
      doubleArray0[2] = 0.0;
      doubleArray0[6] = (-774.81);
      doubleArray0[4] = 1794.993453036;
      doubleArray0[5] = 0.08325;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-481.62777255765);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      double double0 = openMapRealVector0.getNorm();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.232595164407831E-28);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapUlp();
      int int0 = 0;
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      int int1 = 0;
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      try { 
        openMapRealVector0.setSubVector(10, doubleArray1);
      } catch(RuntimeException e) {
         //
         // index 10 out of allowed range [0, 7]
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1525.80521676989;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 54.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1525.80521676989;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 0.0;
      doubleArray1[3] = Double.POSITIVE_INFINITY;
      doubleArray1[4] = 1525.80521676989;
      doubleArray1[5] = 54.0;
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
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-1288.6);
      doubleArray0[2] = (-1364.1811156581566);
      doubleArray0[3] = (-774.81);
      doubleArray0[4] = 1794.993453036;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-481.62777255765);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      double double0 = openMapRealVector0.getNorm();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.232595164407831E-28);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapUlp();
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      int int0 = 0;
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      try { 
        openMapRealVector0.setSubVector(10, doubleArray1);
      } catch(RuntimeException e) {
         //
         // index 10 out of allowed range [0, 7]
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[3] = (-774.81);
      doubleArray0[4] = 1794.993453036;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-481.61865284428626);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      double double0 = openMapRealVector0.getNorm();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.232595164407831E-28);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapUlp();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      int int0 = 0;
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      try { 
        openMapRealVector0.setSubVector(10, doubleArray1);
      } catch(RuntimeException e) {
         //
         // index 10 out of allowed range [0, 7]
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-4915.0);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.9999999999999998;
      doubleArray0[5] = 2.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 1608.8116607288441;
      doubleArray1[2] = Double.NEGATIVE_INFINITY;
      doubleArray1[3] = 1851.70226531;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = (-873.4);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[6];
      doubleArray2[0] = (-873.4);
      doubleArray2[1] = 2.0;
      doubleArray2[2] = 0.0;
      doubleArray2[3] = (-873.4);
      doubleArray2[4] = 1851.70226531;
      doubleArray2[5] = 0.0;
      doubleArray0[1] = doubleArray2;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, false);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1960.1);
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1900.11193635;
      doubleArray1[1] = 1254.534778;
      doubleArray1[2] = (-195.451279511);
      doubleArray1[3] = 0.0;
      doubleArray1[4] = (-3045.808);
      doubleArray1[5] = 0.0;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-302.6909998429863));
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x6 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = Double.NEGATIVE_INFINITY;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 6.283185307179586;
      doubleArray0[4] = 5571.728111076296;
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
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 1168.9;
      doubleArray0[2] = (-1744.0);
      doubleArray0[3] = (-3164.6313);
      doubleArray0[4] = (-3529.5607735489534);
      doubleArray0[5] = 1982.95762;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.copy();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1.0));
      } catch(RuntimeException e) {
         //
         // a 6x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(1, 1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 52);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-2636.0438974506897));
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 833.66;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 2930.0236;
      doubleArray0[3] = 1.0E-12;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 332.309827;
      doubleArray0[6] = 129.85274306;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1.0E-12;
      doubleArray1[1] = 129.85274306;
      doubleArray1[2] = 833.66;
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
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 361.8739;
      doubleArray0[2] = 1211.882;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1.5;
      doubleArray0[6] = 0.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1211.882;
      doubleArray1[1] = 1.5;
      doubleArray1[2] = 1211.882;
      doubleArray1[3] = 361.8739;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 361.8739;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1211.882);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-0.5123195108550888);
      doubleArray0[1] = (-1288.6);
      doubleArray0[2] = (-0.5123195108550888);
      doubleArray0[6] = (-774.81);
      doubleArray0[4] = (-774.81);
      doubleArray0[5] = 0.08325;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-481.62777255765);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      double double0 = openMapRealVector0.getNorm();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.232595164407831E-28);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapUlp();
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      double double1 = eigenDecompositionImpl0.getImagEigenvalue(0);
      double double2 = eigenDecompositionImpl0.getDeterminant();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
      double double3 = eigenDecompositionImpl0.getRealEigenvalue(0);
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(1966);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1966
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-1288.6);
      doubleArray0[2] = (-1364.1811156581566);
      doubleArray0[3] = (-774.81);
      doubleArray0[4] = 1794.993453036;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-481.62777255765);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      double double0 = openMapRealVector0.getNorm();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.232595164407831E-28);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapUlp();
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      double[] doubleArray1 = realMatrix0.getRow(0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      int int0 = 0;
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getVT();
      try { 
        openMapRealVector0.setSubVector(10, doubleArray1);
      } catch(RuntimeException e) {
         //
         // index 10 out of allowed range [0, 7]
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[][] doubleArray0 = new double[7][9];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1171.1;
      doubleArray1[1] = (-1200.84585086);
      doubleArray1[2] = Double.POSITIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[0];
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[2];
      doubleArray3[0] = 1171.1;
      doubleArray3[1] = 1171.1;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[1];
      doubleArray4[0] = 1171.1;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = Double.POSITIVE_INFINITY;
      doubleArray5[1] = Double.POSITIVE_INFINITY;
      doubleArray5[2] = (-1200.84585086);
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[4];
      doubleArray6[0] = 1171.1;
      doubleArray6[1] = 1171.1;
      doubleArray6[2] = Double.POSITIVE_INFINITY;
      doubleArray6[3] = Double.POSITIVE_INFINITY;
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[2];
      doubleArray7[0] = (-1200.84585086);
      doubleArray7[1] = Double.POSITIVE_INFINITY;
      doubleArray0[6] = doubleArray7;
      Array2DRowRealMatrix array2DRowRealMatrix0 = null;
      try {
        array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, true);
      } catch(IllegalArgumentException e) {
         //
         // some rows have length 3 while others have length 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, (-1908.5899521451));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1809.5);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }
}