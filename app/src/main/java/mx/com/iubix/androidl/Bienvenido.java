package mx.com.iubix.androidl;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Outline;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Bienvenido extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
    }

    public void onClick(View view){
        notificacion("Que tal, estas a punto de escuchar musica :)");
        Intent intent = new Intent(this,My_music.class);
        startActivity(intent);
    }

    public void notificacion(String texto){
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
    }
}
