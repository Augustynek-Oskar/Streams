import java.util.LinkedList;
import java.util.List;

public class Exercise {

    public static void main(String[] args) {
        Pizza Id1 = new Pizza("Pepperoni", 1200, false, List.of("salami", "papryka", "cebula", "pieczarki"));
        Pizza Id2 = new Pizza("Capricciosa", 1095, true, List.of("pomidor", "cebula", "pieczarki", "mozarella", "seler"));
        Pizza Id3 = new Pizza("Capricciosa z salami", 850, false, List.of("pomidor", "cebula", "pieczarki", "mozarella", "seler", "salami"));
        Pizza Id4 = new Pizza("Mafioso ostra", 1540, false, List.of("salami", "cebula", "pomidor", "papryka"));
        Pizza Id5 = new Pizza("Margherita", 1010, false, List.of("pomidor", "mozarella"));
        Pizza Id6 = new Pizza("Wegetariańska", 681, true, List.of("pomidor","cebula","pieczarki","mozarella", "seler", "papryka"));
        Pizza Id7 = new Pizza("Napoletana", 1423, false, List.of("salami", "papryka", "pomidor", "pieczarki"));
        Pizza Id8 = new Pizza("Włoska", 959, true, List.of("pomidor","mozarella", "papryka"));
        Pizza Id9 = new Pizza("Amerykańska", 1345, true, List.of("salami", "pieczarki", "cebula"));
        Pizza Id10 = new Pizza("Polska", 1060, true, List.of("seler", "papryka", "cebula", "salami", "pieczarki", "pomidor"));

        List <Pizza>pizzaMenu = new LinkedList<>();
        pizzaMenu.add(Id1);
        pizzaMenu.add(Id2);
        pizzaMenu.add(Id3);
        pizzaMenu.add(Id4);
        pizzaMenu.add(Id5);
        pizzaMenu.add(Id6);
        pizzaMenu.add(Id7);
        pizzaMenu.add(Id8);
        pizzaMenu.add(Id9);
        pizzaMenu.add(Id10);

    }

}
