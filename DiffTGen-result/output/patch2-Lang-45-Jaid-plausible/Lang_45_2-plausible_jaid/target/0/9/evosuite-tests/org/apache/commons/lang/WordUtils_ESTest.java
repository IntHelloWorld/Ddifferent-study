/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:04:03 GMT 2020
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
      String string0 = WordUtils.abbreviate(" ", 0, 0, "");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 0, 0, "");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 0, 3328, "org.apache.commons.lang.SystemUtils");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WordUtils.initials((String) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = WordUtils.initials("");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully((String) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = WordUtils.capitalize((String) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WordUtils.capitalize("");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        WordUtils.abbreviate(" ", (-2521), (-2521), "org.apache.commons.lang.WordUtils");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'U';
      String string0 = WordUtils.initials("`[N]IU3", charArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = WordUtils.initials("<nY3|B:*]]fvRDgx5N9", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '.';
      String string0 = WordUtils.uncapitalize("java.home", charArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null, (char[]) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("q$N^oCrzQcNML&Trz", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '.';
      String string0 = WordUtils.capitalize("org.apache.commons.lang.WordUtils", charArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = WordUtils.capitalize((String) null, (char[]) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.wrap("llV:", (-266), (String) null, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, (-3882), (String) null, false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = WordUtils.abbreviate("Windows 9", (-4596), 0, "");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", (-1686), 1958, "");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = WordUtils.abbreviate("java.ext.dirs", 0, (-1), "");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", (-5822), 3328, "LINUX");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = WordUtils.abbreviate("222222", 0, 0, "2 2+yYR-+ 2+yYR-y 2+yYR-Y 2+yYR-R 2+yYR--");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, (-600), 0, (String) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = WordUtils.abbreviate("[e.68TGd$]T^)nOts", 1991, (-1877), ":QAEds@-F");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = WordUtils.initials("; $<F>eUF=9o{");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("SVU,nNF4@Tm]_$cT~", charArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("", charArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.initials((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = WordUtils.swapCase("org.apache.commons.lang.WordUtils");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("2 2+Yyr-+ 2+Yyr-Y 2+Yyr-y 2+Yyr-r 2+Yyr--");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("org.apache.commons.lang.WordUtils", charArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.uncapitalize("", charArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("user.timezone", charArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[6];
      String string0 = WordUtils.capitalizeFully("", charArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[2] = '^';
      String string0 = WordUtils.capitalizeFully("EnN&6TA^.2#UXvNg", charArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("w!", charArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[4];
      String string0 = WordUtils.capitalize("", charArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = WordUtils.wrap("'; The Systemutils Property Value Will Default To Null.", 2, "", false);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = WordUtils.wrap(" 2+Yyr-", 0, " 2+Yyr-", true);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = WordUtils.wrap("wMzd]4,^s\"=2X\u0004~0g`", (-1686));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = WordUtils.wrap("", (-766), "PMgs`-wS=U7%?", true);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 1002);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = WordUtils.wrap("", (-1686));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("|hbgzXGQ,");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = WordUtils.capitalize("LINUX");
  }
}
