/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 07:03:46 GMT 2020
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
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, (-2448));
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = numericEntityEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[3];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTIONArray0[0];
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = numericEntityUnescaper0.translate((CharSequence) stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      // Undeclared exception!
      try { 
        unicodeUnpairedSurrogateRemover0.with((CharSequenceTranslator[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[9];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonOptional;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTIONArray0[0];
      numericEntityUnescaper_OPTIONArray0[3] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[4] = numericEntityUnescaper_OPTIONArray0[3];
      numericEntityUnescaper_OPTIONArray0[5] = numericEntityUnescaper_OPTIONArray0[0];
      numericEntityUnescaper_OPTIONArray0[6] = numericEntityUnescaper_OPTIONArray0[4];
      numericEntityUnescaper_OPTIONArray0[7] = numericEntityUnescaper_OPTIONArray0[4];
      numericEntityUnescaper_OPTIONArray0[8] = numericEntityUnescaper_OPTIONArray0[1];
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      StringWriter stringWriter0 = new StringWriter(65);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        numericEntityUnescaper0.translate((CharSequence) stringBuffer0, 1336, (Writer) stringWriter0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) charBuffer0, (-1626), (Writer) stringWriter0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      CharSequence[] charSequenceArray0 = new CharSequence[6];
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charSequenceArray0[1] = (CharSequence) charBuffer0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate(charSequenceArray0[1]);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "FFFFFC00", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[0];
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityUnescaper0.translate((CharSequence) "75E", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(878);
      String string0 = unicodeEscaper0.translate((CharSequence) "36E");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[1];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonRequired;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[3];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonOptional;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTIONArray0[0];
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTIONArray0[0];
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      // Undeclared exception!
      try { 
        numericEntityUnescaper0.translate((CharSequence) "36E", (Writer) null);
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      String string0 = octalUnescaper0.translate((CharSequence) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(878, 878);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[7];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(0);
  }
}