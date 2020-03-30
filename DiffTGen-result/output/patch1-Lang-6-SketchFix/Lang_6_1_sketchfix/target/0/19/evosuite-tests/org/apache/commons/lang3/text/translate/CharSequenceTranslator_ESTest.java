/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 10:26:12 GMT 2020
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
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "4C2");
      StringWriter stringWriter0 = new StringWriter();
      int int0 = octalUnescaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = octalUnescaper0.translate((CharSequence) stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.with((CharSequenceTranslator[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(49);
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      CharBuffer charBuffer2 = charBuffer0.put('3');
      StringWriter stringWriter0 = new StringWriter(49);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer1, (Writer) stringWriter0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "1", (-603), (Writer) stringWriter0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeUnpairedSurrogateRemover0.translate((CharSequence) null, 84, (Writer) stringWriter0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "4C2");
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) charBuffer0, (-354), (Writer) stringWriter0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(49);
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(49);
      unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "1", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(49);
      char[] charArray0 = new char[9];
      charArray0[0] = ':';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      StringWriter stringWriter0 = new StringWriter();
      unicodeUnpairedSurrogateRemover0.translate((CharSequence) null, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[8];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTIONArray0[1];
      numericEntityUnescaper_OPTIONArray0[3] = numericEntityUnescaper_OPTIONArray0[0];
      numericEntityUnescaper_OPTIONArray0[4] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[5] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[6] = numericEntityUnescaper_OPTIONArray0[2];
      numericEntityUnescaper_OPTIONArray0[7] = numericEntityUnescaper_OPTIONArray0[0];
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        numericEntityUnescaper0.translate((CharSequence) charBuffer0, (Writer) null);
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-895), (-895));
      String string0 = unicodeEscaper0.translate((CharSequence) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[5];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "0");
      // Undeclared exception!
      try { 
        charSequenceTranslator0.translate((CharSequence) charBuffer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      StringWriter stringWriter0 = new StringWriter(687);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "7AF", (Writer) stringWriter0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(1967);
  }
}