package com.example.dagger2app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
   // private Car car;
    @Inject Car car; //Field Injection
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component= DaggerCarComponent.create();
        component.inject(this);//Field Injection
      //  car= component.getCar(); //Provision Method and Constructor Injection
        car.drive();
    }
}