package exercicio;

import java.util.Scanner;

class Aluno{
    String nome;
    float notas[]=new float[4];
    float media(){
        float media=0;
        
        for(int i=0; i<4; i++){
            media+=notas[i];
        }
        return (media/4);
    }
    float maior(){
        float maior=notas[0];
        
        for(int i=1; i<4; i++){
            if (notas[i]>maior){
                maior=notas[i];
            }
        }
        return maior;
    }
    float menor(){
        float menor=notas[0];
        
        for(int i=1; i<4; i++){
            if (notas[i]<menor){
                menor=notas[i];
            }
        }
        return menor;
    }
    boolean esta_aprovado(){
        boolean estaaprovado=false;
        
        for(int i=0; i<4; i++){
            if(media()>=60){
                estaaprovado=true;
            }else{
                estaaprovado=false;
            }
        }
        return estaaprovado;
    }
}
public class Exercicio {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        
        Aluno alunos [] = new Aluno[3];
        
        for(int i=0; i<3; i++){
            alunos[i] = new Aluno();
        }
        
        for(int i=0; i<3; i++){
            System.out.println("Digite o nome do aluno na posicao "+(i));
            alunos[i].nome=ler.next();
            for(int j=0; j<4; j++){
                System.out.println("Digite a nota da "+(j+1)+" prova do aluno na posicao "+i);
                alunos[i].notas[j]=ler.nextFloat();
                while (alunos[i].notas[j]<0 || alunos[i].notas[j]>100){
                    System.out.println("Digite uma nota válida");
                    alunos[i].notas[j]=ler.nextFloat();
                }
            }
        }
        
        System.out.println("");
        
        for(int i=0; i<3; i++){
            System.out.println("Nome: "+alunos[i].nome);
            System.out.println("Media: "+alunos[i].media());
            System.out.println("Maior: "+alunos[i].maior());
            System.out.println("Menor: "+alunos[i].menor());
            if(alunos[i].esta_aprovado()==true){
                System.out.println("Situacao: Aprovado");
            }else{
                System.out.println("Situcao: Reprovado");
            }
            System.out.println("");
        }
    }
    
}
