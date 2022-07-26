/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancox;

/**
 *
 * @author alsgo
 */
public class BancoX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta p1 = new Conta(); //novo objeto p1
        p1.setNumConta(1001);
        p1.setNome("Rafael");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.sacar(70);
        
        
        
        
        Conta p2 = new Conta();
        p2.setNome("Mateus");
        p2.setNumConta(1002); 
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(80);
        p2.sacar(700);
        p2.sacar(570);
        p2.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
        
      
        
        
    }
    
}
