package waled.department_employeelistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.ArrayList;
import java.util.List;


import android.widget.ArrayAdapter;

public class EmployeeListAdapter extends ArrayAdapter<EmployeeAttributes> {

    private static final String TAG = "EmployeeListAdapter";
    private Context mContext;
    private int mResource;


    private static class ViewHolder {
        TextView employeeName;
        TextView employeeAge;
        TextView employeeSalary;

    }

    public EmployeeListAdapter(Context context, int resource, ArrayList<EmployeeAttributes> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String empName = getItem(position).getEmployeeName();
        String empAge = getItem(position).getEmployeeAge();
        String empSalary = getItem(position).getEmployeeSalary();



        final View result;

        //ViewHolder object
        EmployeeListAdapter.ViewHolder holder;


        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder = new ViewHolder();
            holder.employeeName = (TextView) convertView.findViewById(R.id.employeeNameText);
            holder.employeeAge = (TextView) convertView.findViewById(R.id.employeeAgeText);
            holder.employeeSalary = (TextView) convertView.findViewById(R.id.employeeSalary);



            result = convertView;

            convertView.setTag(holder);
        } else {
            holder = (EmployeeListAdapter.ViewHolder) convertView.getTag();
            result = convertView;
        }

        holder.employeeName.setText("Employee Name: " + empName);
        holder.employeeAge.setText("Employee Age: " + empAge);
        holder.employeeSalary.setText("Employee Salary: " + empSalary);






        return convertView;


    }


}