package model;

public class StudentBlockA extends Person{
	public static final String Math_Subject = "Math";
	public static final String Physics_Subject = "Physics";
	public static final String Chemistry_Subject = "Chemistry";
	 
	public StudentBlockA(String id, String name, String address, int priority) {
		 super(id, name, address, priority);
	    }

	@Override
    public String toString() {
        return "StudentBlockA{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + Math_Subject + " - " + Physics_Subject + " - " + Chemistry_Subject +
                '}';
	}
	


}
