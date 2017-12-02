package waled.department_employeelistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main_activity);
    }

    public void GoToEmployee(View view) {
        Intent go = new Intent(this, EmployeeMainActivity.class);
        startActivity(go);

    }

    public void GoToDepartment(View view) {
        Intent go = new Intent(this, MainActivity.class);
        startActivity(go);

    }



}
