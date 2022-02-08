public class Variables {
    public static void main(String[] args) {
        String firstName;
        firstName = "Jan";
        var lastName = "Kowalski";
        final String pesel = "1234567890";
        int age = 25;
        double height = 180;
        double suma = height + 5;

        System.out.println(firstName + " " + lastName + " ma " + age + " lat" );
        System.out.println("Pan " + lastName + " ma pesel " + pesel);
        System.out.println(firstName + " ma wzrost " + height + "cm");
        System.out.println("Jeżeli " + firstName + " urośnie o 5cm, to będzie miał " + suma + "cm");

        firstName = "Krzysztof";
        System.out.println("Imię po zmianie "+ firstName);

    }
}
