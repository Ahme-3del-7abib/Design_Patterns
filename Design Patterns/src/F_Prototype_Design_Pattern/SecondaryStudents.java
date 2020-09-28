package F_Prototype_Design_Pattern;

public class SecondaryStudents extends Student {

    public SecondaryStudents() {
        level = 2;
        clasName = "Class B";
        clasId = "BB";
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
        return new SecondaryStudents();
    }
    
    
}
