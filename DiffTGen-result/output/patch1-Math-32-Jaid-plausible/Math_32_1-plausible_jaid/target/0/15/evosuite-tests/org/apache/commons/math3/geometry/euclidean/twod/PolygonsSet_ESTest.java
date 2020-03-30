/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 00:07:31 GMT 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(1.4629238871724173E7, 3418.31181807, 1.4629238871724173E7, (-264.73));
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(boolean0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, 0.9474478361819838, 2812.4, 2947.7904699536525);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      polygonsSet0.computeGeometricalProperties();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      Vector2D[][] vector2DArray0 = polygonsSet1.getVertices();
      PolygonsSet polygonsSet2 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet2.getVertices();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(2488.699, 0.0, 0.0, (-0.5));
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew((BSPTree<Euclidean2D>) null);
      // Undeclared exception!
      try { 
        polygonsSet1.getVertices();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Vector1D vector1D0 = Vector1D.NaN;
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, true);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList0);
      SubOrientedPoint subOrientedPoint0 = new SubOrientedPoint(orientedPoint0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, subOrientedPoint0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree1);
      // Undeclared exception!
      try { 
        polygonsSet0.getVertices();
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet((-1584.684419107), (-1584.684419107), (-1584.684419107), Double.POSITIVE_INFINITY);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.BSPTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      Vector2D vector2D0 = new Vector2D(0.0, 0.0);
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      Vector2D[][] vector2DArray0 = polygonsSet1.getVertices();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      linkedList0.push(subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(147.31003769877614, 3671.3619022852117, (-1.0E-10), 3671.3619022852117);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(object0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
      Vector2D[][] vector2DArray1 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      linkedList0.push(subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(object0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      Boolean boolean0 = new Boolean(false);
      bSPTree0.setAttribute(boolean0);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(object0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-2991.0), 3821.147673459711, (-2991.0), 3821.147673459711);
      double double0 = polygonsSet0.getSize();
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      PolygonsSet polygonsSet2 = polygonsSet1.buildNew(bSPTree0);
      polygonsSet2.computeGeometricalProperties();
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      AbstractSubHyperplane<Euclidean2D, Euclidean1D> abstractSubHyperplane0 = subLine0.buildNew(line0, intervalsSet0);
      linkedList0.push(abstractSubHyperplane0);
      linkedList0.push(subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
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
}