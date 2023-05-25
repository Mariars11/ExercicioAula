package prova.revisao;
//classe abstrata
abstract class Employee
{
    //encapsulamento usar o get e o set
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    public abstract double earnings(); //nenhuma implementacao, pois sera sobrescrito
    
    //constructor
    public Employee(String first, String last, String ssn){
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
    }
    public void setFirstName(String first){
         this.firstName = first;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String last){
         this.lastName = last;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setSocialSecurityNumber(String ssn){
         this.socialSecurityNumber = ssn;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
}
//classe concreta
class SalarariedEmployee extends Employee{
    private double weklySalary;
    
    public SalarariedEmployee(String first, String last, String ssn, double salary){
        super(first, last, ssn);
        setWeeklySalary(salary);
    }
    public void setWeeklySalary(double salary){
        this.weklySalary = salary;
    }
    public double getWeeklySalary(){
        return this.weklySalary;
    }
    
    @Override
    public double earnings(){
        return getWeeklySalary();
    }
}
//classe concreta
class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    
    public HourlyEmployee(String first, String last, String ssn, double hourlyWage, double hoursWorked){
        super(first, last, ssn);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }
    public void setWage(double hourlyWage){
        this.wage = hourlyWage;
    }
    public double getWage(){
        return this.wage;
    }
    public void setHours(double hoursWorked){
        this.hours = hoursWorked;
    }
    public double getHours(){
        return this.hours;
    }
    
    @Override
    public double earnings(){
       if(getHours() <= 40){
           return getWage() * getHours();
       } else{
           return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
       }
       
    }
}
public class Revisao {

    public static void main(String[] args) {
        SalarariedEmployee salariedEmployee = new SalarariedEmployee("John", "Smith", "111-11-1111", 800.00); 
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        
        Employee[] employees = new Employee[2];
        
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        
        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);
        }
    }
}
