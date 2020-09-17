/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Servicio;
import modelo.Taxi;
import modelo.Usuario;

/**
 *
 * @author toshiba
 */
public class ManejadorDatos {

    public ArrayList<Usuario> cargarUsuarios(File f) throws NumberFormatException, IOException {

        ArrayList listaUsuarios = null;

        if (f.exists()) {

            listaUsuarios = new ArrayList();
            FileReader reader = null;
            BufferedReader buufrd = null;
            try {
                reader = new FileReader(f);
                buufrd = new BufferedReader(reader);
                String line;
                while ((line = buufrd.readLine()) != null) {

                    String[] infoUsuario = line.split(";");
                    String nomUsuario = infoUsuario[0];
                    int IDUsuario = Integer.parseInt(infoUsuario[1]);
                    String nomDireccionDefecto = infoUsuario[2];
                    String telFijo = infoUsuario[3];
                    int celular = Integer.parseInt(infoUsuario[4]);
                    String correo = infoUsuario[5];
                    String contrasena = infoUsuario[6];

                    Usuario user = new Usuario(nomUsuario, IDUsuario, nomDireccionDefecto, telFijo, celular, correo, contrasena);
                    listaUsuarios.add(user);
                }// end while
            } finally {
                buufrd.close();
                reader.close();
            }
        }
        return listaUsuarios;
    }

    public ArrayList<Taxi> cargarTaxis(File f) throws NumberFormatException, IOException {

        ArrayList listaTaxis = null;

        if (f.exists()) {

            listaTaxis = new ArrayList();
            FileReader reader = null;
            BufferedReader buufrd = null;
            try {
                reader = new FileReader(f);
                buufrd = new BufferedReader(reader);
                String line;
                while ((line = buufrd.readLine()) != null) {

                    String[] infoUsuario = line.split(";");
                    String placa = infoUsuario[0];
                    String marca = infoUsuario[1];
                    String idconductor = infoUsuario[2];
                    String modelo = infoUsuario[3];
                    String idpoliza = infoUsuario[4];
                    String idseguro = infoUsuario[5];
                    String fechavencimiento = infoUsuario[6];
                    

                    Taxi ta = new Taxi(placa, marca, idconductor, modelo, idpoliza, idseguro, fechavencimiento);
                    listaTaxis.add(ta);
                }// end while
            } finally {
                buufrd.close();
                reader.close();
            }
        }
        return listaTaxis;
    }

    public ArrayList<Servicio> cargarServicios(File f) throws NumberFormatException, IOException {

        ArrayList listaServicios = null;

        if (f.exists()) {

            listaServicios = new ArrayList();
            FileReader reader = null;
            BufferedReader buufrd = null;
            try {
                reader = new FileReader(f);
                buufrd = new BufferedReader(reader);
                String line;
                while ((line = buufrd.readLine()) != null) {

                    String[] infoServicio = line.split(";");
                    int IDServicio = Integer.parseInt(infoServicio[0]);
                    int IDUser = Integer.parseInt(infoServicio[1]);
                    String DireccionOrigen = infoServicio[2];
                    String FechaServicio = infoServicio[3];
                    String HoraServicio = infoServicio[4];
                    String Placa = infoServicio[5];
                    int valorServicio = Integer.parseInt(infoServicio[6]);

                    Servicio serv = new Servicio(IDServicio, IDUser, DireccionOrigen, FechaServicio, HoraServicio, Placa, valorServicio);
                    listaServicios.add(serv);
                }// end while
            } finally {
                buufrd.close();
                reader.close();
            }
        }
        return listaServicios;
    }

    public boolean guardarUsuario(ArrayList elements, File f) {
        boolean sw = true;
        //creo el archivo

        try {
            FileWriter writer = new FileWriter(f);
            BufferedWriter buffwr = new BufferedWriter(writer);

            for (int i = 0; i < elements.size(); i++) {
//                buffwr.write(elements.elementAt(i).toString());
                buffwr.write(elements.get(i).toString());
                buffwr.write(0x0D);
                buffwr.write(0x0A);
            }

            buffwr.close();
            writer.close();

        } catch (IOException ex) {
            sw = false;
        }

        return sw;
    }

    public boolean guardarServicios(ArrayList elements, File f) {
        boolean sw = true;
        //creo el archivo

        try {
            FileWriter writer = new FileWriter(f);
            BufferedWriter buffwr = new BufferedWriter(writer);

            for (int i = 0; i < elements.size(); i++) {
//                buffwr.write(elements.elementAt(i).toString());
                buffwr.write(elements.get(i).toString());
                buffwr.write(0x0D);
                buffwr.write(0x0A);
            }

            buffwr.close();
            writer.close();

        } catch (IOException ex) {
            sw = false;
        }

        return sw;
    }

    
}
