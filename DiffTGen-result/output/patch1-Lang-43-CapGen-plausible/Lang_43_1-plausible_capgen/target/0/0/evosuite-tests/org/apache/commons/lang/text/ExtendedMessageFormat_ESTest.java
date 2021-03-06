/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 17:38:30 GMT 2020
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.MessageFormat;
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
      Locale locale0 = Locale.GERMANY;
      HashMap<Object, MessageFormat> hashMap0 = new HashMap<Object, MessageFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("c{'VS5YaC[)Ag", locale0, hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 2: '
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0);
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<DecimalFormat, DecimalFormat> hashMap0 = new HashMap<DecimalFormat, DecimalFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", hashMap0);
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
        extendedMessageFormat0 = new ExtendedMessageFormat("~l{oF^sx(", (Map) null);
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<MessageFormat, Integer> hashMap0 = new HashMap<MessageFormat, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("#@#.[C<JCa6%{T=OT'", hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 13: T
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("<U,ltFxlfQge[R{", hashMap0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.apache.commons.lang.text.StrMatcher$CharSetMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat((String) null, (Locale) null, hashMap0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat((String) null, (Locale) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("gA}{PoU|JHU;N@", locale0);
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
        extendedMessageFormat0 = new ExtendedMessageFormat("k_Cl{jS|Ag?6fS1b");
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("+|A,1tFi9k6X`L", hashMap0);
      extendedMessageFormat0.applyPattern("+|A,1tFi9k6X`L");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", (Map) null);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("hjk~!{f>y}");
      } catch(IllegalArgumentException e) {
         //
         // can't parse argument number: f>y
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      HashMap<ChoiceFormat, MockDateFormat> hashMap0 = new HashMap<ChoiceFormat, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("AY>g'C7{ji!^", locale0, hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 9: j
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(",TE 0K10y;RH;:G");
      Format[] formatArray0 = new Format[0];
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
  public void test16()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("AY>g'C7{ji!^");
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("'\"", hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormat(1416, extendedMessageFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("Unterminated format element at position ", locale0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatByArgumentIndex(606, extendedMessageFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<ChoiceFormat, Object> hashMap0 = new HashMap<ChoiceFormat, Object>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("H?#~", (Locale) null, hashMap0);
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

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<MockDateFormat, Integer> hashMap0 = new HashMap<MockDateFormat, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("qQC", hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("s_6{q");
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 4: q
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }
}
