/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 12:43:32 GMT 2020
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
      boolean boolean0 = BooleanUtils.toBoolean("yL");
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-991), 2019, (-2482), 0);
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
        BooleanUtils.toBooleanObject(1324, 3960, (-595), (-595));
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
        BooleanUtils.toBoolean(0, 73, 73);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1739, 110, 110);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Integer integer0 = new Integer((-3487));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(84);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2153);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[3];
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
  public void test010()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, "");
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Integer integer0 = new Integer((-222));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Integer integer0 = new Integer(115);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Integer integer0 = new Integer(3067);
      Integer integer1 = BooleanUtils.toIntegerObject(false, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      Integer integer0 = new Integer((-1));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 69);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-907), (-2861));
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1960), 0, 0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      int int0 = BooleanUtils.toInteger(boolean0, (-2593), (-173), 675);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[5] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "org.apache.commons.lang.math.NumberUtils", "");
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "true", "true");
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", (String) null, "", "");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, "ZM!_E'?Hj", "ZM!_E'?Hj", "");
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "off");
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("{}", "{}", "{}", "^HXGd6+Rf-");
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Boolean[] booleanArray0 = new Boolean[4];
      Integer integer0 = new Integer(983);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0);
      booleanArray0[0] = boolean1;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      Boolean[] booleanArray0 = new Boolean[8];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      booleanArray0[6] = boolean0;
      booleanArray0[7] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
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
      boolean[] booleanArray0 = new boolean[5];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Integer integer0 = Integer.getInteger("", (-1045));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("1.hbE2O$k'", "-0x", "L4");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("07[+?N#%A-@Dbp", "07[+?N#%A-@Dbp", "yes");
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "', has a length less than 2", "Aa ~*AxAdO+`2|-");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "%yq^xYP}0PSU~L!|7n8", (String) null);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "false");
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", ").X|", "");
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("CV");
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("--");
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("false");
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("?c;|k<6qpEfi3p^", "@_fm", "@_fm", "?c;|k<6qpEfi3p^");
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("org.apache.commons.lang.ArrayUtils", (String) null, (String) null, "~E/+F(XkguJ");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "6vlq#*N)^u(z", "9}nK", (String) null);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "liRe=vQT+Pg", (String) null, "");
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "off", "U (~>h", "U (~>h");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("");
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Integer integer0 = new Integer(115);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("{}", "{}", "{}", "^HXGd6+Rf-");
      Integer integer0 = new Integer(2353);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Integer integer0 = new Integer(33);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf((String) null);
      int int0 = BooleanUtils.toInteger(boolean0, 0, 882, (-2034));
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 111, (-3156));
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean1);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
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
      Integer integer0 = new Integer(69);
      Integer integer1 = Integer.getInteger("+07zr@fv-Vww", 0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Integer integer0 = new Integer(3);
      Integer integer1 = new Integer(2873);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, (Integer) null, integer1, (Integer) null);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Integer integer0 = new Integer(3);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      String string0 = BooleanUtils.toString(boolean0, "", (String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, (-2847), 2433, 0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1969, 69, 1969, 114);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(629, 629, (-475), (-475));
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Integer integer0 = new Integer(78);
      Integer integer1 = new Integer(97);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Integer integer0 = new Integer(224);
      Integer integer1 = new Integer((-7));
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
      Integer integer0 = new Integer(821);
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
      Integer integer0 = new Integer(3272);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 101, 0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-475));
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1628));
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.toBooleanDefaultIfNull(boolean1, true);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("{}", "{}", "{}", "^HXGd6+Rf-");
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isNotFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[3] = true;
      boolean boolean0 = BooleanUtils.isNotTrue((Boolean) booleanArray0[3]);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isTrue((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Boolean boolean2 = BooleanUtils.negate(boolean1);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      String string0 = BooleanUtils.toStringOnOff(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
  }
}