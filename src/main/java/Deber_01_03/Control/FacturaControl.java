/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_01_03.Control;

import Deber_01_03.Servicio.ClienteServiceImpl;
import Deber_01_03.Servicio.FacturaServiceImpl;
import Deber_01_03.modelo.Cliente;
import Deber_01_03.modelo.Factura;
import java.util.List;

/**
 *
 * @author Juano
 */
public class FacturaControl {

    private final FacturaServiceImpl facturaServiceImpl;
    private final ClienteServiceImpl clienteServiceImpl;

    public FacturaControl() {
        this.facturaServiceImpl = new FacturaServiceImpl();
        this.clienteServiceImpl = new ClienteServiceImpl();
    }

    public String crear(String[] data) {
        var retorno = "No se pudo crear la factura:";
        var numeroFactura = Integer.valueOf(data[0]).intValue();
        var nombreEmpresa = data[1];
        var RUCEmisor = data[2];
        var direccion = data[3];
        var telefono = Integer.valueOf(data[4]).intValue();;
        var cantidadProducto = Integer.valueOf(data[5]).intValue();;
        var costoProducto = Double.valueOf(data[6]).doubleValue();

        var codigo = Integer.valueOf(data[7]).intValue();
        var sucursalPerteneciente = Integer.valueOf(data[8]).intValue();
        var nombre = data[9];
        var cedula = data[10];
        var direccionC = data[11];
        var celular = data[12];

        if (numeroFactura < 1) {
            retorno += " Numero de factura incorrectos.";

        } else {
            if (cantidadProducto < 0 || costoProducto < 0) {
                retorno += " La cantidad de productos o su costo son incorrectos.";
            } else {

                if (codigo < 1) {
                    retorno += " El codigo del cliente es invalido";

                } else {
                    if (sucursalPerteneciente < 1 || sucursalPerteneciente > 3) {
                        retorno += " La sucursal no es valida.";

                    } else {

                        var cliente = new Cliente(codigo, sucursalPerteneciente, nombre, cedula, direccionC, celular);
                        var factura = new Factura(numeroFactura, nombreEmpresa, RUCEmisor,
                                direccion, telefono, cantidadProducto, costoProducto, cliente);
                        this.facturaServiceImpl.crear(factura);
                        this.clienteServiceImpl.crear(cliente);
                        retorno = "Factura NUM." + factura.getNumeroFactura()
                                + " - Cliente con codigo." + cliente.getCodigo()
                                + " creados correctamente";
                    }
                }
            }
        }
        return retorno;
    }

    public final List<Factura> listar() {
        return this.facturaServiceImpl.listar();

    }

    public final List<Cliente> listarC() {
        return this.clienteServiceImpl.listar();

    }

   public String eliminarF(String[] data) {
        var retorno = "No se elimino la factura";
        var codigoFactura =  Integer.valueOf(data[0]).intValue();
        var x = true;
        for (var facturas : this.facturaServiceImpl.listar()) {
            if (facturas.getNumeroFactura() == codigoFactura) {
                x = false;
            } else {
            }
        }
        if (x) {
            retorno += ", no existe la factura ";
        } else {
            this.facturaServiceImpl.eliminar(codigoFactura);
            retorno = "Se elimino la factura Num. " + codigoFactura;
        }
        return retorno;
    }

    public String eliminarC(String[] data) {
        var retorno = "No se elimino el Cliente ";
        var codigoCliente =  Integer.valueOf(data[7]).intValue();
        var x = true;
        for (var clientes : this.clienteServiceImpl.listar()) {
            if (clientes.getCodigo() == codigoCliente) {
                x = false;
            } else {
            }
        }
        if (x) {
            retorno += ", no existe el Cliente ";
        } else {
            this.clienteServiceImpl.eliminar(codigoCliente);
            retorno = "Se elimino correctamente al cliente COD. " + codigoCliente;
        }
        return retorno;
    }
    
    public String modificarF(String[] data, FacturaControl facturaControl){
    var retorno="No se modifico correctamente ";
    var numeroFactura=Integer.valueOf(data[0]).intValue();;
    var numeroFacturaModificada= facturaControl;
    var x= true;
        for(var facturas:this.facturaServiceImpl.listar()){
            if(facturas.getNumeroFactura() == numeroFactura){
                x=false;
            }
        }
        if(x){
        retorno+=", no existe la factura ";
        }else{
        this.facturaServiceImpl.modificar(numeroFactura,numeroFacturaModificada.listar().get(0));
        retorno="Se elimino Correctamente a "+numeroFactura;
        }
        return retorno;
    
    
    
    }
}
