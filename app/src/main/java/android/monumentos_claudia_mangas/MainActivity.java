package android.monumentos_claudia_mangas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Monumento> listaMonumentos;
    private Random random;

    ImageView ivMonument;
    TextView tvName, tvDescription, tvLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMonumentos = MonumentosDatos.listaMonumentos();
        random = new Random();
        initReferences();
        showRandom();
    }

    private void initReferences(){
        ivMonument = findViewById(R.id.ivMonument);
        tvName =  findViewById(R.id.tvName);
        tvDescription = findViewById(R.id.tvDescription);
        tvLocation = findViewById(R.id.tvLocation);
    }

//    private void getRandom(){
//        int index = random.nextInt(listaMonumentos.size());
//        Monumento randomMonument = listaMonumentos.get(index);
//    }

    private void showRandom(){
        int index = random.nextInt(listaMonumentos.size());
        Monumento randomMonument = listaMonumentos.get(index);

        // Actualiza las vistas con la información del monumento
        tvName.setText(randomMonument.getNombre());
        tvDescription.setText(randomMonument.getDescripcion());
        tvLocation.setText(randomMonument.getCiudad() + ", " + randomMonument.getPais());

        // Cargar la imagen del monumento
        int imagenId = randomMonument.getImgId();
        Drawable drMonument = ContextCompat.getDrawable(this, imagenId);
        ivMonument.setImageDrawable(drMonument);

    }
}