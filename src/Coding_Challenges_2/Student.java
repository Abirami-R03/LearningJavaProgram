package Coding_Challenges_2;

public class Student {
    String name;
    int rollNo;
    String section;
    public Student(String name,int rollNo, String section)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }
    void displayinfo()
    {
        System.out.println("Student: " + name + "," + " Roll No: " + rollNo + "," + " Section: " + section);
    }

    public static void main(String[] args) {
        Student S = new Student("Bob", 101, "A");
        S.displayinfo();
    }
}
