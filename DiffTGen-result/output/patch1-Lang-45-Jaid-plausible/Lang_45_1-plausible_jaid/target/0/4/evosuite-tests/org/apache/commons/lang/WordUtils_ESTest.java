/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:43:09 GMT 2020
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
      String string0 = WordUtils.abbreviate(" ", 0, 151, " ");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 2, 0, "user.dir");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[8];
      String string0 = WordUtils.uncapitalize(" ", charArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = WordUtils.wrap("@", 1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 4);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WordUtils.wrap(".E1.4gS3XT1.4;'?_21.4S;", 2452);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = WordUtils.uncapitalize(" ");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WordUtils.initials((String) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully((String) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        WordUtils.abbreviate("org.apache.commons.lang.WordUtils", (-633), (-633), "org.apache.commons.lang.WordUtils");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[1] = '[';
      String string0 = WordUtils.initials("`E[2a'3 z^!RkB", charArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = WordUtils.initials(".G", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = WordUtils.initials("", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[5];
      String string0 = WordUtils.uncapitalize((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[8];
      String string0 = WordUtils.uncapitalize("", charArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[2] = 'd';
      String string0 = WordUtils.capitalize("org.apache.commons.lang.WordUtils", charArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[2];
      String string0 = WordUtils.capitalize((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("", charArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.capitalize(">U+=Q-$", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = WordUtils.wrap("", 32, (String) null, false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", 0, 0, " ");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.abbreviate(">};cc0ww,[", 0, 0, " ");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = WordUtils.abbreviate("U;uNo~;qb", 583, 1, "org.apache.commons.lang.WordUtils");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = WordUtils.abbreviate("*R%r%nZ,Uh~.mt9/", (-1), (-1), "*R%r%nZ,Uh~.mt9/");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 0, 0, "'6#v WqH#L|~O{=");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, 0, (-1595), (String) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = WordUtils.abbreviate("tH?]n#JUD5 ", 0, 0, "fo*vt3(H-8=r*u]u");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[4] = '*';
      String string0 = WordUtils.capitalizeFully("V/YyJB`,*l", charArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = WordUtils.initials(".e Gs3xt;'?_2s;");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("tH?]n#JUD5 ", charArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = WordUtils.initials("");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = WordUtils.swapCase("tH?]n#JUD5 ");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = WordUtils.uncapitalize(".E gS3XT;'?_2S;", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("%", charArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[2];
      String string0 = WordUtils.capitalizeFully((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("jT8A", charArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("tH?]n#JUD5 ", charArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = WordUtils.capitalize("");
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = WordUtils.capitalize((String) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = WordUtils.wrap(".E gS3XT;'?_2S;", 5, "1.4", true);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = WordUtils.wrap(" !Sw[mpkOaf8KVav3", 0, "awt.toolkit", false);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = WordUtils.wrap("", 1625);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = WordUtils.wrap(".e Gs3xt;'?_2s;", 0, ".e Gs3xt;'?_2s;", false);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, (-1), "U=WcJLOvC(/", false);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("'6#v WqH#L|~O{=");
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = WordUtils.capitalize("j");
  }
}
