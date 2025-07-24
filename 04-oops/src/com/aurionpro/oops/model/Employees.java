package com.aurionpro.oops.model;

public class Employees {
	private String name;
	private double salary;
	private double bonus;

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setBonus(double bonus) {
		if (bonus <= (0.20 * salary)) {
			this.bonus = bonus;
		} else {
			this.bonus = (salary * 0.15);
		}
	}

	public void displaySalary() {
		System.out.println(" EmployeeName: " + name + " Salary: " + salary + " BonusSlary: " + (bonus + salary));
	}
}
