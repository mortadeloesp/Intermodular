/*  Àngel Semperem García*/
public class Cliente {
    private String idCliente;
    private String direccion;
    private String nombre;
    private String correo;

    // Constructor
    public Cliente(String idCliente, String direccion, String nombre, String correo) {
        try {
            setIdCliente(idCliente);
            setDireccion(direccion);
            setNombre(nombre);
            setCorreo(correo);
        } catch (Exception e) {
            System.out.println("Error al crear el cliente: " + e.getMessage());
        }
    }

    // Getters y Setters con validaciones
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        try {
            if (idCliente == null || !idCliente.matches("\\w{9}")) {
                System.out.println("ID Cliente debe tener 9 caracteres alfanuméricos.");
                return;
            }
            this.idCliente = idCliente;
        } catch (Exception e) {
            System.out.println("Error en ID Cliente: " + e.getMessage());
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        try {
            if (direccion == null || direccion.length() > 30) {
                System.out.println("La dirección no puede exceder 30 caracteres.");
                return;
            }
            this.direccion = direccion;
        } catch (Exception e) {
            System.out.println("Error en dirección: " + e.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            if (nombre == null || nombre.length() > 20) {
                System.out.println("El nombre no puede exceder 20 caracteres.");
                return;
            }
            this.nombre = nombre;
        } catch (Exception e) {
            System.out.println("Error en nombre: " + e.getMessage());
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        try {
            if (correo == null || !correo.matches("^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,6}$") || correo.length() > 25) {
                System.out.println("Correo inválido o demasiado largo.");
                return;
            }
            this.correo = correo;
        } catch (Exception e) {
            System.out.println("Error en correo: " + e.getMessage());
        }
    }

    // Método para mostrar la información del cliente
    public void mostrarCliente() {
        System.out.println("Cliente:");
        System.out.println("ID: " + idCliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Correo: " + correo);
    }

}
