/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 05:00:05 GMT 2020
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
        LocaleUtils.toLocale("VTxQ[qP");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: VTxQ[qP
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = new Locale("14M#D77ar", "14M#D77ar", "14M#D77ar");
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage((String) null);
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale(";Wk?-");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ;Wk?-
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage("");
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("vtk[(XCRFq<");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: vtk[(XCRFq<
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry("");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry("Chinese");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      Set set1 = LocaleUtils.availableLocaleSet();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      Locale locale1 = Locale.forLanguageTag("");
      List list0 = LocaleUtils.localeLookupList(locale1, locale0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = new Locale("14M#D77ar", "14M#D77ar", "14M#D77ar");
      List list0 = LocaleUtils.localeLookupList(locale0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      List list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      String string0 = "0n!G0#wX+pZx##";
      List list1 = LocaleUtils.languagesByCountry("0n!G0#wX+pZx##");
      List list2 = LocaleUtils.availableLocaleList();
      List list3 = LocaleUtils.availableLocaleList();
      LocaleUtils localeUtils0 = new LocaleUtils();
      List list4 = LocaleUtils.countriesByLanguage("Cr7_I:Y:O@");
      List list5 = LocaleUtils.languagesByCountry((String) null);
      List list6 = LocaleUtils.localeLookupList((Locale) null);
      Locale locale0 = null;
      try {
        locale0 = new Locale("0n!G0#wX+pZx##", (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("n$}W>gV");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: n$}W>gV
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("mK*0H=~5rNu=TO");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: mK*0H=~5rNu=TO
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("|<R_I9\"<y");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: |<R_I9\"<y
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
      Locale locale0 = LocaleUtils.toLocale("ca");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List list0 = LocaleUtils.availableLocaleList();
      List list1 = LocaleUtils.countriesByLanguage("ca");
      Locale locale0 = LocaleUtils.toLocale("ca");
      Locale locale1 = locale0.stripExtensions();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale locale2 = Locale.lookup(linkedList0, linkedList1);
      LinkedList<Locale.LanguageRange> linkedList2 = new LinkedList<Locale.LanguageRange>();
      Locale locale3 = Locale.PRC;
      boolean boolean0 = linkedList1.add(locale3);
      LinkedList<String> linkedList3 = new LinkedList<String>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list2 = Locale.filterTags((List<Locale.LanguageRange>) linkedList2, (Collection<String>) linkedList3, locale_FilteringMode0);
      List list3 = LocaleUtils.localeLookupList(locale1);
      List list4 = LocaleUtils.availableLocaleList();
      List list5 = LocaleUtils.availableLocaleList();
  }
}
