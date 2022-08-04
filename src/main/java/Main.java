public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("nikita", 31);
        Student student2 = new Student("eugene", 31);

        System.out.println(student1.equals(student2));

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
