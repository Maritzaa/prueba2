/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author s204e14
 */
public class Taxi {
    
    private String placa;
    private String marca;
    private String IDConductor;
    private String modelo;
    private String IDPoliza;
    private String IDseguro;
    private String FechaVencimientoTecnomecanica;

    public Taxi(String placa, String marca, String IDConductor, String modelo, String IDPoliza, String IDseguro, String FechaVencimientoTecnomecanica) {
        this.placa = placa;
        this.marca = marca;
        this.IDConductor = IDConductor;
        this.modelo = modelo;
        this.IDPoliza = IDPoliza;
        this.IDseguro = IDseguro;
        this.FechaVencimientoTecnomecanica = FechaVencimientoTecnomecanica;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getIDConductor() {
        return IDConductor;
    }

    public void setIDConductor(String IDConductor) {
        this.IDConductor = IDConductor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getIDPoliza() {
        return IDPoliza;
    }

    public void setIDPoliza(String IDPoliza) {
        this.IDPoliza = IDPoliza;
    }

    public String getIDseguro() {
        return IDseguro;
    }

    public void setIDseguro(String IDseguro) {
        this.IDseguro = IDseguro;
    }

    public String getFechaVencimientoTecnomecanica() {
        return FechaVencimientoTecnomecanica;
    }

    public void setFechaVencimientoTecnomecanica(String FechaVencimientoTecnomecanica) {
        this.FechaVencimientoTecnomecanica = FechaVencimientoTecnomecanica;
    }

    
    

    @Override
    public String toString() {
        return  placa +";" + marca + ";" + IDConductor + ";" + modelo + ";" + IDPoliza + ";" + IDseguro + ";" + FechaVencimientoTecnomecanica;
    }
    
    
    
    
}
