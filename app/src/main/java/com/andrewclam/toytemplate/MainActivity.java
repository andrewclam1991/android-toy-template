package com.andrewclam.toytemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.andrewclam.toytemplate.model.Beverage;
import com.andrewclam.toytemplate.model.Coffee;
import com.andrewclam.toytemplate.model.Tea;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button makeTeaBtn = findViewById(R.id.make_tea_btn);
    makeTeaBtn.setOnClickListener(view -> {
      Beverage tea = new Tea();
      Toast.makeText(this,tea.getRecipe(),Toast.LENGTH_SHORT).show();
    });

    Button makeCoffeeBtn = findViewById(R.id.make_coffee_btn);
    makeCoffeeBtn.setOnClickListener(view -> {
      Beverage coffee = new Coffee();
      Toast.makeText(this,coffee.getRecipe(),Toast.LENGTH_SHORT).show();
    });
  }
}
