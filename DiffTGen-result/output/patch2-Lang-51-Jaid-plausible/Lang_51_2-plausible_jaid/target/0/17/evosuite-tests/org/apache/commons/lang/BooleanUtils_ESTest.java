/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 02:05:05 GMT 2020
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
      boolean boolean0 = BooleanUtils.toBoolean("-0x");
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("@/");
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("tD");
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(272, 0, 0, (-6749));
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1195), 0, (-1195), 0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-816), 1, 0);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2803);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[5];
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
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "~6dQfcHw[F{q+$($|L", (String) null);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Integer integer0 = new Integer((-1790));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "gM", "");
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "", "MvlM9p=2E]H,A", "");
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Integer integer0 = new Integer(69);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Integer integer0 = new Integer((-1518));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Integer integer0 = new Integer(46);
      Integer integer1 = new Integer((-8029));
      Integer integer2 = BooleanUtils.toIntegerObject(false, integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer(1193);
      Integer integer1 = new Integer((-2015));
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer0, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-2141), (-3667));
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "Ld`CV)2%?lR%5(P@e", "Ld`CV)2%?lR%5(P@e");
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "IfXl?W5uc", "Array is empty");
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1011));
      String string0 = BooleanUtils.toString(boolean0, "nzejE$n", "{?qB< 6I", "{?qB< 6I");
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("6>");
      String string0 = BooleanUtils.toString(boolean0, "$\"q31gMoe=z", "0", "BmN1Qb@ ^p!wEBR6Vl");
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("7kJrVlQC");
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isTrue((Boolean) null);
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
      Boolean[] booleanArray0 = new Boolean[3];
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes", "yes", "", (String) null);
      booleanArray0[0] = boolean0;
      Boolean boolean1 = Boolean.FALSE;
      booleanArray0[1] = boolean1;
      booleanArray0[2] = booleanArray0[1];
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
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
      Boolean boolean0 = new Boolean(true);
      Boolean[] booleanArray0 = new Boolean[5];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("j4p9{|RD)", "!dz5v#$-Q_@0<@:", "Index: ");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("`02@8|&`", "`02@8|&`", "`02@8|&`");
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "true", (String) null);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "K?cE");
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "!=m{^bPs7-L;#,&B", ")3.R;'@(");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(" is not a valid number.", "vy", " is not a valid number.");
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("tD;|");
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("%yes");
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
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
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("");
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(";ZYM+4x'W\"[", "false", "-0x", ";ZYM+4x'W\"[");
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("P", (String) null, "off", "I{O$4J7>");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "", "", "P1#}");
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "y10]!,zw", "y10]!,zw", (String) null);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "cQ", "|T|(IKaA");
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "q@o %=", "", "q@o %=");
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Integer integer0 = new Integer(1867);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer(1193);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("6>");
      Integer integer0 = new Integer((-1195));
      Integer integer1 = BooleanUtils.toIntegerObject((boolean) boolean0, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      int int0 = BooleanUtils.toInteger(boolean0, (-2250), 0, 0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 1878, 1878, 1878);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("es6XX=6LdTo]");
      int int0 = BooleanUtils.toInteger(boolean0, 115, 0, 0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 84, 84);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer(2);
      Integer integer2 = new Integer(2);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0, integer1, integer2, integer0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Integer integer0 = Integer.getInteger("yes", 3447);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(1140);
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
  public void test083()  throws Throwable  {
      Integer integer0 = new Integer(2434);
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
  public void test084()  throws Throwable  {
      Integer integer0 = new Integer(5467);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Integer integer0 = new Integer(116);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1, (-2896), 2070, Integer.MAX_VALUE);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, (-1), 2, 0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Integer integer0 = new Integer(65);
      Integer integer1 = new Integer(69);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, integer1, (Integer) null);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Integer integer0 = new Integer((-1790));
      Integer integer1 = Integer.getInteger("4>}sDGGcH*boC]%^Qm");
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Integer integer0 = new Integer(0);
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
  public void test094()  throws Throwable  {
      Integer integer0 = new Integer((-1790));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(145, (-840), 145);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(2397, 0, 377);
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Integer integer0 = new Integer(377);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1195));
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, (-1916));
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, (-1916));
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isFalse((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 0);
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.isTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isNotTrue((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      String string0 = BooleanUtils.toStringOnOff(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
  }
}
