/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



/**
 *
 * @author s204e14
 */
public class Usuario {
    
    private String nombre;
    private int IDUsuario;
    private String Direccion;
    private String TelFijo;
    private int Celular;
    private String CorreoElectronico;
    private String Contraseña;

    public Usuario(String nombre, int IDUsuario, String Direccion, String TelFijo, int Celular, String CorreoElectronico, String Contraseña) {
        this.nombre = nombre;
        this.IDUsuario = IDUsuario;
        this.Direccion = Direccion;
        this.TelFijo = TelFijo;
        this.Celular = Celular;
        this.CorreoElectronico = CorreoElectronico;
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelFijo() {
        return TelFijo;
    }

    public void setTelFijo(String TelFijo) {
        this.TelFijo = TelFijo;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    

    @Override
    public String toString() {
        return nombre + ";" + IDUsuario + ";" + Direccion + ";" + TelFijo + ";" + Celular + ";" +CorreoElectronico+";"+ Contraseña ;
    }
    
    
    
    
}
