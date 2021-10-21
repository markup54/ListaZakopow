package com.example.listazakopow_new;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ZakupyAdapter extends RecyclerView.Adapter<ZakupyAdapter.ProduktViewHolder> {
    private ArrayList<Produkt> produkty;
    private LayoutInflater inflater;

    public ZakupyAdapter(Context context,
                         ArrayList<Produkt> produkty) {
        this.produkty = produkty;
        inflater = LayoutInflater.from(context); // przypisuje widokom ,xml
    }


    // implementacja metod - wygenerowana żarówką
    @NonNull
    @Override
    public ProduktViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // tworzy widoki uruchamiania aktywności

        View itemView = inflater.inflate(R.layout.item_view, parent, false);
        return new ProduktViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProduktViewHolder holder, final int position) {
        // do widoków przypisujemy dane do wyświetlenia
        // na bieżąco

        holder.itemTextView.setText(produkty.get(position).getNazwa());
        holder.itemTextView.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!produkty.get(position).isZaznaczony()){
                    holder.itemTextView.setPaintFlags(
                        holder.itemTextView.getPaintFlags()
                        | Paint.STRIKE_THRU_TEXT_FLAG
                    );
                    produkty.get(position).setZaznaczony(true);
                }
                else{
                    holder.itemTextView.setPaintFlags(
                            holder.itemTextView.getPaintFlags()
                                    & ~Paint.STRIKE_THRU_TEXT_FLAG
                    );
                    produkty.get(position).setZaznaczony(false);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        // zlicza elementy, ile jest elementów do wyświetlenia
        return produkty.size();
    }

    public class ProduktViewHolder extends RecyclerView.ViewHolder {
        public TextView itemTextView;
        public ZakupyAdapter zakupyAdapter;

        public ProduktViewHolder(@NonNull View itemView, ZakupyAdapter adapter) {
            super(itemView);
            itemTextView = itemView.findViewById(R.id.textView);
            this.zakupyAdapter = adapter;

        }
    }
}
