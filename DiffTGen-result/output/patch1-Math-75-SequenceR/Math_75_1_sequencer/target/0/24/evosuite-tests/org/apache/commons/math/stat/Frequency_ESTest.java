/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 06:17:00 GMT 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Frequency_ESTest extends Frequency_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      int int0 = frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      frequency0.addValue(1271);
      double double0 = frequency0.getCumPct(3L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      frequency0.addValue(1271);
      double double0 = frequency0.getPct('P');
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1);
      frequency0.addValue(1);
      double double0 = frequency0.getPct((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getPct(508L);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getPct(0L);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1294L);
      double double0 = frequency0.getPct((-1395));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct(0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1294L);
      double double0 = frequency0.getPct('j');
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Long long0 = new Long((-2560L));
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct((Object) long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-58), (-908), 9, (-908), 1).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-309));
      long long0 = frequency0.getCumFreq((Comparable<?>) null);
      double double0 = frequency0.getCumPct((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n-309\t0\t0%\t100%\n");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getCumPct((-442L));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('k');
      double double0 = frequency0.getCumPct((-1));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct(265);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('K');
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(614L);
      double double0 = frequency0.getCumPct('Q');
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      long long0 = frequency0.getCumFreq((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-495L));
      long long0 = frequency0.getCumFreq((-495L));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      long long0 = frequency0.getCumFreq(1393);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((Object) "F");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      Integer integer0 = new Integer(4179);
      long long0 = frequency0.getCount((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(614L);
      long long0 = frequency0.getCount((-1L));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      long long0 = frequency0.getCount(1271);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      long long0 = frequency0.getCount('Y');
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) frequency0);
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(']');
      // Undeclared exception!
      try { 
        frequency0.getPct((Comparable<?>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-117));
      // Undeclared exception!
      try { 
        frequency0.getCumPct((Object) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.getCumPct(object0);
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Object) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Object) frequency0);
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(':');
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Comparable<?>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.getCount((Comparable<?>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Integer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-495L));
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n-495\t1\t100%\t100%\n");
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      // Undeclared exception!
      try { 
        frequency0.addValue(2498L);
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('b');
      // Undeclared exception!
      try { 
        frequency0.addValue(1);
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1294L);
      // Undeclared exception!
      try { 
        frequency0.addValue('j');
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-58), (-908), 9, (-908), 1).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-309));
      double double0 = frequency0.getCumPct((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n-309\t0\t0%\t100%\n");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      double double0 = frequency0.getCumPct((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) 0L);
      Long long0 = new Long((-1524L));
      long long1 = frequency0.getCumFreq((Comparable<?>) long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyString() , anyString());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \nMock for Comparable, hashCode: 1944422619\t2\t100%\t100%\n");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1);
      frequency0.addValue(1);
      long long0 = frequency0.getCumFreq((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      double double0 = frequency0.getPct((Comparable<?>) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1620);
      double double0 = frequency0.getPct((Comparable<?>) 1L);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      Long long0 = new Long((-2240L));
      long long1 = frequency0.getCount((Comparable<?>) long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      long long0 = frequency0.getCount(comparable0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1L));
      long long0 = frequency0.getSumFreq();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getSumFreq();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1971).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-309));
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      boolean boolean0 = frequency0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      boolean boolean0 = frequency0.equals(frequency0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      boolean boolean0 = frequency0.equals("Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-58), (-908), 9, (-908), 1).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-309));
      long long0 = frequency0.getCumFreq((Comparable<?>) null);
      long long1 = frequency0.getCumFreq(')');
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      String string0 = frequency0.toString();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      long long0 = frequency0.getCount((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) iterator0);
      } catch(IllegalArgumentException e) {
         //
         // class (java.util.TreeMap$KeyIterator) does not implement Comparable
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((long) 0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(854);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.getCount(object0);
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1971, (-1730), 1971, (-1730), (-555)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-309));
      long long0 = frequency0.getCumFreq((Comparable<?>) null);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(')');
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount('N');
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(1490);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1294L);
      long long0 = frequency0.getCumFreq(1019L);
  }
}
