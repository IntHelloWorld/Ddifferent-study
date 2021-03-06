/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 05:19:42 GMT 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.HashMap;
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
        LocaleUtils.toLocale("5eDv$%W");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: 5eDv$%W
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      Locale locale0 = new Locale("!KA/Ng`cs", "", "org.apache.commons.lang.LocaleUtils");
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      List list0 = LocaleUtils.countriesByLanguage("be");
      String string0 = locale0.getScript();
      List list1 = LocaleUtils.languagesByCountry("w[U#*l2BD`+0pj3");
      String string1 = "lt";
      Locale locale1 = LocaleUtils.toLocale("lt");
      List<Locale.LanguageRange> list2 = Locale.LanguageRange.parse("lt");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      List<Locale.LanguageRange> list3 = Locale.LanguageRange.mapEquivalents(list2, hashMap0);
      LinkedList<Locale> linkedList0 = new LinkedList<Locale>();
      List<Locale> list4 = Locale.filter(list2, (Collection<Locale>) linkedList0);
      List<Locale> list5 = Locale.filter(list3, (Collection<Locale>) list4);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<Locale> list6 = Locale.filter(list3, (Collection<Locale>) list5, locale_FilteringMode0);
      String string2 = locale1.getDisplayCountry();
      List list7 = LocaleUtils.localeLookupList(locale1);
      List list8 = LocaleUtils.availableLocaleList();
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale1);
      Locale locale2 = LocaleUtils.toLocale("et");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage((String) null);
      Locale locale0 = LocaleUtils.toLocale((String) null);
      Locale locale1 = Locale.ENGLISH;
      Locale locale2 = Locale.JAPANESE;
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry((String) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = new Locale("", "cs", "vi");
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      Set set1 = LocaleUtils.availableLocaleSet();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = new Locale("", "cs", "vi");
      Locale locale1 = Locale.PRC;
      List list0 = LocaleUtils.localeLookupList(locale1, locale0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("ykn?yeMG}s2UX}v,(<V");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ykn?yeMG}s2UX}v,(<V
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("q}V%9QX*I5$1;hM");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: q}V%9QX*I5$1;hM
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("w[U#*l2BD`+0pj3");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: w[U#*l2BD`+0pj3
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("&G\"|DTg$");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: &G\"|DTg$
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("\"q;t[");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: \"q;t[
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      List list0 = LocaleUtils.localeLookupList(locale0);
      Locale locale1 = Locale.TRADITIONAL_CHINESE;
      String string0 = locale0.getDisplayVariant(locale1);
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      boolean boolean1 = LocaleUtils.isAvailableLocale(locale0);
      List list1 = LocaleUtils.localeLookupList(locale0);
      List list2 = LocaleUtils.languagesByCountry("");
      LocaleUtils localeUtils0 = new LocaleUtils();
      List list3 = LocaleUtils.languagesByCountry("");
      List list4 = LocaleUtils.countriesByLanguage("");
      boolean boolean2 = LocaleUtils.isAvailableLocale(locale0);
      List list5 = LocaleUtils.languagesByCountry("");
      List list6 = LocaleUtils.languagesByCountry("");
  }
}
