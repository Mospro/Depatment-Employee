package waled.department_employeelistview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Waled on 11/24/2017.
 */

public class DepartmentListAdapter extends ArrayAdapter<DepartmentAttributes> {

    private static final String TAG = "DepartmentListAdapter";
    private Context mContext;
    private int mResource;

    private static class ViewHolder {

        TextView depName;
        TextView depEmployeeTotal;
        TextView depEmployeeOn;


    }


    public DepartmentListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<DepartmentAttributes> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String depName = getItem(position).getDepartmentName();
        String depEmployeeTotal = getItem(position).getDepartmentEmployeeTotal();
        String depEmployeeOn = getItem(position).getDepartmentEmployeeOn();






        final View result;

        //ViewHolder object
        ViewHolder holder;


        if(convertView == null){
           LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder= new ViewHolder();
            holder.depName = (TextView) convertView.findViewById(R.id.departmentTextView);
            holder.depEmployeeTotal = (TextView) convertView.findViewById(R.id.employeeTotalTextView);
            holder.depEmployeeOn = (TextView) convertView.findViewById(R.id.employeeOntextView);

            result = convertView;

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        holder.depName.setText("Department Name:\n" + depName);
        holder.depEmployeeTotal.setText("Employee Total: " + depEmployeeTotal);
        holder.depEmployeeOn.setText("Employee Total: " + depEmployeeOn);

        return convertView;


    }

    }




