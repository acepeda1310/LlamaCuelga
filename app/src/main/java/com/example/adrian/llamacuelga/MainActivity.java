package com.example.adrian.llamacuelga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ImageButton.OnClickListener {
    TextView texto;
    ImageView walterWhite;
    ImageButton telefono;
    boolean llamando=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto=(TextView)findViewById(R.id.textView);
        walterWhite=(ImageView)findViewById(R.id.imageView);
        telefono=(ImageButton)findViewById(R.id.imageButton);
        telefono.setOnClickListener(this);
    }

    public void onClick(View v){
        if(llamando){
            texto.setText(R.string.llamar);
            walterWhite.setImageResource(R.drawable.walterwhite_llamar);
            telefono.setImageResource(R.drawable.llamar);
            llamando=false;
        } else{
            texto.setText(R.string.llamando);
            walterWhite.setImageResource(R.drawable.walterwhite_llamando);
            telefono.setImageResource(R.drawable.colgar);
            llamando=true;
        }
    }
}
