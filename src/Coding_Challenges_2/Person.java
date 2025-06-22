package Coding_Challenges_2;

public class Person {
String Name;
int Age;
    public Person(String name, int age) {
        this.Name = name;
        this.Age = age;
        System.out.println("Name: " + Name + "," + " Age: " + Age);
    }

    public static void main(String[] args) {
        Person P1 = new Person("John",25);
        Person P2 = new Person("Alice",30);
    }

}
