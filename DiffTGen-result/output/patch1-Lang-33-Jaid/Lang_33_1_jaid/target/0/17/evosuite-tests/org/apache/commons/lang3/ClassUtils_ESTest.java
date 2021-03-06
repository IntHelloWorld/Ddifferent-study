/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 13:35:11 GMT 2020
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
      Class<Integer> class0 = Integer.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("java.lang");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("short", false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass((ClassLoader) null, "short");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Short> class0 = Short.class;
      Class<ClassUtils>[] classArray0 = (Class<ClassUtils>[]) Array.newInstance(Class.class, 9);
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        ClassUtils.getClass(classLoader0, (String) null, true);
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang3.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "");
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "", false);
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<?> class0 = ClassUtils.primitiveToWrapper((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Long> class0 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0, true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("Zndc#6kv?.3K3\":=G");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((String) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("!]yX{vG5KD}JB<e");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      String string0 = ClassUtils.getPackageName(class0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("java.compiler");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((String) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<String> class0 = String.class;
      String string0 = ClassUtils.getShortClassName(class0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      Class<?> class2 = ClassUtils.primitiveToWrapper(class1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getShortCanonicalName(" [~!pLk+F$u;xt");
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, "short");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      String string0 = ClassUtils.getPackageCanonicalName((Object) class0, "mX^II");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Character> class0 = Character.class;
      String string0 = ClassUtils.getShortCanonicalName(class0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, "");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      String string0 = ClassUtils.getShortCanonicalName((Object) list0, (String) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 2);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.toClass(classArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      try { 
        ClassUtils.getClass(">v~~H`o]ljcA[]", true);
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("double");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Character>[] classArray0 = (Class<Character>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      Class<Byte> class0 = Byte.class;
      try { 
        ClassUtils.getPublicMethod(class0, "|n", classArray1);
      } catch(NoSuchMethodException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 5);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 5);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0, false);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 1);
      Class<Double> class0 = Double.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 5);
      Class<Object> class0 = Object.class;
      boolean boolean0 = ClassUtils.isAssignable(classArray0[0], class0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Class<Byte>[] classArray0 = (Class<Byte>[]) Array.newInstance(Class.class, 7);
      classArray0[0] = class0;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, false);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null, false);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      Class<Object>[] classArray1 = (Class<Object>[]) Array.newInstance(Class.class, 7);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray1, true);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("");
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<Object> class0 = Object.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("");
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((String) null);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "");
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      String string0 = ClassUtils.getPackageName((Object) class0, ".");
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("$");
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("Z");
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("[");
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("");
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((String) null);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "%M!l91{{l");
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) "className must not be null.", "Byte");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
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
  public void test68()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 1);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      try { 
        ClassUtils.getClass("lang");
      } catch(ClassNotFoundException e) {
      }
  }
}
