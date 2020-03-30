/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 05:12:57 GMT 2020
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
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("ozo 'eA7 -!c");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ozo 'eA7 -!c
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("da");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = new Locale("", "", "M14^C");
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      List list0 = LocaleUtils.availableLocaleList();
      List list1 = LocaleUtils.countriesByLanguage("ja");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.US;
      String string0 = locale0.getDisplayLanguage();
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
      Locale locale1 = LocaleUtils.toLocale("nl");
      List list1 = LocaleUtils.countriesByLanguage("nl");
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("English");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: English
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage((String) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage("");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      String[] stringArray0 = Locale.getISOCountries();
      Locale locale1 = locale0.stripExtensions();
      Locale locale2 = Locale.UK;
      String string0 = locale0.getDisplayLanguage(locale2);
      String string1 = locale0.getDisplayScript();
      Locale locale3 = new Locale("7S", "gB?|", "O(Y{t4+[");
      String string2 = locale3.getDisplayScript();
      Set<Character> set0 = locale3.getExtensionKeys();
      String string3 = locale3.getDisplayVariant();
      String string4 = locale0.getDisplayScript(locale3);
      Locale locale4 = Locale.forLanguageTag("7S");
      List list0 = LocaleUtils.localeLookupList(locale0);
      List list1 = LocaleUtils.localeLookupList(locale2);
      List list2 = LocaleUtils.languagesByCountry("JP");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage("2a3m");
      Locale locale0 = Locale.CANADA;
      Locale locale1 = Locale.JAPAN;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale2 = Locale.lookup(linkedList0, (Collection<Locale>) null);
      String string0 = locale0.getDisplayName(locale1);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<Locale> list1 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) null, locale_FilteringMode0);
      String string1 = locale0.getDisplayCountry();
      List list2 = LocaleUtils.localeLookupList(locale0);
      List list3 = LocaleUtils.countriesByLanguage("jZZXd}Q:uMabF");
      List list4 = LocaleUtils.languagesByCountry("jZZXd}Q:uMabF");
      LocaleUtils localeUtils0 = new LocaleUtils();
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("jZZXd}Q:uMabF");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: jZZXd}Q:uMabF
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry("");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      Set set1 = LocaleUtils.availableLocaleSet();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      Locale locale1 = Locale.SIMPLIFIED_CHINESE;
      List list0 = LocaleUtils.localeLookupList(locale0, locale1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("zEcLUmxk#?/etSjx]#");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: zEcLUmxk#?/etSjx]#
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("+y#D");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: +y#D
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      Locale locale0 = Locale.FRENCH;
      List list0 = LocaleUtils.localeLookupList(locale0);
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
      List list1 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      Locale locale1 = new Locale(".;5r53l136}]", ".;5r53l136}]");
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      Locale.setDefault(locale_Category0, locale1);
      List list2 = LocaleUtils.localeLookupList(locale1, locale1);
      List list3 = LocaleUtils.localeLookupList(locale1, locale1);
      List list4 = LocaleUtils.availableLocaleList();
      List list5 = LocaleUtils.languagesByCountry((String) null);
  }
}
