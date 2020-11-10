package id.ac.id.telkomuniversity.vsi3f4.praktikactivity;

        import androidx.appcompat.app.AlertDialog;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.core.app.NotificationCompat;
        import androidx.core.app.NotificationManagerCompat;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textview1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1 = findViewById(R.id.editTextTextPersonName);
        button1 = findViewById(R.id.buttonPindah);
    }


    public void alert(View view) {

        if (textview1.getText().toString().length() == 0) {
            Toast.makeText(MainActivity.this,
                    "Input tidak boleh kosong !", Toast.LENGTH_LONG).show();
        } else {
            final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);


            builder.setMessage("Yakin ingin pindah?");
            builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("EdtText", textview1.getText().toString());
                    intent.putExtra("Ganti Activity", button1.getText().toString());

                    startActivity(intent);
                }

            });

            builder.setNegativeButton("Tidak", null);

            builder.show();


        }
    }
}
