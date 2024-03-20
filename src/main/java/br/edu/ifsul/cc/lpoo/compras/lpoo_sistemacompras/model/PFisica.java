/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.compras.lpoo_sistemacompras.model;

/**
 *
 * @author 20212PF.CC0020
 */
public class PFisica extends Pessoa {
    
    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public PFisica(String CPF, Integer id, String nome) {
        super(id, nome);
        this.CPF = CPF;
    }
    
    
}
