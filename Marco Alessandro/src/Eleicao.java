/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MARCO ANTONIO AND ALESSANDRO PEIXOTO
 */
public class Eleicao {
    
    
    //ATRIBUTOS DINÂMICOS (VALORES VARIÁVEIS DE ACORDO COM A INSERÇÃO PELO USUÁRIO !!
    
    private int votosCandidatoA;
    private int votosCandidatoB;
    private int votosCandidatoC;
    private int votosValidos,totalVotos;
    private int votosNulos,votosBrancos; 
    
    
    //CONSTRUTOR 
    
    public Eleicao(int votosCandidatoA,int votosCandidatoB,int votosCandidatoC,int votosNulos,int votosBrancos){
        
        //INICIALIZANDO OS ATRIBUTOS !!
        this.votosCandidatoA = votosCandidatoA;
        this.votosCandidatoB = votosCandidatoB;
        this.votosCandidatoC = votosCandidatoC;
        this.votosNulos = votosNulos;
        this.votosBrancos = votosBrancos; 
        this.votosValidos = this.votosCandidatoA + this.votosCandidatoB + this.votosCandidatoC;
        this.totalVotos = this.votosValidos + this.votosNulos + this.votosBrancos;
    }   
    //MÉTODOS GET ATRIBUTOS DINÂMICOS !!

    public int getVotosCandidatoA() {
        return votosCandidatoA;
    }

    public int getVotosCandidatoB() {
        return votosCandidatoB;
    }

    public int getVotosCandidatoC() {
        return votosCandidatoC;
    }

    public int getVotosValidos() {
        return votosValidos;
    }

    public int getTotalVotos() {
        return totalVotos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public int getVotosBrancos() {
        return votosBrancos;
    }
    
    //MÉTODOS GET VALORES PERCENTUAIS !!
    //USO DO CASTING !!

    public double getPercVCA() {
      double percA =   ((double)votosCandidatoA / (double)totalVotos )*100; 
        return percA ;
    }
    
    public double getPercVCB() {
      double percB =   ((double)votosCandidatoB / (double)totalVotos )*100; 
        return percB ;
    }
     
    public double getPercVCC() {
      double percC =   ((double)votosCandidatoC / (double)totalVotos )*100; 
        return percC ;
    }
      
    public double getPercVV() {
      double percVV =   ((double)votosValidos / (double)totalVotos )*100;  
        return percVV ;
    }
       
    public double getPercTV() {
      double percTV =   ((double)totalVotos / (double)totalVotos )*100; 
       return percTV ;
    }
        
    public double getPercVN() {
      double percVN =   ((double)votosNulos / (double)totalVotos )*100; 
       return percVN ;
    }
         
    public double getPercVB() {
      double percVB =   ((double)votosBrancos / (double)totalVotos )*100;  
       return percVB ;
    }

    
    //MÉTODO PARA CALCULAR O VENCEDOR !!
    
    public String apurar(){
     //VARIÁVEL PARAR GUARDAR O RESULTADO DA ELEIÇÃO !!
     String resultado = ("");
     
        // SE APENAS UM CANDIDATO VENCER A ELIÇÃO !!
        if(this.votosCandidatoA > this.votosCandidatoB && this.votosCandidatoA > this.votosCandidatoC){resultado = "Vencedor: Candidato A";}
        if(this.votosCandidatoB > this.votosCandidatoA && this.votosCandidatoB > this.votosCandidatoC){resultado = "Vencedor: Candidato B";}
        if(this.votosCandidatoC > this.votosCandidatoA && this.votosCandidatoC > this.votosCandidatoB){resultado = "Vencedor: Candidato C";}
        
        //SE HOUVER EMPATE ENTRE DOIS OU TODOS OS CANDIDATOS !1
        if(this.votosCandidatoA == this.votosCandidatoB && this.votosCandidatoB > this.votosCandidatoC){resultado = "Empate, Necessário 2* Turno";}
        if(this.votosCandidatoA == this.votosCandidatoC && this.votosCandidatoC > this.votosCandidatoB){resultado = "Empate, Necessário 2* Turno";} 
        if(this.votosCandidatoC == this.votosCandidatoB && this.votosCandidatoC > this.votosCandidatoA){resultado = "Empate, Necessário 2* Turno";}
        if(this.votosCandidatoA == this.votosCandidatoB && this.votosCandidatoA == this.votosCandidatoC){resultado = "Empate, Necessário 2* Turno";}
        
        //SE HOUVER UM VENCEDOR MESMO COM EMPATE DOS OUTROS DOIS CANDIDATOS !!
        if(this.votosCandidatoA == this.votosCandidatoB && this.votosCandidatoB < this.votosCandidatoC){resultado = "Vencedor: Candidato C";}
        if(this.votosCandidatoA == this.votosCandidatoC && this.votosCandidatoC < this.votosCandidatoB){resultado = "Vencedor: Candidato B";} 
        if(this.votosCandidatoC == this.votosCandidatoB && this.votosCandidatoC < this.votosCandidatoA){resultado = "Vencedor: Candidato A";} 
        
     //VARIÁVEL DO TIPO (STRING) PARA CONCATENAR COM A VARIÁVEL (resultado)!!   
     String candidatoVencedor =  "" + resultado;
     return candidatoVencedor ; 
    
    }   
}
