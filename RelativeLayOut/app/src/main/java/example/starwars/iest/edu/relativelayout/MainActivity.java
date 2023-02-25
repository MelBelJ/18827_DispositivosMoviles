package example.starwars.iest.edu.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bnCanal= findViewById(R.id.bnCanal);
        EditText etCanal= findViewById(R.id.etCanal);
        TextView tvCanal= findViewById(R.id.tvCanal);
        Spinner spProgramas=findViewById(R.id.spProgramas);
        ImageView ivContinuara=findViewById(R.id.ivContinuara);

        bnCanal.setOnClickListener(new View.OnClickListener()){
            @Override
                    public void onClick(View view){
                String texto= etCanal.getText().toString();
                Toast.makeText(MainActivity.this, "El valor era "+texto, Toast.LENGTH_LONG).show();
                tvCanal.setText(texto);


            }
        }
    }
}