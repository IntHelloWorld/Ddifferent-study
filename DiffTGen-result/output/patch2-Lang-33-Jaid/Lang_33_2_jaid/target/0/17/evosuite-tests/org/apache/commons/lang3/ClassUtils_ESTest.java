/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 08:07:16 GMT 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("L+EDPrT");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("0ia3hgWX");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Float> class0 = Float.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<String> class1 = String.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("java.lang");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("short", false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("org.apache.commons.lang3.ClassUtils", false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("java.lang.Long");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("long");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "float");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Long> class0 = Long.class;
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 5);
      // Undeclared exception!
      try { 
        ClassUtils.getPublicMethod(class0, (String) null, classArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<Long>[] classArray0 = (Class<Long>[]) Array.newInstance(Class.class, 5);
      try { 
        ClassUtils.getPublicMethod(class0, "~D!Ot", classArray0);
      } catch(NoSuchMethodException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null, false);
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang3.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        ClassUtils.getClass(classLoader0, (String) null, false);
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang3.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        ClassUtils.getClass("L-<~r,x|]FTB", true);
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "", true);
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0, false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      Class<Long> class1 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Long> class0 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, (Class<?>) null, false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      classArray0[0] = class0;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, false);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 6);
      Class<Byte>[] classArray1 = (Class<Byte>[]) Array.newInstance(Class.class, 3);
      boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0, true);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("[]");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      String string0 = ClassUtils.getPackageName(class0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("java.lang");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<String> class0 = String.class;
      String string0 = ClassUtils.getShortClassName(class0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getPackageCanonicalName("[java.lang.String");
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((String) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, "");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) "W\"F~twyNa?YGv&Cs7i", "W\"F~twyNa?YGv&Cs7i");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, "0^wV");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      String string0 = ClassUtils.getShortCanonicalName(object0, "char");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "[]");
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null);
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang3.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "int", true);
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 8);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      Class<Long> class2 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class2, false);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 1);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 8);
      Class<Double> class0 = Double.class;
      classArray0[0] = class0;
      classArray0[1] = classArray0[0];
      classArray0[2] = classArray0[0];
      classArray0[3] = classArray0[0];
      classArray0[4] = classArray0[2];
      classArray0[5] = classArray0[0];
      Class<Double> class1 = Double.TYPE;
      classArray0[6] = class1;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null, false);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      List<String> list0 = ClassUtils.convertClassesToClassNames((List<Class<?>>) null);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.offer("className must not be null.");
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Class<Float> class0 = Float.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      String string0 = ClassUtils.getPackageCanonicalName(class1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("LSb |S?$@T}I8%5U.X3");
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getPackageName("[");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((String) null);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "char");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      String string0 = ClassUtils.getPackageName((Object) class0, "");
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("LSb |S?$@T}I8%5U");
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("F");
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("[");
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((String) null);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "0v\"gH)L`6R+lS;v^eU");
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) "byte", "char");
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Class<Short> class0 = Short.class;
      String string0 = ClassUtils.getShortCanonicalName(class0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      try { 
        ClassUtils.getClass("");
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Class<Float> class0 = Float.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Class<Float> class0 = Float.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0);
  }
}