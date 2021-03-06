/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 05:13:08 GMT 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
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
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("b1");
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      List list1 = LocaleUtils.localeLookupList((Locale) null);
      List list2 = LocaleUtils.availableLocaleList();
      List list3 = LocaleUtils.countriesByLanguage("be");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = null;
      List list0 = LocaleUtils.countriesByLanguage((String) null);
      Locale locale0 = LocaleUtils.toLocale((String) null);
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      List<Locale.LanguageRange> list1 = null;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      // Undeclared exception!
      try { 
        Locale.filterTags((List<Locale.LanguageRange>) null, (Collection<String>) linkedList0, locale_FilteringMode0);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage("z9}zRJK)SHC");
      Locale locale0 = Locale.FRENCH;
      String string0 = locale0.getExtension('P');
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      boolean boolean1 = LocaleUtils.isAvailableLocale(locale0);
      boolean boolean2 = LocaleUtils.isAvailableLocale(locale0);
      String[] stringArray0 = Locale.getISOCountries();
      LocaleUtils localeUtils0 = new LocaleUtils();
      Set set0 = LocaleUtils.availableLocaleSet();
      Set set1 = LocaleUtils.availableLocaleSet();
      List list1 = LocaleUtils.languagesByCountry((String) null);
      List list2 = LocaleUtils.countriesByLanguage("u:wR%B0p%FLC[~ thR");
      Set set2 = LocaleUtils.availableLocaleSet();
      List list3 = LocaleUtils.countriesByLanguage("");
      List list4 = LocaleUtils.availableLocaleList();
      List list5 = LocaleUtils.localeLookupList(locale0);
      boolean boolean3 = LocaleUtils.isAvailableLocale(locale0);
      List list6 = LocaleUtils.localeLookupList(locale0);
      List list7 = LocaleUtils.availableLocaleList();
      List list8 = LocaleUtils.languagesByCountry("");
      Locale locale1 = Locale.FRANCE;
      Locale locale2 = Locale.TRADITIONAL_CHINESE;
      List list9 = LocaleUtils.localeLookupList(locale1, locale2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry(".lTp6jZl");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = new Locale(".lTp6jZl", "opOxOk ;fxw+", "opOxOk ;fxw+");
      List list0 = LocaleUtils.localeLookupList(locale0, (Locale) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("zaJI;N7)If<`X&Nl 5");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: zaJI;N7)If<`X&Nl 5
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("o,iSUe1%[*malhU");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: o,iSUe1%[*malhU
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("aXb 6`DU4Z?TUG9");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: aXb 6`DU4Z?TUG9
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("\u5FB7\u6587");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: \u5FB7\u6587
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("Francia");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: Francia
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("O`:N");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: O`:N
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("be");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
}
