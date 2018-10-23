package my.edu.tarc.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textViewMessage;
        textViewMessage = findViewById(R.id.textViewMessage);
        ImageView imageView;
        imageView = (ImageView)findViewById(R.id.imageView);

        Intent intent = getIntent(); // who called me?
        if (intent.hasExtra(MainActivity.TAG_MESSAGE)) {
            Double value = intent.getDoubleExtra(MainActivity.TAG_MESSAGE, 0);
            textViewMessage.setText(value.toString());

            if(value<18.5)
            {
                imageView.setImageResource(R.drawable.under);
            }
            else if(value > 25)
            {
                imageView.setImageResource(R.drawable.over);
            }
            else
            {
                imageView.setImageResource(R.drawable.normal);
            }

        }





    }
}
