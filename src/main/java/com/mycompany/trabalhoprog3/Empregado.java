/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoprog3;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author hugop
 */
public class Empregado {
    private String nome;
    double salario;
    private Date dataContracao;
    
    public Empregado(String n, double s, Date dc) {
        this.nome = n;
        this.salario = s;
        this.dataContracao = dc;
    }
    
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Date getDataContracao() {
        return dataContracao;
    }
    
    public void aumentoSalarial(double percentual) {
        this.salario += (this.salario * (percentual/100));
    }
}
