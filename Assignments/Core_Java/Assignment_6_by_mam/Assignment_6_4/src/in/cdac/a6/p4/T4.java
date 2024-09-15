package in.cdac.a6.p4;

class Student {
    // Attributes of the Student class
    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}


public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Chatan", 24, "A");
		s1.displayDetails();
	}

}
