/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 15:52:26 GMT 2020
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
      double[] doubleArray0 = new double[1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarAdd(388.0);
      RealMatrix realMatrix1 = array2DRowRealMatrix0.subtract(realMatrix0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix1, 0.0);
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 3339.92936;
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
      double double0 = eigenDecompositionImpl0.getImagEigenvalue(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 3339.92936;
      doubleArray0[5] = (-1.0);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 35.7615984145455;
      doubleArray1[3] = 35.7615984145455;
      doubleArray1[6] = (-978.0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 3339.92936;
      doubleArray0[3] = 1.0;
      doubleArray0[4] = 35.7615984145455;
      doubleArray0[5] = (-1.0);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 35.7615984145455;
      doubleArray1[6] = (-978.0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 3400.27020747251);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.9999999999999998);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(2301, 2301);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1528.6);
      } catch(RuntimeException e) {
         //
         // a 4x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(7, 1);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.transpose();
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 3404533.9400458355);
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x7 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      doubleArray1[2] = (-2793.6408);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-16);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double(9.0);
      doubleArray0[0] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1383.37231);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 970.1009673;
      doubleArray0[3] = 970.1009673;
      doubleArray0[4] = 1325.34;
      double[] doubleArray1 = new double[7];
      doubleArray1[2] = (-2793.6408);
      doubleArray1[3] = 0.333;
      doubleArray1[4] = 4388.4637;
      doubleArray1[5] = 4388.4637;
      doubleArray1[6] = (-552.2);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-16);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = 970.1009673;
      doubleArray0[4] = 1325.34;
      doubleArray0[5] = (-2793.6408);
      double[] doubleArray1 = new double[7];
      doubleArray1[3] = 0.333;
      doubleArray1[4] = 4388.4637;
      doubleArray1[5] = 4388.4637;
      doubleArray1[6] = (-552.2);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-16);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      doubleArray1[4] = 4388.4637;
      doubleArray1[5] = 4388.4637;
      doubleArray1[6] = (-552.2);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-16);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 4388.4637;
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 4388.4637;
      doubleArray1[2] = (-2793.6408);
      doubleArray1[3] = 0.333;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-16);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 970.1009673;
      doubleArray0[4] = 1325.34;
      doubleArray0[5] = (-2793.6408);
      double[] doubleArray1 = new double[7];
      doubleArray1[2] = (-2793.6408);
      doubleArray1[3] = 0.333;
      doubleArray1[4] = 4388.4637;
      doubleArray1[5] = 4388.4637;
      doubleArray1[6] = (-552.2);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-16);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      doubleArray1[3] = 0.333;
      doubleArray1[4] = 4388.4637;
      doubleArray1[5] = 4388.4637;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-16);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1804.5685316301174;
      doubleArray0[2] = 1804.5685316301174;
      doubleArray0[5] = 262.61076;
      doubleArray0[6] = 217.71859;
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct(arrayRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-693.3834790086));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      doubleArray1[2] = (-2793.6408);
      doubleArray1[3] = 0.333;
      doubleArray1[4] = 4388.4637;
      doubleArray1[5] = 4388.4637;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-16);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = Double.NEGATIVE_INFINITY;
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct(arrayRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-693.3834790086));
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1787.3685941;
      doubleArray0[5] = 262.61076;
      doubleArray0[6] = 1787.3685941;
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct(arrayRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-693.3834790086));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      doubleArray1[5] = (-1596.72169720335);
      doubleArray1[6] = (-978.0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
      try { 
        eigenDecompositionImpl0.getEigenvector((-63));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -63
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      try { 
        eigenDecompositionImpl0.getEigenvector(208);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 208
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-16);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-16);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(230);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 230
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double(9.0);
      doubleArray0[0] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1383.37231);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(20);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 579.819396098);
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct(arrayRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-693.3834790086));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }
}