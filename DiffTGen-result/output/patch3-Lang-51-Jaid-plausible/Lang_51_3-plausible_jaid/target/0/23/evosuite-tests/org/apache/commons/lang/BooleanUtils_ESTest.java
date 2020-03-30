/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 04:26:25 GMT 2020
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
      boolean boolean0 = BooleanUtils.toBoolean(".f");
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1), 1560, 116, 1135);
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
        BooleanUtils.toBoolean(78, 0, (-601));
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Integer integer0 = new Integer(83);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-3685));
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1798));
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "]Q2#9h_:11", "]Q2#9h_:11");
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = new Integer((-1028));
      Integer integer2 = BooleanUtils.toIntegerObject(true, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      Integer integer1 = new Integer((-2940));
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      int int0 = BooleanUtils.toInteger(boolean0, 232, 232, 232);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "");
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) true, "F.,Ho]s%,-vU", "off", (String) null);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "7V}Tvp", "", "");
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, "");
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isTrue((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("}%\"M+fb");
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Integer integer0 = new Integer((-2045629234));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Integer integer0 = new Integer((-1259));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Boolean[] booleanArray0 = new Boolean[2];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
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
  public void test029()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
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
      boolean[] booleanArray0 = new boolean[4];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", "}%\"M+fb", "");
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", "", (String) null);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "', has a length less than 2", "', has a length less than 2");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "");
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "(\"NAZ5ijDI?", (String) null);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("dy", (String) null, "yes");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("NA|");
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("dy");
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(", Length: 0");
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(")jw^G3jIHq+q", (String) null, "", "");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Array element ", "", "Array element ", "");
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(")jw^G3jIHq+q", "true", (String) null, ")jw^G3jIHq+q");
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "$9y4*\"", (String) null, "");
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, "ao?|0CZJ");
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "{}", "|/HTNdHspEqIG1", "no");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Integer integer0 = new Integer((-1259));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Integer integer0 = new Integer(3407);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("mI:BuO}oQq", "mI:BuO}oQq", "%ikR;#", "sXy");
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-4527), 1350, (-4527));
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(" is not a valid number.");
      int int0 = BooleanUtils.toInteger(boolean0, (-3677), 0, (-3677));
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-2269), 0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 85, 85);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = new Integer(0);
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
  public void test069()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Integer integer0 = new Integer((-2021462347));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, (-2940), 2, 1);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, (-3306), 0, 83);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer(1950);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(669, 669, 0, 669);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1877, 0, 0, (-968));
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1439);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer(1439);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, integer1, integer1);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Integer integer0 = new Integer(2120);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Integer integer0 = new Integer((-1086));
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
  public void test080()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Integer integer0 = new Integer((-2251));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(2, 6743, 114);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(16, 0, 16);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Integer integer0 = new Integer((-1259));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Integer integer0 = new Integer((-67));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(" is not a valid number.");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = new Integer(2548);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Integer integer0 = new Integer((-1259));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isNotTrue((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.isNotTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) false);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("<P^l+}]");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes", "yes", "%swVr,{XZ>Dm5zU", "The array must not contain any null elements");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
  }
}