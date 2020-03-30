/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 00:09:21 GMT 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, 3.4028234663852886E38, 0.0, 3.4028234663852886E38);
      double double0 = polygonsSet0.getSize();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(boolean0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(boolean0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
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
  public void test03()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      boolean boolean0 = bSPTree0.insertCut(line0);
      // Undeclared exception!
      try { 
        polygonsSet0.getVertices();
      } catch(ClassCastException e) {
         //
         // java.lang.Boolean cannot be cast to org.apache.commons.math3.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$SegmentsBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(object0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      try { 
        polygonsSet1.computeGeometricalProperties();
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet();
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>();
      BSPTree<Euclidean1D> bSPTree1 = new BSPTree<Euclidean1D>((SubHyperplane<Euclidean1D>) null, bSPTree0, bSPTree0, bSPTree0);
      IntervalsSet intervalsSet1 = intervalsSet0.buildNew(bSPTree1);
      SubLine subLine0 = new SubLine((Hyperplane<Euclidean2D>) null, intervalsSet1);
      boolean boolean0 = linkedList0.offerFirst(subLine0);
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet(linkedList0);
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.partitioning.BSPTree cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet(0.0, 0.0, 0.0, 0.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.BSPTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(2336.3, 1753.06761145, 2336.3, (-532.6111953));
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = new Vector2D(0.0, (-1819.3963));
      Line line0 = new Line(vector2D0, 322.721961790585);
      SubLine subLine0 = line0.wholeHyperplane();
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(boolean0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      try { 
        polygonsSet1.computeGeometricalProperties();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D(5.865827662008209E-8, 5.865827662008209E-8);
      Line line0 = new Line(vector2D0, vector2D0);
      PolygonsSet polygonsSet0 = line0.wholeSpace();
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      Vector2D[][] vector2DArray0 = polygonsSet1.getVertices();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-458.54628644334093), 1454.1, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      // Undeclared exception!
      try { 
        polygonsSet0.getBarycenter();
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      double double0 = polygonsSet0.getSize();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(boolean0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      polygonsSet0.computeGeometricalProperties();
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
  }
}