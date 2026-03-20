package structural_patterns.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private List<Employee> employees=new ArrayList<>();

    public void add(Employee emp){
        employees.add(emp);
    }

    public void showDetails(){
        for (Employee e: employees){
            e.showDetails();
        }
    }
}
