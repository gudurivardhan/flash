package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileWithObjects {
	public static void saveEmployee(Employee e) throws FileNotFoundException, IOException {
		try (FileOutputStream fout=new FileOutputStream("src/practice/employee.txt")){
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			oos.writeObject(e);
			System.out.println("Saved....");
		}
	}
	public static void readEmployee() throws FileNotFoundException, IOException, ClassNotFoundException {
		try (FileInputStream fout=new FileInputStream("src/practice/employee.txt")){
			ObjectInputStream oos=new ObjectInputStream(fout);
			Employee e=(Employee)oos.readObject();
			System.out.println(e.toString());
			System.out.println("Read....");
		}
	}
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		Employee e=new Employee();
		e.setId(1);
		e.setName("Vardhan");
		e.setDept("Devloper");
		saveEmployee(e);
		readEmployee();
	}
}
