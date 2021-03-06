/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 29 07:57:47 GMT 2020
 */

package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListPopulation_ESTest extends ListPopulation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      ElitisticListPopulation elitisticListPopulation1 = new ElitisticListPopulation(1, 0.0);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      elitisticListPopulation1.setChromosomes(list0);
      elitisticListPopulation1.setPopulationLimit(1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(11, 0.0);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.setPopulationLimit(0);
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      ElitisticListPopulation elitisticListPopulation1 = new ElitisticListPopulation(1, 0.0);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      elitisticListPopulation1.addChromosomes(list0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      elitisticListPopulation0.addChromosome((Chromosome) null);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.addChromosomes(list0);
      } catch(IllegalArgumentException e) {
         //
         // list of chromosomes bigger than maxPopulationSize
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      Iterator<Chromosome> iterator0 = elitisticListPopulation0.iterator();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      ElitisticListPopulation elitisticListPopulation1 = new ElitisticListPopulation(1, 0.0);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      elitisticListPopulation1.setChromosomes(list0);
      int int0 = elitisticListPopulation1.getPopulationSize();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      ElitisticListPopulation elitisticListPopulation1 = new ElitisticListPopulation(1, 0.0);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      elitisticListPopulation1.setChromosomes(list0);
      List<Chromosome> list1 = elitisticListPopulation1.getChromosomeList();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.getFittestChromosome();
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(250, 0.0);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.addChromosomes((Collection<Chromosome>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(11, 0.0);
      int int0 = elitisticListPopulation0.getPopulationLimit();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(11, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.setPopulationLimit((-102));
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      elitisticListPopulation0.setPopulationLimit(1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      ElitisticListPopulation elitisticListPopulation1 = new ElitisticListPopulation(1, 0.0);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      elitisticListPopulation1.setChromosomes(list0);
      // Undeclared exception!
      try { 
        elitisticListPopulation1.getFittestChromosome();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(11, 0.0);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      elitisticListPopulation0.addChromosomes(linkedList0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(11, 0.0);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      elitisticListPopulation0.setChromosomes(linkedList0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((-5206), 1297);
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) null, (-5162), 0.0);
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(11, 0.0);
      int int0 = elitisticListPopulation0.getPopulationSize();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      String string0 = elitisticListPopulation0.toString();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      ElitisticListPopulation elitisticListPopulation1 = new ElitisticListPopulation(1, 0.0);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      elitisticListPopulation1.setChromosomes(list0);
      // Undeclared exception!
      try { 
        elitisticListPopulation1.addChromosome((Chromosome) null);
      } catch(IllegalArgumentException e) {
         //
         // list of chromosomes bigger than maxPopulationSize
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }
}
