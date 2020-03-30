/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 07:38:47 GMT 2020
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
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-463));
      frequency0.addValue(integer0);
      int int0 = frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = Integer.getInteger("", 4564);
      frequency0.addValue((Comparable<?>) integer0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('`');
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = Integer.getInteger("", 4564);
      frequency0.addValue((Comparable<?>) integer0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('{');
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('g');
      double double0 = frequency0.getPct((Object) "");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getPct((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('u');
      Integer integer0 = Integer.valueOf((-2185));
      double double0 = frequency0.getPct((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-463));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(1L);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(9);
      double double0 = frequency0.getPct(0L);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-98));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((-1647));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getPct((-1));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Integer integer0 = Integer.getInteger("", 4564);
      frequency0.addValue((Comparable<?>) integer0);
      double double0 = frequency0.getPct('{');
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('`');
      double double0 = frequency0.getCumPct((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getCumPct((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-2912));
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getCumPct((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n-2912\t1\t100%\t100%\n");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1491);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(915L);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = Integer.getInteger("", 4564);
      frequency0.addValue((Comparable<?>) integer0);
      double double0 = frequency0.getCumPct((-1204));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Integer integer0 = Integer.getInteger("", 4564);
      frequency0.addValue((Comparable<?>) integer0);
      double double0 = frequency0.getCumPct('`');
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((Object) "z}X)ypjhOx,s1CAV~{C");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(0L);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = Integer.getInteger("", 4564);
      frequency0.addValue((Comparable<?>) integer0);
      long long0 = frequency0.getCumFreq(2051);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-152L));
      long long0 = frequency0.getCumFreq('M');
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      long long0 = frequency0.getCount((Object) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      long long0 = frequency0.getCount(1155L);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = Integer.getInteger("", 4564);
      frequency0.addValue((Comparable<?>) integer0);
      long long0 = frequency0.getCount(2051);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      long long0 = frequency0.getCount('n');
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
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
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
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
      frequency0.addValue(1395);
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
      frequency0.addValue(')');
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
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2878L);
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
  public void test31()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
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
      Frequency frequency0 = new Frequency();
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
  public void test33()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(155);
      frequency0.addValue((Object) integer0);
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
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
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
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      Integer integer0 = new Integer((-656));
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
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
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
      frequency0.addValue((Comparable<?>) "");
      Integer integer0 = Integer.getInteger("", 0);
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) integer0);
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Integer not comparable to existing values
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
        frequency0.addValue((long) 2308);
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
      frequency0.addValue((Comparable<?>) "z}X)ypjhOx,s1CAV~{C");
      // Undeclared exception!
      try { 
        frequency0.addValue('r');
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Comparable<?>) "z}X)ypjhOx,s1CAV~{C");
      double double0 = frequency0.getCumPct((Comparable<?>) "z}X)ypjhOx,s1CAV~{C");
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      double double0 = frequency0.getCumPct((Comparable<?>) "z}X)ypjhOx,s1CAV~{C");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2878L);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(896, (-1111)).when(comparable0).compareTo(any());
      long long0 = frequency0.getCumFreq(comparable0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      long long0 = frequency0.getCumFreq((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Integer integer0 = Integer.getInteger("", 4564);
      frequency0.addValue((Comparable<?>) integer0);
      long long0 = frequency0.getCumFreq((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((Comparable<?>) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      double double0 = frequency0.getPct((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-463));
      frequency0.addValue(integer0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(comparable0).compareTo(any(org.apache.commons.math.stat.Frequency.class));
      double double0 = frequency0.getPct(comparable0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any(org.apache.commons.math.stat.Frequency.class));
      long long0 = frequency0.getCount(comparable0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      long long0 = frequency0.getCount(comparable0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Comparable<?>) "z}X)ypjhOx,s1CAV~{C");
      long long0 = frequency0.getSumFreq();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getSumFreq();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency();
      frequency1.addValue((Comparable<?>) "z}X)ypjhOx,s1CAV~{C");
      boolean boolean0 = frequency0.equals(frequency1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      boolean boolean0 = frequency0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      boolean boolean0 = frequency0.equals(frequency0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Integer integer0 = Integer.getInteger("", 4564);
      frequency0.addValue((Comparable<?>) integer0);
      double double0 = frequency0.getCumPct((-1));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1491);
      long long0 = frequency0.getCount((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-2912));
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getCumPct(0L);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Frequency frequency0 = new Frequency();
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
  public void test65()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-960));
      String string0 = frequency0.toString();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(0L);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-463));
      frequency0.addValue(integer0);
      frequency0.addValue(3748);
      long long0 = frequency0.getCumFreq(0L);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(3748);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) iterator0);
      } catch(ClassCastException e) {
         //
         // java.util.TreeMap$KeyIterator cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('r');
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('+');
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      long long0 = frequency0.getCumFreq(2047);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
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
  public void test75()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Integer integer0 = Integer.getInteger("", 4564);
      frequency0.addValue((Comparable<?>) integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
  }
}
