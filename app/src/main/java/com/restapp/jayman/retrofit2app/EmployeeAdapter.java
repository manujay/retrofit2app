package com.restapp.jayman.retrofit2app;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by jayman on 1/11/2017.
 */

public class EmployeeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements Filterable {

    private Context context;
    private ArrayList<EmployeeVO> employeeVOs;
    private ArrayList<EmployeeVO> filteredlists;
    private EmployeeFilter employeeFilter;

    public EmployeeAdapter(Context context, ArrayList<EmployeeVO> employeeVOs) {
        this.context = context;
        this.employeeVOs = employeeVOs;
        this.filteredlists = employeeVOs;
    }

    @Override
    public int getItemCount() {
        return null != filteredlists && filteredlists.size() > 0 ? filteredlists.size() : 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_single_item_employee, parent, false);
        return new EmployeeHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ((EmployeeHolder) holder).textView.setText(
                String.format(Locale.getDefault(), " %s - %s %s ",
                        filteredlists.get(position).getEmployeeID(),
                        filteredlists.get(position).getFName(),
                        filteredlists.get(position).getLName()));
    }

    @Override
    public Filter getFilter() {
        if (null == employeeFilter) {
            employeeFilter = new EmployeeFilter();
        }
        return employeeFilter;
    }

    private class EmployeeHolder extends RecyclerView.ViewHolder {
        TextView textView;

        private EmployeeHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item_text);
        }
    }

    private class EmployeeFilter extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults filterResults = new FilterResults();
            if (null != constraint && constraint.length() > 0) {
                ArrayList<EmployeeVO> tempLs = new ArrayList<>();

                for (EmployeeVO em : employeeVOs) {
                    if (em.getFName().toLowerCase().contains(constraint.toString().toLowerCase())) {
                        tempLs.add(em);
                    }
                }

                filterResults.count = tempLs.size();
                filterResults.values = tempLs;


            } else {
                filterResults.count = employeeVOs.size();
                filterResults.values = employeeVOs;
            }
            return filterResults;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {

            filteredlists = (ArrayList<EmployeeVO>) filterResults.values;
            notifyDataSetChanged();

        }
    }
}
