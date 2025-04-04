package PRG_ED_Mockups_II_y_III;

import PRG_ED_Mockups_I.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ArrayDeCliente {
    private List<Cliente> clientes = new ArrayList<>();

    public void addNewEjemplo(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removeEjemplo(String id) {
        clientes.removeIf(cliente -> cliente.getIdCliente().equals(id));
    }

    public Cliente findById(String id) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    public void updateEjemplo(Cliente clienteActualizado) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdCliente().equals(clienteActualizado.getIdCliente())) {
                clientes.set(i, clienteActualizado);
                break;
            }
        }
    }

    public void queryEjemplo() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void printEjemplo() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
