/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 23:58:21 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixPreservingVisitor;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1461.332191729935);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.563;
      doubleArray0[3] = (-451.7109588417295);
      doubleArray0[4] = (-2650.606630459522);
      doubleArray0[5] = (-2760.625331553);
      doubleArray0[6] = (-862.9786921);
      doubleArray0[7] = 2187.458110158666;
      doubleArray0[8] = 0.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-862.9786921);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-862.9786921);
      doubleArray1[3] = 0.563;
      doubleArray1[4] = (-2760.625331553);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = 1734.7477;
      doubleArray1[7] = (-2650.606630459522);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2760.625331553));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1461.332191729935);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.563;
      doubleArray0[3] = (-1461.332191729935);
      doubleArray0[4] = (-2681.095777);
      doubleArray0[5] = (-2760.625331553);
      doubleArray0[6] = (-862.9786921);
      doubleArray0[7] = 2187.458110158666;
      doubleArray0[8] = 0.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-862.9786921);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-862.9786921);
      doubleArray1[3] = (-2681.095777);
      doubleArray1[4] = (-2760.625331553);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = 1734.7477;
      doubleArray1[7] = (-2681.095777);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2760.625331553));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1461.332191729935);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.563;
      doubleArray0[3] = (-420.314204478);
      doubleArray0[4] = (-2681.095777);
      doubleArray0[5] = (-2760.625331553);
      doubleArray0[6] = (-862.9786921);
      doubleArray0[7] = 2187.458110158666;
      doubleArray0[8] = 0.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-862.9786921);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-862.9786921);
      doubleArray1[3] = (-2681.095777);
      doubleArray1[4] = (-2760.625331553);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = 1734.7477;
      doubleArray1[7] = (-2681.095777);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2760.625331553));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      double double1 = eigenDecompositionImpl0.getDeterminant();
      double[] doubleArray3 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(41, 41);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 1135.36251773327);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      double[] doubleArray0 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1461.332191729935);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.563;
      doubleArray0[3] = (-420.314204478);
      doubleArray0[4] = (-420.314204478);
      doubleArray0[6] = (-862.9786921);
      doubleArray0[7] = 2187.458110158666;
      doubleArray0[8] = 0.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-862.9786921);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-862.9786921);
      doubleArray1[3] = (-2681.095777);
      doubleArray1[4] = (-2760.625331553);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = 0.563;
      doubleArray1[7] = (-2681.095777);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 41;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(41, 41);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 845.50822127905);
      double[] doubleArray0 = eigenDecompositionImpl0.getRealEigenvalues();
      int int1 = (-378);
      // Undeclared exception!
      eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1461.332191729935);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.563;
      doubleArray0[3] = (-420.314204478);
      doubleArray0[4] = (-2681.095777);
      doubleArray0[5] = (-2760.625331553);
      doubleArray0[6] = (-862.9786921);
      doubleArray0[7] = 2187.458110158666;
      doubleArray0[8] = 0.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-862.9786921);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-862.9786921);
      doubleArray1[3] = (-2681.095777);
      doubleArray1[4] = (-2760.625331553);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (-106.407);
      doubleArray1[7] = (-2681.095777);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2760.625331553));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1461.332191729935);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.563;
      doubleArray0[3] = (-420.314204478);
      doubleArray0[4] = (-2681.095777);
      doubleArray0[6] = (-862.9786921);
      doubleArray0[7] = 2187.458110158666;
      doubleArray0[8] = 0.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-862.9786921);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-862.9786921);
      doubleArray1[3] = (-2681.095777);
      doubleArray1[4] = (-2760.625331553);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = 1734.7477;
      doubleArray1[7] = (-2681.095777);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1461.332191729935);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.563;
      doubleArray0[3] = (-420.314204478);
      doubleArray0[4] = (-2681.095777);
      doubleArray0[5] = (-2760.625331553);
      doubleArray0[6] = (-862.9786921);
      doubleArray0[7] = 2187.458110158666;
      doubleArray0[8] = 0.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-862.9786921);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-862.9786921);
      doubleArray1[3] = (-2681.095777);
      doubleArray1[4] = (-2760.625331553);
      doubleArray1[6] = 1734.7477;
      doubleArray1[7] = (-2681.095777);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2760.625331553));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      try { 
        eigenDecompositionImpl0.getEigenvector(3166);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3166
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      int int0 = 0;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-945.076);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 0.0;
      doubleArray1[3] = (-945.076);
      doubleArray1[4] = (-945.076);
      doubleArray1[5] = (double) 0;
      doubleArray1[6] = 0.0;
      doubleArray1[7] = Double.POSITIVE_INFINITY;
      doubleArray1[8] = (-2781.72);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray1, true);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct(arrayRealVector0);
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
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1461.332191729935);
      doubleArray0[1] = 11.497739068185924;
      doubleArray0[2] = 0.563;
      doubleArray0[3] = (-420.314204478);
      doubleArray0[4] = (-2681.095777);
      doubleArray0[5] = (-2760.625331553);
      doubleArray0[6] = (-862.9786921);
      doubleArray0[7] = 2187.458110158666;
      doubleArray0[8] = 0.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-862.9786921);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-862.9786921);
      doubleArray1[3] = (-2681.095777);
      doubleArray1[4] = (-2760.625331553);
      doubleArray1[5] = 11.497739068185924;
      doubleArray1[6] = 1734.7477;
      doubleArray1[7] = (-2681.095777);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2760.625331553));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(993);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 993
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1306.760321912;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.copy();
      DefaultRealMatrixPreservingVisitor defaultRealMatrixPreservingVisitor0 = new DefaultRealMatrixPreservingVisitor();
      double double0 = array2DRowRealMatrix0.walkInOptimizedOrder((RealMatrixPreservingVisitor) defaultRealMatrixPreservingVisitor0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2224.386840591);
      int int0 = 2288;
      try { 
        eigenDecompositionImpl0.getEigenvector(2288);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2288
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1189.5075546219073);
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      double double0 = new Double((-1189.5075546219073));
      try { 
        eigenDecompositionImpl0.getEigenvector((-1257));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1257
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 686;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(686, 686);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 686);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.5;
      doubleArray0[1] = 1.0;
      doubleArray0[2] = 2.2250738585072014E-308;
      doubleArray0[3] = 915.85;
      doubleArray0[4] = Double.POSITIVE_INFINITY;
      doubleArray0[5] = (-3384.0);
      doubleArray0[6] = 1612.6;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1.0;
      doubleArray1[1] = 1.0;
      doubleArray1[2] = 1.0;
      doubleArray1[3] = 0.5;
      doubleArray1[4] = 1.0;
      doubleArray1[5] = 0.5;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3384.0));
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.5;
      doubleArray0[1] = 1.0;
      doubleArray0[2] = 2.2250738585072014E-308;
      doubleArray0[3] = 2.2250738585072014E-308;
      doubleArray0[4] = Double.POSITIVE_INFINITY;
      doubleArray0[5] = (-3384.0);
      doubleArray0[6] = 1612.6;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1.0;
      doubleArray1[1] = 1.0;
      doubleArray1[2] = 1.0;
      doubleArray1[3] = 0.5;
      doubleArray1[4] = 1.0;
      doubleArray1[5] = 0.5;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3384.0));
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-3052.610710876497);
      doubleArray0[3] = 3072.769324127;
      doubleArray0[4] = (-653.320177945664);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, true);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = Double.NaN;
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = Double.NaN;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.NaN);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[1][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = Double.NEGATIVE_INFINITY;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-1882.1666);
      doubleArray1[3] = (-3661.98222805447);
      doubleArray1[4] = (-371.89254889328);
      doubleArray1[5] = (-1955.621125);
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, true);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarMultiply((-371.89254889328));
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-2051.0));
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x6 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = 414.462261865132;
      doubleArray0[4] = 984.0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      double[][] doubleArray1 = new double[1][7];
      doubleArray1[0] = doubleArray0;
      Array2DRowRealMatrix array2DRowRealMatrix1 = new Array2DRowRealMatrix(doubleArray1);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.multiply((RealMatrix) array2DRowRealMatrix1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 984.0);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(2278);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2278
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1461.332191729935);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.563;
      doubleArray0[3] = (-420.314204478);
      doubleArray0[4] = (-2681.095777);
      doubleArray0[5] = (-2760.625331553);
      doubleArray0[6] = (-862.9786921);
      doubleArray0[7] = 2187.458110158666;
      doubleArray0[8] = 0.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-862.9786921);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-862.9786921);
      doubleArray1[3] = (-2681.095777);
      doubleArray1[4] = (-2760.625331553);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = 1734.7477;
      doubleArray1[7] = (-2681.095777);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2760.625331553));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1096.7;
      doubleArray0[1] = (-1997.1687437149628);
      doubleArray0[2] = 0.5;
      doubleArray0[3] = 0.563;
      double double0 = 1.0;
      doubleArray0[4] = 1.0;
      doubleArray0[5] = 0.08325;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarAdd(0.563);
      RealMatrix realMatrix1 = array2DRowRealMatrix0.add(realMatrix0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 4222.6305453744);
      } catch(RuntimeException e) {
         //
         // a 6x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      double double0 = Double.NEGATIVE_INFINITY;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, Double.NEGATIVE_INFINITY);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, (-550.8385984688754));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, (-1561.1810499691294));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1521.99739952625;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 100.0;
      doubleArray0[3] = (-701.126976561);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 100.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(9);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 1.0E-12;
      doubleArray0[1] = 1.0E-12;
      doubleArray0[2] = (double) 9;
      doubleArray0[3] = (double) 9;
      doubleArray0[4] = (double) 9;
      doubleArray0[5] = 1.0E-12;
      doubleArray0[6] = (double) 9;
      doubleArray0[7] = (double) 9;
      doubleArray0[8] = 1.0E-12;
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 3175.650793);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(9);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1189.5075546219073);
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      int int0 = (-1257);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue((-1257));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1257
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1996.92522088381);
      doubleArray0[1] = 1.0;
      doubleArray0[2] = 378.9124451377784;
      doubleArray0[3] = (-268.02463585);
      doubleArray0[4] = 400.0881509389874;
      doubleArray0[5] = 2699.253177;
      doubleArray0[6] = 1527.68517;
      doubleArray0[7] = Double.NEGATIVE_INFINITY;
      doubleArray0[8] = 250.79396701439055;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1.0;
      doubleArray0[6] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = new OpenMapRealVector(openMapRealVector1);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1.0E-12);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1461.332191729935);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.563;
      doubleArray0[3] = (-420.314204478);
      doubleArray0[4] = (-2681.095777);
      doubleArray0[5] = (-2760.625331553);
      doubleArray0[6] = (-862.9786921);
      doubleArray0[7] = 2187.458110158666;
      doubleArray0[8] = 0.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-862.9786921);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-862.9786921);
      doubleArray1[3] = (-2681.095777);
      doubleArray1[4] = (-2760.625331553);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = 1734.7477;
      doubleArray1[7] = (-2681.095777);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2760.625331553));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      double double0 = eigenDecompositionImpl0.getDeterminant();
      double double1 = eigenDecompositionImpl0.getDeterminant();
      double[] doubleArray3 = eigenDecompositionImpl0.getImagEigenvalues();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 350.954358;
      doubleArray0[3] = (-3011.7);
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 350.954358;
      doubleArray1[1] = 350.954358;
      doubleArray1[2] = 907.519558002408;
      doubleArray1[3] = 350.954358;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 350.954358);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      double[][] doubleArray0 = new double[2][0];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) (-820);
      doubleArray1[1] = (double) 1833;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[6];
      doubleArray2[0] = (double) (-820);
      doubleArray2[1] = (double) (-820);
      doubleArray2[2] = (double) 1833;
      doubleArray2[3] = (double) (-820);
      doubleArray2[4] = (double) (-820);
      doubleArray2[5] = (double) (-820);
      doubleArray0[1] = doubleArray2;
      BlockRealMatrix blockRealMatrix0 = null;
      try {
        blockRealMatrix0 = new BlockRealMatrix((-820), 1833, doubleArray0, false);
      } catch(IllegalArgumentException e) {
         //
         // invalid row dimension -820 (must be positive)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = 41;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(41, 41);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 845.50822127905);
      // Undeclared exception!
      eigenDecompositionImpl0.getV();
  }
}
