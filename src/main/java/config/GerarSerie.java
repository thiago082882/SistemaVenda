/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/**
 *
 * @author thiag
 */
public class GerarSerie {
    int dado;
    String numero;
    
    public String numeroSerie(int dado){
        this.dado=dado + 1;
       if(( this.dado>=10000000)&&(this.dado<=100000000)){
           numero= ""+this.dado;
       }
        if  ((this.dado>=1000000)&&(this.dado<=10000000)){
           numero="0"+this.dado;
       }
         if  ((this.dado>=100000)&&(this.dado<=1000000)){
           numero="00"+this.dado;
       }
          if  ((this.dado>=10000)&&(this.dado<=100000)){
           numero="000"+this.dado;
       }
             if  ((this.dado>=1000)&&(this.dado<=100000)){
           numero="0000"+this.dado;
       }
                if  ((this.dado>=100)&&(this.dado<=1000)){
           numero="00000"+this.dado;
       }
                   if  ((this.dado>=100)&&(this.dado<=1000)){
           numero="000000"+this.dado;
       }
                      if  ((this.dado>=10)&&(this.dado<=100)){
           numero="0000000"+this.dado;
       }
                         if  ((this.dado<10)){
           numero="000000000"+this.dado;
       }
        return this.numero;
        
    }
    
}
