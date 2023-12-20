import java.util.List;

public class Exercise {
    //Dostępne składniki to: mozarella, pieczarki, salami, cebula, pomidor, papryka, seler
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Pepperoni", 1200, false, List.of("salami", "papryka", "cebula", "pieczarki"));
        Pizza pizza2 = new Pizza("Capricciosa", 1095, true, List.of("pomidor", "cebula", "pieczarki", "mozarella", "seler"));
        Pizza pizza3 = new Pizza("Capricciosa z salami", 850, false, List.of("pomidor", "cebula", "pieczarki", "mozarella", "seler", "salami"));
        Pizza pizza4 = new Pizza("Mafioso ostra", 1540, false, List.of("salami", "cebula", "pomidor", "papryka"));
        Pizza pizza5 = new Pizza("Margherita", 1010, false, List.of("pomidor", "mozarella"));
        Pizza pizza6 = new Pizza("Wegetariańska", 681, true, List.of("pomidor","cebula","pieczarki","mozarella", "seler", "papryka"));
        Pizza pizza7 = new Pizza("Napoletana", 1423, false, List.of("salami", "papryka", "pomidor", "pieczarki"));
        Pizza pizza8 = new Pizza("Włoska", 959, true, List.of("pomidor","mozarella", "papryka"));
        Pizza pizza9 = new Pizza("Amerykańska", 1345, true, List.of("salami", "pieczarki", "cebula"));
        Pizza pizza10 = new Pizza("Polska", 1060, true, List.of("seler", "papryka", "cebula", "salami", "pieczarki", "pomidor"));


    }
}
