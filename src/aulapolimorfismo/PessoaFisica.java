/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo;

/**
 *
 * @author aluno.si
 */
public class PessoaFisica extends Pessoa{
    
    private double peso;
    private double altura;
    
    public PessoaFisica(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Implementar");
    }

    @Override
    public void imcH() {
        
    }

}
