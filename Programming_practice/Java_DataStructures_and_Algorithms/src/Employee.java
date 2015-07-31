/**
 * Created by elahiz on 4/6/2015.
 */
public class Employee {
    public static int employeeNumber;
    public static String fname;
    public static String lname;
    public static String eMailId;

    //Constructor for Employee class
    public Employee(int employeeNumber, String fname, String lname, String eMailId){
        this.employeeNumber = employeeNumber;
        this.fname = fname;
        this.lname = lname;
        this.eMailId = eMailId;
    }



    //sort the employees using insertion sort
    public static Employee[] sortEmployees(Employee[] comp){
        for(int i = 0; i < comp.length - 1; i++){
            Employee current = comp[i];
            int j = i - 1;

            Employee temp = comp[j];
            while(j >= 0 && temp.employeeNumber >= current.employeeNumber){
                comp[j+1] = comp[j];
                j = j - 1;
                comp[j + 1] = current;
            }
        }

        return comp;

    }

    //main test function
    public static void main(String[] args){
        Employee employee1 = new Employee('1',"Zuhayr","Elahi","email");
        Employee employee2 = new Employee('2',"Jimmy","Manson","anotherEmail");
        Employee employee3 = new Employee('3',"Bob","Billy","anotherEmail");

        Employee[] myCompany = {employee3,employee1,employee2};

        Employee[] sorted = sortEmployees(myCompany);

    }
}
