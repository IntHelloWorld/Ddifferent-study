/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 05:03:37 GMT 2020
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
        LocaleUtils.toLocale("oz+*=~m~2)I-k<");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: oz+*=~m~2)I-k<
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("am\"UC!hnQF#qoR8,_uJ");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: am\"UC!hnQF#qoR8,_uJ
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List list0 = LocaleUtils.availableLocaleList();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage("th");
      Locale locale0 = Locale.FRANCE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      List list1 = LocaleUtils.localeLookupList(locale0);
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      Locale locale0 = Locale.JAPANESE;
      List list0 = LocaleUtils.localeLookupList(locale0);
      List list1 = LocaleUtils.countriesByLanguage((String) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry("");
      List list1 = LocaleUtils.countriesByLanguage("6T'kJO");
      Set set0 = LocaleUtils.availableLocaleSet();
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
      Locale locale0 = new Locale("da", "5=P](z`,:+");
      String string0 = locale0.getDisplayLanguage();
      String string1 = locale0.getDisplayLanguage();
      String string2 = locale0.getScript();
      Locale locale1 = Locale.JAPANESE;
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale.setDefault(locale_Category0, locale0);
      Set<Character> set0 = locale0.getExtensionKeys();
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
      List list1 = LocaleUtils.languagesByCountry("5=P](z`,:+");
      List list2 = LocaleUtils.languagesByCountry((String) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = new Locale("be", "be");
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      Set set1 = LocaleUtils.availableLocaleSet();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("hr");
      List list0 = LocaleUtils.localeLookupList(locale0, (Locale) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = new Locale("", "~`_f1rJd~fZC", "~`_f1rJd~fZC");
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("u-HP89c9");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: u-HP89c9
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("}U+7Xkg");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: }U+7Xkg
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("@^tE0>YW&'N/Tt");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: @^tE0>YW&'N/Tt
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale(")#Q,T");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: )#Q,T
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage("aZT}?S");
      List list1 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      List list2 = LocaleUtils.localeLookupList((Locale) null);
  }
}
