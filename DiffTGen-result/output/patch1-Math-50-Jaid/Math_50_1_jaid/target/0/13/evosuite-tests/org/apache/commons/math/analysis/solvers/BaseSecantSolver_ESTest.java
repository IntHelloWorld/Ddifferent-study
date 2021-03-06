/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 10:44:43 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Tan;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.function.Ulp;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.633123935319537E16, 2352.60545, 1587.75);
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(40320385, (UnivariateRealFunction) floor0, 0.0, 1.633123935319537E16, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0));
      Exp exp0 = new Exp();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1922, (UnivariateRealFunction) exp0, (-1.0), (-1697.6739512458), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-173.5732792763639), (-173.5732792763639));
      Gaussian gaussian0 = new Gaussian();
      UnivariateRealFunction univariateRealFunction0 = gaussian0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(35, univariateRealFunction0, (double) 35, 0.0, (-173.5732792763639), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1), (UnivariateRealFunction) sigmoid0, (double) (-1), 0.167, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(266, (UnivariateRealFunction) floor0, 2575.23863708502, 2575.23863708502, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,575.239, 2,575.239]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1432.1), (-991.4277268124));
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2039, (UnivariateRealFunction) asin0, (double) 15, 2550.722170371, allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [15, 2,550.722], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1276, (UnivariateRealFunction) tan0, (double) 1276, 1412.8972941190689, (AllowedSolution) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2219.48777748));
      Ulp ulp0 = new Ulp();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) ulp0, (double) 0, (-374.0), 1.0E-6, allowedSolution0);
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-159.56407));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-37.55730561655), (-159.56407), 1007);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1007, (UnivariateRealFunction) harmonicOscillator0, (double) 1007, (-37.55730561655), (-37.55730561655), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,007, -37.557]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-159.56407));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-37.55730561655), (-159.56407), 1007);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1007, (UnivariateRealFunction) harmonicOscillator0, (-159.56407), 1.5707963267948966, (-2306.28490444611), allowedSolution0);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-159.564, 1.571], values: [36.605, 27.055]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2943.0065802938448), (-2943.0065802938448));
      Floor floor0 = new Floor();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1996), (UnivariateRealFunction) floor0, (double) (-1996), (double) (-1996), (double) (-1996));
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,996) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2825.731514355511, 2825.731514355511, 798.830062221278);
      Asin asin0 = new Asin();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2, (UnivariateRealFunction) asin0, 798.830062221278, 2825.731514355511, 1691.47729004325);
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [798.83, 2,825.732], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3834.04338, 3834.04338);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(5205.51, 5205.51, 5205.51);
      Tanh tanh0 = new Tanh();
      illinoisSolver0.setup(3, tanh0, 3, 3, 3);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3, 3]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1276, (UnivariateRealFunction) tan0, (double) 1276, 1696.33352878502, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1276, (UnivariateRealFunction) tan0, (double) 1276, 1696.33352878502, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1299, (UnivariateRealFunction) tan0, (double) 1299, 1412.8972941190689, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1276, (UnivariateRealFunction) tan0, (double) 1276, 1667.5652818645613, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1299, (UnivariateRealFunction) tan0, (double) 1299, 1696.33352878502, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.8166804287214582, (-1112.953757476691), (-1112.953757476691));
      Signum signum0 = new Signum();
      double double0 = illinoisSolver0.solve(2543, (UnivariateRealFunction) signum0, (-1244.84325), 1797.349865163, 1797.349865163);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.62, 16.0, 16.0);
      Signum signum0 = new Signum();
      double double0 = illinoisSolver0.solve(2543, (UnivariateRealFunction) signum0, (-1244.84325), 1797.349865163, 1797.349865163);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-2141.1867722), 4305, (-658.204318183209));
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(4305, univariateRealFunction0, 0.0, (double) 4305, (-838.0155572163864), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.62, (-1112.953757476691), (-1112.953757476691));
      Signum signum0 = new Signum();
      double double0 = illinoisSolver0.solve(2543, (UnivariateRealFunction) signum0, (-1244.9543254853245), 1797.349865163, 1797.349865163);
      double double1 = illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1276, (UnivariateRealFunction) tan0, (double) 1276, 1412.8972941190689, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-173.5732792763639), (-173.5732792763639));
      Log log0 = new Log();
      pegasusSolver0.setup(576, log0, (-173.5732792763639), 383.670085564186, 576);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-173.573, 383.67], values: [\uFFFD, 5.95]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0, 0.0);
      Sin sin0 = new Sin();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2020, (UnivariateRealFunction) sin0, 1.494140625, (-870.91995607388), (-1343.151099782815));
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1.494, -870.92]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-159.56407));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-37.55730561655), (-159.56407), 1007);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1007, (UnivariateRealFunction) harmonicOscillator0, (-159.56407), 0.765297786206417, (-2306.28490444611), allowedSolution0);
  }
}
