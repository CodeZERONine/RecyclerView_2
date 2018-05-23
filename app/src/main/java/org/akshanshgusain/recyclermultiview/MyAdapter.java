package org.akshanshgusain.recyclermultiview;

import android.content.Context;
import android.graphics.ColorSpace;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static org.akshanshgusain.recyclermultiview.MyModel.FIRST_TYPE;
import static org.akshanshgusain.recyclermultiview.MyModel.SECOND_TYPE;
import static org.akshanshgusain.recyclermultiview.MyModel.THIRD_TYPE;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    Context mContext;
    List<MyModel> list;

    public MyAdapter(List<MyModel> list,Context mContext) {
        this.list=list;
        this.mContext=mContext;
    }

    @Override
    public int getItemViewType(int position) {
        MyModel model=list.get(position);
           if(model!=null){
              return model.getType();
            }
        return 0;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
          switch(viewType){
              case FIRST_TYPE:
                  Log.d("gdaysd", String.valueOf(FIRST_TYPE));
                   view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout_1,parent,false);

                     return new FirstViewHolder(view);
              case SECOND_TYPE:
                  Log.d("gdaysd", String.valueOf(SECOND_TYPE));
                   view=LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout_2,parent,false);
                  return new SecondViewHolder(view);
              case THIRD_TYPE:
                  Log.d("gdaysd", String.valueOf(SECOND_TYPE));
                  view=LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout_3,parent,false);
                  return new ThirdViewHolder(view);
          }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyModel model=list.get(position);
        switch(model.getType()){
            case FIRST_TYPE:
                Log.d("BindViewHolder",String.valueOf(FIRST_TYPE));
                ((FirstViewHolder)holder).title.setText(model.getTitle());
                ((FirstViewHolder)holder).title.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(mContext, "GG", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case SECOND_TYPE:
                Log.d("BindViewHolder",String.valueOf(SECOND_TYPE));
                ((SecondViewHolder)holder).title.setText(model.getTitle());
                ((SecondViewHolder)holder).title.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(mContext, "GG", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case THIRD_TYPE:
                Log.d("BindViewHolder",String.valueOf(SECOND_TYPE));
                ((ThirdViewHolder)holder).title.setText(model.getTitle());
                ((ThirdViewHolder)holder).title.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(mContext, "GG", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
        }
       /* ((FirstViewHolder)holder).title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "GG", Toast.LENGTH_SHORT).show();
            }
        });*/


    }

    @Override
    public int getItemCount() {
        return list.size();
        //return 3;

    }



    private class FirstViewHolder extends RecyclerView.ViewHolder{
        private TextView title;

        public FirstViewHolder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.text1);

        }
    }
    private class SecondViewHolder extends RecyclerView.ViewHolder{
        private TextView title;

        public SecondViewHolder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.text2);
        }
    }
    private class ThirdViewHolder extends RecyclerView.ViewHolder{
       private TextView title;

        public ThirdViewHolder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.text3);
        }
    }
}
