/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 00:11:02 GMT 2020
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
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      PolygonsSet polygonsSet0 = line0.wholeSpace();
      Boolean boolean0 = Boolean.FALSE;
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(boolean0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((BSPTree<Euclidean2D>) null);
      // Undeclared exception!
      try { 
        polygonsSet0.getVertices();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-0.5), 0.0);
      Line line0 = new Line(vector2D0, 0.0);
      PolygonsSet polygonsSet0 = line0.wholeSpace();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, bSPTree0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      // Undeclared exception!
      try { 
        polygonsSet1.getVertices();
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.partitioning.BSPTree cannot be cast to org.apache.commons.math3.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$SegmentsBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((BSPTree<Euclidean2D>) null);
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
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet(0.0, 0.0, (-31.12007302702603), 0.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.BSPTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      boolean boolean0 = linkedList0.offerFirst(subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3.4028234663852886E38, 0.0, 3.4028234663852886E38, 44.81989598034865);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      PolygonsSet polygonsSet0 = line0.wholeSpace();
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      IntervalsSet intervalsSet0 = new IntervalsSet(2024.34, 2024.34);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
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
  public void test09()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(1778.9640656947238, 2.0000000000000004, 1531.0580225, 2.0000000000000004);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      boolean boolean0 = linkedList0.offerFirst(subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
      Vector2D[][] vector2DArray1 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-108.587488777365), 0.0, (-108.587488777365), 0.0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }
}
