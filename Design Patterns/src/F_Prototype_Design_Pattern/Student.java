package F_Prototype_Design_Pattern;

public abstract class Student {

    public String name;
    public String address;
    public int age;
    public int level;
    public String clasName;
    public String clasId;

    public abstract Student clone();
}
