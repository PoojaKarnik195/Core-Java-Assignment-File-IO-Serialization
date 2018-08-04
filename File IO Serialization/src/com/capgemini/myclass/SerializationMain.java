package com.capgemini.myclass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Object converted into bit stream during serialization
public class SerializationMain {

	public static void main(String[] args) {

		// creating an arraylist which can store 5 objects of myclass
		ArrayList<MyClass> list = new ArrayList<>();

		MyClass mc1 = new MyClass(101, "Pooja", 20_000.18);
		MyClass mc2 = new MyClass(102, "Ramu", 23_900.12);
		MyClass mc3 = new MyClass(103, "Mamu", 12_908.44);
		MyClass mc4 = new MyClass(104, "Samu", 34_908.66);
		MyClass mc5 = new MyClass(105, "Famu", 23_998.77);

		list.add(mc1);
		list.add(mc2);
		list.add(mc3);
		list.add(mc4);
		list.add(mc5);

		String filename = "list.ser";

		try {

			// output stream is used for serialization
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// writing the contents of object employee into disk(server) as a bit stream
			oos.writeObject(list);

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
