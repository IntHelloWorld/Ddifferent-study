/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 07:05:43 GMT 2020
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
import org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeUnpairedSurrogateRemover0;
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) unicodeUnpairedSurrogateRemover0;
      CharSequenceTranslator charSequenceTranslator0 = unicodeUnpairedSurrogateRemover0.with(charSequenceTranslatorArray0);
      char[] charArray0 = new char[5];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = charSequenceTranslator0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) numericEntityEscaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(3507);
      String string0 = aggregateTranslator0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = charSequenceTranslatorArray0[0].translate((CharSequence) string0, 3507, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(97, 97);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) stringBuffer0, 1025, (Writer) stringWriter0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between((-1452), (-1452));
      StringWriter stringWriter0 = new StringWriter(65);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) null, (-53), (Writer) stringWriter0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "0");
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeUnpairedSurrogateRemover0.translate((CharSequence) charBuffer0, (-3224), (Writer) stringWriter0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(3519);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[2];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonRequired;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      StringWriter stringWriter0 = new StringWriter(120);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) null);
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(48, 1251);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "FFFFF498", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[1];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) null, (Writer) null);
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(2, 2);
      String string0 = unicodeEscaper0.translate((CharSequence) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(0, 0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[1];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(255);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0, 0, 0);
      String string0 = charSequenceTranslator0.translate((CharSequence) charBuffer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(2005, 2005);
      String string0 = CharSequenceTranslator.hex((-1306));
      String string1 = numericEntityEscaper0.translate((CharSequence) string0);
  }
}