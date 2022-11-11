/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo;

/**
 *
 * @author lab04
 */
public abstract class Animal implements MinhaInterface {
    // Atributos 
    private int tamanho;
    private String nome;
    
    public Animal(int tamanho, String nome){
        this.tamanho = tamanho;
        this.nome = nome;
    }
    
    public void mover(){
        System.out.println("Movendo!!!");
    }
    
    
    public int getTamanho(){
       return  tamanho;
    }
    
    public String getNome(){
       return nome;
    }
}
