package model;

import java.util.Scanner;

public class Student extends Person {
	private String rollNo;
	private float mark;
	private String email;

	public Student(String name, String gender, String birthday, String address, String rollNo, float mark,
			String email) {
		super(name, gender, birthday, address);
		this.rollNo = rollNo;
		this.mark = mark;
		this.email = email;
	}

	public Student() {
	}

	public String getRollNo() {
		return rollNo;
	}

	public boolean setRollNo(String rollNo) {
		if (rollNo != null) {
			this.rollNo = rollNo;
			return true;
		} else {
			System.out.println("Re-enter student code number!.");
			return false;

		}

	}

	public float getMark() {
		return mark;
	}

	public boolean setMark(float mark) {
		if (mark >= 0 && mark <= 10) {
			this.mark = mark;
			return true;
		} else {
			System.out.println("Re-enter the score (score >= 0 && score < 10)!.");
			return false;
		}

	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {
		if (email != null && email.contains("@") && !email.contains(" ")) {
			this.email = email;
			return true;
		} else {
			System.out.println("Re-enter email!.");
			return false;
		}
	}

	public boolean checkScholarship() {
		return mark >= 8;

	}

	public void inputInfo() {
		super.inputInfo();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rollNo:");
		while (!setRollNo(input.nextLine()))
			;

		System.out.println("Enter mark:");
		while (!setMark(Float.parseFloat(input.nextLine())))
			;

		System.out.println("Enter email:");
		while (!setEmail(input.nextLine()))
			;
	}

	public void showStudent() {
		super.showPerson();
		System.out.println("  rollNo: " + rollNo + "   mark: " + mark + "  email: " + email);

	}

}
