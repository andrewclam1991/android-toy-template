package com.andrewclam.toytemplate.model;

import android.support.annotation.NonNull;

public class Tea extends Beverage {

  public Tea() {
    super();
  }

  @NonNull
  @Override
  String brew() {
    return "Steep Tea for 3 minutes\n";
  }

  @NonNull
  @Override
  String addCondiments() {
    return "Add 1 tbsp honey\n";
  }

  @Override
  boolean setAddCondiments() {
    return true;
  }
}
