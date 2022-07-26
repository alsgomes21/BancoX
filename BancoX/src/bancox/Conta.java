/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancox;

/**
 *
 * @author alsgo
 */
public class Conta {
    protected String tipo;
    public int numConta;
    private String nome;
    private double saldo;
    private boolean status;
    
    //Métodos Especiais
    public void estadoAtual(){
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Nome: " +this.getNome());
        System.out.println("Saldo: " +this.getSaldo());
        System.out.println("Status: " +this.getStatus());
    
}
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A conta não pode ser fechada pois a há saldo na mesma");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("A conta não pode ser fechada pois está em debito");
        }
        else { 
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
                    
    }
    
     public void depositar(double v) {
         if (this.getStatus()) {
            // this.saldo = this.saldo + v; mexendo no atributo
             this.setSaldo(this.getSaldo() + v); // mexendo no método
             System.out.println("Deposito realizado com sucesso na conta de " + this.getNome());  
         }
         else{
             System.out.println("Impossível depositar pois a conta não está ativa");
         }
        
    }
    
    public void sacar(double v ) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Saque efetuado com sucesso na conta de " + this.getNome());
            
                
            }else {
                System.out.println("Operação não efetuado por falta de saldo em conta"); 
            } 
        }else {System.out.println("Operação nao efetuada, pois a conta não esta ativa"); 
    }
}

    public void pagarAnuidade (){
     int v = 0;
    if (this.getTipo()== "CC"){
        v = 12;
    }else if (this.getTipo() == "CP"){
        v = 20;
    }
    if(this.getStatus()){
        this.setSaldo(this.getSaldo()- v);
        System.out.println("Anuidade Paga");
    } else{
        System.out.println("Impossível pagar uma conta desativada");
    }
    
    
    }
   
    
   
    
    // Métodos Especiais

    public Conta() {
        this.saldo = 0;
        this.status = false;
        
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
    
}
