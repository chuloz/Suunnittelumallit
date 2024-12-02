public class Main {
    public static void main(String[] args) {
        ApiFacade facade = new ApiFacade();

        // Chuck Norris API
        String chuckNorrisApi = "https://api.chucknorris.io/jokes/random";
        try {
            String joke = facade.getAttributeValueFromJson(chuckNorrisApi, "value");
            System.out.println("Chuck Norris -vitsi: " + joke);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Toinen API (esim. valuuttakurssit)
        String forexApi = "https://api.exchangerate-api.com/v4/latest/USD"; // Valitse sopiva API
        try {
            String baseCurrency = facade.getAttributeValueFromJson(forexApi, "base");
            System.out.println("Pohjavaluutta: " + baseCurrency);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}