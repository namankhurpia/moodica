package patel.abhay.moodica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class layout2 extends AppCompatActivity {

    EditText answer;
    ImageButton next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_layout2);


        answer=(EditText)findViewById(R.id.answer);
        next=(ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String  ans = answer.getText().toString();

                if(TextUtils.isEmpty(ans))
                {
                    Toast.makeText(getApplicationContext(),"Enter answer",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent i = new Intent(layout2.this,layout3.class);
                    startActivity(i);
                }



            }
        });

    }
}
