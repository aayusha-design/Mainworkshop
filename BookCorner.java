public class BookCorner {
    public static void main(String[] args) {

        String[] categories = {"Fiction", "Nepali"};

        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        titles[0][0] = "Asahamati - 5";
        prices[0][0] = 750.0;

        titles[1][0] = "Seto Dharti";
        prices[1][0] = 500.0;

        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);

            for (int j = 0; j < titles[i].length; j++) {

                String title = (titles[i][j] != null) ? titles[i][j] : "N/A";

                System.out.println("Title: " + title);

                System.out.printf("Price: Rs. %.2f%n", prices[i][j]);
            }

            System.out.println(); 
        }
    }
}