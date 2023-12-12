/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoprog3;

import java.util.Date;

/**
 *
 * @author hugop
 */
public class Secretario extends Empregado {
    private int turno;
    
    public Secretario(String n, double s, Date dc, int t) {
        super(n, s, dc);
        this.turno = t;
    }
    
    public int getTurno() {
        return this.turno;
    }
    
    public String getTurnoString() {
        return switch (this.turno) {
            case 1 -> "Manha";
            case 2 -> "Tarde";
            case 3 -> "Noite";
            default -> "Desconhecido";
        };
    }
    
    public void setTurno(int t) {
        this.turno = t;
    }
    
    
}
