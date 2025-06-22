package Coding_Challenges_2;

public class Employee {
    int Emp_ID;
    String Emp_name;
    int Emp_Salary;

    private int GetEmployeeID() {
        return Emp_ID;
    }
    private void SetEmployeeID(int EmpID)
    {
        this.Emp_ID = EmpID;
    }
    private String GetEmployeeName() {
        return Emp_name;
    }
    private void SetEmployeeName(String Emp_name)
    {
        this.Emp_name = Emp_name;
    }
    private double GetEmployeeSalary() {
        return(double) Emp_Salary;
    }
    private void SetEmployeeSalary(int Emp_Salary)
    {
        this.Emp_Salary = Emp_Salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.SetEmployeeID(1);
        emp.SetEmployeeName("John Doe");
        emp.SetEmployeeSalary(50000);
        System.out.println("Employee ID: " + emp.GetEmployeeID() + " Employee Name: " + emp.GetEmployeeName() + " Employee Salary: " + emp.GetEmployeeSalary() );
    }
}
