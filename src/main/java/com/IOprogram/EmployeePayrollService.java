package com.IOprogram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EmployeePayrollService {
	

public void readEmployeePayroll() throws IOException {
	
	List<String> lines=Files.readAllLines(Paths.get("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\Java_IO_Class199\\Payroll.txt"));
           for (String line:lines) {
        	   System.out.println(line);
           }
}
public void writeEmployeePayrollData() throws IOException {
	ArrayList<String> data=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Ente the id");
	data.add(sc.next());
	System.out.println("Ente the Name");
	data.add(sc.next());
	System.out.println("Ente the Salary");
	data.add(sc.next());	
	Files.write(Paths.get("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\Java_IO_Class199\\Payroll.txt"),data, StandardOpenOption.CREATE);

}
public static void main(String[] args) throws IOException {
	EmployeePayrollService obj=new EmployeePayrollService();
	obj.writeEmployeePayrollData();
	obj.readEmployeePayroll();
}
}
