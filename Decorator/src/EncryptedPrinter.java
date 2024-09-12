public class EncryptedPrinter extends PrinterDecorator {

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        printer.print(encryptedMessage);
    }

    private String encrypt(String message) {
        // Yksinkertainen esimerkkisalaus (käännetään merkkijono)
        return new StringBuilder(message).reverse().toString();
    }
}
