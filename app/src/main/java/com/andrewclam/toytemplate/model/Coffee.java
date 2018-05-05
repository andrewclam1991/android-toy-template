package com.andrewclam.toytemplate.model;

import android.support.annotation.NonNull;

public class Coffee extends Beverage {

  public Coffee() {
    super();
  }

  @NonNull
  @Override
  String brew() {
    return "Brew Coffee for 1 minutes\n";
  }

  @NonNull
  @Override
  String addCondiments() {
    return "Add 2 tbsp coffee creamer\n";
  }

  @Override
  boolean setAddCondiments() {
    return true;
  }
}
