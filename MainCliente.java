/* Àngel Sempere García*/
public class MainCliente {
    public static void main(String[] args) {
        try {
            System.out.println();
            Cliente cliente = new Cliente("123456789", "Calle Falsa 123 ", "Juan Perez", "juan@example.com");
            cliente.mostrarCliente();
        } catch (Exception e) {
            System.out.println("Error al crear el cliente: " + e.getMessage());
        }
    }
}
