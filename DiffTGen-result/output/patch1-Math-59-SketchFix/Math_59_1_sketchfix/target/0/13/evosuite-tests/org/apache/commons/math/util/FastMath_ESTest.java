/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 09:42:25 GMT 2020
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.util.FastMath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastMath_ESTest extends FastMath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      float float0 = FastMath.max(0.0F, 1.0F);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      long long0 = FastMath.max((long) (-493), (long) (-1));
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      double double0 = FastMath.min((-1420.585708379966), (-1420.585708379966));
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      float float0 = FastMath.min(1.0F, 1.0F);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      int int0 = FastMath.min((-2204), 838837812);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double double0 = FastMath.ceil((-2176.759340946));
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = FastMath.ceil(0L);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      double double0 = FastMath.rint(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      double double0 = FastMath.ulp(0.036);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      double double0 = FastMath.atan2(1086.9200527314, 1086.9200527314);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      double double0 = FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      double double0 = FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      double double0 = FastMath.log1p(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      double double0 = FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      double double0 = FastMath.expm1((-1.0));
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      double double0 = FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      double double0 = FastMath.toRadians((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      double double0 = FastMath.toRadians((-7.2781425391718892E18));
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      double double0 = FastMath.toDegrees(2.2737367544323206E-13);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      double double0 = FastMath.toDegrees((-1.0));
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      double double0 = FastMath.sqrt(0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      double double0 = FastMath.sqrt(1.725803294805311);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      int int0 = FastMath.round(1177.2117F);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      int int0 = FastMath.round((-1.0F));
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      long long0 = FastMath.round(1.0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      double double0 = FastMath.rint(0.031);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      double double0 = FastMath.rint((-1.0));
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      long long0 = FastMath.min(802L, 1646L);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      int int0 = FastMath.min(1917, 0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      int int0 = FastMath.min((-1), (-1));
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      float float0 = FastMath.min((float) 802L, 0.0F);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      float float0 = FastMath.min((-1042.91F), (-336.9F));
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      double double0 = FastMath.min(5111.27774339395, (double) 1803);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      double double0 = FastMath.min((-0.05569997400548161), (-0.05417713522911072));
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      long long0 = FastMath.max(1671L, 124L);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      int int0 = FastMath.max(0, 0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      int int0 = FastMath.max((-1), (-493));
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      float float0 = FastMath.max(0.0F, (-1.0F));
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double double0 = FastMath.max(0.0, (-1314.15810723896));
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      double double0 = FastMath.max((-1.0), (-1.0));
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      double double0 = FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      double double0 = FastMath.log10(0.7853981633974483);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      double double0 = FastMath.log(4172.2951572069205);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      double double0 = FastMath.exp((-1836));
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      double double0 = FastMath.cbrt(1.9868161777724352E-8);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      double double0 = FastMath.atan(1.725803294805311);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double double0 = FastMath.acosh(1.0F);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      double double0 = FastMath.acosh(1319.726);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      double double0 = FastMath.acosh((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      long long0 = FastMath.abs((long) 0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      int int0 = FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      double double0 = FastMath.floor((-1L));
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      double double0 = FastMath.floor(0.25534192122103627);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      double double0 = FastMath.floor(4577762542105553359L);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      double double0 = FastMath.floor((-851.238417053));
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      double double0 = FastMath.nextAfter(1.0, (-2984.968));
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double double0 = FastMath.nextAfter((-1.0), (-1.0));
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double double0 = FastMath.nextAfter(2362.0, 1473);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      double double0 = FastMath.abs((-1742.03298426589));
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      double double0 = FastMath.max((double) 6, 2932.878);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, 0.0F);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      float float0 = FastMath.max((-1111.4944F), (-1111.4944F));
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      long long0 = FastMath.max((long) (-1), (long) (-1));
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      long long0 = FastMath.max(0L, (-37L));
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = FastMath.max(0, 1609825150);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      double double0 = FastMath.min((-2176.759340946), Double.NaN);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      double double0 = FastMath.min((double) 0L, 1.0320850239843855);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, 0.0F);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      long long0 = FastMath.min(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      long long0 = FastMath.min(2957L, (long) (-1237));
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      int int0 = FastMath.min(6, 6);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      double double0 = FastMath.rint(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      double double0 = FastMath.rint(2932.878);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      double double0 = FastMath.ceil((-0.9922289206385345));
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      long long0 = FastMath.round(0.1538461446762085);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      double double0 = FastMath.ceil(1.0320850239843855);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      double double0 = FastMath.floor((-7278142539171889152L));
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      double double0 = FastMath.nextUp((-1.0));
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      double double0 = FastMath.nextUp(0.9999999999999999);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      double double0 = FastMath.nextAfter(0L, (-3975.0));
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 0.36787944117144233);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (-1.0));
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      float float0 = FastMath.abs((-1177.2117F));
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      float float0 = FastMath.abs((float) 8);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      long long0 = FastMath.abs((-1447L));
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      long long0 = FastMath.abs(1646L);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      int int0 = FastMath.abs((-1154));
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      int int0 = FastMath.abs(8);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      double double0 = FastMath.cbrt((-292.4169486598863));
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      double double0 = FastMath.acos(1.3526894423597173E-6);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      double double0 = FastMath.acos((-22.254693292179695));
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      double double0 = FastMath.acos(15.0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      double double0 = FastMath.asin((-1111.4944F));
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      double double0 = FastMath.asin(2.772588722239781);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      double double0 = FastMath.atan2(4.455505956692757, (-1522.227906225309));
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      double double0 = FastMath.atan2(1751.7833358351, 0.0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      double double0 = FastMath.atan2((-3975.454351730372), 0.0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-1944.275F));
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      double double0 = FastMath.atan2(0L, 1116.81850381862);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 15.0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      double double0 = FastMath.acos((-0.8067237729649778));
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      double double0 = FastMath.atan((-7278142539171889152L));
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      double double0 = FastMath.tan(1.560070049119026);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      double double0 = FastMath.cos(186.93716484);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      double double0 = FastMath.cos(1072.226);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      double double0 = FastMath.cos((-2635.3));
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      double double0 = FastMath.cos(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      double double0 = FastMath.sin((-825.9183104));
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      double double0 = FastMath.sin((-697.070837448126));
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      double double0 = FastMath.sin(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      double double0 = FastMath.tan(4.809026695933187E256);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      double double0 = FastMath.cos(838837812);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      double double0 = FastMath.sin(4577762542105553359L);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      double double0 = FastMath.tan(2144505168);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      double double0 = FastMath.cos((-8.0E298));
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      double double0 = FastMath.tan((-3896.163318249));
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      double double0 = FastMath.tan(1.0);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      double double0 = FastMath.sin(4.9E-324);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (-1.0));
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      double double0 = FastMath.pow((-3750.585751), 276.1);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (-8.0E298));
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      double double0 = FastMath.pow((-1548.102755132998), 6);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      double double0 = FastMath.pow(3929.5, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      double double0 = FastMath.pow(0L, 89.2);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      double double0 = FastMath.pow(0.0, (-0.5));
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, 2542.7);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      double double0 = FastMath.pow(0.9666709402050021, 0.0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      double double0 = FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      double double0 = FastMath.log(1.0);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      double double0 = FastMath.log1p(0.9315964599440725);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      double double0 = FastMath.pow(1.0F, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      double double0 = FastMath.log1p((-0.16925294350672204));
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      double double0 = FastMath.log10(0.0);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      double double0 = FastMath.log(0.0);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      double double0 = FastMath.asinh((-8.0E298));
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      double double0 = FastMath.log10((-1.0));
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      double double0 = FastMath.atanh(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      double double0 = FastMath.expm1((-0.16925294350672204));
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      double double0 = FastMath.pow(186.93716484, 1.0);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      double double0 = FastMath.expm1(3195);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      double double0 = FastMath.expm1((-3896.163318249));
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      double double0 = FastMath.exp((-1.0));
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      double double0 = FastMath.signum(0.0F);
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      double double0 = FastMath.signum((-1.0));
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      double double0 = FastMath.signum(471.7852992117);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      double double0 = FastMath.atanh((-0.008065465924143587));
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      double double0 = FastMath.atanh(0.06666666666666667);
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      double double0 = FastMath.atanh(0.1);
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      double double0 = FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      double double0 = FastMath.asinh(0.017300728138391914);
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      double double0 = FastMath.asinh(0.07073719799518585);
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      double double0 = FastMath.asinh(0.1323290818724702);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      double double0 = FastMath.tanh(1.9868161777724352E-8);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      double double0 = FastMath.tanh((-1.0));
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      double double0 = FastMath.tanh(0);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      double double0 = FastMath.tanh(2534.42428968);
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      double double0 = FastMath.tanh((-2147483647));
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      double double0 = FastMath.sinh(0.1818181574344635);
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      double double0 = FastMath.sinh(0.8510423424603096);
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      double double0 = FastMath.sinh((-3750.585751));
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      double double0 = FastMath.sinh((-0.40491558760802304));
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      double double0 = FastMath.sinh(153.76614821833044);
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      double double0 = FastMath.cosh((-1.0));
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      double double0 = FastMath.cosh((-1747.0));
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      double double0 = FastMath.cosh(2144505168);
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      double double0 = FastMath.cosh(0.07490822288864472);
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      double double0 = FastMath.atan((-1893.624));
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      double double0 = FastMath.log10(2712.681540056);
  }

  @Test(timeout = 4000)
  public void test202()  throws Throwable  {
      double double0 = FastMath.random();
      double double1 = FastMath.random();
  }

  @Test(timeout = 4000)
  public void test203()  throws Throwable  {
      int int0 = FastMath.round(0.0F);
  }

  @Test(timeout = 4000)
  public void test204()  throws Throwable  {
      long long0 = FastMath.round((-1681.32));
  }

  @Test(timeout = 4000)
  public void test205()  throws Throwable  {
      double double0 = FastMath.toDegrees(0L);
  }

  @Test(timeout = 4000)
  public void test206()  throws Throwable  {
      double double0 = FastMath.toRadians(5857.33252597);
  }
}