package task06products;

public class myPermittedProducts {

    private double maxProteins = 15.00;
    private double maxFats = 10.00;
    private double maxCarbohydrates = 30.00;
    private int maxCalories = 200;
    private Product product;

    public myPermittedProducts() {

    }

    public myPermittedProducts(Product product) {
        this.product = product;
    }

    public boolean checking(Product product) {
        if (product.getCalories() > maxCalories
                || product.getCarbohydrates() > maxCarbohydrates
                || product.getFats() > maxFats
                || product.getProteins() > maxProteins) {
            return false;
        } else {
            return true;
        }
    }


    public double getMaxProteins() {
        return maxProteins;
    }

    public double getMaxFats() {
        return maxFats;
    }

    public double getMaxCarbohydrates() {
        return maxCarbohydrates;
    }

    public int getMaxCalories() {
        return maxCalories;
    }
}

