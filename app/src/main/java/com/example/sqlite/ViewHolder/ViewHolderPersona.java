package com.example.sqlite.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sqlite.R;

public class ViewHolderPersona extends RecyclerView.ViewHolder {
    private TextView id, nombre, apellido, edad;

    public ViewHolderPersona(@NonNull View itemView) {
        super(itemView);
        this.id = itemView.findViewById(R.id.txvId);
        this.nombre= itemView.findViewById(R.id.txvNombre);
        this.apellido = itemView.findViewById(R.id.txvApellido);
        this.edad = itemView.findViewById(R.id.txvEdad);
    }

    public TextView getIdPersona(){
        return id;
    }

    public TextView getNombrePersona(){
        return nombre;
    }

    public TextView getApellidoPersona(){
        return apellido;
    }

    public TextView getEdadPersona(){
        return edad;
    }
}
