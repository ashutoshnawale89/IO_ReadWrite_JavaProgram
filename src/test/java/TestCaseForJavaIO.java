import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.IOprogram.EmployeePayrollService;

public class TestCaseForJavaIO {
      @Test
	public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEnteries() throws Exception {
	List<String> somelines = new ArrayList<String>();
	somelines.add("Id : 001 , Name : Ashutosh ,  Salary : 800000");
	somelines.add("Id : 002 , Name : Nikita ,  Salary : 850000");
	Files.write(Paths.get("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\Java_IO_Class199\\Test1.txt"), somelines, StandardOpenOption.CREATE);
	EmployeePayrollService obj=new EmployeePayrollService();
	Assert.assertEquals(2, obj.listFilesDirectory());
      }
	}

