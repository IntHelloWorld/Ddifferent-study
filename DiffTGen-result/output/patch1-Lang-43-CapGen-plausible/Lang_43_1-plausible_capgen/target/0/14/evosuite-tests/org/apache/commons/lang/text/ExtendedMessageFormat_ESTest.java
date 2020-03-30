/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 17:40:06 GMT 2020
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExtendedMessageFormat_ESTest extends ExtendedMessageFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      HashMap<Object, MockDateFormat> hashMap0 = new HashMap<Object, MockDateFormat>(125, 125);
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("EYUud/TMy{'KNN]", locale0, hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 10: '
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0);
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      HashMap<String, DecimalFormat> hashMap0 = new HashMap<String, DecimalFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("Unterminated quoted string at position ", locale0, hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("");
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("A3_,vR6/v]=hDH5{gT&");
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, ChoiceFormat> hashMap0 = new HashMap<String, ChoiceFormat>();
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
  public void test05()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("1`2(}ro-PP{d8", hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 11: d
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.UK;
      HashMap<DecimalFormat, Locale> hashMap0 = new HashMap<DecimalFormat, Locale>();
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
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
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
      Locale locale0 = Locale.CANADA_FRENCH;
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("(%9FJaB.2s[{5~/I6%", locale0);
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
        extendedMessageFormat0 = new ExtendedMessageFormat("caHK.fc{Aj<@(y");
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("[7A", locale0, hashMap0);
      extendedMessageFormat0.applyPattern("[7A");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = new Locale("Unterminated quoted string at position ", "J*", "Unterminated quoted string at position ");
      HashMap<Locale, MockSimpleDateFormat> hashMap0 = new HashMap<Locale, MockSimpleDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0, hashMap0);
      extendedMessageFormat0.applyPattern("''");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Locale, ChoiceFormat> hashMap0 = new HashMap<Locale, ChoiceFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("}{", hashMap0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.lang.text.StrMatcher$CharSetMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("org.apache.commons.lang.text.ExtendedMessageFormat", locale0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatByArgumentIndex(44, extendedMessageFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<NumberFormat, String> hashMap0 = new HashMap<NumberFormat, String>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("org.apache.commons.lang.text.StrMatcher$StringMatcher", hashMap0);
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(")P#hRZM1H6ZHm", hashMap0);
      Locale locale0 = new Locale(")P#hRZM1H6ZHm", ")P#hRZM1H6ZHm");
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormat((-2125), numberFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("t7ZQ[");
      Format[] formatArray0 = new Format[8];
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
      HashMap<MessageFormat, ChoiceFormat> hashMap0 = new HashMap<MessageFormat, ChoiceFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("DvIN+faL/Cp*rk.#Q:", hashMap0);
      Format[] formatArray0 = new Format[6];
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatsByArgumentIndex(formatArray0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }
}
