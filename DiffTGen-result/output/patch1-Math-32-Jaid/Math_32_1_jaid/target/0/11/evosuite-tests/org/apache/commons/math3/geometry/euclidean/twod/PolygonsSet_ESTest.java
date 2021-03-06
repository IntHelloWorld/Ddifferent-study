/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 10:52:52 GMT 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree1);
      // Undeclared exception!
      try { 
        polygonsSet0.getVertices();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, object0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree1);
      // Undeclared exception!
      try { 
        polygonsSet0.getVertices();
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.math3.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$SegmentsBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(Double.NEGATIVE_INFINITY, 3.141592653589793, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet((Collection<SubHyperplane<Euclidean2D>>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet(1844.08119222899, 1844.08119222899, 3707.53391971159, (-1.0E-10));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.BSPTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      // Undeclared exception!
      try { 
        polygonsSet1.computeGeometricalProperties();
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.partitioning.BoundaryAttribute cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3.0, (-183.8610952406), 0.0, (-183.8610952406));
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3410.59099, 4643.239, (-1.0E-10), 4643.239);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3719.72, 0.0, 3719.72, (-2188.536544859735));
      polygonsSet0.computeGeometricalProperties();
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3719.72, 0.0, 3719.72, (-2188.536544859735));
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.getPlus();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      polygonsSet1.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      PolygonsSet polygonsSet0 = line0.wholeSpace();
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3719.72, 0.0, 3719.72, (-2188.536544859735));
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.getMinus();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      // Undeclared exception!
      try { 
        polygonsSet1.computeGeometricalProperties();
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.partitioning.BoundaryAttribute cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, (-1556.2515));
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      Line line1 = new Line(vector2D0, vector2D0);
      SubLine subLine1 = line1.wholeHyperplane();
      boolean boolean1 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine1);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      // Undeclared exception!
      try { 
        polygonsSet0.getVertices();
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }
}
