package com.jonmid.asynctaskinternet.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.asynctaskinternet.Models.Comment;
import com.jonmid.asynctaskinternet.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by software on 21/09/2017.
 */

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {

    List<Comment> commentList = new ArrayList<>();
    Context context;

    // Constructor de la clase
    public CommentAdapter(List<Comment> commentList, Context context) {
        this.commentList = commentList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Encargado de trabajar con el item.xml y sus componentes

        holder.textViewEmail.setText(commentList.get(position).getEmail());
        holder.textViewBody.setText(commentList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textViewEmail;
        TextView textViewBody;

        public ViewHolder(View item) {
            super(item);
            imageView = (ImageView) item.findViewById(R.id.id_img_1);
            textViewEmail = (TextView) item.findViewById(R.id.id_tv_item_email);
            textViewBody = (TextView) item.findViewById(R.id.id_tv_item_body);
        }
    }
}
