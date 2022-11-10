package com.IOprogram;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.List;
import static java.nio.file.StandardWatchEventKinds.*;

public class EmployeePayrollService {
	
	
	public void listFilesDirectory() throws IOException, InterruptedException  {
		ArrayList<String> writing = new ArrayList<String>();
			
			writing.add("Id : 001");
			writing.add("Name : Ashutosh");
			writing.add("Salary : 800000");
//		File Exist => Override                        
				// Will create new file if not exist                  
				Files.write(Paths.get("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\Java_IO_Class199\\Test1.txt"), writing, StandardOpenOption.CREATE);
	System.out.println("The Writing is done.......");
	}
public static void main(String[] args) throws IOException, InterruptedException {
	EmployeePayrollService obj=new EmployeePayrollService();
	obj.listFilesDirectory();
}
}
