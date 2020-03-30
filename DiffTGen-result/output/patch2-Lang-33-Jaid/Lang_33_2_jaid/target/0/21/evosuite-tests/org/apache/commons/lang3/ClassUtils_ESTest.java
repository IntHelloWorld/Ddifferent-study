/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 08:07:23 GMT 2020
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
      Class<Double> class0 = Double.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("Byte");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((String) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, (String) null);
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
      Class<?> class0 = ClassUtils.getClass("float", false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("char");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 2);
      Class<Long> class0 = Long.class;
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
      Class<String> class0 = String.class;
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 3);
      try { 
        ClassUtils.getPublicMethod(class0, "Byte", classArray0);
      } catch(NoSuchMethodException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getPackageCanonicalName("[]");
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "Byte");
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, ".V+x|k2AKc\".tW-$_}[]", true);
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      Class<?> class2 = ClassUtils.primitiveToWrapper(class1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<Long> class1 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0, true);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null, false);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = ClassUtils.getPackageName(",i[M)f~%t");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = ClassUtils.getPackageName(class0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      String string0 = ClassUtils.getShortClassName(class0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getShortCanonicalName("[java.lang.Long");
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((String) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = new Object();
      String string0 = ClassUtils.getPackageCanonicalName(object0, "jZuwU?%EW/>^>hw3");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Long> class0 = Long.class;
      String string0 = ClassUtils.getShortCanonicalName(class0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.toClass(classArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        ClassUtils.getClass("[]", false);
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
      boolean boolean0 = ClassUtils.isInnerClass((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Double> class0 = Double.class;
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
      Object[] objectArray0 = new Object[8];
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<ClassUtils>[] classArray0 = (Class<ClassUtils>[]) Array.newInstance(Class.class, 7);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      Class<Character> class2 = Character.class;
      boolean boolean0 = ClassUtils.isAssignable(class2, class1, true);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<Long> class1 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Class<Short> class0 = Short.class;
      Class<Float> class1 = Float.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<ClassUtils> class1 = ClassUtils.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 8);
      Class<Boolean> class0 = Boolean.class;
      classArray0[0] = class0;
      classArray0[1] = classArray0[0];
      classArray0[2] = classArray0[0];
      classArray0[3] = classArray0[1];
      classArray0[4] = classArray0[2];
      Class<Boolean> class1 = Boolean.TYPE;
      classArray0[5] = class1;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, true);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0, true);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 1);
      Class<Object>[] classArray1 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray1, false);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add((String) null);
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Class<Double> class0 = Double.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("[java.lang.String");
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((String) null);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Class<?>) null);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "String");
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      String string0 = ClassUtils.getPackageName((Object) class0, "double");
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("En<K<>U}^64*w($");
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("Z");
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[java.lang.Boolean");
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("");
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((String) null);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "};><iZ=r$L]T");
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) "$", "");
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "int");
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      String string0 = ClassUtils.getShortCanonicalName((Object) class0, ".");
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      try { 
        ClassUtils.getClass(".");
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
  }
}