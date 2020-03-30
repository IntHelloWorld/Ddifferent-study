/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 15:03:16 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.EigenDecompositionImpl;
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
      double[] doubleArray1 = new double[5];
      doubleArray1[2] = (-156.38438761);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 230.762402293);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-1174.0400980612615));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 230.762402293;
      doubleArray0[1] = 230.762402293;
      doubleArray0[4] = (-1929.0723367);
      doubleArray0[5] = (-827.577);
      double[] doubleArray1 = new double[5];
      doubleArray1[2] = (-156.38438761);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 230.762402293);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2135.869361533);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(7);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      Double[] doubleArray1 = new Double[2];
      doubleArray1[0] = (Double) doubleArray0[0];
      doubleArray1[1] = (Double) 0.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1, 0.0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      try { 
        eigenDecompositionImpl0.getEigenvector(1758);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1758
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-1736.68));
      } catch(RuntimeException e) {
         //
         // a 7x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(1, 3458);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.9999999999999998);
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x3,458 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, (-2431.4583709));
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
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 230.762402293;
      doubleArray0[2] = (-156.38438761);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-156.38438761);
      doubleArray1[1] = 230.762402293;
      doubleArray1[2] = (-156.38438761);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 230.762402293);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (-156.38438761);
      doubleArray0[4] = (-1929.0723367);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-156.38438761);
      doubleArray1[1] = 230.762402293;
      doubleArray1[2] = (-156.38438761);
      doubleArray1[3] = (-2174.056092852971);
      doubleArray1[4] = (-1929.0723367);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 230.762402293);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (-156.38438761);
      doubleArray0[4] = (-1929.0723367);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-156.38438761);
      doubleArray1[1] = 230.762402293;
      doubleArray1[2] = (-156.38438761);
      doubleArray1[3] = (-2174.056092852971);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 230.762402293);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 230.762402293;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-156.38438761);
      doubleArray1[1] = 230.762402293;
      doubleArray1[2] = (-156.38438761);
      doubleArray1[3] = (-2174.056092852971);
      doubleArray1[4] = (-1929.0723367);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 230.762402293);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 4491.57;
      doubleArray0[1] = 0.9999999999999998;
      doubleArray0[3] = (-2473.7402415619);
      doubleArray0[8] = (-55.35930980875711);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.POSITIVE_INFINITY);
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      doubleArray1[2] = (-156.38438761);
      doubleArray1[3] = (-2174.056092852971);
      doubleArray1[4] = (-1929.0723367);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 230.762402293);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (-156.38438761);
      doubleArray0[4] = (-1929.0723367);
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 230.762402293;
      doubleArray1[2] = (-156.38438761);
      doubleArray1[3] = (-2174.056092852971);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 230.762402293);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.POSITIVE_INFINITY);
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      doubleArray1[2] = (-156.38438761);
      doubleArray1[3] = (-2174.056092852971);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 230.762402293);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = Double.NaN;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.NaN);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.NaN);
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 230.762402293);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2135.869361533);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2135.869361533);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2135.869361533);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      RealVector realVector1 = eigenDecompositionImpl0.getEigenvector(0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2135.869361533);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 230.762402293);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 230.762402293);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2135.869361533);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2135.869361533);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[][] doubleArray0 = new double[2][9];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-1442.4648254645342);
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, false);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-1.0));
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2135.869361533);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 4491.57;
      doubleArray0[1] = 0.9999999999999998;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.POSITIVE_INFINITY);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue((-1729));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1729
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2135.869361533);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      double double0 = eigenDecompositionImpl0.getImagEigenvalue(0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2135.869361533);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
  }
}