/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 06:42:44 GMT 2020
 */

package org.apache.commons.math3.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.inference.MannWhitneyUTest;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MannWhitneyUTest_ESTest extends MannWhitneyUTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
      TiesStrategy tiesStrategy0 = TiesStrategy.MAXIMUM;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[17];
      double double0 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TiesStrategy tiesStrategy0 = TiesStrategy.MAXIMUM;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest((NaNStrategy) null, tiesStrategy0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      try { 
        mannWhitneyUTest0.mannWhitneyU(doubleArray1, doubleArray0);
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest();
      double[] doubleArray0 = new double[1];
      double double0 = mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.FIXED;
      TiesStrategy tiesStrategy0 = TiesStrategy.AVERAGE;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      try { 
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray1);
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.MAXIMAL;
      TiesStrategy tiesStrategy0 = TiesStrategy.MAXIMUM;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[8];
      try { 
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, (double[]) null);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest();
      try { 
        mannWhitneyUTest0.mannWhitneyUTest((double[]) null, (double[]) null);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.FIXED;
      TiesStrategy tiesStrategy0 = TiesStrategy.AVERAGE;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[1];
      double double0 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest((NaNStrategy) null, (TiesStrategy) null);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
