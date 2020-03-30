/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 13:45:32 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixChangingVisitor;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2.0;
      doubleArray0[2] = (-2760.85);
      doubleArray0[3] = 5063.894578437;
      doubleArray0[5] = 1504.32192466705;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-100.046);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapDivide(0.0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-100.046));
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[25];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = 1525.354426956;
      doubleArray0[2] = (-2760.85);
      doubleArray0[3] = 5063.894578437;
      doubleArray0[4] = 0.333;
      doubleArray0[5] = 1504.32192466705;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-96.21689085185132);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-96.21689085185132));
      // Undeclared exception!
      eigenDecompositionImpl0.getEigenvector(20);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = 2.0;
      doubleArray0[2] = (-2760.85);
      doubleArray0[3] = 5063.894578437;
      doubleArray0[5] = 1504.32192466705;
      doubleArray0[6] = 0.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = 2.0;
      doubleArray0[2] = (-2760.85);
      doubleArray0[3] = 5063.894578437;
      doubleArray0[7] = (-100.046);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-100.046));
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 530;
      int int1 = 102;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(530, 102);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (-7.294846335542143E-150));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 4907.787060973;
      doubleArray0[1] = (-441.0766286007654);
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = 1743.38;
      doubleArray0[4] = 3004.34642013;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 4907.787060973;
      doubleArray1[1] = 1743.38;
      doubleArray1[2] = 3004.34642013;
      doubleArray1[3] = 1743.38;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1743.38);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      int int0 = 3771;
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(3771);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3771
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = 1525.354426956;
      doubleArray0[2] = (-2760.85);
      doubleArray0[3] = 5063.894578437;
      doubleArray0[4] = 0.333;
      doubleArray0[5] = 1504.32192466705;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 1504.32192466705;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1504.32192466705);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapRintToSelf();
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 3000.604741609747;
      doubleArray0[1] = 152.889605;
      doubleArray0[2] = 1.0E-12;
      doubleArray0[3] = 1.232595164407831E-28;
      doubleArray0[4] = (-1339.807);
      doubleArray0[5] = 616.817756516;
      doubleArray0[6] = 27.0;
      doubleArray0[7] = (-2169.97908782);
      doubleArray0[8] = 0.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.POSITIVE_INFINITY);
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 1586.7402;
      doubleArray0[2] = (-1092.873051874);
      doubleArray0[3] = Double.NaN;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 2302.9192513521;
      doubleArray0[6] = (-343.5673445560794);
      doubleArray0[7] = 1237.848;
      doubleArray0[8] = 1.01;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1503.112556);
      } catch(RuntimeException e) {
         //
         // a 9x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 4.0;
      doubleArray0[1] = (-464.7443421796);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, true);
      RealVector realVector0 = arrayRealVector0.unitVector();
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 3286.802);
      try { 
        eigenDecompositionImpl0.getEigenvector((-1077));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1077
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-3380.6669);
      doubleArray0[1] = 1.0;
      doubleArray0[2] = 278.4070307;
      doubleArray0[3] = 1898.0;
      doubleArray0[4] = 1611.0;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-3919.82);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapLog10();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1611.0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
      RealVector realVector1 = arrayRealVector0.mapAsin();
      RealVector realVector2 = eigenDecompositionImpl0.getEigenvector(0);
      RealVector realVector3 = eigenDecompositionImpl0.getEigenvector(0);
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
      double[] doubleArray3 = eigenDecompositionImpl0.getImagEigenvalues();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = 1525.354426956;
      doubleArray0[2] = (-2760.85);
      doubleArray0[3] = 5063.894578437;
      doubleArray0[4] = 0.333;
      doubleArray0[5] = 1504.32192466705;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-100.046);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      DefaultRealMatrixChangingVisitor defaultRealMatrixChangingVisitor0 = new DefaultRealMatrixChangingVisitor();
      double double0 = realMatrix0.walkInRowOrder((RealMatrixChangingVisitor) defaultRealMatrixChangingVisitor0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-100.046));
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(3, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-306.86);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (double) 3;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 3.0);
      try { 
        eigenDecompositionImpl0.getEigenvector(3);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
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
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 1584.1685;
      doubleArray1[1] = 1.05;
      doubleArray1[2] = 0.0;
      doubleArray1[3] = 1.1102230246251565E-16;
      doubleArray0[0] = doubleArray1;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 1584.1685);
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x4 matrix
         //
         verifyException("org.apache.commons.math.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-547.05275814145);
      doubleArray0[1] = 1026.2;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.transpose();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x2 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 2252.4389807;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      array2DRowRealMatrix0.setRow(0, doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1.0);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 3094.5);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, Double.NaN);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1167.5156338976;
      doubleArray0[2] = 54.0;
      doubleArray0[3] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-1204.85825648));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 4907.787060973;
      doubleArray0[1] = (-441.0766286007654);
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = 1743.38;
      doubleArray0[4] = 3004.34642013;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 4907.787060973;
      doubleArray1[1] = 1743.38;
      doubleArray1[2] = 3004.34642013;
      doubleArray1[3] = 1743.38;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1743.38);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(3771);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3771
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 898.2690926221402;
      doubleArray0[1] = 1.01;
      doubleArray0[2] = 3129.113;
      doubleArray0[3] = (-4661.7840665941);
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 2800.61869857;
      doubleArray0[6] = Double.POSITIVE_INFINITY;
      doubleArray0[7] = 1.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = 2.0;
      doubleArray0[2] = (-2760.85);
      doubleArray0[3] = 5063.894578437;
      doubleArray0[5] = 1504.32192466705;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-100.046);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-100.046));
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      double double0 = array2DRowRealMatrix0.getFrobeniusNorm();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 5065.350740963);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 2.0;
      doubleArray0[2] = 2920.4602123627;
      doubleArray0[3] = 27.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = (-2451.217);
      doubleArray0[7] = 0.0;
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
}
