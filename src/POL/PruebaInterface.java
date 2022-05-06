package POL;

public class PruebaInterface {

    public static void main(String[] args) {

        PorPagar[] objetosPorPagar = new PorPagar[4];

        // Se llama al arreglo con objetos que implementan la interfaz: "PorPagar"
        objetosPorPagar[0] = new Factura("0123", "Silla", 2, 375.00);
        objetosPorPagar[1] = new Factura("01234", "Escritorio", 3, 79.55);

        objetosPorPagar[2] = new EmpleadoAsalariado("Luis", "Escobar", "1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Luisa", "Reyes", "2222", 1800.00);

        System.out.println("Facturas y Empleados procesados en forma polimorficas: \n");
        //Se procesan de forma genérica cada elemento del arreglo "objetosPorPagar"

        for (PorPagar porPagarActual : objetosPorPagar) {

            System.out.printf("%s \n%s: $%,.2f\n\n", porPagarActual.toString(), "Pago vencido", porPagarActual.obtenerMontoPago());

        }

    }

}
