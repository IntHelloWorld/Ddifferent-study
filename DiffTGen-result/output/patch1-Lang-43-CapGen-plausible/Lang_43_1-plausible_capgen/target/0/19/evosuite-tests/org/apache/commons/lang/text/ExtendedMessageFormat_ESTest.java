/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 17:41:44 GMT 2020
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Locale;
import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExtendedMessageFormat_ESTest extends ExtendedMessageFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.US;
      HashMap<ChoiceFormat, ChoiceFormat> hashMap0 = new HashMap<ChoiceFormat, ChoiceFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("zj /={%", locale0, hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 6: %
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<MockDateFormat, Integer> hashMap0 = new HashMap<MockDateFormat, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", hashMap0);
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
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
  public void test03()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("{wi#G4mz:1x'>{T%(g", hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 1: w
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
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
      Locale locale0 = Locale.GERMANY;
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
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("-}8z@c^6:HL.L+{YmOO", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("b;W^W%{/3");
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("''", hashMap0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.US;
      HashMap<MessageFormat, Integer> hashMap0 = new HashMap<MessageFormat, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("org.apache.commons.lang.text.StrMatcher$NoMatcher", locale0, hashMap0);
      extendedMessageFormat0.applyPattern("org.apache.commons.lang.text.StrMatcher$NoMatcher");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("XR9+|1L|:p<r\"K<B", locale0);
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
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("0sN Fi~({Uo>H;*");
      HashMap<ChoiceFormat, Integer> hashMap0 = new HashMap<ChoiceFormat, Integer>();
      double[] doubleArray0 = new double[5];
      String[] stringArray0 = new String[5];
      ChoiceFormat choiceFormat0 = new ChoiceFormat(doubleArray0, stringArray0);
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0, hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatByArgumentIndex(39, choiceFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("|", locale0, hashMap0);
      Format[] formatArray0 = new Format[6];
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
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("|", locale0, hashMap0);
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("QZf&y1'#K'1c");
      DateFormat dateFormat0 = MockDateFormat.getTimeInstance();
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormat(1744, dateFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("'\"", (Locale) null, hashMap0);
      Format[] formatArray0 = new Format[4];
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
