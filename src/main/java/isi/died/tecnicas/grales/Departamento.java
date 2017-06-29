/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isi.died.tecnicas.grales;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author mdominguez
 */
public class Departamento {
    
    private static Integer IDS=0;
    
    private Integer id;
    private String nombre;
    private Integer cursos;
    private Integer[] puntajes;

    public Departamento() {
        id=++IDS;
        cursos=1;
    }

    public Departamento(String nombre,Integer[] puntajes) {
        this();
        this.nombre = nombre;
        this.puntajes = puntajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public Integer cantidadCursos(){
        return this.cursos;
    }
        
    public void agregarCurso(){
        this.cursos++;
    }
    
    public boolean quitarCurso(){
        if(cursos>1) {
            this.cursos--;
            return true;
        } 
        return false;
    }
    
    public Integer puntaje(){
        return this.puntaje(this.cursos);
    }
    
    
    
    public Integer puntaje(Integer cantCursos){
        if(cantCursos>0 && cantCursos<7) return this.puntajes[cantCursos];
        else return 0;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.id);
        hash = 73 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Departamento other = (Departamento) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

      
    
}
