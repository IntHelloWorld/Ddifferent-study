/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 06:10:16 GMT 2020
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
      Integer integer0 = Integer.valueOf(2872);
      frequency0.addValue(integer0);
      int int0 = frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2544);
      frequency0.addValue(2361L);
      double double0 = frequency0.getPct((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1180, 1879048192).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2819);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct((Object) "7");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue(0);
      double double0 = frequency0.getPct((Comparable<?>) 1L);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue((-2677));
      double double0 = frequency0.getPct((-1L));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue(0L);
      double double0 = frequency0.getPct(0L);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('p');
      double double0 = frequency0.getPct((-1593));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1180, 1879048192).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2819);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct((-820));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue(1L);
      double double0 = frequency0.getPct('[');
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1180, 1879048192).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2819);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct(',');
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      Integer integer0 = new Integer(0);
      double double0 = frequency0.getCumPct((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-677));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1335);
      double double0 = frequency0.getCumPct((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n1335\t1\t100%\t100%\n");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1169));
      double double0 = frequency0.getCumPct((-4596L));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 1);
      double double0 = frequency0.getCumPct((-262));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = Integer.valueOf(2872);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(210);
      double double0 = frequency0.getCumPct(' ');
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      long long0 = frequency0.getCumFreq((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-520L));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Comparable<?>) 0L);
      long long0 = frequency0.getCumFreq((-1425));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Long long0 = new Long(0L);
      long long1 = frequency0.getCount((Object) long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1169));
      long long0 = frequency0.getCount((Object) "");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2937L);
      long long0 = frequency0.getCount((-74L));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-5L));
      long long0 = frequency0.getCount(1929);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-677));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount('p');
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue(2239);
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
  public void test26()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
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
  public void test27()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue(0L);
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
  public void test28()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
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
  public void test29()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(210);
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
  public void test30()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue((-2677));
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
  public void test31()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.getCumFreq(object0);
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1016);
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
  public void test33()  throws Throwable  {
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
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(932);
      frequency0.addValue((Object) "}I?$KU");
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
      frequency0.addValue((-245L));
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n-245\t1\t50%\t50%\n-167\t1\t50%\t100%\n");
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('}');
      // Undeclared exception!
      try { 
        frequency0.addValue(0L);
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('p');
      // Undeclared exception!
      try { 
        frequency0.addValue((-1593));
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
      frequency0.addValue((long) 1);
      // Undeclared exception!
      try { 
        frequency0.addValue('=');
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-2110));
      Long long0 = new Long(0L);
      double double0 = frequency0.getCumPct((Comparable<?>) long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      double double0 = frequency0.getCumPct((Comparable<?>) "7");
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      frequency0.addValue(0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(31, 0, (-3954), 216, 0).when(comparable0).compareTo(any());
      long long0 = frequency0.getCumFreq(comparable0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      long long0 = frequency0.getCumFreq((Comparable<?>) "");
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1180, 1879048192, 1180, (-536)).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2819);
      frequency0.addValue((Object) integer0);
      long long0 = frequency0.getCumFreq((Comparable<?>) null);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((Comparable<?>) "7");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Long long0 = new Long((-2532L));
      double double0 = frequency0.getPct((Comparable<?>) long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = Integer.valueOf(2872);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount((Comparable<?>) 1L);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Comparable<?>) 1L);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = Integer.valueOf(2872);
      long long0 = frequency0.getCount((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getSumFreq();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(568);
      frequency0.addValue(integer0);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = Integer.valueOf(2872);
      frequency0.addValue(integer0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency1 = new Frequency(comparator1);
      boolean boolean0 = frequency0.equals(frequency1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency1 = new Frequency(comparator1);
      boolean boolean0 = frequency0.equals(frequency1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(31, 0, (-3954), 216).when(comparable0).compareTo(any());
      long long0 = frequency0.getCumFreq(comparable0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct((-1492L));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('@');
      double double0 = frequency0.getCumPct('d');
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2937L);
      long long0 = frequency0.getCumFreq('J');
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2937L);
      Integer integer0 = new Integer(1);
      double double0 = frequency0.getPct((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1180).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2819);
      frequency0.addValue((Object) integer0);
      long long0 = frequency0.getSumFreq();
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
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
      long long0 = frequency0.getCount((-74L));
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
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
  public void test70()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(1);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) frequency0);
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      frequency0.addValue(0);
      String string0 = frequency0.toString();
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq('T');
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('i');
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
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
  public void test76()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Long long0 = new Long((-2532L));
      long long1 = frequency0.getCumFreq((Object) long0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(1);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue(2239);
      long long0 = frequency0.getCumFreq((long) 2239);
  }
}
