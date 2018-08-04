package com.capgemini.employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Object converted into bit stream during serialization
public class SerializationMain {

	public static void main(String[] args) {

		Employee employee = new Employee(101, "Pooja", 20_000);
		String filename = "employee.ser";

		try {

			// output stream is used for serialization
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// writing the contents of object employee into disk(server) as a bit stream
			oos.writeObject(employee);

			System.out.println("Serialization successful....");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
