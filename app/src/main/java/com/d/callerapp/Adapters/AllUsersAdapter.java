package com.d.callerapp.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.d.callerapp.MainActivity;
import com.d.callerapp.Models.User;
import com.d.callerapp.R;

import java.util.ArrayList;

public class AllUsersAdapter extends RecyclerView.Adapter<AllUsersAdapter.AllUsersViewHolder>
{
    Activity context;
    ArrayList<User> UserArrayList;

    public AllUsersAdapter(Activity context,ArrayList<User> userArrayList)
    {
        this.context =context;
        this.UserArrayList=userArrayList;
    }

    @NonNull
    @Override
    public AllUsersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_users,parent,false);
        AllUsersViewHolder allUsersAdapter = new AllUsersViewHolder(view);
        return allUsersAdapter;
    }

    @Override
    public void onBindViewHolder(@NonNull AllUsersViewHolder holder, int position) {
        User user = UserArrayList.get(position);
        holder.textViewName.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        return UserArrayList.size();
    }

    public class AllUsersViewHolder extends RecyclerView.ViewHolder
    {
        TextView textViewName;
        Button button;

        public AllUsersViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName =  (TextView)itemView.findViewById(R.id.itemName);
            button =itemView.findViewById(R.id.callButton);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    User user = UserArrayList.get(getAbsoluteAdapterPosition());
                    ((MainActivity)context).callUser(user);
                }
            });
        }
    }
}
