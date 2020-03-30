/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 06:10:17 GMT 2020
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
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Integer integer0 = new Integer(2552);
      frequency0.addValue(integer0);
      int int0 = frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getPct((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(249);
      frequency0.addValue(integer0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(9).when(comparable0).compareTo(any());
      double double0 = frequency0.getPct(comparable0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Integer integer0 = new Integer(2552);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((long) 0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(3792);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct((-1L));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 31).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1);
      frequency0.addValue(integer0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((-183));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getPct((-1000));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue((-2194));
      double double0 = frequency0.getPct('?');
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getPct('x');
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2728L);
      double double0 = frequency0.getCumPct((Object) "SOzQw<c.!Q");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getCumPct((Object) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1845L);
      double double0 = frequency0.getCumPct((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n1845\t1\t100%\t100%\n");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(4005, 10, 5354, 5354, (-2783)).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-3850L));
      String string0 = frequency0.toString();
      double double0 = frequency0.getCumPct(0L);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue((-2194));
      double double0 = frequency0.getCumPct((long) (-2194));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1019));
      double double0 = frequency0.getCumPct((-2146));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getCumPct(0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(249);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('F');
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2525);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('=');
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1));
      long long0 = frequency0.getCumFreq('T');
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-3900));
      long long0 = frequency0.getCount((Object) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1));
      long long0 = frequency0.getCount(2L);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      long long0 = frequency0.getCount((-2644));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(3792);
      frequency0.addValue((Object) integer0);
      long long0 = frequency0.getCount('l');
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.getPct(object0);
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('d');
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
  public void test26()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1682L));
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
  public void test27()  throws Throwable  {
      Frequency frequency0 = new Frequency();
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
  public void test28()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-570));
      frequency0.addValue(integer0);
      // Undeclared exception!
      try { 
        frequency0.getCumPct((Comparable<?>) null);
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
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
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
  public void test30()  throws Throwable  {
      Frequency frequency0 = new Frequency();
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
  public void test31()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "org.apache.commons.math.stat.Frequency$1");
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-1), 1).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Comparable<?>) "org.apache.commons.math.stat.Frequency$1");
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
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
  public void test33()  throws Throwable  {
      Frequency frequency0 = new Frequency();
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
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      Frequency frequency0 = new Frequency();
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
  public void test36()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue((Comparable<?>) "");
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
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('}');
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n}\t1\t100%\t100%\n");
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('9');
      // Undeclared exception!
      try { 
        frequency0.addValue(1497L);
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('G');
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
  public void test42()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Integer integer0 = new Integer(2552);
      frequency0.addValue(integer0);
      // Undeclared exception!
      try { 
        frequency0.addValue('');
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(4005, 10, 5354, 5354).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-3850L));
      double double0 = frequency0.getCumPct((Comparable<?>) "C3VQy%@ZARM1ixF.Y");
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      double double0 = frequency0.getCumPct((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(4005, 10, 5354, 5354, (-2783)).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-3850L));
      String string0 = frequency0.toString();
      Long long0 = new Long(4L);
      long long1 = frequency0.getCumFreq((Comparable<?>) long0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 31, 31).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      Long long0 = new Long(68L);
      Integer integer0 = new Integer(1);
      frequency0.addValue(integer0);
      frequency0.addValue(integer0);
      long long1 = frequency0.getCumFreq((Comparable<?>) long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Long long0 = new Long(68L);
      double double0 = frequency0.getPct((Comparable<?>) long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Integer integer0 = new Integer(2552);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      long long0 = frequency0.getCount((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Integer integer0 = new Integer(2552);
      long long0 = frequency0.getCount((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(249);
      frequency0.addValue(integer0);
      long long0 = frequency0.getSumFreq();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparable0).compareTo(any());
      Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable1).compareTo(any());
      frequency0.addValue(comparable1);
      frequency0.addValue(comparable0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf(1244);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Comparator<Long> comparator1 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-536)).when(comparator1).compare(anyLong() , anyLong());
      Frequency frequency1 = new Frequency(comparator1);
      Integer integer0 = new Integer(2525);
      frequency1.addValue(integer0);
      boolean boolean0 = frequency0.equals(frequency1);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Comparator<Long> comparator1 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency1 = new Frequency(comparator1);
      boolean boolean0 = frequency0.equals(frequency1);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      boolean boolean0 = frequency0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      boolean boolean0 = frequency0.equals(frequency0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      boolean boolean0 = frequency0.equals("");
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1019));
      frequency0.addValue(1);
      long long0 = frequency0.getCumFreq((-1L));
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      Integer integer1 = new Integer(28);
      frequency0.addValue(integer1);
      String string0 = frequency0.toString();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('C');
      Integer integer0 = new Integer(0);
      double double0 = frequency0.getPct((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
      } catch(IllegalArgumentException e) {
         //
         // class (java.lang.Object) does not implement Comparable
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(0L);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(1802);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((Object) "Value \t Freq. \t Pct. \t Cum Pct. \nG\t1\t100%\t100%\n");
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('u');
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('G');
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(1L);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      long long0 = frequency0.getCumFreq((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(249);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(0);
  }
}