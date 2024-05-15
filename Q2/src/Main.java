public class Main {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1, "Muthu", 25);
            System.out.println("Voter 1 created successfully.");

            Voter voter2 = new Voter(2, "Dinesh", 16);
            System.out.println("Voter 2 created successfully.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
