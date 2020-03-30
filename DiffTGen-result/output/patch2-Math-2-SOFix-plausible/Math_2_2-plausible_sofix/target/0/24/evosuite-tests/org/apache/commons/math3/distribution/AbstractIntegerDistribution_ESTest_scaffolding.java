/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 28 22:25:07 GMT 2020
 */

package org.apache.commons.math3.distribution;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractIntegerDistribution_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.distribution.AbstractIntegerDistribution"; 
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
    java.lang.System.setProperty("user.dir", "/home/hewitt/work/DiffTGen-master/output/patch2-Math-2-SOFix-plausible/Math_2_2-plausible_sofix/target/0/24"); 
    java.lang.System.setProperty("user.home", "/home/hewitt"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "hewitt"); 
    java.lang.System.setProperty("user.timezone", "Asia/Chongqing"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractIntegerDistribution_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.special.Gamma$1",
      "org.apache.commons.math3.random.RandomDataImpl",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.exception.MathInternalError",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.exception.NonMonotonicSequenceException",
      "org.apache.commons.math3.special.Erf",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.ConvergenceException",
      "org.apache.commons.math3.distribution.IntegerDistribution",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.util.MathArrays$Position",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.distribution.SaddlePointExpansion",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.distribution.NormalDistribution",
      "org.apache.commons.math3.random.MersenneTwister",
      "org.apache.commons.math3.random.AbstractRandomGenerator",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.util.ContinuedFraction",
      "org.apache.commons.math3.analysis.UnivariateFunction",
      "org.apache.commons.math3.util.ResizableDoubleArray",
      "org.apache.commons.math3.exception.NotFiniteNumberException",
      "org.apache.commons.math3.distribution.RealDistribution",
      "org.apache.commons.math3.util.ResizableDoubleArray$ExpansionMode",
      "org.apache.commons.math3.distribution.EnumeratedIntegerDistribution",
      "org.apache.commons.math3.random.Well1024a",
      "org.apache.commons.math3.random.Well19937a",
      "org.apache.commons.math3.util.MathArrays$Function",
      "org.apache.commons.math3.random.JDKRandomGenerator",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.exception.NotANumberException",
      "org.apache.commons.math3.distribution.AbstractRealDistribution",
      "org.apache.commons.math3.random.Well44497b",
      "org.apache.commons.math3.random.Well44497a",
      "org.apache.commons.math3.util.MathArrays",
      "org.apache.commons.math3.random.RandomAdaptor",
      "org.apache.commons.math3.util.MathArrays$1",
      "org.apache.commons.math3.util.MathArrays$2",
      "org.apache.commons.math3.distribution.UniformIntegerDistribution",
      "org.apache.commons.math3.distribution.GeometricDistribution",
      "org.apache.commons.math3.random.RandomData",
      "org.apache.commons.math3.random.ISAACRandom",
      "org.apache.commons.math3.util.MathArrays$OrderDirection",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.special.Gamma",
      "org.apache.commons.math3.random.SynchronizedRandomGenerator",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.distribution.ExponentialDistribution",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.special.Beta",
      "org.apache.commons.math3.distribution.PascalDistribution",
      "org.apache.commons.math3.distribution.AbstractIntegerDistribution",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.distribution.BinomialDistribution",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.distribution.HypergeometricDistribution",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.distribution.EnumeratedDistribution",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.distribution.PoissonDistribution",
      "org.apache.commons.math3.util.DoubleArray",
      "org.apache.commons.math3.random.RandomDataGenerator",
      "org.apache.commons.math3.distribution.ZipfDistribution",
      "org.apache.commons.math3.random.RandomGenerator",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.util.ArithmeticUtils",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.Field",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.ResizableDoubleArray$1",
      "org.apache.commons.math3.random.Well512a",
      "org.apache.commons.math3.special.Beta$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractIntegerDistribution_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.distribution.AbstractIntegerDistribution",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.random.ISAACRandom",
      "org.apache.commons.math3.random.SynchronizedRandomGenerator",
      "org.apache.commons.math3.distribution.GeometricDistribution",
      "org.apache.commons.math3.random.RandomDataImpl",
      "org.apache.commons.math3.random.RandomDataGenerator",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.distribution.UniformIntegerDistribution",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.random.Well1024a",
      "org.apache.commons.math3.distribution.HypergeometricDistribution",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.distribution.PoissonDistribution",
      "org.apache.commons.math3.distribution.AbstractRealDistribution",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.distribution.NormalDistribution",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.util.ResizableDoubleArray",
      "org.apache.commons.math3.util.ResizableDoubleArray$ExpansionMode",
      "org.apache.commons.math3.util.ArithmeticUtils",
      "org.apache.commons.math3.distribution.ExponentialDistribution",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.distribution.EnumeratedIntegerDistribution",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.distribution.PascalDistribution",
      "org.apache.commons.math3.random.Well19937a",
      "org.apache.commons.math3.distribution.ZipfDistribution",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.random.MersenneTwister",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.distribution.EnumeratedDistribution",
      "org.apache.commons.math3.util.MathArrays",
      "org.apache.commons.math3.random.RandomAdaptor",
      "org.apache.commons.math3.distribution.BinomialDistribution",
      "org.apache.commons.math3.random.Well44497a",
      "org.apache.commons.math3.random.Well512a",
      "org.apache.commons.math3.random.Well44497b",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.special.Erf",
      "org.apache.commons.math3.special.Gamma",
      "org.apache.commons.math3.special.Beta",
      "org.apache.commons.math3.util.ContinuedFraction",
      "org.apache.commons.math3.special.Beta$1",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.distribution.SaddlePointExpansion",
      "org.apache.commons.math3.random.JDKRandomGenerator",
      "org.apache.commons.math3.special.Gamma$1",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.exception.MaxCountExceededException"
    );
  }
}
