/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 07:05:28 GMT 2020
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
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(3);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) "1BF", 0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(0);
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeEscaper0;
      CharSequenceTranslator charSequenceTranslator0 = octalUnescaper0.with(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = charSequenceTranslator0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
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
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) "0", 1, (Writer) stringWriter0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      // Undeclared exception!
      try { 
        unicodeUnpairedSurrogateRemover0.translate((CharSequence) null, 57, (Writer) null);
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
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) charBuffer0, 208, (Writer) stringWriter0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(615);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[5];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) numericEntityEscaper0;
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) numericEntityEscaper0;
      charSequenceTranslatorArray0[2] = (CharSequenceTranslator) numericEntityEscaper0;
      charSequenceTranslatorArray0[3] = (CharSequenceTranslator) numericEntityEscaper0;
      charSequenceTranslatorArray0[4] = (CharSequenceTranslator) numericEntityEscaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(2178);
      // Undeclared exception!
      aggregateTranslator0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "FFFFF66A");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(0);
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeEscaper0;
      StringWriter stringWriter0 = new StringWriter();
      charSequenceTranslatorArray0[0].translate((CharSequence) "0", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(43, (-1));
      StringWriter stringWriter0 = new StringWriter(90);
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-1808), (-1808));
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) null, (Writer) null);
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-1808), (-1808));
      String string0 = unicodeEscaper0.translate((CharSequence) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      String string0 = octalUnescaper0.translate((CharSequence) "0");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(3);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "1BF", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(447);
  }
}
