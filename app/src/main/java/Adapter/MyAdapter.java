package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import com.gmail.myrecyclerview1.bmichaelh13.DetailsActivity;
import com.gmail.myrecyclerview1.bmichaelh13.R;

import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

import Model.ListItem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements View.OnClickListener{
    Context context;
    List<ListItem> listItems;




    public MyAdapter(Context context, List listitem) {
        this.context = context;
        this.listItems = listitem;


   }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {

        ListItem item = listItems.get(position);

        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());
        holder.rating.setText(item.getRating());


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @Nullable
        public TextView name;
        @Nullable
        public TextView description;
        @Nullable
        public TextView rating;

            public ViewHolder( View itemView) {
                super(itemView);

                itemView.setOnClickListener(this);

                name = (TextView) itemView.findViewById(R.id.title);
                description = (TextView) itemView.findViewById(R.id.description);
                rating = (TextView) itemView.findViewById(R.id.rating);
            }

        @Override
        public void onClick(View v) {
                //Get the position of the row clicked
            int position = getAdapterPosition();

            ListItem item = listItems.get(position);
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra("name", item.getName());
            intent.putExtra("description", item.getDescription());
            intent.putExtra("rating", item.getRating());

            context.startActivity(intent);

            Objects.requireNonNull(Toast.makeText(context, item.getName(), Toast.LENGTH_LONG)).show();

        }
    }
    }

