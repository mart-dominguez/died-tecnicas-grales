/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isi.died.tecnicas.grales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mdominguez
 */
public class Estudiante {
    
    private final Integer[] depto1 = {25,41,52, 79,100,100,100};
    private final Integer[] depto2 = {20,43,55, 72,100,100,100};
    private final Integer[] depto3 = {40,47,47,100,100,100,100};
    private final Integer[] depto4 = {10,20,30, 40, 50, 60, 70};

    private final Integer[][] puntajePorDepto = {depto1,depto2,depto3,depto4};
    
    
    public Integer[] elegir(Integer cantidad){
        Integer[] eleccion = {1,1,1,1};
//        return this.elegir(eleccion,cantidad,0);
        return elegirPD(eleccion,cantidad);
    }

    private Integer[] elegir(Integer[] eleccion,Integer cantidad,Integer iniciar){
        Integer[] aux = new Integer[eleccion.length];
        Integer[] res=aux;

        System.arraycopy(eleccion, 0, aux, 0, eleccion.length);
        // si la cantidad es tope listo.
        int elegidos = this.elegidos(eleccion);
        if(elegidos>=cantidad || iniciar==eleccion.length-1) return aux;
        for(int i=iniciar;i<eleccion.length;i++){
            ++aux[i];
            int puntajeAgregado = puntaje(aux);
            Integer[] resNoAgregado = elegir(eleccion,cantidad,i+1);
            if( puntaje(resNoAgregado)>puntajeAgregado  ){
                System.arraycopy(resNoAgregado, 0, res, 0, resNoAgregado.length);
            }
            else {
                System.arraycopy(aux, 0, res, 0, aux.length);
            }
            --aux[i];
        }       
        return res;
    }

    
      private Integer[] elegirPD(Integer[] eleccion,Integer cantidad){
        Integer[]auxs=new Integer[cantidad];
        int puntos = puntaje(eleccion);
        int nroCursos = elegidos(eleccion);
        int seleccionado = 0;
        
        for(int i=0;i<cantidad;i++){
            if(i==0){
                auxs[i]=puntajePorDepto[i][0];
            }else{
                if(i<puntajePorDepto.length){
                    auxs[i]=auxs[i-1]+puntajePorDepto[i][0];
                }
                else{
                    auxs[i]=auxs[i-1];
                }
            }
        }
        
        System.out.println("ARRANQUE ====>"+Arrays.toString(auxs));
        for(int k =4;k<cantidad;k++){
            for(int i =0;i<4;i++){
                //si hay lugar para agregar 1
                if(nroCursos<cantidad){
                    //System.out.println("wengo"+puntos+" busco ("+i+")("+eleccion[i]+"): "+puntajePorDepto[i][eleccion[i]]);                    
                    int ptosAgregando = puntajePorDepto[i][eleccion[i]];
                    if(auxs[k]< auxs[k-1]+ptosAgregando){
                        auxs[k] = auxs[k-1]+ptosAgregando;
                        seleccionado=i;
                    }
                }
            }
           // System.out.println("====>"+Arrays.toString(auxs));
            nroCursos++;
            eleccion[seleccionado]++;
            System.out.println("====>"+Arrays.toString(eleccion));

        }
        return eleccion;
      }
    
    public int puntaje(Integer[] aux){
        int sum = 0;
        for(int i=0;i<aux.length;i++){
            sum+=puntajePorDepto[i][aux[i]];
        }
        return sum;
    }


    public int elegidos(Integer[] aux){
        int sum = 0;
        for(Integer i:aux){
            sum+=i;
        }
        return sum;
    }
       /*
    int knapsack(int value[],int weight[],int n,int C, vector<int> backtrack)
{
 int * M = new int[C+1];
 int i,j,tmp=0,pos=0;
 M[0]=0;
 for(i=1;i<=C;i++)
 {
  M[i] = M[i-1]; // M[i] can be atleast M[i-1]
  pos = i-1 //pos stores the i-weight[j] is the weight filled already if j is the last item added to kanpsack (used to find items in backtracking)
  for(j=0;j<n;j++)
  {
    if(i>=weight[j])
      tmp = M[i-weight[j]]+value[j];
    if(tmp>M[i])
    {
      M[i]=tmp;
      pos = i-weight[j];
    }

  }  
  backtrack.push_back(pos);// after finding the optimal value push its pos
 }
 int ans = M[C];  
 delete[] M;        
 return ans;
/
}*/

}
