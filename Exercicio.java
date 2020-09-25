package exercicio;
//importando o Scanner
import java.util.Scanner;
//criando a class aluno 
class Aluno{
    //informacoes do aluno 
    String nome;
    float notas[]=new float[4];
    //funcao para calcular media 
    float media(){
        //criando variavel media para ajudar nas contas
        float media=0;
        
        for(int i=0; i<4; i++){
            media+=notas[i];//somando todas as notas na variavel media 
        }
        return (media/4);//retornando a soma dividido por 4, ou seja, a media
    }
    //funcao para achar a maior nota 
    float maior(){
        float maior=notas[0];//criando a variavel maior e colocando a primeira nota dentro dela 
        
        for(int i=1; i<4; i++){
            if (notas[i]>maior){//se alguma nota for maior do que a que estiver na variavel maior
                maior=notas[i];//a varial maior comeca a conter ela
            }
        }
        return maior;//retornando a maior nota
    }
    //funcao para achar a menor nota
    float menor(){
        float menor=notas[0];//criando a variavel menor e colocando a primeira nota dentro dela
        
        for(int i=1; i<4; i++){//se alguma nota for menro do que a que estiver na variavel maior
            if (notas[i]<menor){//a varial menor comeca a conter ela
                menor=notas[i];
            }
        }
        return menor;//retornando a menor nota
    }
    //funcao para saber se o aluno esta aprovado ou nao
    boolean esta_aprovado(){
        boolean estaaprovado=false;//criando e inicializando, com false, a variavel estaaprovado 
        
        for(int i=0; i<4; i++){
            if(media()>=60){//se a media for maior ou igual a 60
                estaaprovado=true;//estaaprovado recebe true
            }else{
                estaaprovado=false;// se nao, recebe false
            }
        }
        return estaaprovado;//retornando a variavel estaaprovado
    }
}
public class Exercicio {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);// inicializando o Scanner
        
        Aluno alunos [] = new Aluno[3];//criando um vetor do tipo Alunos de tamanho 3
        //inicializando o vetor alunos
        for(int i=0; i<3; i++){
            alunos[i] = new Aluno();
        }
        //lendo todas as informacoes de cada aluno 
        for(int i=0; i<3; i++){
            System.out.println("Digite o nome do aluno na posicao "+(i));
            alunos[i].nome=ler.next();
            for(int j=0; j<4; j++){
                System.out.println("Digite a nota da "+(j+1)+" prova do aluno na posicao "+i);
                alunos[i].notas[j]=ler.nextFloat();
                while (alunos[i].notas[j]<0 || alunos[i].notas[j]>100){//verificando se a nota e valida
                    System.out.println("Digite uma nota válida");
                    alunos[i].notas[j]=ler.nextFloat();
                }
            }
        }
        
        System.out.println("");
        //printando a tela todas as informacoes
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
