/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 01:38:47 GMT 2020
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.time.StopWatch;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StopWatch_ESTest extends StopWatch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      String string0 = stopWatch0.toString();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      System.setCurrentTimeMillis(0L);
      stopWatch0.suspend();
      stopWatch0.resume();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.suspend();
      // Undeclared exception!
      try { 
        stopWatch0.start();
      } catch(IllegalStateException e) {
         //
         // Stopwatch already started. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.split();
      long long0 = stopWatch0.getSplitTime();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.getSplitTime();
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be split to get the split time. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      long long0 = stopWatch0.getTime();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.suspend();
      long long0 = stopWatch0.getTime();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.split();
      String string0 = stopWatch0.toSplitString();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      long long0 = stopWatch0.getTime();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.resume();
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be suspended to resume. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.suspend();
      stopWatch0.resume();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.suspend();
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be running to suspend. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.unsplit();
      } catch(IllegalStateException e) {
         //
         // Stopwatch has not been split. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.suspend();
      // Undeclared exception!
      try { 
        stopWatch0.split();
      } catch(IllegalStateException e) {
         //
         // Stopwatch is not running. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.split();
      stopWatch0.unsplit();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.stop();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.stop();
      } catch(IllegalStateException e) {
         //
         // Stopwatch is not running. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.toSplitString();
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be split to get the split time. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.reset();
  }
}
