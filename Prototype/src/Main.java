import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create initial recommendation list
        Recommendation sciFiRecommendation = new Recommendation("Science Fiction Enthusiasts");
        sciFiRecommendation.addBook(new Book("Dune", "Frank Herbert", "Science Fiction", 1965));
        sciFiRecommendation.addBook(new Book("Neuromancer", "William Gibson", "Cyberpunk", 1984));

        System.out.println("Welcome to the Book Recommendation System!");
        Recommendation currentRecommendation = sciFiRecommendation;

        while (true) {
            System.out.println("\nCurrent Recommendation:\n" + currentRecommendation);
            System.out.println("Options:");
            System.out.println("1. Clone Recommendation");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Change Target Audience");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    currentRecommendation = currentRecommendation.clone();
                    System.out.println("Recommendation cloned.");
                }
                case 2 -> {
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    currentRecommendation.addBook(new Book(title, author, genre, year));
                    System.out.println("Book added.");
                }
                case 3 -> {
                    System.out.print("Enter title of the book to remove: ");
                    String titleToRemove = scanner.nextLine();
                    currentRecommendation.getBooks().removeIf(book -> book.getTitle().equalsIgnoreCase(titleToRemove));
                    System.out.println("Book removed.");
                }
                case 4 -> {
                    System.out.print("Enter new target audience: ");
                    String newAudience = scanner.nextLine();
                    currentRecommendation.setTargetAudience(newAudience);
                    System.out.println("Target audience updated.");
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}