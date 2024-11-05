import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Luodaan käyttäjät
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Lisätään suojaamaton asiakirja
        library.addUnprotectedDocument("doc1", new Date(), "Public content of document 1");

        // Lisätään suojattu asiakirja
        library.addProtectedDocument("doc2", new Date(), "Alice");

        // Yritetään käyttää asiakirjoja eri käyttäjillä
        try {
            DocumentInterface doc1 = library.getDocument("doc1");
            System.out.println("doc1 content: " + doc1.getContent(user1)); // pitäisi onnistua kaikille

            DocumentInterface doc2 = library.getDocument("doc2");
            System.out.println("doc2 content for Alice: " + doc2.getContent(user1)); // pitäisi onnistua
            System.out.println("doc2 content for Bob: " + doc2.getContent(user2));   // pitäisi epäonnistua

        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
