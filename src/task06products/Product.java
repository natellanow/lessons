package task06products;

public class Product {
    private String name;
    private double proteins;
    private double fats;
    private double carbohydrates;
    private int calories;

    public Product(String name) {
        if (name == null || "".equals(name))
            throw new IllegalArgumentException("Введите название продукта");
        this.name = name;
    }


    public Product(String name, double proteins, double fats, double carbohydrates, int calories) {
        if (name == null || "".equals(name))
            throw new IllegalArgumentException("Введите название продукта");
        this.name = name;
        if (proteins <= 0)
            throw new IllegalArgumentException("Вводимое число должно быть больше нуля");
        this.proteins = proteins;
        if (fats <= 0)
            throw new IllegalArgumentException("Вводимое число должно быть больше нуля");
        this.fats = fats;
        if (carbohydrates <= 0)
            throw new IllegalArgumentException("Вводимое число должно быть больше нуля");
        this.carbohydrates = carbohydrates;
        if (calories <= 0)
            throw new IllegalArgumentException("Вводимое число должно быть больше нуля");
        this.calories = calories;
    }


    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getProteins() {
        return proteins;
    }

    public double getFats() {
        return fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public int getCalories() {
        return calories;
    }
}
