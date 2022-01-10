import java.util.*;
//Comparable
 class  Employee implements Comparable {
     String name;
     int age;
    
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    //override the compareTo() method
    @Override
    public int compareTo(Object o){
        return this.age -  ((Employee)o).age;
    }
}
public class ComparableDemo
{
    public static void main(String[] args) {
    List<Employee> empList = new ArrayList<Employee>();
    //Insertion
	empList.add(new Employee("Pat", 29));
	empList.add(new Employee("Ade", 28));
	empList.add(new Employee("Hari", 23));
	
	System.out.println("Before Sorting: ");
	for ( Employee e : empList){
	    System.out.print("[ Emplyee Age : "+e.age+" ]");
	}
	//Sorting
	Collections.sort(empList);
	
	System.out.println("After Sorting: ");
	for ( Employee e : empList){
	    System.out.print("[ Emplyee Age : "+e.age+" ]");
	}
	
	
	}
}
