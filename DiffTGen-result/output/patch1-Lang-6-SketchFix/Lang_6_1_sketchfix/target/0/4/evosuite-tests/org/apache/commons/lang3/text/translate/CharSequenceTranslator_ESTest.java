/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 10:22:55 GMT 2020
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "1");
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      int int0 = octalUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(0, 141);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(0, 141);
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
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above((-391));
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "FFFFFE79", 949, (Writer) null);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between((-34), (-34));
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, (-34), (Writer) stringWriter0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(677);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) charBuffer0, 677, (Writer) stringWriter0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(1631, 1631);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "2D6", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(1115, 1115);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "65F", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "1");
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) stringBuffer0, (Writer) stringWriter1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharSequence[] charSequenceArray0 = new CharSequence[20];
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append(',');
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      charSequenceArray0[1] = (CharSequence) stringBuffer0;
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(1387);
      String string0 = unicodeEscaper0.translate(charSequenceArray0[1]);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      octalUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "\u0000\u0000\u0000{\u0000\u0000\u0000\u0000\u0000", (Writer) null);
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above((-1168));
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      CharSequenceTranslator charSequenceTranslator0 = aggregateTranslator0.with(charSequenceTranslatorArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "FFFFFFFF");
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
  public void test15()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-1));
  }
}
