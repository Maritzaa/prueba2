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
public class Servicio {
    
    private int IDServicio;
    private int IDUser;
    private String DirOrigen;
    private String FechaServicio;
    private String HoraServicio;
    private String Placa;
    private int ValorServicio;

    public Servicio(int IDServicio, int IDUser, String DirOrigen, String FechaServicio, String HoraServicio, String Placa, int ValorServicio) {
        this.IDServicio = IDServicio;
        this.IDUser = IDUser;
        this.DirOrigen = DirOrigen;
        this.FechaServicio = FechaServicio;
        this.HoraServicio = HoraServicio;
        this.Placa = Placa;
        this.ValorServicio = ValorServicio;
    }

    public int getIDServicio() {
        return IDServicio;
    }

    public void setIDServicio(int IDServicio) {
        this.IDServicio = IDServicio;
    }

    public int getIDUser() {
        return IDUser;
    }

    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
    }

    public String getDirOrigen() {
        return DirOrigen;
    }

    public void setDirOrigen(String DirOrigen) {
        this.DirOrigen = DirOrigen;
    }

    public String getFechaServicio() {
        return FechaServicio;
    }

    public void setFechaServicio(String FechaServicio) {
        this.FechaServicio = FechaServicio;
    }

    public String getHoraServicio() {
        return HoraServicio;
    }

    public void setHoraServicio(String HoraServicio) {
        this.HoraServicio = HoraServicio;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public int getValorServicio() {
        return ValorServicio;
    }

    public void setValorServicio(int ValorServicio) {
        this.ValorServicio = ValorServicio;
    }
    
    

    @Override
    public String toString() {
        return  IDServicio + ";" + IDUser + ";" + DirOrigen + ";" + FechaServicio + ";" + HoraServicio + ";" + Placa + ";" + ValorServicio ;
    }

    
    
    
}
