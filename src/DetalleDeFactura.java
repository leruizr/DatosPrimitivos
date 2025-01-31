import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre para la factura o descripcion");
        String nombreFactura = scanner.nextLine();
        System.out.println("Ingrese el precio del primer producto");
        double primerPrecio = scanner.nextDouble();
        System.out.println("Ingrese el precio del segundo producto");
        double segundoPrecio = scanner.nextDouble();

        double calculo = primerPrecio+segundoPrecio;
        double impuesto = calculo * 0.19;
        double montoTotal = calculo+impuesto;

        System.out.println("La factura: " + nombreFactura + " de oficina tiene un total bruto de : $ " + calculo + "con un impuesto de : $ " + impuesto + " y el monto despues de impuesto es de: $ " + montoTotal);

    }
}
