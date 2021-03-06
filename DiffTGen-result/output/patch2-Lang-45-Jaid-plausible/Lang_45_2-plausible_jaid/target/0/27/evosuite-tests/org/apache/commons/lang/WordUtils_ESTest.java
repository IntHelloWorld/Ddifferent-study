/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:08:16 GMT 2020
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
      String string0 = WordUtils.abbreviate("", 0, 546, "");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WordUtils.wrap("", (-325), "", true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 746);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WordUtils.wrap("", (-3233));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("IVbx");
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
      String string0 = WordUtils.capitalize((String) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WordUtils.capitalize("");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = WordUtils.initials("h`", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = WordUtils.initials("", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[6];
      String string0 = WordUtils.uncapitalize("", charArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null, (char[]) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("", charArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully((String) null, (char[]) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = WordUtils.capitalize("lo-2m&zU.W?WOvqGP~", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = WordUtils.wrap("bGxJGn>q/K 3", (-764), "", true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.wrap("w]-MuMpxH{W", (-3300), (String) null, false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        WordUtils.abbreviate("KO9/ XedV0~XPe(", (-1785), (-876), "org.apache.commons.lang.WordUtils");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = WordUtils.abbreviate("lo-2m&zU.W?WOvqGP~", 0, 0, "java.vm.name");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", 0, 1360, "6.0");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 3796, (-2485), "AIX");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = WordUtils.abbreviate("`Z7TUd&gC.l", (-1), (-1), "&HjhR+-");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", (-1), (-1), "");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 2784, 0, "1.1");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, (-2251), 585, (String) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = 'w';
      String string0 = WordUtils.initials("Java.awT.headless", charArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("k&T99Bi|{EewK'/ ", charArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = WordUtils.initials("");
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.initials((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = WordUtils.swapCase("aNa/p+Na/p,Na/pNNa/pPNa/pfNa/ptNa/p2Na/p2Na/p!Na/pXNa/p<Na/pR");
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
      char[] charArray0 = new char[3];
      charArray0[1] = 'r';
      String string0 = WordUtils.uncapitalize("F6nhakq&b^8]*r/", charArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("`Z7TUd&gC.l", charArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("K", charArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[1] = 'm';
      String string0 = WordUtils.capitalize("kmmxD, (", charArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("^ZL66SP^n;", charArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.capitalize("", charArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[2];
      String string0 = WordUtils.capitalize((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[2];
      String string0 = WordUtils.capitalizeFully("<F", charArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = WordUtils.wrap("Caught a securityexcepTion reading the system pRopErty '", 32);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = WordUtils.wrap(" zxjA9U=", 0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = WordUtils.wrap("k&T99Bi|{EewK'/ ", 3441, "E", true);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = WordUtils.wrap("Windows 9", (-1214), "W", false);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 1, "w}", true);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("");
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = WordUtils.initials("o)!@y");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("org.apache.commons.lang.WordUtils");
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = WordUtils.capitalize("2s(mcw2q,J;h");
  }
}
