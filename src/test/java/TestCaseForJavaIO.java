import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

public class TestCaseForJavaIO {
      @Test
	public void givenPathWhenCheckedThenConfirm() {
	Path homePath=Paths.get("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\Java_IO_Class199\\Payroll.txt");
	Assert.assertTrue(Files.exists(homePath));
}
	@Test
      public void givenFileCheckedAreAvailable_NotIfAvailableThenDelete() throws IOException {
    	Path playPath=Paths.get("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\Java_IO_Class199\\"+"/"+"Payroll.txt");  
	    Files.deleteIfExists(Paths.get("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\Java_IO_Class199\\Payroll.txt"));
       Assert.assertTrue(Files.notExists(playPath));
	}
	@Test
	public void givenPathCreateTheDirectory() throws IOException {
    	Path playPath=Paths.get("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\Java_IO_Class199\\"+"/"+"JavaProgram.txt");      
    	Files.createDirectory(playPath);
    	Assert.assertTrue(Files.exists(playPath));
	}
	@Test
	public void givenPathCreateTheFileInGivenDirectory() throws IOException {
      	Path playPath=Paths.get("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\Java_IO_Class199\\");  
    	Path tempFile=Paths.get(playPath+"/temp"+"Demo.txt");  
    	Files.createFile(tempFile);
    	Assert.assertTrue(Files.exists(tempFile));
	}
	
	}

