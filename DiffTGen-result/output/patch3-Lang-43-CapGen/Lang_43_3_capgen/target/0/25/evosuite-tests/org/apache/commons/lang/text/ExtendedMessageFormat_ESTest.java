/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 04:50:19 GMT 2020
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExtendedMessageFormat_ESTest extends ExtendedMessageFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0);
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat((String) null, hashMap0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("$br uN{NOgn", (Map) null);
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<NumberFormat, Integer> hashMap0 = new HashMap<NumberFormat, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("Z8tI{#sYbG<o", hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 5: #
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      HashMap<ChoiceFormat, String> hashMap0 = new HashMap<ChoiceFormat, String>(985, 985);
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat((String) null, locale0, hashMap0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("dirteYRw3v{=dd0-", locale0, (Map) null);
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = new Locale("%o1{U4jw", "", "%o1{U4jw");
      HashMap<String, NumberFormat> hashMap0 = new HashMap<String, NumberFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("%o1{U4jw", locale0, hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 4: U
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat((String) null, locale0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("`I~=");
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("{hHS;yv", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("Mx{m;enXbL4#s//Sh>");
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      HashMap<ChoiceFormat, String> hashMap0 = new HashMap<ChoiceFormat, String>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0, hashMap0);
      extendedMessageFormat0.applyPattern("UIJ,0/o=oHAS*'!}");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Integer, MockDateFormat> hashMap0 = new HashMap<Integer, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("G~B[", hashMap0);
      extendedMessageFormat0.applyPattern("Ww)f\"}d4");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", (Map) null);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      HashMap<DecimalFormat, ChoiceFormat> hashMap0 = new HashMap<DecimalFormat, ChoiceFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("''", locale0, hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("&{a<t}M}Pd?1D8I,rz1");
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 2: a
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<ChoiceFormat, Object> hashMap0 = new HashMap<ChoiceFormat, Object>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("g2n!F=}sgl!{", hashMap0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.apache.commons.lang.text.StrMatcher$CharSetMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("");
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatByArgumentIndex((-2763), dateFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("+!*Hs&d?x*G%:t`d");
      Format[] formatArray0 = new Format[5];
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormats(formatArray0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      HashMap<String, DecimalFormat> hashMap0 = new HashMap<String, DecimalFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("`1'F%WWYL'HF.gME:u", locale0, hashMap0);
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormat(1029, extendedMessageFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Integer, MockDateFormat> hashMap0 = new HashMap<Integer, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("G~B[", hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatsByArgumentIndex((Format[]) null);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }
}
