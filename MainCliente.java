import java.util.List;
import java.util.Scanner;

/* Àngel Sempere García*/
public class MainCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String idCliente = "";
        String direccion = "";
        String nombre = "";
        String correoElectronico = "";

        // Solicitamos el ID del cliente
        boolean continuar = false;
        do {
            System.out.print("Introduce el ID del cliente (9 caracteres alfanuméricos): ");
            idCliente = scanner.nextLine();
            if (idCliente.length() != 9 || !idCliente.matches("\\w{9}")) {
                System.out.println("Error: El ID cliente debe tener 9 caracteres alfanuméricos.");
                System.out.println();
                continuar = true;
            } else {
                continuar = false; // Si es válido, se sale del bucle
            }
        } while (continuar);

        // Solicitamos el nombre del cliente
        do {
            System.out.print("Introduce el nombre del cliente (máximo 20 caracteres): ");
            nombre = scanner.nextLine().trim();

            if (nombre.length() > 20) {
                System.out.println("Error: El nombre no puede exceder los 50 caracteres.");
                System.out.println();
                continuar = true;
            } else if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                System.out.println("El nombre solo admite caracteres alfabeticos");
                System.out.println();
                continuar = true;
            } else {
                continuar = false; // Si es válido, se sale del bucle
            }
        } while (continuar);

        // Solicitamos la dirección del cliente
        do {
            System.out.print("Introduce la dirección del cliente (máximo 30 caracteres): ");
            direccion = scanner.nextLine().trim();

            if (direccion.length() > 30) {
                System.out.println("Error: La dirección no puede exceder los 100 caracteres.");
                System.out.println();
                continuar = true;
            } else {
                continuar = false; // Si es válido, se sale del bucle
            }
        } while (continuar);

        // Solicitamos el correo electrónico del cliente
        do {
            System.out.print("Introduce el correo electrónico del cliente: ");
            correoElectronico = scanner.nextLine().trim();
            if (correoElectronico.length() > 25) {
                System.out.println("Error: La longitud del correo maxima es 25.");
                System.out.println();
                continuar = true;
            }else if (!correoElectronico.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
                System.out.println("Error: El correo electrónico no es válido.");
                System.out.println();
                continuar = true;
            } else {
                continuar = false; // Si es válido, se sale del bucle
            }
        } while (continuar);

        // Crear instancia de Cliente con los datos ingresados
        Cliente cliente = new Cliente();
        cliente.setIdCliente(idCliente);
        cliente.setNombre(nombre);
        cliente.setDireccion(direccion);
        cliente.setCorreoElectronico(correoElectronico);

        // Mostrar información del cliente
        cliente.mostrarCliente();

        scanner.close();
    }
}
