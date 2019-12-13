package stratroulette.example.strategyroulette;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.stratroulette.R;

import org.w3c.dom.Text;

import java.util.Random;

public class Inferno extends AppCompatActivity {
    private TextView text;
    private Random rand;
    private int choose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inferno);
        Bundle extra = getIntent().getExtras();
        final String[] arrayCT = extra.getStringArray("ctStrats");
        final String[] arrayT = extra.getStringArray("tStrats");
        text = (TextView)findViewById(R.id.strat);
        rand = new Random();

        Button attackButton = findViewById(R.id.t_button);
        Button defendButton = findViewById(R.id.ct_button);

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
