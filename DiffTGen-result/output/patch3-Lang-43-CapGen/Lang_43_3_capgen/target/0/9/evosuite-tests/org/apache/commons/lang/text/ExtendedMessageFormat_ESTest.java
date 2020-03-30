/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 04:47:10 GMT 2020
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
      Locale locale0 = Locale.forLanguageTag("{)Jp']/!3SlRnq`bw");
      HashMap<NumberFormat, MockSimpleDateFormat> hashMap0 = new HashMap<NumberFormat, MockSimpleDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("{)Jp']/!3SlRnq`bw", locale0, hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 1: )
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      HashMap<DecimalFormat, ChoiceFormat> hashMap0 = new HashMap<DecimalFormat, ChoiceFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("G[=8&", locale0, hashMap0);
      extendedMessageFormat0.applyPattern("");
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, MockDateFormat> hashMap0 = new HashMap<String, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("Unterminated format element at position ", (Locale) null, hashMap0);
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
  public void test04()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("G.VN{lEy+ctF", (Map) null);
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      HashMap<MockSimpleDateFormat, DecimalFormat> hashMap0 = new HashMap<MockSimpleDateFormat, DecimalFormat>();
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
      Locale locale0 = Locale.KOREAN;
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("Mjp;ud{4gG ,X", locale0, (Map) null);
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      HashMap<MockSimpleDateFormat, DecimalFormat> hashMap0 = new HashMap<MockSimpleDateFormat, DecimalFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("Mjp;ud{4gG ,X", locale0, hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 7: 4g
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, NumberFormat> hashMap0 = new HashMap<String, NumberFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("*1g/rv-Pj8eK{", (Locale) null, hashMap0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.apache.commons.lang.text.StrMatcher$CharSetMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
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
  public void test10()  throws Throwable  {
      Locale locale0 = new Locale("");
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("N{;r;Qu|c|4", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("{ItT+");
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      HashMap<ChoiceFormat, Object> hashMap0 = new HashMap<ChoiceFormat, Object>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("oiHLXZTiJ]7,f'AJ|", locale0, hashMap0);
      extendedMessageFormat0.applyPattern("oiHLXZTiJ]7,f'AJ|");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("3");
      extendedMessageFormat0.applyPattern("org.apache.commons.lang.text.StrMatcher$CharMatcher");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("8jV]Ao`kn", locale0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<ChronoLocalDate, NumberFormat> hashMap0 = new HashMap<ChronoLocalDate, NumberFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("o?1x7Ix%AnE={6", hashMap0);
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 13
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("^('qhDiFr^@zUo");
      Format[] formatArray0 = new Format[1];
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
      HashMap<Object, ChoiceFormat> hashMap0 = new HashMap<Object, ChoiceFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("5i/ p", hashMap0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("^('qhDiFr^@zUo");
      String string0 = extendedMessageFormat0.toPattern();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("3");
      DateFormat dateFormat0 = DateFormat.getInstance();
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
  public void test21()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("");
      Locale locale0 = Locale.US;
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatByArgumentIndex((-1472), numberFormat0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("''");
      HashMap<ChoiceFormat, Integer> hashMap0 = new HashMap<ChoiceFormat, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("''", locale0, hashMap0);
      Format[] formatArray0 = new Format[0];
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