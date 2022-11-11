/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo;

/**
 *
 * @author lab04
 */
public class Peixe extends Animal{
    
    public Peixe(int tamnaho, String nome){
        // superclasse
        super(tamnaho, nome);
    }
    
    @Override
    public int getTamanho(){
      
        return super.getTamanho();
    }
    
    @Override
    public void mover(){
        System.out.println("Tamanho: "+getTamanho());
        System.out.println("Peixe nada!!!");
    }
    
    
}
