package com.developer.prihann.myapplication.actvities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developer.prihann.myapplication.R;
import com.developer.prihann.myapplication.fragments.FragmentOne;
import com.developer.prihann.myapplication.fragments.FragmentTwo;

public class MainActivity extends AppCompatActivity {
    Button button;
    private Boolean buttonState = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button_click_me);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(!buttonState){
                    fragmentTransaction.add(R.id.relative_layout_fragment_container,new FragmentOne());
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    buttonState=true;
                }else {
                    fragmentTransaction.add(R.id.relative_layout_fragment_container,new FragmentTwo());
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    buttonState=false;
                }
            }
        });






    }
}
