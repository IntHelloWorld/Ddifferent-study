/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 11:37:17 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
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
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2.2250738585072014E-308;
      doubleArray0[1] = (-42.494205271);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1567.2931558);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(404, 404);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 0.0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.25);
      } catch(RuntimeException e) {
         //
         // a 5x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[1][8];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, Double.POSITIVE_INFINITY);
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x8 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, Double.POSITIVE_INFINITY);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, Double.POSITIVE_INFINITY);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.5;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.5;
      doubleArray0[3] = (-688.7105163774195);
      doubleArray0[4] = 4439.00197;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.5;
      doubleArray0[2] = (-2893.72089508);
      doubleArray0[3] = (-688.7105163774195);
      doubleArray0[4] = 4439.00197;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.5;
      doubleArray0[2] = (-2893.72089508);
      doubleArray0[3] = (-688.7105163774195);
      doubleArray0[4] = (-941.34723136404);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, Double.NEGATIVE_INFINITY);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 656.8165165218866);
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.5;
      doubleArray0[3] = (-688.7105163774195);
      doubleArray0[4] = (-941.34723136404);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.5;
      doubleArray0[2] = (-2893.72089508);
      doubleArray0[3] = (-2893.72089508);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.5;
      doubleArray0[2] = (-2893.72089508);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(7, 7);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 7);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1705.22295105367);
      doubleArray0[2] = 12.566370614359172;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, Double.NEGATIVE_INFINITY);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.mapFloorToSelf();
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 656.8165165218866);
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(13, 13);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 13);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(474);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 474
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(7, 7);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 7);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(7);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }
}
