/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 08:54:57 GMT 2020
 */

package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.math.stat.clustering.Cluster;
import org.apache.commons.math.stat.clustering.EuclideanIntegerPoint;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KMeansPlusPlusClusterer_ESTest extends KMeansPlusPlusClusterer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER;
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      // Undeclared exception!
      try { 
        kMeansPlusPlusClusterer0.cluster(linkedList0, 4929, 0);
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.evosuite.runtime.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR;
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      int[] intArray0 = new int[6];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      boolean boolean0 = linkedList0.add(euclideanIntegerPoint0);
      boolean boolean1 = linkedList0.add(euclideanIntegerPoint0);
      // Undeclared exception!
      try { 
        kMeansPlusPlusClusterer0.cluster(linkedList0, 2370, (-1924));
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE;
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      int[] intArray0 = new int[3];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      boolean boolean0 = linkedList0.add(euclideanIntegerPoint0);
      // Undeclared exception!
      kMeansPlusPlusClusterer0.cluster(linkedList0, 4, 428);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      int[] intArray0 = new int[8];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      boolean boolean0 = linkedList0.add(euclideanIntegerPoint0);
      List<Cluster<EuclideanIntegerPoint>> list0 = kMeansPlusPlusClusterer0.cluster(linkedList0, (-1853), (-776));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      int[] intArray0 = new int[8];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      boolean boolean0 = linkedList0.add(euclideanIntegerPoint0);
      List<Cluster<EuclideanIntegerPoint>> list0 = kMeansPlusPlusClusterer0.cluster(linkedList0, (-776), 0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT;
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>((Random) null, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      // Undeclared exception!
      try { 
        kMeansPlusPlusClusterer0.cluster((Collection<EuclideanIntegerPoint>) null, 0, 3746);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
