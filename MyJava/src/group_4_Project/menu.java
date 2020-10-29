package group_4_Project;

public class menu {

    public static void main(String[] args) {

        methods menu = new methods();
        menu.runMenu();
        shopOwner_1 conectShop = new shopOwner_1();
        conectShop.askRequest("Johny","Bravo","Seiko",true);
        conectShop.information();
    }
}
