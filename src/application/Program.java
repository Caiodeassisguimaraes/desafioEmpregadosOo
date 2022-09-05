package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String departmentName = sc.next();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		String phone = sc.next();

		Address address = new Address(email, phone);
		Department department = new Department(departmentName, payDay, address);

		System.out.print("Quantos funcionários tem o departamento? ");
		int quantityEmployee = sc.nextInt();
		for (int i = 0; i < quantityEmployee; i++) {
			System.out.println("Dados do funcionário " + (i + 1) + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			System.out.print("Salario: ");
			double employeeSalary = sc.nextDouble();

			Employee employee = new Employee(employeeName, employeeSalary);
			department.addEmployee(employee);
		}
		
		System.out.println();

		//System.out.println(department);
		
		showReport (department);

		sc.close();

	}

	private static void showReport(Department department) {

		System.out.println(department);

	}

}
