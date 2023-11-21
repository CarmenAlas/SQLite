package com.example.sqlite.UI;

import static com.example.sqlite.UI.MainActivity.personaViewModel;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sqlite.Entidades.Personas;
import com.example.sqlite.R;
import com.example.sqlite.databinding.ActivityAddPersonBinding;

public class AddPersonActivity  extends AppCompatActivity {
    private ActivityAddPersonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);

        binding = ActivityAddPersonBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        if(getIntent().getExtras() != null){
            binding.edtID.setText(String.valueOf(getIntent().getIntExtra("Id", 0)));
            binding.edtNombre.setText(getIntent().getStringExtra("Nombre").toString());
            binding.edtApellido.setText(getIntent().getStringExtra("Apellido").toString());
            binding.edtEdad.setText(String.valueOf(getIntent().getIntExtra("Edad", 0)));
        }

        binding.btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Personas persona = new Personas();
                persona.nombrePersona = binding.edtNombre.getText().toString();
                persona.apellidoPersona = binding.edtApellido.getText().toString();
                persona.edadPersona = Integer.parseInt(binding.edtEdad.getText().toString());

                if(binding.edtID.getText().toString().equals("")){
                    personaViewModel.insertPersona(persona);
                }else{
                    persona.idPersona = Integer.parseInt(binding.edtID.getText().toString());
                    personaViewModel.updatePersona(persona);
                }
                finish();
            }
        });
    }
}
