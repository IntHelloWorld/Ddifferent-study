/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 06:37:34 GMT 2020
 */

package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.linear.LinearConstraint;
import org.apache.commons.math.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math.optimization.linear.Relationship;
import org.apache.commons.math.optimization.linear.SimplexSolver;
import org.apache.commons.math.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexSolver_ESTest extends SimplexSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100.0);
      simplexTableau0.numArtificialVariables = 3;
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
  public void test01()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(1, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
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
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1106.93));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
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
  public void test05()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-1274));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-1,274) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      Double[] doubleArray0 = new Double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 1.7976931348623157E308);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1334.3517142596227);
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
  public void test07()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(1);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-4.078170722074109));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(11, 100, 11);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 11);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0, relationship0, relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)11, (-2035.951525872)).when(linearConstraint0).getValue();
      boolean boolean0 = linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.7976931348623157E308);
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
  public void test09()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-4455.0715610647885));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2.2250738585072014E-308);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, simplexSolver0.goalType, false, 2.2250738585072014E-308);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
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
  public void test12()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      Double[] doubleArray0 = new Double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 1.7976931348623157E308);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(11, 100, 11);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 11);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0, relationship0, relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn(Double.NaN, Double.NaN).when(linearConstraint0).getValue();
      boolean boolean0 = linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0);
      boolean boolean1 = simplexSolver0.isOptimal(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(11, 100, 11);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 11);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.GEQ;
      Relationship relationship1 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0, relationship1, relationship0, relationship1).when(linearConstraint0).getRelationship();
      doReturn((double)11, (-2035.951525872)).when(linearConstraint0).getValue();
      boolean boolean0 = linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.7976931348623157E308);
      simplexSolver0.solvePhase1(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, 100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.EQ;
      Relationship relationship1 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship1, relationship0, relationship1, relationship1).when(linearConstraint0).getRelationship();
      doReturn(Double.NaN, Double.NaN).when(linearConstraint0).getValue();
      boolean boolean0 = linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.7976931348623157E308);
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
  public void test16()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(1, 100);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, arrayRealVector0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector1, 0.0);
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
