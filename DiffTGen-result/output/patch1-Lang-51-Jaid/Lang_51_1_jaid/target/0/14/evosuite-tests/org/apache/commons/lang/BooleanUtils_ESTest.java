/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 12:41:20 GMT 2020
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
      boolean boolean0 = BooleanUtils.toBoolean(",'");
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(69, 121, (-1200), (-1200));
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
        BooleanUtils.toBooleanObject(0, (-1305), 740, 3014);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, (-4122), (-4122));
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, 101, 101);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Integer integer0 = new Integer((-2567));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1809);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-356));
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[2];
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
  public void test009()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "on");
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toString(boolean0, "The Integer did not match any specified value", (String) null, "off");
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Integer integer0 = new Integer(97);
      Integer integer1 = BooleanUtils.toIntegerObject(true, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1648), (-1648), (-1648), 0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = new Integer(0);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer0, integer1, integer1);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-2547), (-2547));
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "yes", "{kM]%R[Ky83");
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 89, 0);
      String string0 = BooleanUtils.toString(boolean0, "c;V(bj", "c;V(bj", "c;V(bj");
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "", "", "");
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isTrue((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1999));
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
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
  public void test028()  throws Throwable  {
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
  public void test029()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
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
  public void test032()  throws Throwable  {
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
  public void test033()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Index: ", "Index: ", "Index: ", "Index: ");
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("K_js]lCE t3fg!=", "The Integer did not match either specified value", (String) null);
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("T59/Rmy`.+U-joy", "", "T59/Rmy`.+U-joy");
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "8&:H\" Lp_@", (String) null);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "", "false");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("fD${4aF", "fD${4aF", "Xr}%1\"~){ I1;");
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("SVra");
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("d|");
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("false");
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("bUJ4Ia", "KKM'9is", "false", "bUJ4Ia");
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("e", "^PLTBy1_uvAC", "kaH$U", "D[,L>+V%EvLJG(a'");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "false", "yes", "The String did not match either specified value");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "jo{'R\"e{f ACCu+", (String) null, "");
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, ", '", ", '", (String) null);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "1q}4<pG", "1q}4<pG");
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("");
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Integer integer0 = new Integer((-2824));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Integer integer0 = new Integer((-2824));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Integer integer0 = new Integer(43);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      int int0 = BooleanUtils.toInteger(boolean0, 102, 114, 69);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1), 0, (-322));
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1648), (-1648), (-1648), 0);
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 85);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 859, Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = new Integer(0);
      Integer integer2 = BooleanUtils.toIntegerObject(false, integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Integer integer0 = new Integer((-1153));
      Integer integer1 = new Integer((-526));
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
  public void test076()  throws Throwable  {
      Integer integer0 = Integer.getInteger("4%Bzu_#j(LG0tZ|HH", 0);
      Integer integer1 = new Integer((-3951));
      Integer integer2 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer2, integer0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Integer integer0 = new Integer((-1153));
      Integer integer1 = new Integer((-526));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Integer integer0 = new Integer((-339));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Integer integer0 = new Integer(0);
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
  public void test080()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2266), 1, (-2266), 1);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1524), 1889, (-4103), (-1524));
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Integer integer0 = new Integer(120);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      boolean boolean1 = BooleanUtils.toBoolean(integer1, integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Integer integer0 = new Integer(43);
      Integer integer1 = Integer.getInteger("Array is empty", 677);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer1, integer0, integer0);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Integer integer0 = new Integer((-1076));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Integer integer0 = Integer.valueOf(Integer.MAX_VALUE);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
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
  public void test087()  throws Throwable  {
      Integer integer0 = new Integer(43);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-1), 0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
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
      boolean boolean0 = BooleanUtils.toBoolean(Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 101, 101);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", ",:h8b'mU^`W", "", "");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 101, 101);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-885));
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isNotFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2431), (-2431), 46, 115);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.isNotTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2431), (-2431), 46, 115);
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2431), (-2431), 46, 115);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Boolean boolean2 = BooleanUtils.negate(boolean1);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Integer integer0 = new Integer((-1153));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Index: ", "Index: ", "Index: ", "Index: ");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
  }
}
