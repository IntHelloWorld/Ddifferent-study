/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 06:31:49 GMT 2020
 */

package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.OpenMapRealVector;
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
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 100;
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 631.40795169115);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (double) 100;
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 631.40795169115);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1174.0));
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, Double.NEGATIVE_INFINITY);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2.2250738585072014E-308);
      simplexSolver0.solvePhase1(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, 100.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[8];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-337.79));
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
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.isOptimal((SimplexTableau) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
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
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 100;
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 631.40795169115);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
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
  public void test09()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[2];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
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
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1133.466506));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1133.466506));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-337.79));
      simplexSolver0.setMaxIterations(0);
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 100;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
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

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1133.466506));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 100;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, 100.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1133.466506));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }
}