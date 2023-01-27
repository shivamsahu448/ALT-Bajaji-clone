package com.seeksolution.albalaji.Adpaters;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.seeksolution.albalaji.R;
import com.seeksolution.albalaji.models.SliderModel;
import com.smarteist.autoimageslider.SliderViewAdapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.MyView> {
    private Context context;

    public SliderAdapter(Context context, ArrayList<SliderModel> slider_array) {
        this.context = context;
        this.slider_array = slider_array;
    }

    private ArrayList<SliderModel> slider_array;

    @Override
    public MyView onCreateViewHolder(ViewGroup parent) {
     View view= LayoutInflater.from(context).inflate(R.layout.my_custom_slider,parent,false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(MyView viewHolder, int position) {

        Picasso.get().load(slider_array.get(position).getUrls()).into(viewHolder.imageView);
//        Picasso.get().load(Uri.parse(slider_array.get(i).getImage())).into(holder.imageView);
    }

    @Override
    public int getCount() {
        return slider_array.size();
    }

    public class MyView extends ViewHolder {
        private ImageView imageView;
        public MyView(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.iv_slider);
        }
    }
}
