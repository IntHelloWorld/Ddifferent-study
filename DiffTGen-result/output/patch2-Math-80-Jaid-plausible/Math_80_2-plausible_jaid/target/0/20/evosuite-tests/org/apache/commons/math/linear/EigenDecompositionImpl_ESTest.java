/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 00:01:17 GMT 2020
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
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = (-2766.817997609129);
      doubleArray0[2] = (-9.80423);
      doubleArray0[3] = 1.7075763025786728E-10;
      doubleArray0[4] = (-477.49433286);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 1685.995204492;
      doubleArray0[7] = (-599419.1040618964);
      doubleArray0[8] = (-236.85729222123);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-236.85729222123);
      doubleArray1[3] = (-477.49433286);
      doubleArray1[4] = (-2766.817997609129);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (-9.80423);
      doubleArray1[7] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 2361.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 2361.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[6] = (-3068.971001289508);
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 2361.0;
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[4] = 1152.132;
      doubleArray1[5] = 1476.4145;
      doubleArray1[6] = (-144.939387006);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      try { 
        eigenDecompositionImpl0.getEigenvector(3432);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3432
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1323.1578234);
      doubleArray0[1] = 2361.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[6] = (-3068.971001289508);
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2692.268696338669;
      doubleArray1[1] = 2361.0;
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[0] = 1152.132;
      doubleArray1[5] = 1476.4145;
      doubleArray1[6] = (-3068.971001289508);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = (-2766.817997609129);
      doubleArray0[2] = (-9.80423);
      doubleArray0[3] = 1.7075763025786728E-10;
      doubleArray0[4] = (-9.80423);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 1685.995204492;
      doubleArray0[7] = (-599419.1040618964);
      doubleArray0[8] = (-236.85729222123);
      double[] doubleArray1 = new double[8];
      doubleArray0[1] = 2.0;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-236.85729222123);
      doubleArray1[3] = (-2766.817997609129);
      doubleArray1[4] = (-2766.817997609129);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (-9.80423);
      doubleArray1[7] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-9.80423));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = (-2766.817997609129);
      doubleArray0[2] = (-9.80423);
      doubleArray0[3] = 1.7075763025786728E-10;
      doubleArray0[4] = (-477.49433286);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 1685.995204492;
      doubleArray0[7] = (-599419.1040618964);
      doubleArray0[8] = (-236.85729222123);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-236.85729222123);
      doubleArray1[3] = (-477.49433286);
      doubleArray1[4] = (-2766.817997609129);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (-9.80423);
      doubleArray1[7] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(3);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(32);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = Double.POSITIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, Double.POSITIVE_INFINITY);
      try { 
        eigenDecompositionImpl0.getEigenvector(2);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = Double.POSITIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarMultiply(Double.POSITIVE_INFINITY);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.POSITIVE_INFINITY);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getD();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = (-2766.817997609129);
      doubleArray0[2] = (-9.80423);
      doubleArray0[3] = (-2766.817997609129);
      doubleArray0[4] = (-477.49433286);
      doubleArray0[6] = 1685.995204492;
      doubleArray0[7] = (-599419.1040618964);
      doubleArray0[8] = (-236.85729222123);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-236.85729222123);
      doubleArray1[3] = (-477.49433286);
      doubleArray1[4] = (-2766.817997609129);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (-9.80423);
      doubleArray1[7] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 3.979039320256561E-12;
      doubleArray0[1] = (-591.0421);
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-591.0421);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 697.0);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = (-2766.817997609129);
      doubleArray0[2] = (-9.80423);
      doubleArray0[3] = 1.7075763025786728E-10;
      doubleArray0[4] = (-477.49433286);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (-599419.1040618964);
      doubleArray0[8] = (-236.85729222123);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-236.85729222123);
      doubleArray1[3] = (-477.49433286);
      doubleArray1[4] = 1.7075763025786728E-10;
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (-9.80423);
      doubleArray1[7] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1323.1578234);
      doubleArray0[1] = 2361.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[1] = (-3068.971001289508);
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2692.268696338669;
      doubleArray1[1] = 2361.0;
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[4] = 1152.132;
      doubleArray1[5] = 1476.4145;
      doubleArray1[6] = (-144.939387006);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = (-2766.817997609129);
      doubleArray0[2] = (-9.80423);
      doubleArray0[3] = 1.7075763025786728E-10;
      doubleArray0[4] = (-477.49433286);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 1685.995204492;
      doubleArray0[7] = (-599419.1040618964);
      doubleArray0[8] = (-236.85729222123);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-236.85729222123);
      doubleArray1[3] = (-477.49433286);
      doubleArray1[4] = (-2766.817997609129);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (-9.80423);
      doubleArray1[7] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1323.1578234);
      doubleArray0[1] = 2361.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[6] = (-3068.971001289508);
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2692.268696338669;
      doubleArray1[1] = 2361.0;
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[4] = 1152.132;
      doubleArray1[5] = 1476.4145;
      doubleArray1[6] = (-144.939387006);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(1272);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1272
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1323.1578234);
      doubleArray0[1] = 2361.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[6] = (-3068.971001289508);
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2692.268696338669;
      doubleArray1[1] = 2361.0;
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[4] = 1152.132;
      doubleArray1[5] = 1476.4145;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1323.1578234);
      doubleArray0[1] = 2361.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[6] = (-3068.971001289508);
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2692.268696338669;
      doubleArray1[1] = 2361.0;
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[4] = 1152.132;
      doubleArray1[5] = 1476.4145;
      doubleArray1[6] = (-144.939387006);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1323.1578234);
      doubleArray0[1] = 2361.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[6] = (-3068.971001289508);
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 2361.0;
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[4] = 1152.132;
      doubleArray1[5] = 1495.3057836874323;
      doubleArray1[6] = (-144.939387006);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      try { 
        eigenDecompositionImpl0.getEigenvector(723617304);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 723617304
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1323.1578234);
      doubleArray0[1] = 2361.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[6] = (-3068.971001289508);
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2692.268696338669;
      doubleArray1[1] = 2361.0;
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[4] = 1152.132;
      doubleArray1[5] = 1476.4145;
      doubleArray1[6] = (-144.939387006);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1323.1578234);
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[6] = (-3068.971001289508);
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2692.268696338669;
      doubleArray1[1] = 2361.0;
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[4] = 1152.132;
      doubleArray1[5] = 1476.4145;
      doubleArray1[6] = (-144.939387006);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      try { 
        eigenDecompositionImpl0.getEigenvector((-836));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -836
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1357.1571840889453);
      doubleArray0[1] = 2361.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[6] = (-3068.971001289508);
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2692.268696338669;
      doubleArray1[1] = 2361.0;
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[4] = 1152.132;
      doubleArray1[5] = 1476.4145;
      doubleArray1[6] = (-144.939387006);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1323.1578234);
      doubleArray0[1] = 2361.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[6] = (-3068.971001289508);
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2692.268696338669;
      doubleArray1[1] = 2361.0;
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[4] = 1152.132;
      doubleArray1[5] = 2692.268696338669;
      doubleArray1[6] = (-144.939387006);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1323.1578234);
      doubleArray0[1] = (-1323.1578234);
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[6] = (-3068.971001289508);
      doubleArray0[7] = 11.522123686404353;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2692.268696338669;
      doubleArray1[1] = (-1323.1578234);
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[4] = 1152.132;
      doubleArray1[5] = 1476.4145;
      doubleArray1[6] = (-144.939387006);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      try { 
        eigenDecompositionImpl0.getEigenvector((-2172));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2172
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = Double.POSITIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarMultiply((-659.43948));
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.POSITIVE_INFINITY);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      double[] doubleArray3 = eigenDecompositionImpl0.getRealEigenvalues();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = Double.POSITIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)array2DRowRealMatrix0.scalarMultiply((-659.43948));
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix1, Double.POSITIVE_INFINITY);
      Array2DRowRealMatrix array2DRowRealMatrix2 = array2DRowRealMatrix1.add(array2DRowRealMatrix0);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      try { 
        eigenDecompositionImpl0.getEigenvector((-4));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.copy();
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(2147480026);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2147480026
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(2, 2);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarAdd(293.95737);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.NaN);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(2);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-7088.851573733356));
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1519.7727913;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = Double.NEGATIVE_INFINITY;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-2521.0);
      doubleArray0[5] = (-592.32797914341);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 2461.429;
      doubleArray1[1] = (-2521.0);
      doubleArray1[2] = 0.0;
      doubleArray1[3] = (-592.32797914341);
      doubleArray1[4] = (-592.32797914341);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-786.392));
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 100.0;
      doubleArray0[2] = Double.POSITIVE_INFINITY;
      doubleArray0[3] = 147.3939;
      doubleArray0[4] = 1.0;
      doubleArray0[5] = 2737.273433;
      doubleArray0[6] = 0.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) arrayRealVector0);
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
  public void test28()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-497.0146696);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 5952.0;
      doubleArray1[3] = 1.0E-12;
      doubleArray1[4] = 1.0E-12;
      doubleArray1[5] = 0.0;
      doubleArray1[6] = 0.0;
      doubleArray1[7] = 0.0;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarAdd(4240.33159823);
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
  public void test29()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(534, 41);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 2067.3);
      } catch(RuntimeException e) {
         //
         // a 534x41 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 3227.3637;
      doubleArray0[1] = (-787.79);
      doubleArray0[2] = 1.01;
      doubleArray0[3] = (-1045.85432);
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-1147.6);
      doubleArray0[6] = (-5662.65331247);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarAdd((-5662.65331247));
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      } catch(RuntimeException e) {
         //
         // a 7x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 3302.03603);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 349.539486984617);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 5466.20460488;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = (-1.0);
      doubleArray0[4] = (-3208.952354565);
      doubleArray0[5] = 152.95702134982;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 4.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 2.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.05;
      doubleArray0[1] = 2466.45652367;
      doubleArray0[2] = 7.196376827778295E-11;
      doubleArray0[3] = 648.79616141;
      doubleArray0[4] = 2804.0;
      doubleArray0[5] = 2469.909391556068;
      doubleArray0[6] = (-3462.55534411);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 3.069544618483633E-11);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-1324));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1324
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-2713.93992));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      int int0 = (-266);
      Array2DRowRealMatrix array2DRowRealMatrix0 = null;
      try {
        array2DRowRealMatrix0 = new Array2DRowRealMatrix((-266), (-266));
      } catch(IllegalArgumentException e) {
         //
         // invalid row dimension -266 (must be positive)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1323.1578234);
      doubleArray0[1] = 2361.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1152.132;
      doubleArray0[5] = 2692.268696338669;
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2692.268696338669;
      doubleArray1[1] = 2361.0;
      doubleArray1[2] = (-3068.971001289508);
      doubleArray1[3] = 2692.268696338669;
      doubleArray1[3] = 1152.132;
      doubleArray1[5] = 1476.4145;
      doubleArray1[6] = (-144.939387006);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1104.79704));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 2364.0;
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
  public void test40()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = 0.0;
      doubleArray2[1] = Double.POSITIVE_INFINITY;
      doubleArray2[2] = 1.232595164407831E-28;
      doubleArray2[3] = (-329.4060840726);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[1];
      doubleArray3[0] = 1.232595164407831E-28;
      doubleArray0[2] = doubleArray3;
      Array2DRowRealMatrix array2DRowRealMatrix0 = null;
      try {
        array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, true);
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}
