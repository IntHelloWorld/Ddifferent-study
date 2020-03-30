/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 00:05:35 GMT 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      PolygonsSet polygonsSet0 = new PolygonsSet(215.17, 2.0, 2.0, (-180.37907));
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      Vector2D vector2D0 = new Vector2D((-1.0E-10), (-1351.321));
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.getCell(vector2D0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      bSPTree0.setAttribute(polygonsSet0);
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, 542.02);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      BSPTree<Euclidean2D> bSPTree2 = bSPTree1.copySelf();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree2);
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
  public void test04()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, 0.0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(segment0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.twod.Segment cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) null);
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet(linkedList0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(2961.714044267239, 1.0, 2503.293384567707, 1.0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      linkedList0.addFirst(subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 0.0, 0.0);
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
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
      Vector2D[][] vector2DArray1 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 2418.586299774698);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-3442.57284701947), 0.0, (-3442.57284701947), 1420.0592607);
      polygonsSet0.computeGeometricalProperties();
  }
}