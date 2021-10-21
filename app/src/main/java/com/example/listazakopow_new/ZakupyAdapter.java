package com.example.listazakopow_new;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ZakupyAdapter extends RecyclerView.Adapter<ZakupyAdapter.ProduktViewHolder> { // kliknij żarówkę: create class ProduktViewHolder / żarówka nr3. implement methods
    // będzie rozrzeszało recyclerView adapter
    private ArrayList<String> produkty;
    private LayoutInflater inflater; // ?

    public ZakupyAdapter(Context context, ArrayList<String> produkty) { // czemu context ?
        this.produkty = produkty;
        inflater = LayoutInflater.from(context); // przypisuje widokom ,xml
    }


    // implementacja metod - wygenerowana żarówką
    @NonNull
    @Override
    public ProduktViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // tworzy widoki uruchamiania aktywności
        // na początku, tworzymy je TYLKO raz

        // definiujemy widok
        View itemView = inflater.inflate(R.layout.item_view, parent, false); // false - nie będzie dążyło za root / który widok mamy użyć
        // ADAPTER to taki mostek między danymi(np. lista) i widokami (.xml)
        return new ProduktViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProduktViewHolder holder, int position) { // holder z klasy ProduktViewHolder, pozycja którą mamy wyświetlać
        // do widoków przypisujemy dane do wyświetlenia
        // na bieżąco
        // łączymy widok z danymi

        holder.itemTextView.setText(produkty.get(position)); // element z pozycji position ma być wyświetony
    }

    @Override
    public int getItemCount() {
        // zlicza elementy, ile jest elementów do wyświetlenia
        return produkty.size();
    }

    public class ProduktViewHolder extends RecyclerView.ViewHolder { // żąrówka: create constructor matching super
        // viewHolder jest odpowiedzialny za to jakie dany musimy wykorzystać
        public TextView itemTextView;
        public ZakupyAdapter zakupyAdapter;

        public ProduktViewHolder(@NonNull View itemView, ZakupyAdapter adapter) { // *
            super(itemView);
            itemTextView = itemView.findViewById(R.id.textView);
            this.zakupyAdapter = adapter; // zakupyAdapter będzie tym adapterem *

        }
    }
}
