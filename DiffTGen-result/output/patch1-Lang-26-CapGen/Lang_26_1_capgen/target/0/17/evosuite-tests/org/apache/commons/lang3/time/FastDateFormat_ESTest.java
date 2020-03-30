/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 05:46:27 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.text.AttributedCharacterIterator;
import java.text.ChoiceFormat;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      FastDateFormat fastDateFormat0 = new FastDateFormat("9<f)SuAIPT~]l<17}", (TimeZone) null, locale0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      int[] intArray0 = new int[2];
      String string0 = fastDateFormat0.parseToken("Thursday, January 1, 1970", intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = new Locale("[", "org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, locale0);
      boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Locale locale0 = Locale.ITALY;
      String string0 = FastDateFormat.getTimeZoneDisplay(simpleTimeZone0, true, 0, locale0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, (TimeZone) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      String string0 = fastDateFormat0.getPattern();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", (TimeZone) null, locale0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("8#", timeZone0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      int int0 = fastDateFormat0.getMaxLengthEstimate();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2286), "t_4.v@ZcUM");
      Locale locale0 = Locale.GERMAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, (TimeZone) simpleTimeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("<null>");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
      MockDate mockDate0 = new MockDate(852, 1, 0, 2, 0);
      String string0 = fastDateFormat0.format((Date) mockDate0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 1, 0);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      Locale locale0 = Locale.forLanguageTag("Uy278kF7-st9^:");
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      StringBuffer stringBuffer0 = new StringBuffer("Uy278kF7-st9^:");
      StringBuffer stringBuffer1 = fastDateFormat0.applyRules(calendar0, stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      // Undeclared exception!
      try { 
        fastDateFormat0.parseObject("cMS|DXS}P]qLVF", (ParsePosition) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("");
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeZoneDisplay((TimeZone) null, true, 45, locale0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = new Locale("[", "org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField");
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-927), "org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField", 0, 0, 2771, 1, 0, 0, 0, 1, 48);
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeZoneDisplay(simpleTimeZone0, false, (-739), locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal style: -739
         //
         verifyException("java.util.TimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(Integer.MIN_VALUE, "b%(&1`^43$HA");
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(Integer.MIN_VALUE, (TimeZone) simpleTimeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -2147483648
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(45);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 45
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(3084, 3084, (TimeZone) null, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 3084
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.apache.commons.lang3.time.FastDateFormat$CharacterLiteral");
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(10, 0, timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 10
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(2757, 2757);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 2757
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance((-2952), locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -2952
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(1045);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 1045
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("7(|w'](q", locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Calendar) mockGregorianCalendar0, (StringBuffer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat$StringLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((-1777L), (StringBuffer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      String string0 = fastDateFormat0.format(1904L);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      int int0 = fastDateFormat0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.UK;
      String[] stringArray0 = Locale.getISOLanguages();
      Locale.setDefault(locale0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      String string0 = fastDateFormat0.format(0L);
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone(3, "_qW", (-31), 2309, 4, 0, 0, 1025, 0, 0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal start month -31
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = 0;
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = null;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0, (Locale) null);
      fastDateFormat0.init();
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(0, timeZone0, (Locale) null);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(14, 0, (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 14
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, (Locale) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) null, locale0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("=8?U RfpIHL)zEE?[");
      ZoneInfo zoneInfo0 = (ZoneInfo)timeZone0.clone();
      Instant instant0 = MockInstant.ofEpochSecond((long) 1);
      Date date0 = Date.from(instant0);
      boolean boolean0 = timeZone0.inDaylightTime(date0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, timeZone0);
      String string0 = fastDateFormat0.getPattern();
      String string1 = fastDateFormat0.toString();
      ChoiceFormat choiceFormat0 = new ChoiceFormat("FastDateFormat[MMMM d, yyyy h:mm:ss a z]");
      StringBuffer stringBuffer0 = new StringBuffer();
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(1, 1, (TimeZone) zoneInfo0);
      Locale locale0 = Locale.US;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(1794, 2, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 1794
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale0);
      boolean boolean0 = fastDateFormat0.equals(numberFormat0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.US;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) locale0);
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.util.Locale
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Long long0 = new Long(0);
      AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, locale0);
      MockDate mockDate0 = new MockDate((-873L));
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2062, 3, 0);
      CharBuffer charBuffer0 = CharBuffer.allocate(58);
      StringBuffer stringBuffer0 = new StringBuffer(charBuffer0);
      StringBuffer stringBuffer1 = stringBuffer0.appendCodePoint(0);
      StringBuffer stringBuffer2 = fastDateFormat0.format((-337L), stringBuffer0);
      char char0 = charBuffer0.get();
      StringBuffer stringBuffer3 = fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer2);
      StringBuffer stringBuffer4 = fastDateFormat0.format((Date) mockDate0, stringBuffer3);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("r`hh{THiHk", (TimeZone) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      Locale locale1 = Locale.UK;
      TimeZone timeZone0 = TimeZone.getDefault();
      Set<Character> set0 = locale0.getExtensionKeys();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 14);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone1 = mockSimpleDateFormat0.getTimeZone();
      mockGregorianCalendar0.setTimeZone(timeZone1);
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      MockDate mockDate0 = new MockDate((-146L));
      Locale locale2 = Locale.CHINA;
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale2);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "mercoled\u00EC 14 gennaio 0001 0.00.00 GMT");
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 0);
      StringBuffer stringBuffer1 = numberFormat0.format((long) 0, stringBuffer0, fieldPosition0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(2, timeZone0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("uz?\"xs[[PWt_=D,");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("r`hh{THiHk", (TimeZone) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      DateFormatSymbols dateFormatSymbols0 = new DateFormatSymbols(locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", timeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("nRA;<~%C>(ii65]s6!k", timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("ifm^61zR56EI8_S", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("K\"\u0007_g{6_N");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("9<f)SuAIPT~]l<17}", (TimeZone) null, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(":[eq,d*", timeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(".sb0b&M");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("STESOb4", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(25, "wKN={,m%HjR)");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("wKN={,m%HjR)", (TimeZone) simpleTimeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("{EJ;%B@Lb7PyK^w");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("FastDateFormat[", (TimeZone) null, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("{/CPkJwo^W'E");
      Locale locale0 = new Locale("{/CPkJwo^W'E", "{/CPkJwo^W'E", "@W");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("{/CPkJwo^W'E", timeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("m01mB");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null, (TimeZone) null, locale0);
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(1178, (TimeZone) null, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 1178
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(7, "+AZa8");
      Locale locale0 = Locale.JAPANESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance((-1976), (TimeZone) simpleTimeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -1976
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      MockDate mockDate0 = new MockDate((-146L));
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "mercoled\u00EC 14 gennaio 0001 0.00.00 GMT");
      StringBuffer stringBuffer1 = fastDateFormat0.format((Date) mockDate0, stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("U)7");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0, locale0);
      boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(5, (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 5
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(3198, (TimeZone) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 3198
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("X35ChNJ&(VGJ:m+z", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      MockDate mockDate0 = new MockDate(3);
      String string0 = fastDateFormat0.format((Date) mockDate0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Locale locale0 = new Locale("");
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      int int1 = 661;
      MockDate mockDate0 = new MockDate(661, (-154), 17, 2, (-1456), 622);
      ParsePosition parsePosition0 = new ParsePosition(14);
      Object object0 = fastDateFormat0.parseObject("", parsePosition0);
      StringBuffer stringBuffer0 = new StringBuffer(9);
      FieldPosition fieldPosition0 = new FieldPosition((Format.Field) null, 17);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) null, stringBuffer0, fieldPosition0);
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("<null>");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
      String string0 = fastDateFormat0.toString();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      TimeZone timeZone0 = fastDateFormat0.getTimeZone();
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("<null>");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
      Locale locale0 = fastDateFormat0.getLocale();
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Date) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Locale locale0 = new Locale("N4:", "N4:", "N4:");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) null, locale0);
      String string0 = fastDateFormat0.format((-372L));
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      int int0 = 1;
      int int1 = 0;
      Locale locale0 = Locale.JAPAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 0, locale0);
      Locale locale1 = null;
      // Undeclared exception!
      try { 
        locale0.getDisplayLanguage((Locale) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 14);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
  }
}
