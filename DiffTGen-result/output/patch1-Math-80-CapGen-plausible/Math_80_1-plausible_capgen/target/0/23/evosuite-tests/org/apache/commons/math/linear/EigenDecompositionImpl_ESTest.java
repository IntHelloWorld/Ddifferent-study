/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 14:03:38 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixChangingVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2136.3974524;
      doubleArray0[1] = (-771.174761149548);
      doubleArray0[2] = 402.6635409051137;
      doubleArray0[3] = (-1810.990168099);
      doubleArray0[4] = 2900.0;
      doubleArray0[5] = 4.0;
      doubleArray0[6] = (-1812.9396272650079);
      doubleArray0[7] = 0.0;
      doubleArray0[8] = (-613.061662023263);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 132.170422624446;
      doubleArray1[2] = 402.6635409051137;
      doubleArray1[3] = 402.6635409051137;
      doubleArray1[4] = (-1810.990168099);
      doubleArray1[5] = (-771.174761149548);
      doubleArray1[6] = (-613.061662023263);
      doubleArray1[7] = (-1501.284);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(2013);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2013
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2136.3974524;
      doubleArray0[1] = (-771.174761149548);
      doubleArray0[2] = 402.6635409051137;
      doubleArray0[3] = (-1810.990168099);
      doubleArray0[4] = 2900.0;
      doubleArray0[5] = 4.0;
      doubleArray0[6] = (-1812.9396272650079);
      doubleArray0[7] = 0.0;
      doubleArray0[8] = (-613.061662023263);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (-613.061662023263);
      doubleArray1[2] = 402.6635409051137;
      doubleArray1[3] = 402.6635409051137;
      doubleArray1[4] = (-1810.990168099);
      doubleArray1[5] = (-771.174761149548);
      doubleArray1[6] = (-613.061662023263);
      doubleArray1[7] = (-1501.284);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(2013);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2013
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2136.3974524;
      doubleArray0[1] = (-771.174761149548);
      doubleArray0[2] = 2136.3974524;
      doubleArray0[3] = (-1810.990168099);
      doubleArray0[4] = 2900.0;
      doubleArray0[5] = 4.0;
      doubleArray0[6] = (-1812.9396272650079);
      doubleArray0[7] = 0.0;
      doubleArray0[8] = (-613.061662023263);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (-1810.990168099);
      doubleArray1[2] = (-771.174761149548);
      doubleArray1[3] = (-771.174761149548);
      doubleArray1[4] = (-1810.990168099);
      doubleArray1[5] = (-771.174761149548);
      doubleArray1[6] = (-613.061662023263);
      doubleArray1[7] = (-1501.284);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver2 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(2013);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2013
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 5916.172655296952;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1384.79);
      doubleArray0[3] = 3.0;
      doubleArray0[4] = 3.0;
      doubleArray0[5] = 3.0;
      doubleArray0[6] = 3319.6136805954657;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      DefaultRealMatrixChangingVisitor defaultRealMatrixChangingVisitor0 = new DefaultRealMatrixChangingVisitor();
      double double0 = realMatrix0.walkInColumnOrder((RealMatrixChangingVisitor) defaultRealMatrixChangingVisitor0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-2445.0));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAbs();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2136.3974524;
      doubleArray0[1] = 2136.3974524;
      doubleArray0[2] = 402.6635409051137;
      doubleArray0[3] = (-1810.990168099);
      doubleArray0[4] = 2900.0;
      doubleArray0[5] = 2900.0;
      doubleArray0[6] = (-1812.9396272650079);
      doubleArray0[7] = 0.0;
      doubleArray0[8] = (-613.061662023263);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 132.170422624446;
      doubleArray1[2] = 402.6635409051137;
      doubleArray1[3] = 402.6635409051137;
      doubleArray1[4] = (-1810.990168099);
      doubleArray1[5] = 2136.3974524;
      doubleArray1[6] = (-613.061662023263);
      doubleArray1[7] = (-1501.284);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(2013);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2013
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2136.3974524;
      doubleArray0[1] = 2136.3974524;
      doubleArray0[2] = 402.6635409051137;
      doubleArray0[3] = (-1810.990168099);
      doubleArray0[4] = 2900.0;
      doubleArray0[5] = 4.0;
      doubleArray0[6] = (-1812.9396272650079);
      doubleArray0[7] = 0.0;
      doubleArray0[8] = (-613.061662023263);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 132.170422624446;
      doubleArray1[2] = 402.6635409051137;
      doubleArray1[3] = 402.6635409051137;
      doubleArray1[4] = (-1810.990168099);
      doubleArray1[6] = (-613.061662023263);
      doubleArray1[7] = (-1501.284);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(2013);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2013
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 5916.172655296952;
      doubleArray0[1] = 0.0;
      doubleArray0[4] = (-1384.79);
      doubleArray0[4] = 3.0;
      doubleArray0[4] = (-3069.867947);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 3319.6136805954657;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-2445.0));
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2136.3974524;
      doubleArray0[1] = (-771.174761149548);
      doubleArray0[2] = 402.6635409051137;
      doubleArray0[3] = (-1810.990168099);
      doubleArray0[4] = 2900.0;
      doubleArray0[5] = 4.0;
      doubleArray0[6] = (-1812.9396272650079);
      doubleArray0[7] = 0.0;
      doubleArray0[8] = (-613.061662023263);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 132.170422624446;
      doubleArray1[2] = 402.6635409051137;
      doubleArray1[3] = 402.6635409051137;
      doubleArray1[4] = (-1810.990168099);
      doubleArray1[5] = (-771.174761149548);
      doubleArray1[6] = (-613.061662023263);
      doubleArray1[7] = (-1501.284);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      int int0 = 2013;
      try { 
        eigenDecompositionImpl0.getEigenvector(2013);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2013
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 5;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(5, 5, 197.017);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1.0E-12;
      doubleArray0[1] = 1.0E-12;
      boolean boolean0 = openMapRealVector1.equals("i5glw?");
      doubleArray0[2] = (double) 5;
      doubleArray0[3] = (double) 5;
      doubleArray0[4] = 197.017;
      RealMatrix realMatrix0 = openMapRealVector1.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0E-12);
      int int1 = (-2660);
      try { 
        eigenDecompositionImpl0.getEigenvector((-2660));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2660
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2136.3974524;
      doubleArray0[1] = (-771.174761149548);
      doubleArray0[2] = 402.6635409051137;
      doubleArray0[3] = (-1810.990168099);
      doubleArray0[4] = 2900.0;
      doubleArray0[5] = 4.0;
      doubleArray0[6] = (-1812.9396272650079);
      doubleArray0[7] = 0.0;
      doubleArray0[8] = (-613.061662023263);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 132.170422624446;
      doubleArray1[2] = 402.6635409051137;
      doubleArray1[3] = 402.6635409051137;
      doubleArray1[4] = (-1810.990168099);
      doubleArray1[5] = (-771.174761149548);
      doubleArray1[6] = (-613.061662023263);
      doubleArray1[7] = (-1501.284);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(2013);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2013
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(8, 8);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (-3492.692));
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(2176);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2176
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 5916.172655296952;
      doubleArray0[1] = 0.0;
      doubleArray0[4] = (-1384.79);
      doubleArray0[4] = 3.0;
      doubleArray0[4] = (-3069.867947);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 3319.6136805954657;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-2445.0));
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2136.3974524;
      doubleArray0[1] = (-771.174761149548);
      doubleArray0[2] = 402.6635409051137;
      doubleArray0[3] = (-1810.990168099);
      doubleArray0[4] = 2900.0;
      doubleArray0[5] = 4.0;
      doubleArray0[6] = (-1812.9396272650079);
      doubleArray0[7] = 0.0;
      doubleArray0[8] = (-613.061662023263);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 132.170422624446;
      doubleArray1[2] = 402.6635409051137;
      doubleArray1[3] = 402.6635409051137;
      doubleArray1[4] = (-1810.990168099);
      doubleArray1[5] = (-771.174761149548);
      doubleArray1[6] = (-613.061662023263);
      doubleArray1[7] = (-1501.284);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(2013);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2013
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 1624.27128304;
      doubleArray0[3] = 748.97;
      doubleArray0[4] = 1.0;
      doubleArray0[5] = (-655.89225698101);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, false);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 748.97);
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[][] doubleArray0 = new double[1][8];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-3282.931434662184);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-3915.012915794838);
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, true);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-3282.931434662184));
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x3 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 5916.172655296952;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1384.79);
      doubleArray0[3] = 3.0;
      doubleArray0[4] = (-3069.867947);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 3319.6136805954657;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-2445.0));
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1824.749;
      doubleArray0[1] = Double.NEGATIVE_INFINITY;
      double double0 = 257.1509038;
      doubleArray0[2] = 257.1509038;
      double double1 = (-3595.8174992370837);
      doubleArray0[3] = (-3595.8174992370837);
      double double2 = (-2678.0);
      doubleArray0[4] = (-2678.0);
      doubleArray0[5] = (-1.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      int int0 = 0;
      RealMatrix realMatrix0 = array2DRowRealMatrix0.getColumnMatrix(0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 257.1509038);
      } catch(RuntimeException e) {
         //
         // a 6x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(17, Double.NEGATIVE_INFINITY);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(17, 17);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1.0E-12);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-1507.2442));
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1538.0;
      doubleArray0[1] = 512.285857962;
      doubleArray0[2] = 1.1102230246251565E-14;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, doubleArray0, 512.285857962);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-270.80852458);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-1119.6732693831));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, Double.NaN);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = Double.NaN;
      doubleArray0[1] = 106.07;
      doubleArray0[2] = (-660.9301741102731);
      doubleArray0[3] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-660.9301741102731));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, (-2398.4032823));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = (-327.4204138849);
      doubleArray0[2] = 319.4543703419;
      doubleArray0[3] = 1395.8;
      doubleArray0[4] = 1785.42;
      doubleArray0[5] = 1016.0;
      doubleArray0[6] = 3934.019901310549;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 3934.019901310549);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2136.3974524;
      doubleArray0[1] = (-771.174761149548);
      doubleArray0[2] = 402.6635409051137;
      doubleArray0[3] = (-1810.990168099);
      doubleArray0[4] = 2900.0;
      doubleArray0[5] = 4.0;
      doubleArray0[6] = (-1812.9396272650079);
      doubleArray0[7] = 0.0;
      doubleArray0[8] = (-613.061662023263);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 132.170422624446;
      doubleArray1[2] = 402.6635409051137;
      doubleArray1[3] = 402.6635409051137;
      doubleArray1[4] = (-1810.990168099);
      doubleArray1[5] = (-771.174761149548);
      doubleArray1[6] = (-613.061662023263);
      doubleArray1[7] = (-1501.284);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(2013);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2013
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 5916.172655296952;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1384.79);
      doubleArray0[3] = 3.0;
      doubleArray0[4] = (-3069.867947);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 3319.6136805954657;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      DefaultRealMatrixChangingVisitor defaultRealMatrixChangingVisitor0 = new DefaultRealMatrixChangingVisitor();
      double double0 = realMatrix0.walkInColumnOrder((RealMatrixChangingVisitor) defaultRealMatrixChangingVisitor0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-2427.997403918816));
      try { 
        eigenDecompositionImpl0.getEigenvector(30);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 30
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1171.4256970241624);
      doubleArray0[1] = (-1.0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-1171.4256970241624));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 1068.70485);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1990.6082803;
      doubleArray0[1] = 2.0;
      doubleArray0[2] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 4.557397421082455);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 1.01;
      doubleArray0[1] = 2074.616636173;
      doubleArray0[2] = Double.NEGATIVE_INFINITY;
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      doubleArray0[4] = 3761.217524075;
      doubleArray0[5] = (-821.468561);
      doubleArray0[6] = 1.0;
      doubleArray0[7] = 0.0;
      doubleArray0[8] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, Double.NEGATIVE_INFINITY);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 68.928711725389;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, 489.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }
}
