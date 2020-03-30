/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 05:19:43 GMT 2020
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
      Locale locale0 = LocaleUtils.toLocale("ga");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("zAWjG5?eA*_VBL'");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: zAWjG5?eA*_VBL'
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("a`vmr@)';3k5bV");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: a`vmr@)';3k5bV
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("^apunmv");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ^apunmv
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = new Locale("rx+or&", "rx+or&", "rx+or&");
      boolean boolean0 = locale0.hasExtensions();
      String string0 = locale0.getDisplayCountry();
      boolean boolean1 = LocaleUtils.isAvailableLocale(locale0);
      List list0 = LocaleUtils.countriesByLanguage("pt");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage("pt");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = null;
      List list0 = LocaleUtils.languagesByCountry((String) null);
      LocaleUtils localeUtils0 = new LocaleUtils();
      Locale locale0 = LocaleUtils.toLocale((String) null);
      List list1 = LocaleUtils.languagesByCountry("GB");
      Locale locale1 = null;
      List list2 = LocaleUtils.localeLookupList((Locale) null);
      List list3 = LocaleUtils.countriesByLanguage((String) null);
      List list4 = LocaleUtils.countriesByLanguage("");
      Locale locale2 = Locale.GERMAN;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.LanguageRange locale_LanguageRange0 = null;
      try {
        locale_LanguageRange0 = new Locale.LanguageRange("&U3Q7");
      } catch(IllegalArgumentException e) {
         //
         // range=&u3q7
         //
         verifyException("java.util.Locale$LanguageRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry("");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      Set set1 = LocaleUtils.availableLocaleSet();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = new Locale("rx+or&", "rx+or&", "rx+or&");
      Locale locale1 = LocaleUtils.toLocale("pt");
      List list0 = LocaleUtils.localeLookupList(locale0, locale1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("org.apache.commons.lang.LocaleUtils");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: org.apache.commons.lang.LocaleUtils
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("v*CaF-H1ns~S#QMX");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: v*CaF-H1ns~S#QMX
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("|Q_j#[0K}k");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: |Q_j#[0K}k
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("China");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: China
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      List list0 = LocaleUtils.availableLocaleList();
  }
}