package model;

public class StudentBlockC extends Person {
	public static final String literature_Subject = "Literature";
	public static final String History_Subject = "History";
	public static final String Geography_Subject = "Geography";
	public StudentBlockC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "CandidateC{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + literature_Subject + " - " + History_Subject + " - " + Geography_Subject +
                '}';
    }


}
