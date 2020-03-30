/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 03:35:06 GMT 2020
 */

package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.Relationship;
import org.apache.commons.math3.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexTableau_ESTest extends SimplexTableau_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-528.558047));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 8.696863522320578E-8);
      linkedList0.addFirst(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-2.2534815932619883E-8), 1038);
      int int0 = simplexTableau0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1114.622434025));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1114.622434025));
      int int0 = simplexTableau0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 625.6250545236982);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2105.5390809250553, 1417);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1.0), 353);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double((-388.53));
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[1];
      doubleArray0[5] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (double) doubleArray0[5]);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (double) doubleArray0[5], 0);
      boolean boolean0 = simplexTableau0.isOptimal();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(4);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-521.1243));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-521.1243), 2330);
      simplexTableau0.initializeColumnLabels();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2893.23338635834);
      // Undeclared exception!
      try { 
        simplexTableau0.subtractRow(0, 16, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // row index (16)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12, 0);
      simplexTableau0.setEntry(0, 0, 1.0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(2.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = doubleArray0[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 776.0);
      List<LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2893.23338635834);
      int int0 = simplexTableau0.getWidth();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-594.723404167603));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-594.723404167603), 59);
      int int0 = simplexTableau0.getSlackVariableOffset();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0, 0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 3007.571615689732);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 3007.571615689732, 0);
      int int0 = simplexTableau0.getOriginalNumDecisionVariables();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0, 2315.084612);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector1, 0.5);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.5);
      int int0 = simplexTableau0.getOriginalNumDecisionVariables();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1.0E-9);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12, 2);
      int int0 = simplexTableau0.getNumSlackVariables();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(openMapRealVector0, 0.0, relationship0, openMapRealVector0, 0.0);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2893.23338635834);
      int int0 = simplexTableau0.getNumSlackVariables();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      int int0 = simplexTableau0.getNumObjectiveFunctions();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0, 0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 3007.571615689732);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 3007.571615689732, 0);
      int int0 = simplexTableau0.getNumDecisionVariables();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(2, (-1263.8260187276828));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1275.9700686126));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12, 2);
      int int0 = simplexTableau0.getNumArtificialVariables();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(4);
      double double0 = SimplexTableau.getInvertedCoefficientSum(arrayRealVector0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double((-388.53));
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[2];
      doubleArray0[5] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      double double1 = SimplexTableau.getInvertedCoefficientSum(arrayRealVector0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.5;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      double double0 = SimplexTableau.getInvertedCoefficientSum(arrayRealVector0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12, 0);
      int int0 = simplexTableau0.getHeight();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-394.8909);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      double double0 = simplexTableau0.getEntry(0, 1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, Double.NaN);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 10.0);
      Integer integer0 = simplexTableau0.getBasicRow(1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0, 0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 3007.571615689732);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 3007.571615689732, 0);
      Integer integer0 = simplexTableau0.getBasicRow(0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1064.99250550273));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-2208.66268461023), 1206);
      int int0 = simplexTableau0.getArtificialVariableOffset();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-594.723404167603));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-594.723404167603), 59);
      RealMatrix realMatrix0 = simplexTableau0.createTableau(true);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        SimplexTableau.getInvertedCoefficientSum((RealVector) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-81));
      // Undeclared exception!
      try { 
        SimplexTableau.getInvertedCoefficientSum(openMapRealVector0);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0, Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        simplexTableau0.getBasicRow(Integer.MAX_VALUE);
      } catch(IllegalArgumentException e) {
         //
         // column index (2,147,483,647)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0, (-502), (-502));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1960.916078), 345);
      // Undeclared exception!
      try { 
        simplexTableau0.divideRow((-502), 345);
      } catch(IllegalArgumentException e) {
         //
         // row index (-502)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(2458, 2458, 0.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12, (-277));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-822), (-1.0));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 920.1523006519724);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 920.1523006519724, (-822));
      } catch(IllegalArgumentException e) {
         //
         // -819 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction((RealVector) null, 1465.35664104028);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-3455.019493), (-1));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-1431655764), 2729.700959185153);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(openMapRealVector0, relationship0, (-2432.2786418945125));
      boolean boolean0 = linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-907.0), (-5550));
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-509.8));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Double[] doubleArray1 = new Double[9];
      doubleArray1[0] = (Double) 0.0;
      doubleArray1[1] = (Double) 0.0;
      doubleArray1[2] = doubleArray1[1];
      doubleArray1[3] = (Double) 0.0;
      doubleArray1[4] = (Double) 0.0;
      doubleArray1[5] = (Double) (-1452.588);
      doubleArray1[6] = (Double) 0.0;
      doubleArray1[7] = (Double) (-1452.588);
      doubleArray1[8] = (Double) (-1452.588);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray1);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(arrayRealVector0, relationship0, (-1452.588));
      boolean boolean0 = linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-125.9), 0);
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-477), 0.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1811.1653));
      } catch(IllegalArgumentException e) {
         //
         // -474 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction((RealVector) null, (-4012.1304932579));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 3.141592653589793);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray1 = new double[6];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray1, arrayRealVector0);
      ArrayRealVector arrayRealVector2 = new ArrayRealVector(arrayRealVector1, arrayRealVector1);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(arrayRealVector2, relationship0, 2522.0);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 24.0);
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12, 0);
      double[] doubleArray0 = new double[1];
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 2582.5382709250553);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      List<LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-907.0), (-5550));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-528.558047));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-2.2534815932619883E-8), 1038);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0, 1038);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12, 0);
      double[] doubleArray0 = new double[1];
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 2582.5382709250553);
      boolean boolean0 = simplexTableau0.equals(linearConstraint0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12, 0);
      simplexTableau0.divideRow(0, 2);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.5);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 0);
      PointValuePair pointValuePair0 = simplexTableau0.getSolution();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 1.0;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.5);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1899.1122232241);
      PointValuePair pointValuePair0 = simplexTableau0.getSolution();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-1277.58));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-961.0));
      boolean boolean0 = simplexTableau0.isOptimal();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(openMapRealVector0, 0.0, relationship0, openMapRealVector0, 0.0);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-110.711715051631));
      simplexTableau0.dropPhase1Objective();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12, 0);
      simplexTableau0.dropPhase1Objective();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-994.471));
      boolean boolean0 = linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-907.0), (-5550));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(openMapRealVector0, 0.0, relationship0, openMapRealVector0, 0.0);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2893.23338635834);
      simplexTableau0.dropPhase1Objective();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12, 0);
      int int0 = simplexTableau0.getNumDecisionVariables();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 620.673);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1156.8832263512152));
      int int0 = simplexTableau0.getRhsOffset();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2893.23338635834);
      // Undeclared exception!
      try { 
        simplexTableau0.setEntry(0, 4, 2893.23338635834);
      } catch(IllegalArgumentException e) {
         //
         // column index (4)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2893.23338635834);
      double[][] doubleArray1 = simplexTableau0.getData();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double(199.7663776);
      doubleArray0[0] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 199.7663776);
      // Undeclared exception!
      try { 
        simplexTableau0.getEntry(10, 957);
      } catch(IllegalArgumentException e) {
         //
         // row index (10)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }
}
