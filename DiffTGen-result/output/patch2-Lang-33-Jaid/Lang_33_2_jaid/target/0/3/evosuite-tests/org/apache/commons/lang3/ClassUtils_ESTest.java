/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 08:02:01 GMT 2020
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
      String string0 = ClassUtils.getPackageCanonicalName("?s67rO^NP3W");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<ClassUtils> class0 = ClassUtils.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Class<Long> class1 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("java.lang");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, "");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("java.lang.Short[]");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "java.lang.Short", true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("char");
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 7);
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
  public void test13()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      try { 
        ClassUtils.getPublicMethod(class0, "", classArray0);
      } catch(NoSuchMethodException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getPackageCanonicalName("[]");
      } catch(NullPointerException e) {
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
      try { 
        ClassUtils.getClass("", true);
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        ClassUtils.getClass("java.lang");
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        ClassUtils.getClass(classLoader0, (String) null);
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang3.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "boolean", false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      Class<Object> class1 = Object.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<String> class0 = String.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0, true);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Double> class0 = Double.class;
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 5);
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = class0;
      classArray0[3] = class0;
      classArray0[4] = class0;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, true);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 3);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, (Class<?>[]) null, false);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 1);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, false);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("className must not be null.");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Float> class0 = Float.class;
      String string0 = ClassUtils.getPackageName(class0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("{RMuS'#+.qWlG~");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      String string0 = ClassUtils.getShortClassName(class0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getShortCanonicalName("[java.lang.Long");
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((String) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, "Fb+");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) "Object", "Ke8KxX");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, "HQ+TR>");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      String string0 = ClassUtils.getShortCanonicalName((Object) class0, "2xgg");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<ClassUtils>[] classArray0 = (Class<ClassUtils>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.toClass(classArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "[]", true);
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Double> class0 = Double.class;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<ClassUtils>[] classArray0 = (Class<ClassUtils>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 1);
      Class<Short> class0 = Short.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      Class<?>[] classArray2 = ClassUtils.primitivesToWrappers(classArray1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<?> class0 = ClassUtils.primitiveToWrapper((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Class<ClassUtils> class0 = ClassUtils.class;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("double", true);
      Class<Long> class1 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("char");
      boolean boolean0 = ClassUtils.isAssignable(class0, class0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) class0;
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<Float> class0 = Float.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("char");
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("Long");
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("");
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((String) null);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "vs<TnxjjP\"n]");
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Class<Double> class0 = Double.class;
      String string0 = ClassUtils.getPackageName((Object) class0, "Double");
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("$");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("B");
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("[");
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getShortClassName("[");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("");
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((String) null);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "");
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = ClassUtils.getShortClassName((Object) class0, "java.lang");
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      try { 
        ClassUtils.getClass((ClassLoader) null, "/Yn9\"4`is}'j:G!");
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      String string0 = ClassUtils.getShortCanonicalName(class0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
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
  public void test78()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
  }
}