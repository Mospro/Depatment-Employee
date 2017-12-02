package waled.department_employeelistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Log.d(TAG , "OnCreate: Started.");
        ListView deparmentListView = (ListView) findViewById(R.id.departmentListView);


        //Create Department Objects
        DepartmentAttributes dep1 = new DepartmentAttributes("Math" , "10" , "5");
        DepartmentAttributes dep2 = new DepartmentAttributes("History" , "20" , "10");
        DepartmentAttributes dep3 = new DepartmentAttributes("Computer Science" , "30" , "20");
        DepartmentAttributes dep4 = new DepartmentAttributes("Science" , "40 " , "30");
        DepartmentAttributes dep5 = new DepartmentAttributes("English" , "50" , "40");
        DepartmentAttributes dep6 = new DepartmentAttributes("Frensh " , "60" , "50");
        DepartmentAttributes dep7 = new DepartmentAttributes("Math" , "10" , "5");
        DepartmentAttributes dep8 = new DepartmentAttributes("History" , "20" , "10");
        DepartmentAttributes dep9 = new DepartmentAttributes("Computer Science" , "30" , "20");
        DepartmentAttributes dep10 = new DepartmentAttributes("Science" , "40 " , "30");
        DepartmentAttributes dep11 = new DepartmentAttributes("English" , "50" , "40");
        DepartmentAttributes dep12 = new DepartmentAttributes("Frensh " , "60" , "50");

        //Add DepartmentAttributes Objects to the ArrayList
        ArrayList<DepartmentAttributes> departmentList = new ArrayList<>();
        departmentList.add(dep1);
        departmentList.add(dep2);
        departmentList.add(dep3);
        departmentList.add(dep4);
        departmentList.add(dep5);
        departmentList.add(dep6);
        departmentList.add(dep7);
        departmentList.add(dep8);
        departmentList.add(dep9);
        departmentList.add(dep10);
        departmentList.add(dep11);
        departmentList.add(dep12);

        DepartmentListAdapter depAdapter = new DepartmentListAdapter(this , R.layout.department_custom_row , departmentList);
        deparmentListView.setAdapter(depAdapter);

        deparmentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {

                    Intent myIntent = new Intent(view.getContext(),EmployeeMainActivity.class);
                    startActivityForResult(myIntent,0);
                }
            }
        });


    }
}









