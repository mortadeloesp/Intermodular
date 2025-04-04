package PRG_ED_Mockups_II_y_III;

import PRG_ED_Mockups_I.Cliente;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MenuCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeCliente arrayDeCliente = new ArrayDeCliente();

        boolean seguir = true;
        while (seguir) {
            System.out.println("\n*** Menú de Mantenimiento de Clientes ***");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Actualizar");
            System.out.println("4. Consultar");
            System.out.println("5. Imprimir");
            System.out.println("6. Imprimir en XML y guardar en el archivo .xml");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Para consumir el salto de línea después del número

            switch (opcion) {
                case 1: // Insertar
                    Cliente clienteNuevo = new Cliente();

                    // Validar ID PRG_ED_Mockups_I.Cliente (9 caracteres alfanuméricos)
                    String idCliente = "";
                    boolean continuar = false;
                    do {
                        System.out.print("Introduce el ID del cliente (9 caracteres alfanuméricos): ");
                        idCliente = scanner.nextLine();
                        if (idCliente.length() != 9 || !idCliente.matches("\\w{9}")) {
                            System.out.println("Error: El ID cliente debe tener 9 caracteres alfanuméricos.");
                            continuar = true;
                        } else {
                            continuar = false;
                        }
                    } while (continuar);
                    clienteNuevo.setIdCliente(idCliente);

                    // Validar Nombre (máximo 20 caracteres)
                    String nombre = "";
                    do {
                        System.out.print("Introduce el nombre del cliente (máximo 20 caracteres): ");
                        nombre = scanner.nextLine().trim();
                        if (nombre.length() > 20) {
                            System.out.println("Error: El nombre no puede exceder los 20 caracteres.");
                            continuar = true;
                        } else if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                            System.out.println("El nombre solo admite caracteres alfabéticos.");
                            continuar = true;
                        } else {
                            continuar = false;
                        }
                    } while (continuar);
                    clienteNuevo.setNombre(nombre);

                    // Validar Dirección (máximo 30 caracteres)
                    String direccion = "";
                    do {
                        System.out.print("Introduce la dirección del cliente (máximo 30 caracteres): ");
                        direccion = scanner.nextLine().trim();
                        if (direccion.length() > 30) {
                            System.out.println("Error: La dirección no puede exceder los 30 caracteres.");
                            continuar = true;
                        } else {
                            continuar = false;
                        }
                    } while (continuar);
                    clienteNuevo.setDireccion(direccion);

                    // Validar Correo Electrónico (máximo 25 caracteres y formato válido)
                    String correoElectronico = "";
                    do {
                        System.out.print("Introduce el correo electrónico del cliente (máximo 25 caracteres): ");
                        correoElectronico = scanner.nextLine().trim();
                        if (correoElectronico.length() > 25) {
                            System.out.println("Error: El correo electrónico no puede exceder los 25 caracteres.");
                            continuar = true;
                        } else if (!correoElectronico.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
                            System.out.println("Error: El correo electrónico no es válido.");
                            continuar = true;
                        } else {
                            continuar = false;
                        }
                    } while (continuar);
                    clienteNuevo.setCorreoElectronico(correoElectronico);

                    // Añadir cliente a la colección
                    arrayDeCliente.addNewEjemplo(clienteNuevo);
                    break;

                case 2: // Eliminar
                    System.out.print("Introduce el ID del Cliente a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    arrayDeCliente.removeEjemplo(idEliminar);
                    break;

                case 3: // Actualizar
                    System.out.print("Introduce el ID del Cliente a actualizar: ");
                    String idActualizar = scanner.nextLine();
                    Cliente clienteActualizar = arrayDeCliente.findById(idActualizar);
                    if (clienteActualizar != null) {
                        // Validar Nombre
                        String nuevoNombre = "";
                        do {
                            System.out.print("Introduce el nuevo nombre del cliente (máximo 20 caracteres): ");
                            nuevoNombre = scanner.nextLine().trim();
                            if (nuevoNombre.length() > 20) {
                                System.out.println("Error: El nombre no puede exceder los 20 caracteres.");
                                continuar = true;
                            } else if (!nuevoNombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                System.out.println("El nombre solo admite caracteres alfabéticos.");
                                continuar = true;
                            } else {
                                continuar = false;
                            }
                        } while (continuar);
                        clienteActualizar.setNombre(nuevoNombre);

                        // Validar Dirección
                        String nuevaDireccion = "";
                        do {
                            System.out.print("Introduce la nueva dirección del cliente (máximo 30 caracteres): ");
                            nuevaDireccion = scanner.nextLine().trim();
                            if (nuevaDireccion.length() > 30) {
                                System.out.println("Error: La dirección no puede exceder los 30 caracteres.");
                                continuar = true;
                            } else {
                                continuar = false;
                            }
                        } while (continuar);
                        clienteActualizar.setDireccion(nuevaDireccion);

                        // Validar Correo Electrónico
                        String nuevoCorreo = "";
                        do {
                            System.out.print("Introduce el nuevo correo electrónico del cliente (máximo 25 caracteres): ");
                            nuevoCorreo = scanner.nextLine().trim();
                            if (nuevoCorreo.length() > 25) {
                                System.out.println("Error: El correo electrónico no puede exceder los 25 caracteres.");
                                continuar = true;
                            } else if (!nuevoCorreo.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
                                System.out.println("Error: El correo electrónico no es válido.");
                                continuar = true;
                            } else {
                                continuar = false;
                            }
                        } while (continuar);
                        clienteActualizar.setCorreoElectronico(nuevoCorreo);

                        // Actualizar cliente en la colección
                        arrayDeCliente.updateEjemplo(clienteActualizar);
                    } else {
                        System.out.println("Cliente con ID " + idActualizar + " no encontrado.");
                    }
                    break;

                case 4: // Consultar
                    arrayDeCliente.queryEjemplo();
                    break;

                case 5: // Imprimir
                    arrayDeCliente.printEjemplo();
                    break;

                case 6: // Imprimir en XML
                    System.out.println("\n*** Imprimiendo clientes en formato XML ***");
                    StringBuilder xmlContent = new StringBuilder(); // Para almacenar el contenido XML
                    for (Cliente cliente : arrayDeCliente.getClientes()) {
                        // Imprimir por consola
                        cliente.mostrarClienteToXML();

                        // Guardar en el StringBuilder para el archivo
                        xmlContent.append("<cliente>\n");
                        xmlContent.append("    <idcliente>").append(cliente.getIdCliente()).append("</idcliente>\n");
                        xmlContent.append("    <nombre>").append(cliente.getNombre()).append("</nombre>\n");
                        xmlContent.append("    <direccion>").append(cliente.getDireccion()).append("</direccion>\n");
                        xmlContent.append("    <correoelectronico>").append(cliente.getCorreoElectronico()).append("</correoelectronico>\n");
                        xmlContent.append("</cliente>\n");
                    }

                    // Ruta fija para guardar el archivo
                    String rutaArchivo = "/home/angsemgar3/Escritorio/ficheros/clientes.txt";  // Aquí defines la ruta predeterminada

                    // Guardar el contenido XML en el archivo
                    guardarXMLenArchivo(xmlContent.toString(), rutaArchivo);

                    break;

                // Otros casos ...
                case 7: // Salir
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción inválida, por favor intente nuevamente.");
            }
        }
    }

    // Método para guardar clientes en un archivo
    private static void guardarXMLenArchivo(String xmlContent, String rutaArchivo) {
        try (FileWriter writer = new FileWriter(new File(rutaArchivo))) {
            writer.write(xmlContent); // Escribir el contenido XML en el archivo
            System.out.println("Clientes guardados en el archivo " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
