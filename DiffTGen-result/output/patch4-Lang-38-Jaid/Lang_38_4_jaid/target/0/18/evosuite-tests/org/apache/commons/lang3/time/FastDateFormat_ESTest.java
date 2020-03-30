/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 08:44:23 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 3, 0, 452, 0, 1);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      StringBuffer stringBuffer0 = new StringBuffer("Negative values should not be possible");
      StringBuffer stringBuffer1 = fastDateFormat0.format(date0, stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      Calendar calendar0 = mockSimpleDateFormat0.getCalendar();
      DecimalFormat decimalFormat0 = new DecimalFormat();
      StringBuffer stringBuffer0 = new StringBuffer("");
      FieldPosition fieldPosition0 = new FieldPosition(1);
      fieldPosition0.setBeginIndex(0);
      StringBuffer stringBuffer1 = decimalFormat0.format((long) 3, stringBuffer0, fieldPosition0);
      StringBuffer stringBuffer2 = fastDateFormat0.format(calendar0, stringBuffer1);
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(3526);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 3526
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, (TimeZone) null, locale0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0, locale0);
      String string0 = fastDateFormat0.getPattern();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      int int0 = fastDateFormat0.getMaxLengthEstimate();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", (TimeZone) null, locale0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("]");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance(";}", timeZone0, (Locale) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("m.");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      StringBuffer stringBuffer0 = fastDateFormat0.applyRules(calendar0, (StringBuffer) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        fastDateFormat0.parseToken("", intArray0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "7V,6hH1x@yj");
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = new FastDateFormat("7V,6hH1x@yj", simpleTimeZone0, locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.parseObject("", (ParsePosition) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeZoneDisplay(simpleTimeZone0, true, 3, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal style: 3
         //
         verifyException("java.util.TimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(2429, timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 2429
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance((-1423), locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -1423
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(2398, 2398, timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 2398
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(0, (-1090), locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -1090
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance((-427), (-427));
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -427
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance((-1447), timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -1447
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(2560, (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 2560
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "C;UjwIV0fybp");
      Locale locale0 = Locale.ENGLISH;
      FastDateFormat fastDateFormat0 = new FastDateFormat("8fu8peL%F`vNx$R;", simpleTimeZone0, locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        fastDateFormat0.format(date0, stringBuffer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1);
      // Undeclared exception!
      try { 
        fastDateFormat0.format(854L, (StringBuffer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("[");
      Locale locale0 = Locale.PRC;
      FastDateFormat fastDateFormat0 = new FastDateFormat("[", timeZone0, locale0);
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      StringBuffer stringBuffer0 = new StringBuffer(0);
      // Undeclared exception!
      try { 
        fastDateFormat0.applyRules(calendar0, stringBuffer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      int int0 = fastDateFormat0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      Calendar calendar0 = mockSimpleDateFormat0.getCalendar();
      StringBuffer stringBuffer0 = new StringBuffer("");
      StringBuffer stringBuffer1 = fastDateFormat0.format(calendar0, stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(171, "");
      Locale locale0 = Locale.CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(171, 171, (TimeZone) simpleTimeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 171
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(0, 591, timeZone0, (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 591
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("YcP5:jVj");
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, timeZone0, (Locale) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "64n", 0, 0, 0, 0, 162, 0, 0, (-3046));
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance((-3046), (TimeZone) simpleTimeZone0, (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -3046
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "VWxh}$w ,bG");
      Locale locale0 = Locale.CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(2, (TimeZone) simpleTimeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) null, locale0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      StringBuffer stringBuffer0 = new StringBuffer(":Mg");
      StringBuffer stringBuffer1 = fastDateFormat0.format(0L, stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = "";
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateFormatSymbols dateFormatSymbols0 = new DateFormatSymbols(locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0, locale0);
      Locale locale1 = fastDateFormat0.getLocale();
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(2, 2, timeZone0);
      MockDate mockDate0 = null;
      try {
        mockDate0 = new MockDate("");
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Date", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      MockDate mockDate0 = new MockDate();
      String string0 = fastDateFormat0.format((Date) mockDate0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Long long0 = new Long(1L);
      boolean boolean0 = fastDateFormat0.equals(long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) null);
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      StringBuffer stringBuffer0 = new StringBuffer();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 1);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) fastDateFormat0, stringBuffer0, fieldPosition0);
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: org.apache.commons.lang3.time.FastDateFormat
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      String string0 = fastDateFormat0.format((Object) mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, locale0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(2);
      String string0 = fastDateFormat0.format((-438L));
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockDate mockDate0 = new MockDate(0L);
      StringBuffer stringBuffer0 = new StringBuffer();
      StringBuffer stringBuffer1 = fastDateFormat0.format((Date) mockDate0, stringBuffer0);
      StringBuffer stringBuffer2 = fastDateFormat1.applyRules(mockGregorianCalendar0, stringBuffer1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("`xP#E3?F", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("sW6vu?.G");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("6uQ\"UTVYkhI 2*61", (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("pi`]", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<null>", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("]y/{/5jGWo");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("ewn0 F.N+,]3pWa.RT", (TimeZone) null, (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("{c,TdU0Y}pm.~S]D", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("&?Z;]X4KY=Bb&8", timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("V", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("^TQi<4t'");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("RO^^,*,-E*m");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Q`4b1$pgh");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("3E@O=A*=G", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Negative values should not be possible");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Locale locale0 = new Locale("<null>", "y||KXzncJUQx#, %b", "y||KXzncJUQx#, %b");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("y||KXzncJUQx#, %b", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("0I9\"vy");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("%,GFbl<GazRL+", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("AuH");
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy]", timeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null, (TimeZone) null);
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(10, (TimeZone) null, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 10
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat2 = FastDateFormat.getTimeInstance(2, timeZone0);
      String string0 = fastDateFormat0.format(0L);
      fastDateFormat0.init();
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance((-875));
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -875
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
      int int0 = fastDateFormat0.hashCode();
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "(Gh*]nnN:xu!8TKxlF", 0, 0, 1110, 0, (-1366), 0, 1110, 0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) simpleTimeZone0);
      Locale locale0 = Locale.JAPAN;
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) simpleTimeZone0, locale0);
      String string0 = fastDateFormat0.format(calendar0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", (Locale) null);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, (Locale) null);
      TimeZone timeZone0 = fastDateFormat0.getTimeZone();
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Long long0 = new Long(0L);
      StringBuffer stringBuffer0 = new StringBuffer(":Mg");
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, (-741));
      StringBuffer stringBuffer1 = fastDateFormat0.format((Object) long0, stringBuffer0, fieldPosition0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      String string0 = fastDateFormat0.toString();
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      String string0 = fastDateFormat0.getPattern();
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "yT2`Zo@KN9e7");
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(0, (TimeZone) simpleTimeZone0);
      String string0 = fastDateFormat0.format(0L);
      ParsePosition parsePosition0 = new ParsePosition((-2106));
      Object object0 = fastDateFormat0.parseObject("", parsePosition0);
      FastDateFormat fastDateFormat2 = FastDateFormat.getDateTimeInstance(3, 0, (TimeZone) simpleTimeZone0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, locale0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("kH,<W_{*izJ8B");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }
}
