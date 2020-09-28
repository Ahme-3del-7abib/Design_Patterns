package F_Prototype_Design_Pattern;

// I need create 1000 object from ElementryStudent and 1000 object from SecondaryStudent
public class Program_Main {

    public static void main(String[] args) {

        System.out.println("********* Elementry Students *********** ");

        String[] names = {"Ahmed", "Adel", "Habib"};
        String[] addresses = {"Cairo", "Alex", "Subra"};
        int[] ages = {6, 6, 6};

        Elementry_Student student = new Elementry_Student();

        for (int i = 0; i < names.length; i++) {

            Elementry_Student other = (Elementry_Student) student.clone();
            other.setStudentInfo(names[i], addresses[i], ages[i]);

            other.printInfo();
        }

        System.out.println("********* Secondary Students *********** ");

        String[] secondaryNames = {"Kareem", "Mohamed", "Habib"};
        String[] secondaryAddresses = {"Cairo", "suhag", "Giza"};
        int[] secondaryAges = {7, 7, 7};

        SecondaryStudents student2 = new SecondaryStudents();

        for (int i = 0; i < names.length; i++) {

            SecondaryStudents other = (SecondaryStudents) student2.clone();
            other.setStudentInfo(secondaryNames[i], secondaryAddresses[i], secondaryAges[i]);

            other.printInfo();
        }
    }

}
