public class Main {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "Muthu", 23, "Computer Science");
            Student student2 = new Student(2, "Dinesh", 18, "Physics");
            Student student3 = new Student(3, "Sasi", 24, "Mathematics");
        } catch (AgeNotWithRangeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
