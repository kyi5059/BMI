package my.edu.tarc.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText editText1;
    private EditText editText2;

    public static final String TAG_MESSAGE = "my.edu.tarc.bmi.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         editText1 = findViewById(R.id.editText1);
         editText2 = findViewById(R.id.editText2);

    }

    public void sendMessage(View view)
    {
        double value;

        if(TextUtils.isEmpty(editText1.getText()) )
        {
            editText1.setError("Please enter your weight");
            return;
        }
        if(TextUtils.isEmpty(editText2.getText()))
        {
            editText2.setError("Please enter your height");
            return;
        }

        value = Double.parseDouble(editText1.getText().toString()) / (Double.parseDouble(editText2.getText().toString()) *Double.parseDouble(editText2.getText().toString())) ;
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(TAG_MESSAGE, value);
        startActivity(intent);

    }
}
