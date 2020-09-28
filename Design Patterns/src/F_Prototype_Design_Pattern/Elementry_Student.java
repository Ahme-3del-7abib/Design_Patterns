package F_Prototype_Design_Pattern;

public class Elementry_Student extends Student {

    public Elementry_Student() {
        level = 1;
        clasName = "Class A";
        clasId = "AA";
    }

    public void setStudentInfo(String name, String address, int age) {

        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void printInfo() {

        System.out.println("Level : " + this.level + " , Class Name : " + this.clasName
                + " , Class Id : " + this.clasId + "\n");
        
        System.out.println("Name : " + this.name + " , Address : " + this.address + " , Age : " + this.age + "\n");

        System.out.println("---------------------------------------------\n");

    }

    @Override
    public Student clone() {
        return new Elementry_Student();
    }
}
