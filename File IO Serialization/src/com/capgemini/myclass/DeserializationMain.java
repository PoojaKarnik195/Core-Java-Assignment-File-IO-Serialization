package com.capgemini.myclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//bit stream from disk(server) gets converted into object during deserialization
public class DeserializationMain {

	public static void main(String[] args) {

		ArrayList<MyClass> list;

		// input stream is used for deserialization
		try (FileInputStream fis = new FileInputStream("list.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			// reading the contents from disk(server) into object employee
			list = (ArrayList<MyClass>) ois.readObject();

			System.out.println(list);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
