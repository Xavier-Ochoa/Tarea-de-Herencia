import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Perro perro = new Perro();
        System.out.println("Ingrese los datos del perro:");
        System.out.print("Nombre: ");
        perro.setNombre(scanner.nextLine());
        System.out.print("Edad: ");
        perro.setEdad(scanner.nextInt());
        scanner.nextLine();


        Gato gato = new Gato();
        System.out.println("\nIngrese los datos del gato:");
        System.out.print("Nombre: ");
        gato.setNombre(scanner.nextLine());
        System.out.print("Edad: ");
        gato.setEdad(scanner.nextInt());


        System.out.println("\nAnimal: Perro");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Edad: " + perro.getEdad() + " años");
        System.out.println("Sonido: " + perro.hacerSonido());

        System.out.println("\nAnimal: Gato");
        System.out.println("Nombre: " + gato.getNombre());
        System.out.println("Edad: " + gato.getEdad() + " años");
        System.out.println("Sonido: " + gato.hacerSonido());

        scanner.close();
    }
}
