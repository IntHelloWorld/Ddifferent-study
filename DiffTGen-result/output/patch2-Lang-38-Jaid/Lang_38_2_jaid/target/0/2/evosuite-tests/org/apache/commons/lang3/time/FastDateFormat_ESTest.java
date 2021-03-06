/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 07:39:49 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
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
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ROOT;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      int[] intArray0 = new int[3];
      String string0 = fastDateFormat0.parseToken(",%c!j_4c6fv4 w)", intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      Object object0 = fastDateFormat0.parseObject("", parsePosition0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, (TimeZone) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0, (Locale) null);
      String string0 = fastDateFormat0.getPattern();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", (TimeZone) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALIAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) null, locale0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, (TimeZone) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(3, (TimeZone) simpleTimeZone0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      MockDate mockDate0 = new MockDate(0, 2, 2, 0, 0, (-465));
      StringBuffer stringBuffer0 = fastDateFormat0.format((Date) mockDate0, (StringBuffer) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.US;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      StringBuffer stringBuffer0 = new StringBuffer();
      StringBuffer stringBuffer1 = fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      StringBuffer stringBuffer0 = fastDateFormat0.applyRules(mockGregorianCalendar0, (StringBuffer) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 2, 198);
      StringBuffer stringBuffer0 = new StringBuffer(2);
      StringBuffer stringBuffer1 = fastDateFormat0.applyRules(mockGregorianCalendar0, stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("2'g8j#V>hD)!", timeZone0);
      // Undeclared exception!
      try { 
        fastDateFormat0.parseObject("+V|4l0|&V#", (ParsePosition) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "z");
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeZoneDisplay(simpleTimeZone0, false, 1, (Locale) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat$TimeZoneDisplayKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = new Locale("", "", "3v8oF");
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeZoneDisplay(timeZone0, false, (-763), locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal style: -763
         //
         verifyException("java.util.TimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(13, (TimeZone) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 13
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance((-81), locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -81
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(2894, 2894, timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 2894
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(479, 0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 479
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(575, (-821));
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -821
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance((-2209), locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -2209
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(6);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 6
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FastDateFormat fastDateFormat0 = new FastDateFormat("1={?OOWRIH8[", (TimeZone) null, locale0);
      MockDate mockDate0 = new MockDate((-1L));
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Date) mockDate0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      FastDateFormat fastDateFormat0 = new FastDateFormat("No date time pattern for locale: ", (TimeZone) null, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 2, 0, 3, 0, 2);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = new Locale("");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) null, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, 2);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, locale0);
      int int0 = fastDateFormat0.hashCode();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", 1, 1, 0, 1, 1, 1, 1, 1, 1);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, (TimeZone) simpleTimeZone0);
      int int0 = fastDateFormat0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(1308, (TimeZone) null, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 1308
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(1518, (TimeZone) null, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 1518
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, locale0);
      Instant instant0 = MockInstant.ofEpochSecond((long) 1);
      Date date0 = Date.from(instant0);
      String string0 = fastDateFormat0.format(date0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(0, timeZone0);
      boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
      MockDate mockDate0 = new MockDate(0, 2, (-3426), (-3493), 729, 0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      MockDate mockDate1 = new MockDate((-1L));
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "");
      StringBuffer stringBuffer1 = fastDateFormat1.format((-1L), stringBuffer0);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      StringBuffer stringBuffer2 = mockSimpleDateFormat0.format((Object) mockDate1, stringBuffer1, fieldPosition0);
      StringBuffer stringBuffer3 = fastDateFormat1.format((Date) mockDate0, stringBuffer2);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ROOT;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      boolean boolean0 = fastDateFormat0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) null, (StringBuffer) null, fieldPosition0);
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("4");
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) "4", (StringBuffer) null, (FieldPosition) null);
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.lang.String
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      fastDateFormat0.init();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "F8TQh[=UM@");
      Locale locale0 = Locale.CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, (TimeZone) simpleTimeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Calendar) null, stringBuffer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("tzKp8?k$J{'OH+f=n?Y", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("r", timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("H");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat$UnpaddedMonthField", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<null>", timeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("V?2^x98Ze4\":KC", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("8PZWvrI;{eX");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("No date pattern for locale: ");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "wJ0SRPM8vNC");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("wJ0SRPM8vNC", (TimeZone) simpleTimeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("yIPtRS!");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("GXU^");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("D<!/j~H:?$yM]G ", timeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "", 1, 1, 1, 0, 1, 1, 1, 1);
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("12:00:01 AM GMT+00:00", (TimeZone) simpleTimeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FastDateFormat fastDateFormat0 = null;
      try {
        fastDateFormat0 = new FastDateFormat((String) null, (TimeZone) null, (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("wKa", locale0);
      Locale locale1 = Locale.ITALIAN;
      Locale.setDefault(locale1);
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(3, 0);
      Set<String> set0 = locale1.getUnicodeLocaleKeys();
      String string0 = locale0.getDisplayLanguage();
      String string1 = locale0.getDisplayName(locale1);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "wKa");
      String string2 = locale0.getDisplayLanguage();
      FastDateFormat fastDateFormat2 = FastDateFormat.getTimeInstance(1, (TimeZone) simpleTimeZone0, locale0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("giapponese (Giappone)", (TimeZone) simpleTimeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(11, "3#mE3Q{XPl*%{fH=xo");
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(11, 11, (TimeZone) simpleTimeZone0, (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 11
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("=sTMlRT!QG4<\" ");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) null);
      boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Locale locale0 = new Locale("");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) null, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(1166, timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 1166
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Locale locale0 = Locale.ROOT;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, timeZone0, locale0);
      TimeZone timeZone1 = fastDateFormat0.getTimeZone();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 0, locale0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      StringBuffer stringBuffer0 = new StringBuffer("No date pattern for locale: ");
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Calendar) null, stringBuffer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        fastDateFormat0.parseToken("", intArray0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) null);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((long) 0, (StringBuffer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Locale locale0 = Locale.US;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, locale0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(5768, "");
      Locale locale0 = new Locale("");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", (TimeZone) simpleTimeZone0, locale0);
      String string0 = fastDateFormat0.toString();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance((-1));
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -1
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("^,", locale0);
      Locale locale1 = fastDateFormat0.getLocale();
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, locale0);
      String string0 = fastDateFormat0.getPattern();
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) null);
      String string0 = fastDateFormat0.format((long) 0);
  }
}
