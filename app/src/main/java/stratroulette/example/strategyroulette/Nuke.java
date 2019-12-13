package stratroulette.example.strategyroulette;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.stratroulette.R;

import java.util.Random;

public class Nuke extends AppCompatActivity {
    private TextView text;
    private Random rand;
    private int choose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuke);
        Bundle extra = getIntent().getExtras();
        final String[] arrayCT = extra.getStringArray("ctStrats");
        final String[] arrayT = extra.getStringArray("tStrats");
        text = (TextView)findViewById(R.id.strat4);
        rand = new Random();

        Button attackButton = findViewById(R.id.t_button4);
        Button defendButton = findViewById(R.id.ct_button4);

        attackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                choose = rand.nextInt(40);
                text.setText(arrayT[choose]);
            }
        });
        defendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                choose = rand.nextInt(40);
                text.setText(arrayCT[choose]);
            }
        });
    }
}
