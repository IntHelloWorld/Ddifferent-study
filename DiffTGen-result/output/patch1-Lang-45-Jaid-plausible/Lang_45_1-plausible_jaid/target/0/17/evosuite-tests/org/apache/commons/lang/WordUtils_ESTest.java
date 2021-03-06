/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 02:46:58 GMT 2020
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
      String string0 = WordUtils.abbreviate(" ", 0, 0, "C.v-Vv=$&.+@r~{#!`Y");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 48, 0, "-YW");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 0, 1216, "U");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.capitalizeFully(",Z8CRS[U6 ==5}C", charArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WordUtils.wrap("", 0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("RXi");
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
      // Undeclared exception!
      try { 
        WordUtils.abbreviate("|T}n,1<MM'", (-3431), (-2997), "java.version");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = WordUtils.initials("<]\"[, *y0Cz{-E1", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.initials((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = WordUtils.initials("", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("", charArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.capitalizeFully("", charArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("user.country", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = WordUtils.capitalize(" &", (char[]) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.abbreviate("9-r:", 0, 0, "d)Mf?H:jChiW)");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = WordUtils.abbreviate("0>Qz}@sD c~p^|", 0, (-1231), "0>Qz}@sD c~p^|");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = WordUtils.abbreviate("vq]T x[NXcsR3", 3, 946, ".");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, (-1), 203, "java.class.version");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 9, (-1), "org.apache.commons.lang.WordUtils");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("U", charArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = WordUtils.initials("0>Qz}@sD\nc~p^|");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = WordUtils.initials("");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.initials("S", charArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = WordUtils.swapCase("org.apache.commons.lang.WordUtils");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = 'N';
      String string0 = WordUtils.uncapitalize("ORG.APACHE.COMMONS.LANG.wORDuTILS", charArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("U", charArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null, (char[]) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("org.apache.commons.lang.WordUtils", charArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[6];
      String string0 = WordUtils.capitalizeFully((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'Y';
      String string0 = WordUtils.capitalize("1*jB=f45rO:+Y", charArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("java.vm.specification.vendor", charArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.capitalize((String) null, charArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("", charArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = WordUtils.wrap("EQg3 z]'OJmPF]E", 0, "", false);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = WordUtils.wrap("Windows NT", (-2157), "", true);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = WordUtils.wrap(" ;]ob]", (-1));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = WordUtils.wrap("", 0, (String) null, false);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = WordUtils.wrap("", 1728, "}<'i'Jr8rjIcs", false);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 3674, (String) null, false);
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
      String string0 = WordUtils.initials((String) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("$2U62&i");
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = WordUtils.capitalize("4.0");
  }
}
