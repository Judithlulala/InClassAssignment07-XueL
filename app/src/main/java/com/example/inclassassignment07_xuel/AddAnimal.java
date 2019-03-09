package com.example.inclassassignment07_xuel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.io.Serializable;

public class AddAnimal extends AppCompatActivity {
    private Button submit;
    private CheckBox hasFur;
    private EditText animalName;
    private EditText legs;
    private EditText moreInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_animal);

        animalName = (EditText) findViewById(R.id.animalName);
        legs = (EditText) findViewById(R.id.legs);
        moreInfo = (EditText) findViewById(R.id.moreInfo);
        hasFur=(CheckBox)findViewById(R.id.hasFur);

        submit = (Button) findViewById(R.id.submit_button);

    }



    public void Submit(View view) {
        String name = animalName.getText().toString();
        int legsNum = Integer.parseInt(legs.getText().toString());
        String moreInform = moreInfo.getText().toString();
        boolean hasFurr = hasFur.isChecked();
        Animal newAnimal = new Animal(name, legsNum, moreInform, hasFurr);

        Intent intent = new Intent();

        intent.putExtra("Animal",  newAnimal);
        setResult(RESULT_OK, intent);

        finish();

    }
}
