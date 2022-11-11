/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo;

/**
 *
 * @author lab04
 */
public class Ave extends Animal{
    
    public Ave(int tamanho, String nome){
       // superclasse
       super(tamanho, nome);
    }
    
    @Override
    public void mover(){
        System.out.println("Ave voa!!!");
    }
}
