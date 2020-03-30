/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 05:25:12 GMT 2020
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
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("z9Pz_,N@ ph8wn5");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: z9Pz_,N@ ph8wn5
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("iGo(Y+4");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: iGo(Y+4
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      Locale locale0 = Locale.CANADA;
      List list0 = LocaleUtils.localeLookupList(locale0);
      List list1 = LocaleUtils.countriesByLanguage("");
      List list2 = LocaleUtils.countriesByLanguage("Invalid locale format: ");
      List list3 = LocaleUtils.countriesByLanguage("it");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      Locale locale0 = Locale.CANADA;
      String string0 = locale0.getDisplayCountry();
      List list0 = LocaleUtils.localeLookupList(locale0);
      List list1 = LocaleUtils.countriesByLanguage((String) null);
      LinkedList<String> linkedList0 = new LinkedList<String>();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      Locale locale0 = Locale.CANADA;
      List list0 = LocaleUtils.localeLookupList(locale0);
      List list1 = LocaleUtils.countriesByLanguage("");
      List list2 = LocaleUtils.countriesByLanguage("Invalid locale format: ");
      List list3 = LocaleUtils.languagesByCountry("TH");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage("UW5i");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      List list1 = LocaleUtils.localeLookupList((Locale) null);
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
      boolean boolean1 = LocaleUtils.isAvailableLocale((Locale) null);
      List list2 = LocaleUtils.availableLocaleList();
      List list3 = LocaleUtils.availableLocaleList();
      List list4 = LocaleUtils.availableLocaleList();
      List list5 = LocaleUtils.availableLocaleList();
      List list6 = LocaleUtils.languagesByCountry("PE");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry("");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      Set set1 = LocaleUtils.availableLocaleSet();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.US;
      Locale locale1 = Locale.CHINESE;
      List list0 = LocaleUtils.localeLookupList(locale0, locale1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = new Locale("mK`:QY-DPo/CQy", "I<JP_h?EU,El~*^!#?", "mK`:QY-DPo/CQy");
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("av_7-x|:I%u~c %");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: av_7-x|:I%u~c %
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
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
        LocaleUtils.toLocale("{enaQh~ObQ");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: {enaQh~ObQ
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("vUVB}");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: vUVB}
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("ja");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale(" Qpw!9!-mg+T#%nblj1");
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format:  Qpw!9!-mg+T#%nblj1
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      List list0 = LocaleUtils.countriesByLanguage("eNyh{W!");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Locale locale1 = locale0.stripExtensions();
      String string0 = locale0.getDisplayScript();
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      List list1 = LocaleUtils.languagesByCountry((String) null);
  }
}
