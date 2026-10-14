public class StudentMain{
    public static void main(String[] args) {
        Student s1 = new Student("a", "b");
        Student s2 = new Student("b", "c");

        s1.getClub();
        s2.getClub();
        s1.getName();
        s2.getName();
        System.out.println(s1.isSameClub());
    }
}