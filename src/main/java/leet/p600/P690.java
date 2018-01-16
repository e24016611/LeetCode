package leet.p600;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import leet.depend.Employee;

public class P690 {
    public int getImportance(List<Employee> employees, int id) {


    	Map<Integer ,Employee> employeesMap = new HashMap<Integer ,Employee>();
    	
    	for(Employee employee:employees){
    		employeesMap.put(employee.id ,employee);
    	}
    	  	
    	return addImportance(employeesMap.get(id) ,employeesMap);
       
    }
    
    public int addImportance(Employee employee ,Map<Integer ,Employee> employeesMap){
    	
    	int importance = employee.importance;
    	
    	if(employee.subordinates != null){
    		
    		for(int id:employee.subordinates){
    			importance += addImportance(employeesMap.get(id) ,employeesMap);
    		}
    		
    	}
    	
    	return importance;
    }
    
}
