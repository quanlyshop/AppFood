package com.example.reviewfoodapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.HashMap;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;
import android.text.TextWatcher;
import android.text.Editable;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    private List<Language> listLanguage;
    private Button button4;
    private Button button2;
    private ArrayAdapter<String> adapter;
    private EditText inputSearch;
    private ArrayList<HashMap<String, String>> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String products[]={"America","Viet Nam","Singapo","China","Australia","Italia","Tai wan","Thailand"};
        this.button4=(Button) this.findViewById(R.id.button4);
        button4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Example1Activity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        this.button2=(Button) this.findViewById(R.id.button2);
        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MainActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });





        gridView = (GridView) findViewById(R.id.gridview);

        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "America"));
        listLanguage.add(new Language(2, "Viet Nam"));
        listLanguage.add(new Language(3, "Singapo"));
        listLanguage.add(new Language(4, "China"));
        listLanguage.add(new Language(5, "Austrairia"));
        listLanguage.add(new Language(6, "Tai Wan"));
        listLanguage.add(new Language(7, "Jappan"));
        listLanguage.add(new Language(8, "Italia"));

        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_grid_view, listLanguage);
        gridView.setAdapter(adapter);






    }





}