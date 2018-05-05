package com.andrewclam.toytemplate.model;

import android.support.annotation.NonNull;

/**
 * Example of a Template Method Pattern
 * This is the high-level class for encapsulating the algorithms so that
 * any {@link Beverage}s can hook themselves right into a
 * computation anytime they want.
 */
public abstract class Beverage {

  private String mSteps;

  Beverage(){
    prepareBeverage();
  }

  /**
   * Template Method
   * Encapsulates algorithm to generate the {@link Beverage}'s recipe
   * as a set of ordered instructions.
   */
  private void prepareBeverage(){
    mSteps = boilWater() + brew() + pourInCup();
    if (setAddCondiments()) {
      mSteps += addCondiments();
    }
  }

  @NonNull
  private String boilWater(){
    return "Boil water\n";
  }

  @NonNull
  abstract String brew();

  @NonNull
  private String pourInCup(){
    return "Pour in cup\n";
  }

  @NonNull
  abstract String addCondiments();

  /**
   * Hook method that is optional for subclass to override, defaults to false
   * @return controls whether the beverage has condiments
   */
  boolean setAddCondiments(){
    return false;
  }

  /**
   * Exposes the generated steps for a particular {@link Beverage}
   * @return the generated steps as a String
   */
  public final String getRecipe(){
    return mSteps;
  }
}
