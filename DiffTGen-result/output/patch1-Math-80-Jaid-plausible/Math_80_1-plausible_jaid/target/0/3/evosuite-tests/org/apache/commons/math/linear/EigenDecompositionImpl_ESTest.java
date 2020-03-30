/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 00:38:22 GMT 2020
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
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(15, 15);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1518.9765111289);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(2847);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2847
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, (-1533.0));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2146765478, 2146765478);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 2.146765478E9);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // a 4x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, false);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-437.7));
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x9 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-923.6091983543198));
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 2570.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = 2188.1377711;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.POSITIVE_INFINITY);
      try { 
        eigenDecompositionImpl0.getEigenvector((-457));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -457
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(15, 15);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarAdd(15);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1518.9765111289);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-378.0);
      doubleArray0[1] = (-378.0);
      doubleArray0[3] = 647.6734921721619;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-378.0);
      doubleArray0[1] = Double.NaN;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(15, 15);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1518.9765111289);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(15, 15);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1518.9765111289);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.POSITIVE_INFINITY);
      try { 
        eigenDecompositionImpl0.getEigenvector((-457));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -457
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2435.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      try { 
        eigenDecompositionImpl0.getEigenvector(2067);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2067
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(17);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 17);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.POSITIVE_INFINITY);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(17);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 17);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(15, 15);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1518.9765111289);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = 2293.720602282;
      doubleArray0[5] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2293.720602282);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(17);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 17);
      double[] doubleArray0 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(15, 15);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1518.9765111289);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue((-3038));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3038
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.POSITIVE_INFINITY);
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(15, 15);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1518.9765111289);
      double double0 = eigenDecompositionImpl0.getImagEigenvalue(12);
  }
}
