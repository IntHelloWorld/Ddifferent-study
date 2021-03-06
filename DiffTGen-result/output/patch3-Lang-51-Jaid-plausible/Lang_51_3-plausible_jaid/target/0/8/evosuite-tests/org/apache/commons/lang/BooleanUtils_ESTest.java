/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 04:23:49 GMT 2020
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
      boolean boolean0 = BooleanUtils.toBoolean("|b");
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(395, 2, 69, 0);
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
        BooleanUtils.toBoolean((-1091), 3875, 78);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Integer integer0 = new Integer((-1356));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-554));
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(69);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "");
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "MN?uH{~AxMM08KtBK#{");
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Integer integer0 = new Integer((-1519));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Integer integer0 = new Integer(276);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Integer integer0 = new Integer(404);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("lx!>UI", "lx!>UI", "lx!>UI", "lx!>UI");
      Integer integer0 = Integer.getInteger("lx!>UI");
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer(1228);
      Integer integer2 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 69, 4819);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = BooleanUtils.toInteger(boolean0, (-1734), (-1734), (-2001));
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "Aj", "U@JsXgNj$z}OyZ");
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "true", ".%;4c");
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      String string0 = BooleanUtils.toString(boolean0, "", "", "");
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "off", "/G'579(LGa!;Eg%C0#", "off");
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("lx!>UI", "lx!>UI", "lx!>UI", "lx!>UI");
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("3NIESnMe|i}", "3NIESnMe|i}", "", "p7n:l!r%Wc");
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("Sgo3Fw}m>5tUc&");
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Integer integer0 = new Integer((-1843647350));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Boolean[] booleanArray0 = new Boolean[6];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
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
  public void test033()  throws Throwable  {
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
  public void test034()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
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
  public void test035()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[1] = true;
      booleanArray0[6] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
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
  public void test038()  throws Throwable  {
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
  public void test039()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toStringYesNo(boolean1);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("t+q' $$;04T^kp6k`", "", "t+q' $$;04T^kp6k`");
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("}d5<11O'Q5=*6G2It-", "f4mAmt@Xq/&@-4d&H", "");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "on", "");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "");
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("A blank string is not a valid number", "A blank string is not a valid number", "The String did not match either specified value");
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yM'");
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Array is empty");
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(" N");
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("z(Q2");
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(", Length: ", "6B", "6B", ", Length: ");
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("on", "off", "{}", "false");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("x[2", "o: aA`h0-oIz9p", "x[2", "o: aA`h0-oIz9p");
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "true", "", "true");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "BDia(q`y 6)]Q?1yb", (String) null);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer((-1702));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, 3203, 3203, 658);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1769), 0, 0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-211), (-211));
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 108, 0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(true);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer0);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer1, integer1);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Integer integer0 = new Integer(1508);
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
  public void test081()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[7];
      Integer integer0 = BooleanUtils.toIntegerObject(booleanArray0[0]);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1801), (-1509), (-17), (-1801));
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-876), 0, (-876), 0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(4738, 4738, (-168), 0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-766), 110, 276, 276);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = new Integer(0);
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
  public void test088()  throws Throwable  {
      Integer integer0 = new Integer((-1266));
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
  public void test089()  throws Throwable  {
      Integer integer0 = new Integer(121);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Integer integer0 = new Integer(2803);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Integer integer0 = new Integer((-155));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(131, 69, 131);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(3764, 3764, 3764);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(2, 0, 0);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Integer integer0 = new Integer(490);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(3764);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-579));
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isNotFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isTrue((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Boolean boolean0 = new Boolean("RHz_I~Bt~Od1UXl/u");
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Boolean boolean2 = BooleanUtils.negate(boolean1);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Integer integer0 = Integer.getInteger("${Ol0OQ#<e!`KC[", 0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
  }
}
