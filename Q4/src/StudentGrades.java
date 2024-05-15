import java.util.HashMap;

public class StudentGrades {
    private HashMap<String, Integer> gradesMap;

    public StudentGrades() {
        gradesMap = new HashMap<>();
    }


    public void addStudent(String name, int grade) {
        gradesMap.put(name, grade);
    }


    public void removeStudent(String name) {
        gradesMap.remove(name);
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (gradesMap.containsKey(name)) {
            System.out.println(name + "'s grade is: " + gradesMap.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();


        studentGrades.addStudent("Muthu", 85);
        studentGrades.addStudent("Sasi", 90);
        studentGrades.addStudent("Dinesh", 75);


        studentGrades.displayGrade("Muthu");


        studentGrades.removeStudent("Sasi");


        studentGrades.displayGrade("Sasi");
    }
}
