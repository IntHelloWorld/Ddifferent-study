/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 12:45:25 GMT 2020
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
      boolean boolean0 = BooleanUtils.toBoolean("1Fv");
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("--");
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(2725, 48, 48, 48);
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
        BooleanUtils.toBoolean((-722), 0, 0);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Integer integer0 = new Integer((-1905));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(101);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(516);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
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
  public void test008()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "The Array must not be null", (String) null);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Integer integer0 = new Integer((-1933));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer(52);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer(2);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer1, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer((-742));
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer1, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 1092, (-650));
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[1] = true;
      booleanArray0[3] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "gx5", "");
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "Array element ", "Array element ");
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      String string0 = BooleanUtils.toString(boolean0, "", "", "~");
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, (String) null, "&U.<TC<:=>B- }'", "");
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toString(boolean0, "*{.Q", "*{.Q", "*{.Q");
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isFalse((Boolean) null);
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
      Boolean boolean0 = Boolean.valueOf(true);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
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
  public void test035()  throws Throwable  {
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
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("d~*ti&+7", "yes", (String) null);
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("!=TX>:#sF26", "{}", "!=TX>:#sF26");
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "true", (String) null);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "true", "true");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "v4%`Ci");
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("B!*G>(bus I5qQJ", "B!*G>(bus I5qQJ", "LB;m-yS^B?");
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("kF9(");
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Vw");
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("G`^j]a#U}h");
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes", "mQX/v$UY|P6#", "mQX/v$UY|P6#", "yes");
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("i4yG", "ScQG=uhe ( ha(yI", ":QN\"&n#=s", ", '");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "false", "&P", (String) null);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "TQX/v$UYHP6#", (String) null, "org.apache.commons.lang.BooleanUtils");
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "The String did not match either specified value", "b@^kK");
      String string0 = BooleanUtils.toString(boolean0, (String) null, "Po1J", ", '");
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "4Q=fl,>=", "2'-+Y2c;%AHvt;kZ", "4Q=fl,>=");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("");
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Integer integer0 = new Integer((-1819));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Integer integer0 = new Integer((-818));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-2356), (-2356), (-2356));
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      int int0 = BooleanUtils.toInteger(boolean0, 2294, (-1846), 2294);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-32), (-4280));
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Boolean boolean0 = new Boolean("~");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = new Integer((-1458241758));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Integer integer0 = new Integer((-1819));
      Integer integer1 = new Integer((-3040));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, (Integer) null, integer0, integer0);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Integer integer0 = new Integer(4208);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Boolean[] booleanArray0 = new Boolean[9];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      booleanArray0[6] = boolean0;
      booleanArray0[7] = boolean0;
      booleanArray0[8] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
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
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Integer integer0 = new Integer((-1819));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1909436128), (-230495314), (-1819), (-1909436128));
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(732, (-2757), 732, 732);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(0, (-1215), 65, 412);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer((-1909436128));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, (Integer) null, integer1);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Integer integer0 = new Integer(210);
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
      Integer integer0 = new Integer((-2102));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Integer integer0 = new Integer(65);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(387, 0, 387);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(4, 4, 4);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, 732, (-1452));
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Integer integer0 = new Integer(65);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1543));
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1092));
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) false, false);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(65, 65, 1, 1181);
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      boolean boolean0 = BooleanUtils.isNotFalse((Boolean) booleanArray0[0]);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("org.apache.commons.lang.BooleanUtils", "true", "org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils");
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(65, 65, 1, 1181);
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Boolean boolean0 = new Boolean("~");
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isTrue((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      int int0 = BooleanUtils.toInteger(boolean1, 2294, (-1846), 2294);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "", ", Length: 0", (String) null);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
  }
}
