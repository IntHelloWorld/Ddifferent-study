/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 04:45:37 GMT 2020
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
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
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
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("~q{~S]`rhGlreA?s", hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 3: ~
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("");
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
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
      HashMap<MockSimpleDateFormat, ChronoLocalDate> hashMap0 = new HashMap<MockSimpleDateFormat, ChronoLocalDate>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("WyA{un_0o", hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 4: u
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<MessageFormat, ChoiceFormat> hashMap0 = new HashMap<MessageFormat, ChoiceFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("Ri:VM7730Tw{", hashMap0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("org.apache.commons.lang.text.StrMatcher$CharSetMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      HashMap<MessageFormat, MockDateFormat> hashMap0 = new HashMap<MessageFormat, MockDateFormat>();
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
  public void test06()  throws Throwable  {
      Locale locale0 = new Locale("l=0Dd@,E%", "[y1\"EIo4K9 {0=,m1)");
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("[y1\"EIo4K9 {0=,m1)", locale0, (Map) null);
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, DecimalFormat> hashMap0 = new HashMap<String, DecimalFormat>();
      Locale locale0 = Locale.US;
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("lE3spm+.HXi{", locale0, hashMap0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("org.apache.commons.lang.text.StrMatcher$CharSetMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
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
      Locale locale0 = Locale.TAIWAN;
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("{6W", locale0);
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
        extendedMessageFormat0 = new ExtendedMessageFormat("Lhas{U");
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(" IdX7M1I)!=2Bd(w");
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
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("w![I5f%;?{%Z", locale0, hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 10: %
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<MockSimpleDateFormat, Object> hashMap0 = new HashMap<MockSimpleDateFormat, Object>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("EQ-7'qfhtygb2", hashMap0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("1#");
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("1#", locale0, hashMap0);
      DateFormat dateFormat0 = DateFormat.getDateInstance();
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatByArgumentIndex(0, dateFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("w;`z");
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
      Locale locale0 = Locale.CHINESE;
      HashMap<MockDateFormat, MockDateFormat> hashMap0 = new HashMap<MockDateFormat, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("!g6i\"D", locale0, hashMap0);
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      HashMap<MockDateFormat, MockDateFormat> hashMap0 = new HashMap<MockDateFormat, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("!g6i\"D", locale0, hashMap0);
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormat(0, dateFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<MockDateFormat, DecimalFormat> hashMap0 = new HashMap<MockDateFormat, DecimalFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("!", (Locale) null, hashMap0);
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

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<MessageFormat, Integer> hashMap0 = new HashMap<MessageFormat, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("g_R-0T", hashMap0);
      extendedMessageFormat0.applyPattern("(oyw5x'5\\6ZV':.");
  }
}
