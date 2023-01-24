package com.seeksolution.albalaji.Adpaters;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.seeksolution.albalaji.R;
import com.seeksolution.albalaji.models.LockUpModual;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class LockUpAdapter extends RecyclerView.Adapter<LockUpAdapter.ViewHolder> {
    ArrayList<LockUpModual>LockUp_arr;
    private Context context;

    public LockUpAdapter( Context context,ArrayList<LockUpModual> lockUp_arr) {
        LockUp_arr = lockUp_arr;
        this.context = context;
    }

    @NonNull
    @Override
    public LockUpAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.mucustome_recyler_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LockUpAdapter.ViewHolder holder, int position) {
      //  holder.imageView.setImageResource(LockUp_arr.get(position).getImage());
        final  int i=position;
        holder.imageView.setVisibility(View.GONE);
        holder.shimmerFrameLayout.startShimmer();
        holder.imageView.setVisibility(View.VISIBLE);
        Picasso.get().load(Uri.parse(LockUp_arr.get(i).getImage())).into(holder.imageView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                holder.shimmerFrameLayout.stopShimmer();
                holder.shimmerFrameLayout.setVisibility(View.GONE);
                holder.imageView.setVisibility(View.VISIBLE);
            }
        },3000);

    }

    @Override
    public int getItemCount() {
        return LockUp_arr.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        public ShimmerFrameLayout shimmerFrameLayout;
        public ImageView simmer_imageview;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.trend_pic);
            shimmerFrameLayout=itemView.findViewById(R.id.trending_list_shimmer_container);
            simmer_imageview=itemView.findViewById(R.id.iv_trending_simmer);
        }
    }
}
