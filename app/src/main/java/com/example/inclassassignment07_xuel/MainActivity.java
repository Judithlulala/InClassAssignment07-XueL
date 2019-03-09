package com.example.inclassassignment07_xuel;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView animalInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void AddAnimal(View view) {
        Intent intent = new Intent(MainActivity.this, AddAnimal.class);
        startActivityForResult(intent, 1);


    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Animal newAnimal = (Animal) intent.getSerializableExtra("Animal");
            animalInfo = (TextView) findViewById(R.id.displayContent);

            animalInfo.setText(newAnimal.toString());
        }

    }

}
