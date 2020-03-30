/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 07:01:36 GMT 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
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
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[1];
      charArray0[0] = '.';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = numericEntityEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = unicodeUnpairedSurrogateRemover0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(3908);
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
  public void test03()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(2);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "D800", 55296, (Writer) stringWriter0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) null, 0, (Writer) stringWriter0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      try { 
        unicodeUnpairedSurrogateRemover0.translate((CharSequence) charBuffer0, (-676), (Writer) stringWriter0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(543);
      CharBuffer charBuffer0 = CharBuffer.allocate(572);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      CharBuffer charBuffer2 = charBuffer0.put('t');
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer1);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter(0);
      unicodeUnescaper0.translate((CharSequence) "64F", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      CharBuffer charBuffer0 = CharBuffer.allocate(2952);
      String string0 = unicodeUnpairedSurrogateRemover0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      unicodeUnpairedSurrogateRemover0.translate((CharSequence) string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[3];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonRequired;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) null);
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[3];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonRequired;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      String string0 = numericEntityUnescaper0.translate((CharSequence) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf((-21), (-21));
      String string0 = numericEntityEscaper0.translate((CharSequence) "FFFFFFEB");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[3];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonRequired;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[9];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityUnescaper0.with(charSequenceTranslatorArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(2);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "D800", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(55296);
  }
}