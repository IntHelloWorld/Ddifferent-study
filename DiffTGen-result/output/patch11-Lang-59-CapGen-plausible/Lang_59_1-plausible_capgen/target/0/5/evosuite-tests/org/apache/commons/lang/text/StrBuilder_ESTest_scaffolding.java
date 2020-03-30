/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 28 16:34:58 GMT 2020
 */

package org.apache.commons.lang.text;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class StrBuilder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.lang.text.StrBuilder"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/hewitt/work/DiffTGen-master/output/patch11-Lang-59-CapGen-plausible/Lang_59_1-plausible_capgen/target/0/5"); 
    java.lang.System.setProperty("user.home", "/home/hewitt"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "hewitt"); 
    java.lang.System.setProperty("user.timezone", "Asia/Chongqing"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StrBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.lang.text.StrBuilder",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer",
      "org.apache.commons.lang.text.StrTokenizer",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderWriter",
      "org.apache.commons.lang.text.StrMatcher$CharMatcher",
      "org.apache.commons.lang.text.StrMatcher$TrimMatcher",
      "org.apache.commons.lang.text.StrMatcher$CharSetMatcher",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderReader",
      "org.apache.commons.lang.text.StrMatcher$StringMatcher",
      "org.apache.commons.lang.text.StrMatcher$NoMatcher",
      "org.apache.commons.lang.text.StrMatcher",
      "org.apache.commons.lang.SystemUtils",
      "org.apache.commons.lang.ArrayUtils"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StrBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang.text.StrBuilder",
      "org.apache.commons.lang.text.StrMatcher$CharMatcher",
      "org.apache.commons.lang.text.StrMatcher$CharSetMatcher",
      "org.apache.commons.lang.text.StrMatcher$TrimMatcher",
      "org.apache.commons.lang.text.StrMatcher$NoMatcher",
      "org.apache.commons.lang.text.StrMatcher",
      "org.apache.commons.lang.text.StrTokenizer",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderReader",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderWriter",
      "org.apache.commons.lang.ArrayUtils",
      "org.apache.commons.lang.SystemUtils",
      "org.apache.commons.lang.text.StrMatcher$StringMatcher"
    );
  }
}
