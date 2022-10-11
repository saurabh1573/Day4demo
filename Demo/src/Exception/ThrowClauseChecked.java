package Exception;
//package com.accenture.lkm.exceptions.checked;

import java.io.FileWriter;
import java.io.IOException;

public class ThrowClauseChecked {
	// TODO 1. remove try and catch clause from write method
	// TODO 2. declare IOException on write() method using throws clause
	
	public static void write(String username, String password) throws IOException{
		try (FileWriter fw = new FileWriter("src/files/users.txt", true);) {
			fw.write(username + "," + password);
			fw.write(System.lineSeparator());
			fw.flush();
			System.out.println("record created");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
 
	public static void main(String[] args) {
		try
		{		write("john", "john@123");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

