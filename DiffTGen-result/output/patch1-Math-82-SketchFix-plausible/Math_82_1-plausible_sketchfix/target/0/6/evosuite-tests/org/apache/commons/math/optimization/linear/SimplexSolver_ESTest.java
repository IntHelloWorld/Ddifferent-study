/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 22:35:07 GMT 2020
 */

package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.linear.LinearConstraint;
import org.apache.commons.math.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math.optimization.linear.SimplexSolver;
import org.apache.commons.math.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexSolver_ESTest extends SimplexSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-150.6));
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1967.7572550369);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1967.7572550369);
      simplexTableau0.numArtificialVariables = 858;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-701.7752));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 4318.0);
      simplexTableau0.numArtificialVariables = 18;
      try { 
        simplexSolver0.doIteration(simplexTableau0);
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-3664.037));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(5, Double.NEGATIVE_INFINITY);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 5);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1941.87565229);
      simplexSolver0.solvePhase1(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(Double.POSITIVE_INFINITY);
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
      // Undeclared exception!
      try { 
        simplexSolver0.isOptimal((SimplexTableau) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      simplexSolver0.setMaxIterations((-625));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-625) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(133.6531310281);
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2927.9157248);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1302.382906177));
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1058.35739));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-150.6));
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-150.6);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-2694.5));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2694.5);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.7976931348623157E308);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.7976931348623157E308);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }
}
