public class Person {
protected String name;
protected int age;

private int getAge(){
        return age;
    }
public void printInformation(){
        int a = getAge();
        System.out.println("Age: " + a);
    }
}
