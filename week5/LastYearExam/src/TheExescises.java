
  /*
  First:

  public class TrickyAverage {
   */
  /**
   * Create and test a function called `getTrickyAvg` that takes a number array (only integers) as parameter
   * and returns the average of the smallest odd and largest even.
   *  - use only basic control flow statements, like 'for', 'if', etc.
   *  - do not use built-in methods like 'filter', 'forEach', 'map', etc.
   *  - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)
   *
   * Example cases:
   * [1, 2, 3] -> should return 1.5
   * [3, 4, 5, 6] -> should return 4.5
   * [5, 2, 8, -1] -> should return 3.5
   */

/*
Test for first:
import org.junit.Test;

public class TrickyAverageTest {
   /**
   * Write your test cases here. You should be able to invoke the method like this:
   * double result = TrickyAverage.getTrickyAvg(input);


  @Test
  public void getTrickyAvg_testCase1() {
      /*
       * create a test case

      }

  @Test
  public void getTrickyAvg_testCase2() {

       * create a test case

      }

      }

    -----------------------------------------------------------------------------------------

      Second:

      public class MostProductiveYear {

  /**
   * Write a method that helps you find the most productive year for a film studio.
   * The method should take one argument, which is the name of the film studio.
   * The method should try to open the related data file named `studioname`.csv,
   * which is a comma separated file with 3 columns: name of the movie, release year, director
   *
   *  - If we do not have any data about the studio, the method should return an error message.
   *  - If we have found data, the method should return an information message about the most productive year for that studio.
   *
   * Examples:
   *
   * If we call the method with 'marvel':
   * should return 'marvel has made the most movies in 2017.'
   *
   * If we call the method with 'ghibli':
   * should print 'Cannot find studio, please try again later.'
   *
   * Hint:
   *  - You can find some example files in this folder (marvel.csv and paramount.csv)
   *  - Most productive year: The year in which the studio has made the most movies.

--------------------------------------------------------------------------------------------------------------
Third:
package battle;


import java.util.Arrays;
import java.util.List;

public class HeroBattle {
  /**
   * In this file we want to simulate a fight between Superheroes.
   * Please implement the necessary classes by the following specification
   *
   * You will need a Hero class which is also a BaseHero and is a Punchable (these are provided to you)
   * It should have the following:
   *
   * Properties
   * - motivation: a number representing how much the hero wants to save the world
   *
   * Methods
   * - constructor: sets the hero's name and motivation
   *
   * - getMotivationLevel: returns a number between 0 and 2
   * - 0 if the motivation below 25
   * - 1 if the motivation between 25 and 40
   * - 2 if motivation is above 40
   *
   * - punch: take damage on the other hero by using his/her bePunched function with a damage:
   * - damage = the puncher hero's motivation / 1.5
   * - the hero punches other heroes only if his/her motivation level is at least 1
   *
   * - bePunched: suffer damage, calculated like:
   * - motivation = motivation - (damage / motivation)
   *
   * - toString: returns a string status report about the hero
   * - if the hero's motivation level is 0: {name} is not motivated anymore.
   * - if the hero's motivation level is 1: {name} is motivated.
   * - if the hero's motivation level is 2: {name} is well motivated.
   *
   * You will need also a DCHero and a MarvelHero classes. They extend the Hero class
   * with a restriction, they cannot punch other heroes from the same "Universe":
   * - A MarvelHero shouldn't be able to punch another MarvelHero
   * - A DCHero shouldn't be able to punch another DCHero
   * Also they should have a default motivation if only the name is provided when we create them. Default values:
   * - MarvelHero: 40
   * - DCHero: 45
   * You don't need to modify this file, just add your imports to it.
   */

  /*public static void main(String[] args) {

      /*********************************************************
       *  Do not modify the code below except for test purpose *
       *********************************************************
      List<BaseHero> heroes = Arrays.asList(
      new MarvelHero("Hulk", 55),
      new MarvelHero("Iron man", 35),
      new MarvelHero("Daredevil"),
      new DCHero("Batman", 60),
      new DCHero("Superman", 25),
      new DCHero("Wonder woman")
      );

      battle(heroes);

      log(heroes);

      }

  private static void battle(List<BaseHero> heroes) {
      while (anyHeroCanFight(heroes)) {
      for (BaseHero hero : heroes) {
      punchOtherHeroes(hero, heroes);
      }
      }
      }

  private static void log(List<BaseHero> heroes) {
      for (BaseHero hero : heroes) {
      System.out.println(hero);
      }
      }

  private static boolean anyHeroCanFight(List<BaseHero> heroes) {
      for (BaseHero hero : heroes) {
      if (hero.getMotivationLevel() > 1) {
      return true;
      }
      }
      return false;
      }

  private static void punchOtherHeroes(BaseHero hero, List<BaseHero> otherHeroes) {
      for (BaseHero otherHero : otherHeroes) {
      if (otherHero != hero && otherHero instanceof Punchable) {
      hero.punch((Punchable) otherHero);
      }
      }
      }
      }
-----------------
     Third class1 :
      public abstract class BaseHero {

  private String name;

  BaseHero(String name) {
    this.name = name;
  }

  public abstract void punch(Punchable other);

  public abstract int getMotivationLevel();

  public String getName() {
    return name;
  }

}

---------------
   Second class:
   public abstract class BaseHero {

  private String name;

  BaseHero(String name) {
    this.name = name;
  }

  public abstract void punch(Punchable other);

  public abstract int getMotivationLevel();

  public String getName() {
    return name;
  }

}
      */

