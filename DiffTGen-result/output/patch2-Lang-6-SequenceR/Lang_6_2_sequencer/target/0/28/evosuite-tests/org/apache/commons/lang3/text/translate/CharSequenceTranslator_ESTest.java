/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:16:21 GMT 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.LookupTranslator;
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
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = unicodeEscaper0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[6];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonOptional;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTIONArray0[0];
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTIONArray0[0];
      numericEntityUnescaper_OPTIONArray0[3] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[4] = numericEntityUnescaper_OPTIONArray0[0];
      numericEntityUnescaper_OPTIONArray0[5] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      // Undeclared exception!
      try { 
        numericEntityUnescaper0.with((CharSequenceTranslator[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter(1464);
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) "", 0, (Writer) stringWriter0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-1139), 0);
      StringWriter stringWriter0 = new StringWriter(4095);
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
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[2];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "FFFFFE96");
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityUnescaper0.translate((CharSequence) charBuffer0, (-362), (Writer) stringWriter0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "0");
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) charBuffer0);
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      unicodeEscaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(0);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "0", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LookupTranslator lookupTranslator0 = new LookupTranslator((CharSequence[][]) null);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      CharSequenceTranslator charSequenceTranslator0 = lookupTranslator0.with(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        charSequenceTranslator0.translate((CharSequence) "1", (Writer) stringWriter0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below((-685));
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LookupTranslator lookupTranslator0 = new LookupTranslator((CharSequence[][]) null);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      CharSequenceTranslator charSequenceTranslator0 = lookupTranslator0.with(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter(117);
      CharBuffer charBuffer0 = CharBuffer.allocate(117);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) charBuffer0);
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      // Undeclared exception!
      try { 
        charSequenceTranslator0.translate((CharSequence) stringBuffer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      StringWriter stringWriter0 = new StringWriter();
      unicodeUnpairedSurrogateRemover0.translate((CharSequence) null, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(1772);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) "6EC", (Writer) null);
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      String string0 = unicodeUnpairedSurrogateRemover0.translate((CharSequence) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LookupTranslator lookupTranslator0 = new LookupTranslator((CharSequence[][]) null);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      CharSequenceTranslator charSequenceTranslator0 = lookupTranslator0.with(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter(117);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = charSequenceTranslator0.translate((CharSequence) stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(1);
  }
}
