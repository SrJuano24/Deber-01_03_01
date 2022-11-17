/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_01_03.Servicio;


import Deber_01_03.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juano
 */
public class ClienteServiceImpl implements ClienteService {

    private final List<Cliente> clienteList;

    public ClienteServiceImpl() {
        this.clienteList = new ArrayList<>();
    }

    @Override
    public void crear(Cliente cliente) {
        this.clienteList.add(cliente);
    }

    @Override
    public void modificar(int codigoCliente, Cliente clienteModificado) {
        var indice = 0;
        for (var cliente : this.clienteList) {
            if (cliente.getCodigo() == codigoCliente) {
                this.clienteList.set(indice, clienteModificado);
                break;
            } else {
                indice++;
            }
        }

    }

    @Override
    public void eliminar(int codigoCliente) {
        var indice = 0;
        for (var cliente : this.clienteList) {
            if (cliente.getCodigo() == codigoCliente) {
                this.clienteList.remove(indice);
                break;
            } else {
                indice++;
            }
        }
    }

    @Override
    public List<Cliente> listar() {
        return this.clienteList;
    }
}
