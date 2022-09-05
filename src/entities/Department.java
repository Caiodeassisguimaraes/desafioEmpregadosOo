package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;

	private Address address;
	private List<Employee> employees = new ArrayList<>();

	public Department() {

	}

	public Department(String name, int payDay, Address address) {
		super();
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/*
	 * public List<Employee> getEmployee() { return employees; }
	 */

	public void addEmployee(Employee employee) {

		employees.add(employee);

	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public double payroll() {
		double sumTotal = 0.0;

		for (Employee employeeList : employees) {
			sumTotal += employeeList.getSalary();
		}

		return sumTotal;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("FOLHA DE PAGAMENTO: \n");
		sb.append("Departamento Vendas = R$ " + payroll() + "\n");
		sb.append("Pagamento realizado no dia " + getPayDay() + "\n");
		sb.append("Funcion�rios: \n");

		for (Employee employeeList : employees) {
			sb.append(employeeList.getName() + "\n");
			
		}

		sb.append("Para d�vidas favor entrar em contato: " + address.getEmail());

		return sb.toString();

	}

}
