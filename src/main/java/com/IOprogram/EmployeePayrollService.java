package com.IOprogram;

import java.io.File;
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


	public long listFilesDirectory() throws IOException, InterruptedException  {

		long enteries=0;
		enteries=Files.lines(new File("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\Java_IO_Class199\\Test1.txt").toPath())
				.count();
		System.out.println(enteries);
		return enteries;
	}
}
