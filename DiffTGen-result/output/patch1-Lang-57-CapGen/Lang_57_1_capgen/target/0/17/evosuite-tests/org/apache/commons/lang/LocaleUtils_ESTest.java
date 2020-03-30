/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 05:23:24 GMT 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("[X8Z6VN");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: [X8Z6VN
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      List list0 = LocaleUtils.countriesByLanguage("ja");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage("");
      List list1 = LocaleUtils.availableLocaleList();
      Locale locale0 = Locale.US;
      boolean boolean0 = locale0.hasExtensions();
      String[] stringArray0 = Locale.getISOLanguages();
      boolean boolean1 = LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils localeUtils0 = new LocaleUtils();
      List list2 = LocaleUtils.countriesByLanguage("fi");
      List list3 = LocaleUtils.localeLookupList(locale0, (Locale) null);
      List list4 = LocaleUtils.countriesByLanguage("4}Q[E");
      List list5 = LocaleUtils.availableLocaleList();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "";
      List list0 = LocaleUtils.countriesByLanguage("");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      String string1 = locale0.getDisplayVariant();
      Locale locale1 = Locale.KOREA;
      Locale locale2 = Locale.forLanguageTag("");
      Object object0 = locale1.clone();
      String string2 = locale1.getDisplayLanguage(locale0);
      String string3 = locale0.getDisplayVariant(locale1);
      List list1 = LocaleUtils.localeLookupList(locale0);
      Locale locale3 = Locale.ITALIAN;
      Locale locale4 = locale3.stripExtensions();
      Set<String> set0 = locale3.getUnicodeLocaleKeys();
      Locale locale5 = Locale.FRANCE;
      String string4 = locale5.getDisplayName();
      Locale.setDefault(locale3);
      List list2 = LocaleUtils.localeLookupList(locale3, locale5);
      List list3 = LocaleUtils.availableLocaleList();
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
  public void test06()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry("");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage((String) null);
      List list1 = LocaleUtils.languagesByCountry((String) null);
      Locale locale0 = LocaleUtils.toLocale((String) null);
      List list2 = LocaleUtils.countriesByLanguage((String) null);
      List list3 = LocaleUtils.languagesByCountry((String) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry("en");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      Set set1 = LocaleUtils.availableLocaleSet();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = new Locale("p&~'qOov '**E&-$", "", "p&~'qOov '**E&-$");
      List list0 = LocaleUtils.localeLookupList(locale0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("j|LPDp(k1YrZ");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: j|LPDp(k1YrZ
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("j/@wS<:TSEHZ-");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: j/@wS<:TSEHZ-
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale(":L}~?");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: :L}~?
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("en");
      boolean boolean0 = locale0.hasExtensions();
      List list0 = LocaleUtils.languagesByCountry("en");
      List list1 = LocaleUtils.localeLookupList(locale0);
      Locale locale1 = Locale.GERMAN;
      List list2 = LocaleUtils.localeLookupList(locale1);
      List list3 = LocaleUtils.localeLookupList(locale0);
      List list4 = LocaleUtils.languagesByCountry("en");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("|g?#C3=Ap,");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: |g?#C3=Ap,
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List list0 = LocaleUtils.availableLocaleList();
      String string0 = "";
      List list1 = LocaleUtils.languagesByCountry("");
      LocaleUtils localeUtils0 = new LocaleUtils();
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("a2g1GLH%'>_Xg");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: a2g1GLH%'>_Xg
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }
}