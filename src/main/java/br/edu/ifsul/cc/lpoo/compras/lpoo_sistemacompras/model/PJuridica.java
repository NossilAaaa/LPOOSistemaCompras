/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.compras.lpoo_sistemacompras.model;

/**
 *
 * @author 20212PF.CC0020
 */
public class PJuridica extends Pessoa {
    
    private String CPNJ;

    public String getCPNJ() {
        return CPNJ;
    }

    public void setCPNJ(String CPNJ) {
        this.CPNJ = CPNJ;
    }

    public PJuridica(String CPNJ, Integer id, String nome) {
        super(id, nome);
        this.CPNJ = CPNJ;
    }
    
}
