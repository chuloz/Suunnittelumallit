public class Main {
    public static void main(String[] args) {
        // valitse tyyli A tai B
        UIFactory factory = new AFactory(); // tai uusi BFactory();

        //luo elementit
        Button button = factory.createButton("OK");
        TextField textField = factory.createTextField("Kirjoita tähän");
        Checkbox checkbox = factory.createCheckbox("Muista minut");

        //näytä elementit
        button.display();
        textField.display();
        checkbox.display();

        //muuta tekstiä
        button.setText("Paina tästä");
        textField.setText("syötä tähän jotain");
        checkbox.setText("tarkista teksti");

        //näytä päivitetty teksti
        button.display();
        textField.display();
        checkbox.display();
    }
}
