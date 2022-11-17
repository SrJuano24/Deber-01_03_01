/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_01_03.modelo;

/**
 *
 * @author Juano
 */
public class Cliente {

    private int codigo;
    private int sucursalPerteneciente;
    private String nombre;
    private String cedula;
    private String direccion;
    private String celular;

    public Cliente(int codigo, int sucursalPerteneciente, String nombre, String cedula, String direccion, String celular) {
        this.codigo = codigo;
        this.sucursalPerteneciente = sucursalPerteneciente;
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.celular = celular;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getSucursalPerteneciente() {
        return sucursalPerteneciente;
    }

    public void setSucursalPerteneciente(int sucursalPerteneciente) {
        this.sucursalPerteneciente = sucursalPerteneciente;
    }

    private String SeleccionSucursal() {
        var retorno = "";

        switch (this.sucursalPerteneciente) {
            case 1:
                retorno = "Ingresado en la sucursal Norte";
                break;
            case 2:
                retorno = "Ingresado en la sucursal Central";
                break;
            case 3:
                retorno = "Ingresado en la sucursal Principal";
                break;
        }

        return retorno;
    }

    private String CedulaValida() {
        var retorno = "";
        var longitud = this.cedula.length();
        if (longitud == 10) {
            retorno = "Cedula Valida";

        } else {
            retorno = "Cedula Invalida";
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", sucursalPerteneciente="
                + sucursalPerteneciente + ", el cliente fue: "
                + this.SeleccionSucursal() + ", nombre=" + nombre + ", cedula="
                + cedula + ", la cedula es: " + this.CedulaValida() + ", direccion="
                + direccion + ", celular=" + celular + '}'+"\n";
    }

}
