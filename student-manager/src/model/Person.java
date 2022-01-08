package model;

import java.util.Scanner;

public class Person {
	private String name;
	private String gender;
	private String birthday;
	private String address;

	public Person(String name, String gender, String birthday, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}

	public void inputInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name:");
		name = input.nextLine();
		System.out.println("Enter gender:");
		gender = input.nextLine();
		System.out.println("Enter birthday:");
		birthday = input.nextLine();
		System.out.println("Enter address:");
		address = input.nextLine();
	}

	public void showPerson() {
		System.out.print(
				"Name:  " + name + "  Gender:  " + gender + "   Birthday:  " + birthday + "  Address:  " + address);

	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
