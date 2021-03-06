/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 04:18:11 GMT 2020
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
      boolean boolean0 = BooleanUtils.toBoolean("off");
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("|B");
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1), (-2319), 0, (-2319));
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
        BooleanUtils.toBooleanObject(0, 1, (-488), 1);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2305), 102, (-2713));
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Integer integer0 = new Integer(57);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2673));
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "");
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, "");
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(486);
      String string0 = BooleanUtils.toString(boolean0, "", "", "");
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Integer integer0 = new Integer(1097);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Integer integer0 = new Integer((-2881));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("7S26f0l~N%<?Ef/");
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-1));
      Integer integer2 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, (-98), (-98), (-98));
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "The Integer did not match either specified value", "b'{~");
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, (String) null, "f8+&N'RbGb#Gi{P", "f8+&N'RbGb#Gi{P");
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "", (String) null, "0x");
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toString(boolean0, (String) null, "f8+&N'RbGb#Gi{P", "f8+&N'RbGb#Gi{P");
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.isFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Boolean[] booleanArray0 = new Boolean[3];
      Boolean boolean1 = Boolean.valueOf(true);
      booleanArray0[0] = boolean1;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Boolean[] booleanArray0 = new Boolean[4];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
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
  public void test032()  throws Throwable  {
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
  public void test033()  throws Throwable  {
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
  public void test034()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
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
  public void test037()  throws Throwable  {
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
  public void test038()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("yes", "/}8X}80XQy/Q,PZ", " ");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("0fjB2%I;Cc", "0fjB2%I;Cc", "A blank string is not a valid number");
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "", "`J7o4T.~Di");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "{8");
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(":g>F^gbFhl< ,I[Tx", "", ":g>F^gbFhl< ,I[Tx");
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("P',(");
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("',(");
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("no");
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("");
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("AE", "Ws]#h", (String) null, "");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("@?aD=", "The Array must not be null", "@?aD=", "The Array must not be null");
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("/}8X}80XQy/Q,PZ", "/}8X}80XQy/Q,PZ", "/}8X}80XQy/Q,PZ", (String) null);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "0x", "The String did not match either specified value", "oM_'| MfrT");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "", "");
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "!K'L9%K", (String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "false", "false", "");
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Boolean boolean0 = new Boolean("`}&c+(gjd");
      Integer integer0 = new Integer(1673);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Integer integer0 = new Integer(70);
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2764), (-2764), 1, 70);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) false, 1097, 1097, (-2601));
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 2434, 0, 2434);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, (-1277));
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 76);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 57, 2064);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-3431));
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer(0);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Integer integer0 = new Integer((-1968));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Integer integer0 = new Integer(70);
      Integer integer1 = new Integer(1);
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
  public void test079()  throws Throwable  {
      Integer integer0 = new Integer(57);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Boolean boolean1 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Integer integer0 = new Integer(2064);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(114, 2933, 1199, 114);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(57, (-679), 57, 57);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(true);
      boolean boolean0 = BooleanUtils.toBoolean(integer1, integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) false);
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
  public void test087()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
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
  public void test088()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Integer integer0 = new Integer((-1119));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(43, 0, 43);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2020), 1389, 1292);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Integer integer0 = new Integer((-1119));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Boolean boolean0 = new Boolean("on");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-418), (-418), (-418), (-418));
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isNotFalse((Boolean) false);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isTrue((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
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
      String string0 = BooleanUtils.toStringTrueFalse(true);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
  }
}
