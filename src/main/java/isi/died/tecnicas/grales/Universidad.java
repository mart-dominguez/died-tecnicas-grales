/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isi.died.tecnicas.grales;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mdominguez
 */
public class Universidad {
    
    private  List<Departamento> deptos = new ArrayList<>();
    
    public Universidad(){
        Integer[] aux1 = {25,55,65,80,100,100,100};
        Integer[] aux2 = {20,40,45,50,100,100,100};
        Integer[] aux3 = {40,60,70,72,73,100,100};
        Integer[] aux4 = {10,20,30,40,50,60,70};
        this.deptos.add(new Departamento("D1",aux1));
        this.deptos.add(new Departamento("D2",aux2));
        this.deptos.add(new Departamento("D3",aux3));
        this.deptos.add(new Departamento("D4",aux4));
    }

    public List<Departamento> getDeptos() {
        return deptos;
    }

    public void setDeptos(List<Departamento> deptos) {
        this.deptos = deptos;
    }
    
    
}
