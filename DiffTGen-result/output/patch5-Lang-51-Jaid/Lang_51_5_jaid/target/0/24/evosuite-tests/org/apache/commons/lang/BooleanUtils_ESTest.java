/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 13:26:24 GMT 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.BooleanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BooleanUtils_ESTest extends BooleanUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("1|");
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-4362), 3462, 3462, 3462);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(2408, (-689), (-689));
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Integer integer0 = new Integer(2014);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-567));
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[4];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "");
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "3L", "3L", "");
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Integer integer0 = new Integer((-1773));
      Integer integer1 = new Integer(0);
      Integer integer2 = BooleanUtils.toIntegerObject(false, integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Integer integer0 = new Integer(84);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Integer integer0 = new Integer((-1829));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Boolean boolean0 = new Boolean("yes");
      Boolean boolean1 = BooleanUtils.toBooleanObject((-1790775200));
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean1, (Integer) null, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Integer integer0 = new Integer(2014);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Integer integer0 = new Integer((-3115));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 958);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      int int0 = BooleanUtils.toInteger(boolean0, (-1346), (-1346), (-1346));
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "U*G", (String) null);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "wR UpM", "M\"AwB\"bAJqK");
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toString(boolean0, "DqT", "]7{'IYVX<EwjP&a|f$]", "DqT");
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isFalse((Boolean) true);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1987));
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      String string0 = BooleanUtils.toStringOnOff((Boolean) booleanArray0[1]);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", "-0x", "");
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("", "qZNX_ty,&1", "Mu2PO\"JoI|#");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "", "");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "|jgj<]@(/?rvz", (String) null);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("1699");
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("no");
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("nH3oF");
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("{0p!VLgjg8)`;FT", "A blank string is not a valid number", "@rh^RB?Jta#", "~{[n_W|N\"3");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("gk`3P3)K],.pj7", "L+S>Qxg:t!w{,52XaB", "gk`3P3)K],.pj7", "off");
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("d+o", "d+o", "d+o", "");
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "ha*pW|kDU43$Y}Q DA", "ha*pW|kDU43$Y}Q DA", "GI/wj3sC-ZOZ");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "', is neither of type Map.Entry nor an Array", (String) null, "rUE}`w'p6j");
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, ", Length: 0");
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "Fg", "ja#Rv`bGn", (String) null);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("', is neither of type Map.Entry nor an Array", (String) null, (String) null, "', is neither of type Map.Entry nor an Array");
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("x3H");
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean1, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Integer integer0 = new Integer((-968));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 0, 97, 0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-884));
      int int0 = BooleanUtils.toInteger(boolean0, 1835, 1835, 83);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-884), (-4236));
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 958);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer(45);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Integer integer0 = new Integer(1651);
      Integer integer1 = Integer.getInteger("FxPzd.q..v/&7;");
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(" is not a valid number.", " is not a valid number.", " is not a valid number.");
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) boolean0);
      Integer integer1 = new Integer(48);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer1);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Boolean boolean0 = new Boolean("yes");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Boolean boolean1 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) false);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Integer integer0 = new Integer((-581));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1778, 427, 427, 1778);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(76, (-739), 464, (-739));
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(78, 78, 78, 0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-4236), (-2252), (-4236), 1835);
      int int0 = BooleanUtils.toInteger(boolean0, 1835, 1835, 83);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Integer integer0 = new Integer(45);
      Integer integer1 = new Integer(9);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Integer integer0 = new Integer(2468);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, (Integer) null, (Integer) null);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Integer integer0 = new Integer((-1848));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Integer integer0 = new Integer((-581));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(461, (-567), 461);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(461, 461, 461);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2597), 0, 65);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(461);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[2];
      Integer integer0 = new Integer((-3115));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      booleanArray0[0] = boolean0;
      booleanArray0[1] = booleanArray0[0];
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      boolean boolean2 = BooleanUtils.toBooleanDefaultIfNull(boolean1, false);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[2];
      Integer integer0 = new Integer((-3115));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      booleanArray0[1] = boolean0;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(booleanArray0[1], false);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(461);
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Boolean boolean0 = new Boolean("R;{.Bzo.@{V");
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isTrue((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf((String) null);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Integer integer0 = Integer.valueOf(1211);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      String string0 = BooleanUtils.toStringYesNo((Boolean) boolean0);
  }
}