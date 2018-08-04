package com.capgemini.employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//bit stream from disk(server) gets converted into object during deserialization
public class DeserializationMain {

	public static void main(String[] args) {

		Employee employee;

		// input stream is used for deserialization
		try (FileInputStream fis = new FileInputStream("employee.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			// reading the contents from disk(server) into object employee
			employee = (Employee) ois.readObject();

			System.out.println(employee);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
