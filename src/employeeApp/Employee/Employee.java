package employeeApp.Employee;

import java.util.Arrays;

public class Employee {

   private int id;
   private String fullName;
   private String email;
   private String  password;
   private String[] healthplan;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplan=" + Arrays.toString(healthplan) +
                '}';
    }


    public Employee(int id,String fullName ,String email, String password, String[] healthplan){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthplan=healthplan;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplan() {
        return healthplan;
    }

    public void setHealthplan(String[] healthplan) {
        this.healthplan = healthplan;
    }
}
