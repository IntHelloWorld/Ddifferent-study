/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 08:40:37 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1);
      int[] intArray0 = new int[2];
      String string0 = fastDateFormat0.parseToken("/?35y,", intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1);
      ParsePosition parsePosition0 = new ParsePosition((-3083));
      Object object0 = fastDateFormat0.parseObject("", parsePosition0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      String string0 = fastDateFormat0.getPattern();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1), "");
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", (TimeZone) simpleTimeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2906), "The pattern must not be null");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", (TimeZone) simpleTimeZone0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = new Locale("", "L.[-#");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("_-'KcC<&{", locale0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 931, (-1), 1);
      StringBuffer stringBuffer0 = new StringBuffer(931);
      StringBuffer stringBuffer1 = fastDateFormat0.applyRules(mockGregorianCalendar0, stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        fastDateFormat0.parseToken("", intArray0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        fastDateFormat0.parseToken("", intArray0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = new Locale("DdgCU2'{}DnGh", "DdgCU2'{}DnGh");
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeZoneDisplay((TimeZone) null, true, (-2275), locale0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeZoneDisplay(timeZone0, true, 3355, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal style: 3355
         //
         verifyException("java.util.TimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(469, "");
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance((-218), (TimeZone) simpleTimeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -218
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(251, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 251
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(1119);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 1119
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(13, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 13
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(1422);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 1422
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINESE;
      FastDateFormat fastDateFormat0 = new FastDateFormat("Negative values should not be possible", timeZone0, locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format(1L);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, locale0);
      int int0 = fastDateFormat0.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      int int0 = fastDateFormat0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 90, 0, (-4994), 90, 2);
      StringBuffer stringBuffer0 = new StringBuffer("uBAg8R#wIXP+Lga");
      StringBuffer stringBuffer1 = fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("]");
      String string0 = null;
      int[] intArray0 = new int[5];
      intArray0[0] = 2;
      intArray0[1] = 1;
      intArray0[2] = 1;
      Locale locale0 = null;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(0, (-209), (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -209
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-111), "e f:`");
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance((-111), (-111), (TimeZone) simpleTimeZone0, (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -111
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(11, (TimeZone) null, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 11
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(31, timeZone0, (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 31
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      String string0 = fastDateFormat0.format(date0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = null;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, (Locale) null);
      TimeZone.setDefault(timeZone0);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(305, 2);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 305
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 1, timeZone0, locale0);
      Calendar calendar0 = mockSimpleDateFormat0.getCalendar();
      String string0 = fastDateFormat0.format(calendar0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1);
      String string0 = fastDateFormat0.format(1489L);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 1551, 1, 2);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) null);
      boolean boolean0 = fastDateFormat0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1);
      StringBuffer stringBuffer0 = new StringBuffer();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 0);
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
  public void test33()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      ZoneOffset zoneOffset1 = ZoneOffset.UTC;
      int int0 = zoneOffset0.compareTo(zoneOffset1);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(2, timeZone0);
      String string0 = zoneOffset1.toString();
      int int1 = (-4360);
      ZoneRules zoneRules0 = zoneOffset1.getRules();
      ZoneId zoneId0 = ZoneId.systemDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(64800, (-2878), 0, (-4360), 0);
      AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("\",xC");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("vi", timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(60, "org.apache.commons.lang3.time.FastDateFormat$UnpaddedMonthField");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat$UnpaddedMonthField", (TimeZone) simpleTimeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("+:jh|V F;Pwct!/|<", timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.JAPAN;
      FastDateFormat fastDateFormat0 = new FastDateFormat("i!r)", timeZone0, locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.init();
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("_ZZMb9VqN[{=_", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("{(44&UHaJz_MoG9", locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "yRNvGt2KZ;Q2.");
      Locale locale0 = new Locale("yRNvGt2KZ;Q2.", "");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("yRNvGt2KZ;Q2.", (TimeZone) simpleTimeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("mP`X'skp-|%x", (Locale) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("OEIVb{", timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("`/(`NlsL");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Ln}+?t)UgrC");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("February 14, 2014", timeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "2CRk-X?iR]8zi-#j.");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("2CRk-X?iR]8zi-#j.", (TimeZone) simpleTimeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("B(", timeZone0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null, timeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedHashSet<Locale> linkedHashSet0 = new LinkedHashSet<Locale>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedHashSet0, locale_FilteringMode0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      fastDateFormat0.init();
      String string0 = locale0.toLanguageTag();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(4, "0YGDL|(*:$$=");
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(1, (TimeZone) simpleTimeZone0, locale0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("0YGDL|(*:$$=", (TimeZone) simpleTimeZone0, locale0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(60000, 60000, (TimeZone) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 60000
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("0_ag>FSm2=bt>Qz");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, locale0);
      boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", (TimeZone) null);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance((-1825), (TimeZone) null);
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -1825
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      TimeZone timeZone0 = fastDateFormat0.getTimeZone();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      StringBuffer stringBuffer0 = new StringBuffer(1);
      StringBuffer stringBuffer1 = fastDateFormat0.format((-4507L), stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1);
      String string0 = fastDateFormat0.toString();
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      // Undeclared exception!
      try { 
        fastDateFormat0.parseObject("org.apache.commons.lang3.time.FastDateFormat$TwoDigitYearField", (ParsePosition) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      String string0 = fastDateFormat0.getPattern();
  }
}
