package com.collection;

import java.util.HashMap;
import java.util.List;

public class Department {
	private String name;
	private String[] EmpName;
	private List<Employee> Emplist;
	private HashMap<Integer,Employee> Empmap;
	
	public HashMap<Integer, Employee> getEmpmap() {
		return Empmap;
	}
	public void setEmpmap(HashMap<Integer, Employee> empmap) {
		Empmap = empmap;
	}
	public List<Employee> getEmplist() {
		return Emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		Emplist = emplist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getEmpName() {
		return EmpName;
	}
	public void setEmpName(String[] empName) {
		EmpName = empName;
	}

}
