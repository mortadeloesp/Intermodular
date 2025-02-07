/*  Àngel Semperem García*/
    public class Cliente {
        protected String idCliente;
        protected String direccion;
        protected String nombre;
        protected String correoElectronico;

        // Getters y Setters con validaciones
        public String getIdCliente() {
            return idCliente;
        }

        public void setIdCliente(String idCliente) {
            this.idCliente = idCliente;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCorreoElectronico() {
            return correoElectronico;
        }

        public void setCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
        }

        // Método para mostrar la información del cliente
        public void mostrarCliente() {
            System.out.println();
            System.out.println("Cliente:");
            System.out.println("ID Cliente: " + idCliente);
            System.out.println("Nombre: " + nombre);
            System.out.println("Dirección: " + direccion);
            System.out.println("Correo Electrónico: " + correoElectronico);
        }
    }
