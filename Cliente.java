package PRG_ED_Mockups_I;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/*  Àngel Semperem García*/
    public class Cliente {
    private String idCliente;
    private String nombre;
    private String direccion;
    private String correoElectronico;

    public Cliente(String idCliente, String nombre, String direccion, String correoElectronico) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

    public Cliente() {
        // Constructor vacío
    }

    // Getters y Setters
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    // Método para mostrar en formato XML
    public void mostrarClienteToXML() {
        System.out.println("<cliente>");
        System.out.println("    <idcliente>" + idCliente + "</idcliente>");
        System.out.println("    <nombre>" + nombre + "</nombre>");
        System.out.println("    <direccion>" + direccion + "</direccion>");
        System.out.println("    <correoelectronico>" + correoElectronico + "</correoelectronico>");
        System.out.println("</cliente>");
    }

    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", direccion=" + direccion + ", correoElectronico=" + correoElectronico + "]";
    }
}
