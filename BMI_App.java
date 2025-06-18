package com.example.bmi_app_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editWeight, editfeet, editInch;
        Button btn1;
        TextView txtResult;
        LinearLayout mainLL;


        editWeight = findViewById(R.id.editWeight);
        editfeet= findViewById(R.id.editfeet);
        editInch= findViewById(R.id.editInch);
        btn1= findViewById(R.id.btn1);
        txtResult= findViewById(R.id.txtResult);
        mainLL= findViewById(R.id.mainLL);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt= Integer.parseInt(editWeight.getText().toString());
                int htf= Integer.parseInt(editfeet.getText().toString());
                int htI= Integer.parseInt(editInch.getText().toString());

                int totalIn=htf*12+htI;
                double totalCm= totalIn*2.53;
                double totalM= totalCm/100;
                double bmi = wt/(totalM*totalM);

                if(bmi>25)
                {
                    txtResult.setText("You are the Over Weight");
                    mainLL.setBackgroundColor(getResources().getColor(R.color.Yellow));
                } else if (bmi<18) {
                    txtResult.setText("You are the Under Weight");
                    mainLL.setBackgroundColor(getResources().getColor(R.color.RED));

                }
                else{
                    txtResult.setText("You are Healthy");
                    mainLL.setBackgroundColor(getResources().getColor(R.color.GREEN));
                }


            }
        });






    }
}
