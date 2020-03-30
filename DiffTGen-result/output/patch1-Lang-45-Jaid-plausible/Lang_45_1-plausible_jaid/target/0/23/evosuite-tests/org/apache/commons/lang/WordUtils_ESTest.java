/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:47:05 GMT 2020
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
      String string0 = WordUtils.abbreviate(" ", 0, 0, "HP-UX");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 1488, 0, "");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.capitalizeFully("java.util.prefs.PreferencesFactory", charArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = WordUtils.abbreviate("O>V u4iB^g!r", 2, 2, "bW ");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WordUtils.wrap("", 1005, "", false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null);
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
      String string0 = WordUtils.capitalize("");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WordUtils.initials("|s#wf UbL1HE!X@a", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = WordUtils.initials((String) null, (char[]) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.uncapitalize("", charArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null, (char[]) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("H?RA0!(-s<d", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[1] = '-';
      String string0 = WordUtils.capitalize("!-U;{:u%7fej*(`B", charArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = WordUtils.capitalize("", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = WordUtils.wrap("Bw ", 0, "file.separator", false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = WordUtils.wrap(".X", 675, (String) null, true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 0, "", true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        WordUtils.abbreviate(" ", (-1967), (-1741), "88G");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = WordUtils.abbreviate(".X", 0, 0, (String) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.abbreviate(";yL*f)vwMiHR!F~Wzb", 4363, 4760, (String) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", (-3194), (-1), "2CAe\"RI;xs [9Y;CIE");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", 675, 0, " ");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, 2, 2682, "");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 0, 0, (String) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = WordUtils.initials("Mac OS X");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("0", charArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[8];
      String string0 = WordUtils.initials(".o34yw}R", charArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = WordUtils.initials("", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = WordUtils.swapCase("org.apache.commons.lang.WordUtils");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[3] = '}';
      String string0 = WordUtils.uncapitalize(".o34yw}R", charArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("Yx)2gS8T<v}U1", charArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("1.5");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("", charArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully((String) null, (char[]) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("4Kd>usPo2pcr8%", charArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = WordUtils.capitalize(" ");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("Rue_!Pe", charArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = WordUtils.wrap("Caught a SecurityException reading the system property '", 0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = WordUtils.wrap(";yL*f)vwMiHR!F~Wzb", 0, ";yL*f)vwMiHR!F~Wzb", false);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = WordUtils.wrap("!_Vaph v", (-3194), "", true);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = WordUtils.wrap("", 2);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = WordUtils.initials((String) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("uRv9YT|");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = WordUtils.capitalize((String) null);
  }
}
