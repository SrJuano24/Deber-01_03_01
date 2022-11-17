/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Deber_01_03.Servicio;


import Deber_01_03.modelo.Factura;
import java.util.List;

/**
 *
 * @author Juano
 */
public interface FacturaService {

    public abstract void crear(Factura factura);

    public abstract void modificar(int numeroFactura, Factura facturamodificada);

    public abstract void eliminar(int numeroFactura);

    public abstract List<Factura> listar();

}
