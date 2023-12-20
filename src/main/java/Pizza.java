import java.util.List;

public class Pizza {
    private String name;
    private int kcal;
    private boolean vegetarian;
    private List<String> ingredients;
    //Dostępne składniki to: mozarella, pieczarki, salami, cebula, pomidor, papryka, seler

    public Pizza(String name, int kcal, boolean vegetarian, List<String> ingredients) {
        this.name = name;
        this.kcal = kcal;
        this.vegetarian = vegetarian;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getKcal() {
        return kcal;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

}
