package com.example.foodcoster.Restaurant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodcoster.Category.RecyclerViewCategory;
import com.example.foodcoster.R;

public class RecyclerViewRestaurant extends RecyclerView.Adapter<RecyclerViewRestaurant.myViewHolder>{
    String arrCategorynames[]={"Hari Vadapav","Om Sai","Durga","Pepsi","Hari Om","","cat7"};
    int arrImgs[]={R.drawable.res1,R.drawable.res2,R.drawable.res3,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_home_24,};

    Context context;
    public RecyclerViewRestaurant(Context context){
        this.context=context;
    }
    @NonNull
    @Override

    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater l=LayoutInflater.from (context);
        View v=l.inflate (R.layout.inflater_restaurant,parent,false);
        myViewHolder holder=new myViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.tvCat.setText (arrCategorynames[position]);
        holder.imgimgs.setImageResource (arrImgs[position]);
    }

    @Override
    public int getItemCount() {
        return arrCategorynames.length;
    }

    class myViewHolder extends RecyclerView.ViewHolder {
        ImageView imgimgs;
        TextView tvCat;
        TextView tvTv;
        public myViewHolder(@NonNull View itemView) {
            super (itemView);
            imgimgs=itemView.findViewById (R.id.imgImgs);
            tvCat=itemView.findViewById (R.id.tvCat);

        }
    }
}
