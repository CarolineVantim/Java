/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo;

/**
 *
 * @author lab04
 */
public class Sapo extends Animal{
    
    public Sapo(int tamnho, String nome){
         // superclasse
        super(tamnho, nome);
    }
    
    @Override
    public void mover(){
        System.out.println("Sapo pula!!!");
    }
    
}
