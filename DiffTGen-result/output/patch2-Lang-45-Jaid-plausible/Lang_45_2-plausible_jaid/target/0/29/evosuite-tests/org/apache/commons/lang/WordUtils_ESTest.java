/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:08:10 GMT 2020
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
      String string0 = WordUtils.abbreviate(" ", 0, 0, "java.vm.specification.version");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 0, 0, "Va%dbk%^2.K");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WordUtils.wrap("", (-1), "", true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = WordUtils.wrap("", (-1917));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("'+w#lm&ppqfx.zqr#");
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
      String string0 = WordUtils.capitalize((String) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = WordUtils.capitalize("");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WordUtils.initials("F", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[6];
      String string0 = WordUtils.uncapitalize((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[2];
      String string0 = WordUtils.uncapitalize("", charArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("user.timezone", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("", charArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("E~", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = WordUtils.capitalize("Nk& #!35C", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = WordUtils.wrap("&CN]C}d8<8", (-548), "'6A", false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = WordUtils.wrap("-+B-*", 32, (String) null, false);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 937, "3,Cw6", false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = WordUtils.abbreviate("Windows NT", 0, 0, "Windows NT");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = WordUtils.abbreviate("H", 0, (-1216), "");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 1368, 1368, "");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = WordUtils.abbreviate("mINIMUM ABBREVIATION WIDTH IS 4", 0, (-1), "wZ?$VqE6$jm");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", (-2215), (-2215), (String) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, (-1), 0, (String) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        WordUtils.abbreviate("lINUX", (-548), (-548), "java.ext.dirs");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[3] = '';
      String string0 = WordUtils.initials("[:<Pp1*pu'd%I)#n", charArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("+$cg`{c9<i_", charArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.initials("", charArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.initials((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = WordUtils.swapCase("\"M'9P]AWs{>XGt{d,|a");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WordUtils.swapCase("sa");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[2] = 'p';
      String string0 = WordUtils.uncapitalize("java.awt.graphicsenv", charArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize(" ", charArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully(" ", charArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("");
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[4];
      String string0 = WordUtils.capitalizeFully((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.capitalizeFully("H[3+-", charArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("-NT l");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("~_Usz@@7t", charArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = WordUtils.capitalize((String) null, (char[]) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      char[] charArray0 = new char[7];
      String string0 = WordUtils.capitalize("", charArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = WordUtils.wrap("[mAH:]q3Uh *]v+", 0, "", true);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = WordUtils.wrap(" VU.+rR`0;71w%dT*}", 0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = WordUtils.wrap("Windows 9", (-1), "", false);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, (-155));
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
      String string0 = WordUtils.initials("H[3+-");
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = WordUtils.capitalize("P");
  }
}
