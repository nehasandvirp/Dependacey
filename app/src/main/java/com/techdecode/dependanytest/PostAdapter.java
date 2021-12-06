package com.techdecode.dependanytest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter  extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
   private List<Hero> postList;
    Context context;
    public PostAdapter(Context context, List<Hero> models){
        this.context=context;
        postList=models;
    }
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_user_data, parent, false);
        return new PostViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
    Hero model=postList.get(position);
    holder.txtId.setText(model.getId());
    holder.txtName.setText(model.getName());
    holder.txtUsername.setText(model.getUsername());
    holder.txtEmail.setText(model.getEmail());
   // holder.txtUsername.setText(model.getCompany());
  //  holder.txtUsername.setText(model.getPhone());
   // holder.txtUsername.setText(model.getWebsite());

    }

    @Override
    public int getItemCount() {

        return postList.size();
    }

    public static class PostViewHolder extends  RecyclerView.ViewHolder {

        TextView txtId,txtName,txtUsername,txtEmail;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);

            txtId = itemView.findViewById(R.id.txtId);
            txtName = itemView.findViewById(R.id.txtName);
            txtUsername = itemView.findViewById(R.id.txtUserName);
            txtEmail = itemView.findViewById(R.id.txtEmail);

        }
    }


}
