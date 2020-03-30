/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:02:11 GMT 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WordUtils_ESTest extends WordUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", 0, (-2179), "&rv $<lyG.kIm2S!s");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 0, 0, "<awS~3&{+nx");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WordUtils.wrap("", 0, "", false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = WordUtils.initials("");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = WordUtils.capitalize((String) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = WordUtils.capitalize("p");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WordUtils.initials(">", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[2];
      String string0 = WordUtils.initials((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[1] = '9';
      String string0 = WordUtils.uncapitalize("wINDOWS 9", charArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[2];
      String string0 = WordUtils.capitalizeFully((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '/';
      String string0 = WordUtils.capitalize("af1v1.F<{5/ur<7C", charArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = WordUtils.capitalize("", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = WordUtils.wrap("M+GQ 4jV7A%@F6+SsZs", 0, "M+GQ\n4jV7A%@F6+SsZs", false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = WordUtils.wrap("k)z/qjGEV>ZaX", 1620, (String) null, false);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" Y+>c9&7\"95ym~G8", 0, 400, "");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = WordUtils.abbreviate("CJ*DK\u0007.i#lPxmD#", 0, 2, " ");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = WordUtils.abbreviate("Windows 9", 0, 0, "<wxU");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.abbreviate("d,`aSUAVd}S*35V*5^J", 694, 32, (String) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = WordUtils.abbreviate("[;:E {oh\"}ZQDu[~Y", 2022, (-1), "");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", (-1333), 3, (String) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        WordUtils.abbreviate("S#},", (-351), (-351), "S#},");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, (-1193), 555, (String) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[1] = '9';
      String string0 = WordUtils.initials("Windows 9", charArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("1.2", charArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.initials("", charArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = WordUtils.initials((String) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = WordUtils.swapCase("org.apache.commons.lang.WordUtils");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("org.apache.commons.lang.WordUtils", charArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.uncapitalize((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("^{R1?", charArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully((String) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = '2';
      String string0 = WordUtils.capitalizeFully("X=2L)z~>)6`Lu#68", charArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("org.apache.commons.lang.WordUtils", charArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.capitalize((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = WordUtils.wrap("M+GQ 4jV7A%@F6+SsZs", 0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = WordUtils.wrap("&rv $<lyG.kIm2S!s", 0, "user.name", true);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = WordUtils.wrap(" /MRB", (-899));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 2022, "iHE<i3_J{0Rih-D<C", false);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("Windows 9");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = WordUtils.wrap("", 4);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = WordUtils.initials("<wxU");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("r%\"XO,m");
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = WordUtils.capitalize("");
  }
}