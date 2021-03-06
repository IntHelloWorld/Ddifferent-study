/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 08:37:12 GMT 2020
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
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 656.5084;
      doubleArray0[1] = (-1254.76204);
      doubleArray0[2] = 1.5;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 1.5;
      doubleArray1[1] = 656.5084;
      doubleArray1[2] = (-1254.76204);
      doubleArray1[3] = (-1254.76204);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2325.365));
      try { 
        eigenDecompositionImpl0.getEigenvector(2254);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2254
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 656.5084;
      doubleArray0[0] = (-1254.7620419865586);
      doubleArray0[2] = 1.5;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      double[] doubleArray1 = new double[4];
      doubleArray1[1] = 656.5084;
      doubleArray1[2] = (-1254.7620419865586);
      doubleArray1[3] = (-1254.7620419865586);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2325.365));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(2254, 2254);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 656.5084;
      doubleArray0[1] = (-1254.7620419865586);
      doubleArray0[2] = (-800.7229488);
      doubleArray0[0] = 35.01569845377434;
      doubleArray0[4] = 0.0;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 35.01569845377434;
      doubleArray1[1] = 656.5084;
      doubleArray1[2] = (-1254.7620419865586);
      doubleArray1[3] = (-1254.7620419865586);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2325.365));
      try { 
        eigenDecompositionImpl0.getEigenvector(2254);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2254
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 5954.925;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
      try { 
        eigenDecompositionImpl0.getEigenvector((-2264));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2264
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1096.42826646715);
      doubleArray0[1] = (-39.9813);
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 2447.163502;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-339.9573);
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 1239.42002305115;
      doubleArray0[8] = 0.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-4362));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4362
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-68.0);
      doubleArray0[1] = (-274.0095579653);
      doubleArray0[2] = 3902.70280351;
      doubleArray0[2] = 0.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector((RealVector) arrayRealVector0);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct(arrayRealVector0);
      RealVector realVector0 = arrayRealVector1.mapExpm1();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-5.28901295375834));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver2 = eigenDecompositionImpl0.getSolver();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      try { 
        eigenDecompositionImpl0.getEigenvector(1650);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1650
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 656.5084;
      doubleArray0[1] = (-1254.7620419865586);
      doubleArray0[2] = 1.5;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 656.5084;
      doubleArray1[2] = (-1254.7620419865586);
      doubleArray1[3] = (-1254.7620419865586);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2325.365));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      int int0 = 2254;
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-1900));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1900
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 5954.925;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      try { 
        eigenDecompositionImpl0.getEigenvector(1277);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1277
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 656.5084;
      doubleArray0[1] = (-1254.7620419865586);
      doubleArray0[2] = 1.5;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 656.5084;
      doubleArray1[2] = (-1254.7620419865586);
      doubleArray1[3] = (-1254.7620419865586);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2325.365));
      try { 
        eigenDecompositionImpl0.getEigenvector(2254);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2254
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-68.0);
      doubleArray0[1] = (-274.0095579653);
      doubleArray0[2] = 3902.70280351;
      doubleArray0[2] = 0.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector((RealVector) arrayRealVector0);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct(arrayRealVector0);
      RealVector realVector0 = arrayRealVector1.mapExpm1();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-5.28901295375834));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      try { 
        eigenDecompositionImpl0.getEigenvector(1650);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1650
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 0.0;
      doubleArray0[0] = doubleArray1;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 52);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      double[] doubleArray2 = blockRealMatrix0.operate(doubleArray1);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      try { 
        eigenDecompositionImpl0.getEigenvector((-350));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -350
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1096.42826646715);
      doubleArray0[1] = (-39.9813);
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 2447.163502;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-339.9573);
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 0.0;
      doubleArray0[8] = 0.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-4362));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4362
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-68.0);
      doubleArray0[1] = (-274.0095579653);
      doubleArray0[2] = 3902.70280351;
      doubleArray0[3] = 0.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector((RealVector) arrayRealVector0);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct(arrayRealVector0);
      RealVector realVector0 = arrayRealVector1.mapExpm1();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-5.28901295375834));
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(30, 30);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarMultiply((-1.0));
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 4564.1597204875);
      // Undeclared exception!
      eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 5954.925;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      try { 
        eigenDecompositionImpl0.getEigenvector((-2264));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2264
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(16, 1446);
      OpenMapRealMatrix openMapRealMatrix1 = new OpenMapRealMatrix(openMapRealMatrix0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix1, 0.0);
      } catch(RuntimeException e) {
         //
         // row index 16 out of allowed range [0, 15]
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 1326;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(1326, 1326);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (-128.18999467915685));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 2113.19923);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(9, 2, 0.5);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      RealMatrix realMatrix0 = openMapRealVector1.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.333);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      double double0 = eigenDecompositionImpl0.getImagEigenvalue(5);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      double[] doubleArray0 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(9, 2, 0.5);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      RealMatrix realMatrix0 = openMapRealVector1.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.333);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      double[] doubleArray0 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 938.54404);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = 41;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(41);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      RealMatrix realMatrix0 = openMapRealVector1.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 41);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      int int1 = (-1);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue((-1));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-1553.399956869));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-3234.274764160496);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 4.0;
      doubleArray0[3] = 287.91902;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = Double.NaN;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 1.0;
      doubleArray0[8] = (-976.540985856);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // a 9x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2600.6;
      doubleArray0[1] = 1.232595164407831E-28;
      doubleArray0[2] = 2170.58069118;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 2170.58069118);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-2372.4282436981052);
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 4.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, (double[]) null, 0.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, (-469.0554669905));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      Double double0 = new Double(4732.494302485251);
      doubleArray0[0] = double0;
      Double double1 = new Double(4732.494302485251);
      doubleArray0[1] = double1;
      Double double2 = new Double((double) doubleArray0[1]);
      doubleArray0[2] = double2;
      Double double3 = new Double((double) doubleArray0[2]);
      boolean boolean0 = Double.isFinite((double) doubleArray0[2]);
      doubleArray0[3] = double3;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double4 = Double.sum(4732.494302485251, (double) doubleArray0[1]);
      double double5 = Double.max(0.0, (-2557.718356535));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector1.outerproduct(openMapRealVector0);
      boolean boolean1 = Double.isFinite(1.0E-12);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.mapUlp();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (-1199.0));
      try { 
        eigenDecompositionImpl0.getEigenvector((-1129));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1129
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = 1071;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1071, 0, 1071);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((-1548), (-1548));
      try { 
        openMapRealVector0.outerproduct(openMapRealVector1);
      } catch(IllegalArgumentException e) {
         //
         // vector length mismatch: got 1,071 but expected -1,548
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 1.0E-12;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = (-1067.3609577);
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-522.4263566349501);
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-1368.45684124626));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 357.8769511);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 656.5084;
      doubleArray0[1] = (-1254.7620419865586);
      doubleArray0[2] = (-1254.7620419865586);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 656.5084;
      doubleArray1[2] = (-1254.7620419865586);
      doubleArray1[3] = (-1254.7620419865586);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2325.365));
      try { 
        eigenDecompositionImpl0.getEigenvector(2254);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2254
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }
}
