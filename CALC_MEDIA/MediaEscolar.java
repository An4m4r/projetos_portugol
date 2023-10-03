import javax.swing.JOptionPane;

public class MediaEscolar{

public static void main( String [] args) {

//Faça um algaritmo que leia pro usuario o nome e 3 notas calcule a média e mostre
//na tela.

//Entrada de dados em java
String nome = JOptionPane.showInputDialog(null, "Digite o nome do Aluno(a)");
float nota1=  Float.parseFloat (JOptionPane.showInputDialog(null, "Digite a 1 nota"));
float nota2=  Float.parseFloat (JOptionPane.showInputDialog(null, "Digite a 2 nota"));
float nota3=  Float.parseFloat (JOptionPane.showInputDialog(null, "Digite a 3 nota"));

float media = (nota1 + nota2 + nota3 ) /3;

System.out.println("Nome:" + nome + "sua média final é:" + media);
JOptionPane.showInputDialog(null, "Nome:" + nome + "sua média final é :" + media);

 
}

}