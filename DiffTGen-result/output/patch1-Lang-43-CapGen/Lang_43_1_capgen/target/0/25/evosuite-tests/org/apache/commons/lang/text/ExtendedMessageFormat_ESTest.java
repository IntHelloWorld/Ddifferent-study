/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 04:43:51 GMT 2020
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.MessageFormat;
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
      Locale locale0 = Locale.ITALY;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0, (Map) null);
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      HashMap<ChoiceFormat, MockDateFormat> hashMap0 = new HashMap<ChoiceFormat, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(" \t\n\r\f", locale0, hashMap0);
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
  public void test02()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("\"i~z<2um!EG");
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("ECZ7{k6 )9 un`b!gu");
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
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
  public void test04()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("b;{NP^nK!Cw", (Map) null);
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, DecimalFormat> hashMap0 = new HashMap<String, DecimalFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("WtI\"*{o5w", hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 6: o
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
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
      Locale locale0 = Locale.GERMANY;
      HashMap<ChoiceFormat, NumberFormat> hashMap0 = new HashMap<ChoiceFormat, NumberFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("f5'^3C&pH{@D/D~eQ/", locale0, hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 10: @
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.US;
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
  public void test09()  throws Throwable  {
      Locale locale0 = new Locale("");
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("gj^{.z]3Hw(y!P", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("H%.ApiDeGvN{IHE");
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = new Locale(",KA'&", ",KA'&", ",KA'&");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(",KA'&", locale0, hashMap0);
      extendedMessageFormat0.applyPattern(",KA'&");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<DecimalFormat, MessageFormat> hashMap0 = new HashMap<DecimalFormat, MessageFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("\"i~z<2um!EG", hashMap0);
      extendedMessageFormat0.applyPattern("");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0);
      extendedMessageFormat0.applyPattern("`^buqhifY(!Z");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<MockDateFormat, String> hashMap0 = new HashMap<MockDateFormat, String>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("Invalid format argument index at position ", hashMap0);
      Locale locale0 = Locale.TAIWAN;
      DateFormat dateFormat0 = DateFormat.getDateTimeInstance(0, 0, locale0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatByArgumentIndex((-2068), dateFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      HashMap<Locale, MessageFormat> hashMap0 = new HashMap<Locale, MessageFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("''", locale0, hashMap0);
      Format[] formatArray0 = new Format[3];
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
  public void test17()  throws Throwable  {
      HashMap<MockDateFormat, String> hashMap0 = new HashMap<MockDateFormat, String>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("Invalid format argument index at position ", hashMap0);
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("5t6Z%KdkA_Ks!JP3+hh");
      DateFormat dateFormat0 = MockDateFormat.getTimeInstance();
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormat(32, dateFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("");
      Format[] formatArray0 = new Format[1];
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

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<DecimalFormat, MessageFormat> hashMap0 = new HashMap<DecimalFormat, MessageFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("\"i~z<2um!EG", hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("[KiTx/!g[{<tu>gK");
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 10: <
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }
}
