package com.example.healer.pyeonchang;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by ssop6 on 2017-11-22.
 */

public class BoardRecyclerAdapter extends RecyclerView.Adapter<BoardRecyclerAdapter.ViewHolder> {
    Context context;
    List<ContentData> items;
    //int item_layout;

    public BoardRecyclerAdapter(Context context, List<ContentData> items, int item_layout) {
        this.context=context;
        this.items=items;
        //this.item_layout=item_layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_board_text,null,false);
        v.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ContentData item=items.get(position);
        holder.userName.setText(item.getUserName());
        holder.text.setText(item.getMessage());
        holder.time.setText(item.getTime());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,item.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView userName;
        TextView text;
        TextView time;
        CardView cardview;

        public ViewHolder(View itemView) {
            super(itemView);
            userName = (TextView)itemView.findViewById(R.id.tv_board_user_name);
            text = (TextView)itemView.findViewById(R.id.tv_board_text);
            time = (TextView)itemView.findViewById(R.id.tv_board_time);
            cardview=(CardView)itemView.findViewById(R.id.input_frame_text);
        }
    }

    public void addMessage(ContentData data){
        this.items.add(data);
    }
}
