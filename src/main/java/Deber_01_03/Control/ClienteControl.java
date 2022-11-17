/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_01_03.Control;

import Deber_01_03.Servicio.ClienteServiceImpl;
import Deber_01_03.modelo.Cliente;
import Deber_01_03.modelo.Factura;
import java.util.List;

/**
 *
 * @author Juano
 */
public class ClienteControl {

    private ClienteServiceImpl clienteServiceImpl;

    public ClienteControl() {
        this.clienteServiceImpl = new ClienteServiceImpl();
    }

    public String crear(String[] data1) {
        var retorno = "No se pudo crear al cliente:";

        var codigo = Integer.valueOf(data1[0]).intValue();
        var sucursalPerteneciente = Integer.valueOf(data1[1]).intValue();
        var nombre = data1[2];
        var cedula = data1[3];
        var direccion = data1[4];
        var celular = data1[5];

        if (codigo < 1) {
            retorno += " Codigo de cliente incorrecto.";
        } else {
            if (sucursalPerteneciente < 1 || sucursalPerteneciente > 3) {
                retorno += " La sucursal no es valida.";
            } else {
                var cliente = new Cliente(codigo, sucursalPerteneciente, nombre,
                        cedula, direccion, celular);
                this.clienteServiceImpl.crear(cliente);
                retorno = "El cliente con COD. " + cliente.getCodigo()
                        + " creado correctamente.";
            }
        }
        return retorno;
    }

    
}
