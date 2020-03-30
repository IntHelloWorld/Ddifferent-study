/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 15:08:43 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.BlockRealMatrix;
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
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 2807.7;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = 1.0E-12;
      doubleArray1[5] = 2807.7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1977.7745519582;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 2807.7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(2073);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2073
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-1393.3463428152884));
      int int0 = 1173;
      try { 
        eigenDecompositionImpl0.getEigenvector(1173);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1173
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = (-1.1503940810569009);
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = (-1.1503940810569009);
      doubleArray1[5] = 2807.7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver2 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver3 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = 1977.7745519582;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3876.374679164179));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getVT();
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = 1962.5682669243042;
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[0] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray0[2] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[6] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix3 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      try { 
        eigenDecompositionImpl0.getRealEigenvalue((-3004));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3004
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-190.43406);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-190.43406);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getD();
      try { 
        eigenDecompositionImpl0.getEigenvector((-680));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -680
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray0[2] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 640;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(640, 640);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 640);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-1307.49492);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 844.3;
      doubleArray1[3] = 0.0;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, false);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-1307.49492));
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x4 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 901.664239171513);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(2114, 52);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 52);
      } catch(RuntimeException e) {
         //
         // a 2,114x52 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1393.28065645133;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-1393.3463428152884));
      int int0 = 1173;
      try { 
        eigenDecompositionImpl0.getEigenvector(1173);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1173
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 117.0;
      doubleArray0[1] = 1.05;
      doubleArray0[2] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 117.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-1861.0966408187703));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, (-445.59379323057897));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-2024.150912);
      doubleArray0[3] = 1.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[12];
      doubleArray0[0] = 1468.6871961;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1468.6871961);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 2749.4822274974;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 2749.4822274974);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 2772.4551403);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-5762.46507513);
      doubleArray0[3] = 1100.2612613;
      doubleArray0[4] = (-1016.5061485590479);
      doubleArray0[5] = 1703.219;
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
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 3.0;
      doubleArray0[1] = 4819.0;
      doubleArray0[2] = 2821.9;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1.0;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 2.0;
      doubleArray0[7] = (-253.832703);
      doubleArray0[8] = 1704.56759758;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarAdd((-371.3));
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 4819.0);
      } catch(RuntimeException e) {
         //
         // a 9x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = (-234.7781299642671);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (-234.7781299642671));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-437.5286701216308);
      doubleArray0[1] = (-437.5286701216308);
      doubleArray0[3] = 3175.6281903;
      doubleArray0[4] = (-437.5286701216308);
      doubleArray0[5] = 1.1102230246251565E-16;
      doubleArray0[6] = (-1924.19);
      doubleArray0[7] = 384.34208396443;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-4222.2596));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[][] doubleArray0 = new double[0][5];
      Array2DRowRealMatrix array2DRowRealMatrix0 = null;
      try {
        array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one row
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 824.8064747366;
      doubleArray0[1] = (-1695.943489);
      doubleArray0[2] = 2351.7;
      doubleArray0[3] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, (double[]) null, (-3305.05));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-611.7851647486);
      doubleArray0[1] = 2807.7;
      doubleArray0[2] = 1962.5682669243042;
      doubleArray0[3] = 1977.7745519582;
      doubleArray0[4] = 1.0E-12;
      doubleArray0[5] = 1249.0;
      doubleArray0[6] = (-1693.0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1693.0);
      doubleArray1[1] = (-611.7851647486);
      doubleArray1[2] = 2807.7;
      doubleArray1[3] = 2807.7;
      doubleArray1[4] = (-1693.0);
      doubleArray1[5] = 1962.5682669243042;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3875.064));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getD();
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      double[] doubleArray1 = new double[6];
      double double0 = 0.0;
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 1.01;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray1);
      int int0 = 2;
      RealMatrix realMatrix0 = array2DRowRealMatrix0.getRowMatrix(2);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray1, 1.01);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }
}