package task06products;

public class Main {
    public static void main(String[] args) {

        Product Kolbasa = new Product("Колбаса");
        Kolbasa.setCalories(473);
        Kolbasa.setProteins(24.80);
        Kolbasa.setFats(41.50);
        Kolbasa.setCarbohydrates(0.00);

        Product Kefir = new Product("Кефир");
        Kefir.setCalories(53);
        Kefir.setProteins(2.90);
        Kefir.setFats(2.50);
        Kefir.setCarbohydrates(4.00);

        myPermittedProducts checkPoint = new myPermittedProducts();

        System.out.println(checkPoint.checking(Kefir));



    }
}
