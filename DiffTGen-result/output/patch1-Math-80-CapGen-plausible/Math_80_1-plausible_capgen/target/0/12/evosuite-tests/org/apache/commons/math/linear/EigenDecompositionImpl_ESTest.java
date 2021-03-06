/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 14:00:30 GMT 2020
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
      doubleArray0[0] = 4260.201636023;
      doubleArray0[1] = 1197.8069903387836;
      doubleArray0[2] = Double.NaN;
      doubleArray0[3] = (-1.0);
      doubleArray0[4] = 1446.04029;
      doubleArray0[5] = 2548.793260953207;
      doubleArray0[6] = (-758.260649);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1.0);
      doubleArray1[1] = 2548.793260953207;
      doubleArray1[2] = 1446.04029;
      doubleArray1[3] = 1197.8069903387836;
      doubleArray1[4] = (-140.94199681899855);
      doubleArray1[5] = 4260.201636023;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.01);
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      doubleArray0[1] = 1171.89074;
      doubleArray0[2] = (-2326.694934);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1.0E-12);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getEigenvector(1444);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1444
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 2.0;
      doubleArray0[3] = 0.0;
      doubleArray0[5] = 2.0;
      doubleArray0[6] = 2.0;
      doubleArray0[7] = (-2543.133007814);
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 2.0;
      doubleArray1[2] = 1.0;
      doubleArray1[3] = 1.0;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 0.0;
      doubleArray1[6] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0);
      try { 
        eigenDecompositionImpl0.getEigenvector(8);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 2.0;
      doubleArray0[3] = 0.0;
      doubleArray0[5] = 1735.29;
      doubleArray0[6] = 1.0E-12;
      doubleArray0[7] = (-2543.133007814);
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 2.0;
      doubleArray1[2] = 1.0;
      doubleArray1[3] = 1.0;
      doubleArray1[4] = 1.0E-12;
      doubleArray0[0] = 1.0E-12;
      doubleArray1[6] = 1735.29;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0E-12);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      doubleArray0[1] = 1171.89074;
      doubleArray0[2] = (-2326.694934);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      double[] doubleArray1 = openMapRealVector1.toArray();
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1.0E-12);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 2.0;
      doubleArray0[2] = (-108.8);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (-108.8);
      doubleArray1[2] = 1.0;
      doubleArray1[3] = (-108.8);
      doubleArray1[4] = 1.0;
      doubleArray1[5] = (-108.8);
      doubleArray1[6] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-108.8));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 2.0;
      doubleArray0[2] = (-108.8);
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1735.29;
      doubleArray0[6] = 1.0E-12;
      doubleArray0[7] = (-2543.133007814);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 1.0E-12;
      doubleArray1[1] = (-108.8);
      doubleArray1[3] = (-108.8);
      doubleArray1[4] = 1.0E-12;
      doubleArray1[5] = 1.0E-12;
      doubleArray1[6] = 1735.29;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-108.8));
      try { 
        eigenDecompositionImpl0.getEigenvector((-5698));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5698
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(5, 5);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(1431930220);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1431930220
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      doubleArray0[1] = 1171.89074;
      doubleArray0[1] = (-2326.694934);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1.0E-12);
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 2.0;
      doubleArray0[3] = 0.0;
      doubleArray0[5] = 1735.29;
      doubleArray0[6] = 1.0E-12;
      doubleArray0[7] = (-2543.133007814);
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 2.0;
      doubleArray1[2] = 1.0;
      doubleArray1[3] = 1.0;
      doubleArray1[4] = 1.0E-12;
      doubleArray1[5] = 1.0E-12;
      doubleArray1[6] = 1735.29;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 2.0;
      doubleArray0[3] = 0.0;
      doubleArray0[5] = 1735.29;
      doubleArray0[6] = 1.0E-12;
      doubleArray0[7] = (-2543.133007814);
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 2.0;
      doubleArray1[2] = 1.0;
      doubleArray1[3] = 1.0;
      doubleArray1[4] = 1.0E-12;
      doubleArray1[5] = 1.0E-12;
      doubleArray1[3] = 1735.29;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-959.0);
      doubleArray1[1] = (-1006.8);
      doubleArray1[2] = 0.25;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = 0.0;
      doubleArray2[1] = (-1006.8);
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray2;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, true);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray1, false);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct(arrayRealVector0);
      RealMatrix realMatrix1 = array2DRowRealMatrix0.subtract(realMatrix0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix1, (-1.0));
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2146547431, 2695);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 532.908312);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-643.0107404340088);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-1.0);
      doubleArray1[3] = 2.0;
      doubleArray1[4] = 95.754822134;
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (-3936.433981556502);
      doubleArray1[7] = 370.345478;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      int int0 = 0;
      RealMatrix realMatrix0 = array2DRowRealMatrix0.getRowMatrix(0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x8 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 628.175416765;
      doubleArray0[1] = 3398.071820069959;
      doubleArray0[2] = 180.86806;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 2609.63;
      doubleArray0[5] = (-791.6595586409271);
      doubleArray0[6] = 1.01;
      doubleArray0[7] = 0.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 399.5505263121;
      doubleArray0[1] = 1310.26;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 646.731640622;
      doubleArray0[4] = 425.3372;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.getRowMatrix(0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0);
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 3716.709404);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 0.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1007.164721675902;
      doubleArray0[1] = 3185.29594678;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1.0);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getD();
      int int0 = 3250;
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(3250);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3250
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, (-2982.263819989213));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-2600.8);
      doubleArray0[1] = (-2111.343205);
      doubleArray0[2] = (-1090.472);
      doubleArray0[3] = (-505.104719888);
      doubleArray0[4] = 0.0;
      doubleArray0[5] = Double.POSITIVE_INFINITY;
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
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 628.175416765;
      doubleArray0[1] = 3398.071820069959;
      doubleArray0[2] = 180.86806;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 2609.63;
      doubleArray0[5] = (-791.6595586409271);
      doubleArray0[6] = 1.01;
      doubleArray0[7] = 0.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapPow(628.175416765);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      doubleArray0[1] = 1171.89074;
      doubleArray0[2] = (-2326.694934);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1.0E-12);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 2.0;
      doubleArray0[3] = 0.0;
      doubleArray0[5] = 1735.29;
      doubleArray0[6] = 1.0E-12;
      doubleArray0[7] = (-2543.133007814);
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 2.0;
      doubleArray1[2] = 1.0;
      doubleArray1[3] = 1.0;
      doubleArray1[4] = 1.0E-12;
      doubleArray1[5] = 1.0E-12;
      doubleArray1[6] = 1735.29;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(3593);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1.0E-12;
      doubleArray0[1] = (double) 3593;
      doubleArray0[2] = (double) 3593;
      doubleArray0[3] = 1.0E-12;
      doubleArray0[4] = (double) 3593;
      try { 
        openMapRealVector0.outerProduct(doubleArray0);
      } catch(IllegalArgumentException e) {
         //
         // vector length mismatch: got 3,593 but expected 5
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 978.26141531;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-1321.03945528464);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-1244.44051);
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
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-4544.702);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = Double.POSITIVE_INFINITY;
      doubleArray0[3] = (-2165.0075224);
      doubleArray0[4] = 3733.58002782753;
      doubleArray0[5] = 2487.04241885666;
      doubleArray0[6] = Double.NEGATIVE_INFINITY;
      doubleArray0[7] = Double.NEGATIVE_INFINITY;
      doubleArray0[8] = 44.997934268;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarMultiply(2472.0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.NEGATIVE_INFINITY);
      } catch(RuntimeException e) {
         //
         // a 9x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-2727.0);
      doubleArray0[1] = 1.0;
      doubleArray0[2] = 5211.210926788171;
      doubleArray0[3] = 5399.4664;
      doubleArray0[4] = 612.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-2727.0));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-1915.1725433698884);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = (-1915.1725433698884);
      doubleArray2[1] = 45.397368187;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[3];
      doubleArray3[0] = 45.397368187;
      doubleArray3[1] = 45.397368187;
      doubleArray3[2] = 45.397368187;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[8];
      doubleArray4[0] = 0.0;
      doubleArray4[1] = 0.0;
      doubleArray4[2] = (-1915.1725433698884);
      doubleArray4[3] = 45.397368187;
      doubleArray4[4] = (-1915.1725433698884);
      doubleArray4[5] = (-1915.1725433698884);
      doubleArray4[6] = (-1915.1725433698884);
      doubleArray4[7] = (-1915.1725433698884);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[9];
      doubleArray5[0] = 0.0;
      doubleArray5[1] = 0.0;
      doubleArray5[2] = (-1915.1725433698884);
      doubleArray5[3] = 0.0;
      doubleArray5[4] = 0.0;
      doubleArray5[5] = (-1915.1725433698884);
      doubleArray5[6] = 45.397368187;
      doubleArray5[7] = (-1915.1725433698884);
      doubleArray5[8] = (-1915.1725433698884);
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[0];
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[1];
      doubleArray7[0] = 0.0;
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[1];
      doubleArray8[0] = 45.397368187;
      doubleArray0[7] = doubleArray8;
      double[] doubleArray9 = new double[7];
      doubleArray9[0] = 0.0;
      doubleArray9[1] = 0.0;
      doubleArray9[2] = (-1915.1725433698884);
      doubleArray9[3] = 0.0;
      doubleArray9[4] = 45.397368187;
      doubleArray9[5] = (-1915.1725433698884);
      doubleArray9[6] = 0.0;
      doubleArray0[8] = doubleArray9;
      Array2DRowRealMatrix array2DRowRealMatrix0 = null;
      try {
        array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, false);
      } catch(IllegalArgumentException e) {
         //
         // some rows have length 1 while others have length 2
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2609.26;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 2256.311934524032;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1389.204842;
      doubleArray0[5] = 0.0;
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
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 2.0;
      doubleArray0[2] = (-108.8);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1735.29;
      doubleArray0[6] = 1.0E-12;
      doubleArray0[7] = (-2543.133007814);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 1.0E-12;
      doubleArray1[1] = (-108.8);
      doubleArray1[2] = 1.0;
      doubleArray1[3] = (-108.8);
      doubleArray1[4] = 1.0E-12;
      doubleArray1[5] = 1.0E-12;
      doubleArray1[6] = 1735.29;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-108.8));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
  }
}
