/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 16:18:05 GMT 2020
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
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 844.3);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1.1102230246251565E-14);
      } catch(RuntimeException e) {
         //
         // a 6x1 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.transpose();
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
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (-3184.966528);
      doubleArray0[4] = (-3184.966528);
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = (-3184.966528);
      doubleArray1[2] = 9.0;
      doubleArray1[3] = (-580.2336054553202);
      doubleArray1[4] = 9.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3471.38));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (-3184.966528);
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = (-3184.966528);
      doubleArray1[2] = 9.0;
      doubleArray1[3] = (-580.2336054553202);
      doubleArray1[4] = 9.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3471.38));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = (-3184.966528);
      doubleArray1[2] = 9.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3471.38));
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[4] = (-3184.966528);
      doubleArray0[5] = 9.0;
      double[] doubleArray1 = new double[5];
      doubleArray1[2] = 9.0;
      doubleArray1[3] = (-580.2336054553202);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3471.38));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(390.8777000458901);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = double0;
      doubleArray0[4] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1589.3809925);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(15, 15);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 2805.01707028213);
      double double0 = eigenDecompositionImpl0.getDeterminant();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[3];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 27.0);
      try { 
        eigenDecompositionImpl0.getEigenvector(14);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(16, 16);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 1.05);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getEigenvector(16);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(390.8777000458901);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[1];
      doubleArray0[4] = doubleArray0[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1589.3809925);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(390.8777000458901);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = double0;
      doubleArray0[3] = doubleArray0[1];
      doubleArray0[4] = doubleArray0[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1589.3809925);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(390.8777000458901);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = double0;
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1589.3809925);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      Double double0 = new Double(2079.0673726224795);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-1802.947056242223));
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 2839.67221;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2079.0673726224795);
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(390.8777000458901);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1589.3809925);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(390.8777000458901);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 1589.3809925);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(Integer.MAX_VALUE);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2147483647
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(32, 32);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 32);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(32);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }
}
