package com.ctis487.topinterviewquestions;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.ViewHolderQuestions> {

    private List<String> list;

    public CustomRecyclerViewAdapter(List <String> list){
        this.list = list;

    }

    @NonNull
    @Override
    public ViewHolderQuestions onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        TextView textView = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.text_view_layout,parent,false);
        ViewHolderQuestions vhQuestion = new ViewHolderQuestions(textView);

        return vhQuestion;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderQuestions holder, int position) {
        holder.question.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //responsible for each item on the list
    public static class ViewHolderQuestions extends RecyclerView.ViewHolder{

        TextView question;

        public ViewHolderQuestions(@NonNull TextView itemView) {
            super(itemView);
            question = itemView;
        }
    }
}
