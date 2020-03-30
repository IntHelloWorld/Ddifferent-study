/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:14:28 GMT 2020
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
import org.apache.commons.lang3.text.translate.LookupTranslator;
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
      StringWriter stringWriter0 = new StringWriter();
      int int0 = unicodeUnpairedSurrogateRemover0.translate((CharSequence) "f", 0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(552);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) "228", 0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(0);
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 0);
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
  public void test04()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(0);
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "", (-1039), (Writer) stringWriter0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[1];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(2735);
      // Undeclared exception!
      try { 
        numericEntityUnescaper0.translate((CharSequence) charBuffer0, (-2655), (Writer) null);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(0);
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[9];
      charArray0[0] = '(';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      numericEntityEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.allocate(88);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(1417);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(152, 152);
      CharBuffer charBuffer0 = CharBuffer.allocate(277);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, (-1303));
      String string0 = unicodeEscaper0.translate((CharSequence) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[2][9];
      CharSequence[] charSequenceArray1 = new CharSequence[6];
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      charSequenceArray1[0] = (CharSequence) stringBuffer0;
      charSequenceArray0[0] = charSequenceArray1;
      charSequenceArray0[1] = charSequenceArray1;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[4];
      CharSequenceTranslator charSequenceTranslator0 = lookupTranslator0.with(charSequenceTranslatorArray0);
  }
}
