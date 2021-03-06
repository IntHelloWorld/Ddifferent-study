/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 07:50:41 GMT 2020
 */

package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
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
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 6170.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 2886.8309813065703);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 3607.767);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-2376.2662888118293), 0);
      int int0 = simplexTableau0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, arrayRealVector0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector1, (-130.41718238));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1465.0971437);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 1);
      int int0 = simplexTableau0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 6170.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 2886.8309813065703);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-2376.2662888118293), 0);
      int int0 = simplexTableau0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = (-2509.431);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2819.484799133);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1848.53316);
      boolean boolean0 = simplexTableau0.isOptimal();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, (-1529), 0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1669.29171033, 0);
      simplexTableau0.initializeColumnLabels();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0, 0, 0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 3700.728849216);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-349.5930118691), 0);
      simplexTableau0.setEntry(0, 0, 0.0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-1813.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      List<LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, (-1529), 0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1669.29171033, 0);
      int int0 = simplexTableau0.getWidth();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-235.4), 0);
      int int0 = simplexTableau0.getSlackVariableOffset();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, (-1529), 0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1669.29171033, 0);
      int int0 = simplexTableau0.getOriginalNumDecisionVariables();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 31);
      int int0 = simplexTableau0.getOriginalNumDecisionVariables();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2389.8796);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 435.03196429, 0);
      int int0 = simplexTableau0.getNumSlackVariables();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1465.0971437);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 1);
      int int0 = simplexTableau0.getNumSlackVariables();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-611.8));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      int int0 = simplexTableau0.getNumObjectiveFunctions();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-611.8));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      int int0 = simplexTableau0.getNumDecisionVariables();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, Double.NaN);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1748.6), 0);
      int int0 = simplexTableau0.getNumArtificialVariables();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-130.41718238));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1465.0971437);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 1);
      int int0 = simplexTableau0.getNumArtificialVariables();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      double double0 = SimplexTableau.getInvertedCoefficientSum(openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1281.924041028386);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      double double0 = SimplexTableau.getInvertedCoefficientSum(arrayRealVector0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1698.3097170572;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = SimplexTableau.getInvertedCoefficientSum(openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2927.95));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-2927.95));
      int int0 = simplexTableau0.getHeight();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2960.98118120497);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-375.95609));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.5);
      double double0 = simplexTableau0.getEntry(0, 0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-2517.56580737));
      Integer integer0 = simplexTableau0.getBasicRow(0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1095.56282);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12, 0);
      Integer integer0 = simplexTableau0.getBasicRow(0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 5632.756084483);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1756.5), 1271);
      RealMatrix realMatrix0 = simplexTableau0.createTableau(true);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 5632.756084483);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1756.5), 1271);
      // Undeclared exception!
      try { 
        simplexTableau0.subtractRow(111, 111, (-2685.8315974));
      } catch(IllegalArgumentException e) {
         //
         // row index (111)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-4789.2));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 20);
      // Undeclared exception!
      try { 
        simplexTableau0.normalizeConstraints((Collection<LinearConstraint>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(2939, 1540.05);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 2939);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1540.05, 1371);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1000.7975973738696);
      // Undeclared exception!
      simplexTableau1.isOptimal();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        SimplexTableau.getInvertedCoefficientSum((RealVector) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 31);
      // Undeclared exception!
      try { 
        simplexTableau0.getEntry(1, (-3028));
      } catch(IllegalArgumentException e) {
         //
         // row index (1)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double(3794.9682);
      doubleArray0[0] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 3794.9682);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 3794.9682, 5939);
      // Undeclared exception!
      try { 
        simplexTableau0.getBasicRow(5939);
      } catch(IllegalArgumentException e) {
         //
         // column index (5,939)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, (-1529), 0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1669.29171033, 0);
      // Undeclared exception!
      try { 
        simplexTableau0.divideRow(280, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // row index (280)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-968), (-968), (-968));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1896.5784412838, (-968));
      } catch(IllegalArgumentException e) {
         //
         // -966 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau((LinearObjectiveFunction) null, (Collection<LinearConstraint>) null, goalType0, true, 1.0, 20);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      Double[] doubleArray1 = new Double[9];
      doubleArray1[0] = (Double) doubleArray0[2];
      doubleArray1[1] = (Double) 0.0;
      doubleArray1[2] = (Double) (-1563.9152327746);
      doubleArray1[3] = (Double) 0.0;
      doubleArray1[4] = (Double) 0.0;
      doubleArray1[5] = (Double) (-1000.17209931923);
      doubleArray1[6] = (Double) 0.0;
      doubleArray1[7] = (Double) 0.0;
      doubleArray1[8] = (Double) 0.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(arrayRealVector0, relationship0, (-1.341336085949317E-7));
      boolean boolean0 = linkedList0.offerFirst(linearConstraint0);
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, (-1));
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(2939, 2939, 2939);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0, 2939);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-129), (-1));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-129));
      } catch(IllegalArgumentException e) {
         //
         // -126 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.linear.AbstractRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau((LinearObjectiveFunction) null, linkedList0, goalType0, false, 1394.7799932201485);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, (-1529), 0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1669.29171033, 0);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(arrayRealVector0, (-2980.928837233534), relationship0, arrayRealVector0, 0.0);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      List<LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2960.98118120497);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-375.95609));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.5);
      double[] doubleArray1 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(doubleArray1, 2.0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction1, linkedList0, goalType0, true, (-375.95609));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2960.98118120497);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-375.95609));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.5);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-375.95609));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2960.98118120497);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-375.95609));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.5);
      Integer integer0 = new Integer((-1803));
      boolean boolean0 = simplexTableau0.equals(integer0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-377.4568465285321));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0, 0);
      simplexTableau0.divideRow(0, (-873.26));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1791.103623);
      boolean boolean0 = simplexTableau0.isOptimal();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, (-1529), 0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1669.29171033, 0);
      simplexTableau0.dropPhase1Objective();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.0;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      PointValuePair pointValuePair0 = simplexTableau0.getSolution();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 1594.71193);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(arrayRealVector0, 674.46684, relationship0, arrayRealVector0, 2523.0);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 1036);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(2939, 1540.05);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 2939);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[0];
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 1540.05, relationship0, doubleArray0, 1540.05);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1540.05, 1371);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(2939, 1540.05);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 2939);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[0];
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 1540.05, relationship0, doubleArray0, 1540.05);
      boolean boolean0 = linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1540.05, 1371);
      // Undeclared exception!
      simplexTableau0.dropPhase1Objective();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-323.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2228.7166021217463, Integer.MAX_VALUE);
      int int0 = simplexTableau0.getNumDecisionVariables();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2960.98118120497);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-375.95609));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.5);
      int int0 = simplexTableau0.getArtificialVariableOffset();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2960.98118120497);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-375.95609));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.5);
      int int0 = simplexTableau0.getRhsOffset();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1791.103623);
      // Undeclared exception!
      try { 
        simplexTableau0.setEntry((-1), 17, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // row index (-1)
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 6170.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 2886.8309813065703);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-2376.2662888118293), 0);
      double[][] doubleArray1 = simplexTableau0.getData();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      simplexTableau0.subtractRow(0, 0, 0.0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 31);
      PointValuePair pointValuePair0 = simplexTableau0.getSolution();
  }
}
