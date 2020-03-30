/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 00:11:10 GMT 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
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
      PolygonsSet polygonsSet0 = new PolygonsSet((-3.4028234663852886E38), 3.0, (-3.4028234663852886E38), 3.0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-1904.80171775), 0.0, (-4564.20840565345), 0.0);
      Vector<Euclidean2D> vector0 = polygonsSet0.getBarycenter();
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      PolygonsSet polygonsSet2 = polygonsSet1.buildNew(bSPTree0);
      polygonsSet2.computeGeometricalProperties();
      // Undeclared exception!
      polygonsSet1.getVertices();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(Double.NEGATIVE_INFINITY, (-3712.9602), (-3712.9602), Double.NEGATIVE_INFINITY);
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

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-876.482674549), 2545.95154717, 0.0, 2545.95154717);
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
      PolygonsSet polygonsSet0 = new PolygonsSet((-1635.554363), (-3668.989), (-1635.554363), (-3668.989));
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, subLine0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      // Undeclared exception!
      try { 
        polygonsSet1.getVertices();
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.twod.SubLine cannot be cast to org.apache.commons.math3.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$SegmentsBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew((BSPTree<Euclidean2D>) null);
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
  public void test06()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      OrientedPoint orientedPoint0 = new OrientedPoint((Vector1D) null, true);
      IntervalsSet intervalsSet0 = orientedPoint0.wholeSpace();
      SubLine subLine0 = new SubLine((Hyperplane<Euclidean2D>) null, intervalsSet0);
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet(linkedList0);
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
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector3D vector3D0 = new Vector3D((-536.063202), 4564.208405653451, 2.4276172717959866E7);
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Vector2D vector2D0 = plane0.toSubSpace(vector3D0);
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      boolean boolean0 = linkedList0.offerFirst(subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((BSPTree<Euclidean2D>) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(Double.NEGATIVE_INFINITY, (-2881.770093639365), (-2881.770093639365), Double.NEGATIVE_INFINITY);
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
  public void test11()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      Vector2D vector2D1 = Vector2D.NEGATIVE_INFINITY;
      SubLine subLine1 = new SubLine(vector2D1, vector2D0);
      boolean boolean1 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine1);
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

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(boolean0);
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      polygonsSet1.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      polygonsSet0.computeGeometricalProperties();
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-1904.80171775), 0.0, (-4564.20840565345), 0.0);
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(euclidean2D0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      try { 
        polygonsSet1.computeGeometricalProperties();
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-65.12), 0.0, (-65.12), 1256.52828);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }
}
