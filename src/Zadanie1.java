import javax.print.attribute.HashPrintServiceAttributeSet;

public class Zadanie1 {
    public static void main(String[] args) {
        String brand = "Seat";
        String model = "Ibiza";
        int productionDate = 2002;
        double price = 20_000.55;

        System.out.println("Sprzedam samochód marki "+ brand + " model " + model + " rok produkcji " + productionDate +
                " za cenę " + price + ".");
    }
}
