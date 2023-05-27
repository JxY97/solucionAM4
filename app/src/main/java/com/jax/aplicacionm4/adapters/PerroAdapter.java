package com.jax.aplicacionm4.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jax.aplicacionm4.R;

public class PerroAdapter extends RecyclerView.Adapter<PerroAdapter.PerroViewHolder> {

    private Context context;
    private int[] perroImages = {R.drawable.perro1, R.drawable.perro2, R.drawable.perro3, R.drawable.perro4, R.drawable.perro5};

    public PerroAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public PerroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_cardview, parent, false);
        return new PerroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PerroViewHolder holder, int position) {
        int perroImage = perroImages[position];
        holder.imageView.setImageResource(perroImage);
    }

    @Override
    public int getItemCount() {
        return perroImages.length;
    }

    public static class PerroViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public PerroViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}

