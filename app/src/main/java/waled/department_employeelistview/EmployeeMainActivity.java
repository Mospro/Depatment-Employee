package waled.department_employeelistview;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EmployeeMainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_list_view);

        ListView employeeListView = (ListView) findViewById(R.id.employeeListView);

        EmployeeAttributes emp = new EmployeeAttributes("Waled" , "25" , "1000.0");
        EmployeeAttributes emp1 = new EmployeeAttributes("Mohamed" , "30" , "1000.0");
        EmployeeAttributes emp2 = new EmployeeAttributes("Mosaab" , "34" , "1000.0");
        EmployeeAttributes emp3 = new EmployeeAttributes("Taha" , "28" , "1000.0");
        EmployeeAttributes emp4 = new EmployeeAttributes("Mostafa" , "23" , "1000.0");

        ArrayList<EmployeeAttributes> empInfo = new ArrayList<>();
        empInfo.add(emp);
        empInfo.add(emp1);
        empInfo.add(emp2);
        empInfo.add(emp3);
        empInfo.add(emp4);
        empInfo.add(emp);
        empInfo.add(emp1);
        empInfo.add(emp2);
        empInfo.add(emp3);
        empInfo.add(emp4);
        empInfo.add(emp);
        empInfo.add(emp1);
        empInfo.add(emp2);
        empInfo.add(emp3);
        empInfo.add(emp4);

        EmployeeListAdapter empAdapter = new EmployeeListAdapter(this , R.layout.employee_custom_row , empInfo);
        employeeListView.setAdapter(empAdapter);

        employeeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {

                    Intent myIntent = new Intent(view.getContext(),EmployeeInformation.class);
                    startActivityForResult(myIntent,0);
                }
            }
        });


    }
}
