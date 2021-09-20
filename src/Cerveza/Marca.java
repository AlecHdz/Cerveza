/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cerveza;


public class Marca {

    private String nomMarc;
    private String idFab;
    
    public void SetMarca(String cnom, String cid){
        
        setNomMarc(cnom);
        setIdFab(cid);
        
    }

    public String getNomMarc() {
        return nomMarc;
    }

    public void setNomMarc(String nomMarc) {
        this.nomMarc = nomMarc;
    }

    public String getIdFab() {
        return idFab;
    }

    public void setIdFab(String idFab) {
        this.idFab = idFab;
    }
    
    
}
