/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 09:16:56 GMT 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(1);
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      StringWriter stringWriter0 = new StringWriter(0);
      int int0 = unicodeEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(1, (-5200));
      // Undeclared exception!
      try { 
        unicodeEscaper0.with((CharSequenceTranslator[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between((-2331), 0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "", (-2331), (Writer) stringWriter0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) null, 0, (Writer) stringWriter0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 2272);
      StringWriter stringWriter0 = new StringWriter(57);
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, 2674, (Writer) stringWriter0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '9';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(48);
      numericEntityEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[1];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonOptional;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 2, 2);
      StringWriter stringWriter0 = new StringWriter(2);
      numericEntityUnescaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(3070);
      String string0 = unicodeUnescaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      unicodeUnescaper0.translate((CharSequence) string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above((-709));
      StringWriter stringWriter0 = new StringWriter(676);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = unicodeEscaper0.translate((CharSequence) stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      String string0 = unicodeEscaper0.translate((CharSequence) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[8];
      charSequenceTranslatorArray0[4] = (CharSequenceTranslator) unicodeUnpairedSurrogateRemover0;
      CharSequenceTranslator charSequenceTranslator0 = charSequenceTranslatorArray0[4].with(charSequenceTranslatorArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(55296);
  }
}