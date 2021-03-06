/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 05:01:50 GMT 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("zh");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("aax`Uvkm3");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: aax`Uvkm3
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("`hfY-Sl");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: `hfY-Sl
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage("uk");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage((String) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      List list0 = LocaleUtils.languagesByCountry("");
      Locale locale0 = null;
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
      List list1 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      boolean boolean1 = LocaleUtils.isAvailableLocale((Locale) null);
      List list2 = LocaleUtils.countriesByLanguage("");
      boolean boolean2 = LocaleUtils.isAvailableLocale((Locale) null);
      String string0 = "";
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      String string1 = "Hr6S`LJj!(";
      LinkedList<String> linkedList1 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("cF#;K");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: cF#;K
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      String[] stringArray0 = Locale.getISOCountries();
      String string0 = locale0.getDisplayCountry();
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils localeUtils0 = new LocaleUtils();
      List list1 = LocaleUtils.languagesByCountry((String) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry("{>|ZqQ4`yD.@5");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      Set set1 = LocaleUtils.availableLocaleSet();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Locale locale1 = new Locale("$K=|r)`*4c1}Vev");
      List list0 = LocaleUtils.localeLookupList(locale0, locale1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = new Locale("It<v?La,?R6'@.i/]c,", "L9", "It<v?La,?R6'@.i/]c,");
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("lWo>Xv4eSd1o$s");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: lWo>Xv4eSd1o$s
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("}JnAUp&+MXx5U*V\"");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: }JnAUp&+MXx5U*V\"
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: 
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      List list0 = LocaleUtils.localeLookupList(locale0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List list0 = LocaleUtils.availableLocaleList();
  }
}
