/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author DanielDeJesus
 */
public class Mixto {
    private int numero_Entero;
    private int numerador;
    private int denominador;
    
    public Mixto(int numero_Entero, int numerador, int denominador){
        this.numero_Entero=numero_Entero;
        this.numerador=numerador;
        this.denominador=denominador;
    }

    public int getNumero_Entero() {
        return numero_Entero;
    }

    public void setNumero_Entero(int numero_Entero) {
        this.numero_Entero = numero_Entero;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Mixto operacion (Mixto m2, int op){
        Mixto m;
        int n_Entero=0,num=0,den=0,num1,den1,num2,den2,op2,op3;
        
        switch(op){
            case 0:
                num1 = (this.numero_Entero * this.denominador) + this.numerador;
                den1 = this.denominador;
                num2 = (m2.numero_Entero * m2.denominador) + m2.numerador;
                den2 = m2.denominador;
        
                op2 = (num1 * den2) + (den1 * num2);
                op3 = (den1 * den2);
        
                n_Entero = (op2 / op3);
                num = (op2 % op3);
                den = op3;
            break;
            case 1:
                num1 = (this.numero_Entero * this.denominador) + this.numerador;
                den1 = this.denominador;
                num2 = (m2.numero_Entero * m2.denominador) + m2.numerador;
                den2 = m2.denominador;
        
                op2 = (num1 * den2) - (den1 * num2);
                op3 = (den1 * den2);
        
                n_Entero = (op2 / op3);
                num = (op2 % op3);
                den = op3;
            break;
            case 2:
                num1 = (this.numero_Entero * this.denominador) + this.numerador;
                den1 = this.denominador;
                num2 = (m2.numero_Entero * m2.denominador) + m2.numerador;
                den2 = m2.denominador;
        
                op2 = (num1 * num2);
                op3 = (den1 * den2);
        
                n_Entero = (op2 / op3);
                num = (op2 % op3);
                den = op3;
            break;
            case 3:
                num1 = (this.numero_Entero * this.denominador) + this.numerador;
                den1 = this.denominador;
                num2 = (m2.numero_Entero * m2.denominador) + m2.numerador;
                den2 = m2.denominador;
        
                op2 = (num1 * den2);
                op3 = (den1 * num2);
        
                n_Entero = (op2 / op3);
                num = (op2 % op3);
                den = op3; 
            break;
        }
        m = new Mixto(n_Entero,num,den);
        return m;
        
    }
    
    public Mixto convertirFraccionario(Mixto m2){
        Mixto m;
        int n_E=0,num,den;
        num = (m2.getNumero_Entero()*m2.getDenominador())+m2.getNumerador();
        den = m2.getDenominador();
        m = new Mixto(n_E,num,den);
        return m;
    }
    
}
