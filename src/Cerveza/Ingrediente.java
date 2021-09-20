/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cerveza;


public class Ingrediente {

    private String nomIng;
    private String descIng;
    
    public void SetIngrediente(String cnom, String cdesc ){
        setNomIng(cnom);
        setDescIng(cdesc);
        System.out.println("Objeto Ingrediente Iniciado");
    }
    
    
    public String getNomIng() {
        return nomIng;
    }

    public void setNomIng(String nomIng) {
        this.nomIng = nomIng;
    }

    public String getDescIng() {
        return descIng;
    }

    public void setDescIng(String descIng) {
        this.descIng = descIng;
    }
  
    
}
