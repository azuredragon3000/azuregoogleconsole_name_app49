package com.myapp.app49;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.myapp.mylibrary.DB.LeHoi;
import com.myapp.mylibrary.DB.NgayLe;
import com.myapp.mylibrary.boitinhyeu.ModelDanhNgon;

import java.util.List;

public class AdapterContent extends RecyclerView.Adapter<AdapterContent.MViewHolder> {

    List<ModelDanhNgon> listDanhNgon;
    List<LeHoi> listLehoi;
    List<NgayLe> listNgayLe;
    Context context;
    int mCase;
    public AdapterContent(List<ModelDanhNgon> listDanhNgon ,List<LeHoi> leHois, List<NgayLe> ngayLes, Context context, int mCase){
        this.context = context;
        if(mCase == 1){
            this.listDanhNgon = listDanhNgon;
        }else if(mCase == 2){
            this.listLehoi = leHois;
        }else if(mCase == 3){
            this.listNgayLe = ngayLes;
        }
        this.mCase = mCase;
    }

    @NonNull
    @Override
    public MViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rc, parent, false);
        return new MViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MViewHolder holder, int position) {
        if(mCase == 1){
            holder.tv.setText(listDanhNgon.get(position).getContent().toString()); //this.listDanhNgon = listDanhNgon;
        }else if(mCase == 2){
            holder.tv.setText(listLehoi.get(position).getContent().toString());//this.listLehoi = leHois;
        }else if(mCase == 3){
            holder.tv.setText(listNgayLe.get(position).getContent().toString());//this.listNgayLe = ngayLes;
        }
        //holder.tv.setText(list.get(position).getContent().toString());
    }

    @Override
    public int getItemCount() {
        if(mCase == 1){
            return this.listDanhNgon.size();// = listDanhNgon;
        }else if(mCase == 2){
            return this.listLehoi.size();// = leHois;
        }else if(mCase == 3){
            return this.listNgayLe.size();// = ngayLes;
        }else{
            return  0;
        }

        //return list.size();
    }

    public static class MViewHolder extends RecyclerView.ViewHolder{

        TextView tv;
        public MViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.item_tv);
        }
    }
}
