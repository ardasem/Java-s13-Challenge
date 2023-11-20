package employeeApp.company;

import java.util.Arrays;

public class Company {

    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public int getId() {
        return id;
    }
    public Company(int id,String name ,double giro, String[] developerNames){
        this.id=id;
        this.name=name;
        this.giro=giro;
        this.developerNames=developerNames;

    }

    public static void addEmployee(int index, String name){
        if(developerName[index].isEmpty()){
            developerNames[index] = name;
        }

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if(giro>=0) {
            this.giro = giro;
        }else{
            System.out.println("Giro cannot be lower than 0;");
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
