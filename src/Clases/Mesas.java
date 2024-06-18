/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author krist
 */
public class Mesas {
    private String numesa;
    private String idmes;
    private String pers;
    private String nots;
    private boolean ocup;

    public Mesas() {
    }

    public Mesas(String numesa, String idmes, String pers, String nots, boolean ocup) {
        this.numesa = numesa;
        this.idmes = idmes;
        this.pers = pers;
        this.nots = nots;
        this.ocup = ocup;
    }

    public String getNumesa() {
        return numesa;
    }

    public void setNumesa(String numesa) {
        this.numesa = numesa;
    }

    public String getIdmes() {
        return idmes;
    }

    public void setIdmes(String idmes) {
        this.idmes = idmes;
    }

    public String getPers() {
        return pers;
    }

    public void setPers(String pers) {
        this.pers = pers;
    }

    public String getNots() {
        return nots;
    }

    public void setNots(String nots) {
        this.nots = nots;
    }

    public boolean isOcup() {
        return ocup;
    }

    public void setOcup(boolean ocup) {
        this.ocup = ocup;
    }

    
}
