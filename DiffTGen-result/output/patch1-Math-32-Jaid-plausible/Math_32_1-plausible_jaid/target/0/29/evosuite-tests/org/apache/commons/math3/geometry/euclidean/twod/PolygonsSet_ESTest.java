/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 00:11:08 GMT 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
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
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(euclidean1D0);
      Boolean boolean0 = Boolean.FALSE;
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>((SubHyperplane<Euclidean2D>) null, bSPTree0, bSPTree0, boolean0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree1);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, 0.0);
      PolygonsSet polygonsSet0 = line0.wholeSpace();
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
  public void test02()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, (-0.5));
      PolygonsSet polygonsSet0 = line0.wholeSpace();
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
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
  public void test03()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, (-200.7), 133.29469, (-784.407569965));
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      polygonsSet0.computeGeometricalProperties();
      PolygonsSet polygonsSet2 = polygonsSet1.buildNew(bSPTree0);
      polygonsSet1.computeGeometricalProperties();
      // Undeclared exception!
      polygonsSet2.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet(bSPTree0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet(linkedList0);
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.twod.Vector2D cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PolygonsSet polygonsSet0 = null;
      try {
        polygonsSet0 = new PolygonsSet(46.11125748, (-752.9534339), (-752.9534339), 0.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.BSPTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-2393.0), 6889835.586642278, (-2153.28264599), 6889835.586642278);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = new Vector2D(0.0, 0.0);
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D(0.0, 0.0);
      Line line0 = new Line(vector2D0, vector2D0);
      PolygonsSet polygonsSet0 = line0.wholeSpace();
      polygonsSet0.computeGeometricalProperties();
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(Double.POSITIVE_INFINITY, 0.0, Double.POSITIVE_INFINITY, 643.1768967499585);
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
  public void test13()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(euclidean1D0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = new Vector2D(3045.0, 3045.0);
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      boolean boolean0 = linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(euclidean1D0);
      Boolean boolean0 = Boolean.FALSE;
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>((SubHyperplane<Euclidean2D>) null, bSPTree0, bSPTree0, boolean0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree1);
      polygonsSet0.computeGeometricalProperties();
  }
}
