/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 00:05:37 GMT 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
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
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
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
  public void test01()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-3.4028234663852886E38), (-75.19), (-1.0), 1832.745364);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet(3550.23, (-208.81015451), (-228.71), (-208.81015451));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.BSPTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(polygonsSet0);
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      // Undeclared exception!
      try { 
        polygonsSet1.getVertices();
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      PolygonsSet polygonsSet0 = line0.wholeSpace();
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      SubLine subLine0 = line0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      Vector2D[][] vector2DArray0 = polygonsSet1.getVertices();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, (-2881.66813435), 0.0, (-1842.96988324));
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
  public void test09()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 0.0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(0.9999, 0.001, 1627.023898742, 0.9999);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(0.9999, 0.001, 1627.023898742, 0.9999);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 0.0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      SubLine subLine1 = new SubLine(vector2D0, vector2D0);
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
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
