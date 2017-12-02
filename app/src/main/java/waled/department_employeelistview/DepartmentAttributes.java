package waled.department_employeelistview;



public class DepartmentAttributes {

    private String departmentName = "";
    private String departmentEmployeeTotal = "";
    private String departmentEmployeeOn = "";

    public DepartmentAttributes(String departmentName, String departmentEmployeeTotal, String departmentEmployeeOn) {
        this.departmentName = departmentName;
        this.departmentEmployeeTotal = departmentEmployeeTotal;
        this.departmentEmployeeOn = departmentEmployeeOn;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentEmployeeTotal() {
        return departmentEmployeeTotal;
    }

    public void setDepartmentEmployeeTotal(String departmentEmployeeTotal) {
        this.departmentEmployeeTotal = departmentEmployeeTotal;
    }

    public String getDepartmentEmployeeOn() {
        return departmentEmployeeOn;
    }

    public void setDepartmentEmployeeOn(String departmentEmployeeOn) {
        this.departmentEmployeeOn = departmentEmployeeOn;
    }
}
