/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 12:52:37 GMT 2020
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
      boolean boolean0 = BooleanUtils.toBoolean("L%");
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("{}");
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(102, 0, 0, 0);
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
        BooleanUtils.toBoolean(65, (-1338), (-1338));
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Integer integer0 = new Integer((-1571));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2013));
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[8];
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
  public void test007()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", (String) null);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "=c", "");
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("(@meR[ ]$L`)}");
      String string0 = BooleanUtils.toString(boolean0, "(@meR[ ]$L`)}", "~/c(1NRO@Oqc &8<", "~/c(1NRO@Oqc &8<");
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Integer integer0 = new Integer(193);
      Integer integer1 = BooleanUtils.toIntegerObject(true, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Integer integer0 = new Integer((-548));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Integer integer0 = new Integer((-177));
      Integer integer1 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer1, integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-190), 85);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      int int0 = BooleanUtils.toInteger(boolean0, (-439), 0, 68);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "sg_)", "sg_)");
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "j8Et;=f", "j8Et;=f");
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1053));
      String string0 = BooleanUtils.toString(boolean0, "", "", "");
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, (String) null, "true", (String) null);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(115, 115, (-1986), 0);
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
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
  public void test029()  throws Throwable  {
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
  public void test030()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[2];
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.toBooleanObject(0);
      booleanArray0[1] = boolean1;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
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
  public void test033()  throws Throwable  {
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
  public void test034()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("W", "", "W");
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("3{5~!q@N", "", "org.apache.commons.lang.BooleanUtils");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "5e_`hvdCNvCO,O3H", "|j\"Rxw5RQ309fL5");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "org.apache.commons.lang.math.NumberUtils", (String) null);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("false", "false", "false");
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("");
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
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
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("eNdQpxmf3+w#2RGm", ", Length: 0", "The String did not match any specified value", (String) null);
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no", "YpacQ", "no", "org.apache.commons.lang.math.NumberUtils");
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false", "false", "false", "1(k~");
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "xA(6J`H_p&|/|", "xA(6J`H_p&|/|", "xA(6J`H_p&|/|");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "The Integer did not match either specified value", (String) null, "The Integer did not match either specified value");
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "A blank string is not a valid number", ", Length: 0", (String) null);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("8");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Integer integer0 = new Integer((-2642));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Integer integer0 = new Integer(76);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Integer integer0 = new Integer(76);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      int int0 = BooleanUtils.toInteger(boolean0, 1820, 2, (-1766));
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 102, (-3904), (-3904));
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      int int0 = BooleanUtils.toInteger(boolean0, 76, 76, 76);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-267), (-267));
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Integer integer0 = new Integer(193);
      Integer integer1 = new Integer((-2896));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, (Integer) null, integer1);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Integer integer0 = new Integer(193);
      Integer integer1 = new Integer((-2896));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, (Integer) null, integer0);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer(1820);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
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
  public void test076()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(0, (-1), 120, 102);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-3085), 0, 0, (-3085));
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(76, 0, 76, 0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Integer integer0 = new Integer((-548));
      Integer integer1 = new Integer(120);
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
  public void test082()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-274));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Integer integer0 = new Integer(101);
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
  public void test084()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Integer integer0 = new Integer(78);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Integer integer0 = new Integer(79);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1, 13, 114);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2068, 2068, 2068);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Integer integer0 = new Integer(120);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2832);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Integer integer0 = new Integer(76);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("(@meR[ ]$L`)}");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Boolean[] booleanArray0 = new Boolean[5];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Integer integer0 = new Integer(46);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isTrue((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-1315), 0);
      boolean boolean1 = BooleanUtils.isTrue((Boolean) boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(43);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Boolean boolean2 = BooleanUtils.negate(boolean1);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(57, 57, 102, 115);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-1315), 0);
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("U#Z/_r-\".39u", "The Integer did not match either specified value", "'F", "U#Z/_r-\".39u");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
  }
}