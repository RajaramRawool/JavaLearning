package javacourse.codingexercises.oops;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "meat", 19.10, "breadRollType");
        super.addHamburgerAddition1("Chips",1);
        super.addHamburgerAddition1("Drinks",1);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Can't add additional items in deluxe Hamburger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Can't add additional items in deluxe Hamburger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Can't add additional items in deluxe Hamburger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Can't add additional items in deluxe Hamburger");
    }
}
