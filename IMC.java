package indicemassacorporal;
import javax.swing.JOptionPane;
public class IndiceMassaCorporal {
    public static void main(String[] args) {
    String peso = JOptionPane.showInputDialog("Informe seu peso em Kg: ");
    String altura = JOptionPane.showInputDialog("Informe sua altura em metros: ");
    double pesoPessoa = Double.parseDouble(peso);
    double alturaPessoa = Double.parseDouble(altura);
    double imc = (pesoPessoa) / (alturaPessoa * alturaPessoa);
    
    String mensagem = "Seu IMC vale: " + imc;
    JOptionPane.showMessageDialog(null, mensagem);
    
    String mensagem1 = "Magreza grave";
    String mensagem2 = "Magreza moderada";
    String mensagem3 = "Magreza leve";
    String mensagem4 = "Saudável";
    String mensagem5 = "Sobrepeso";
    String mensagem6 = "Obesidade grau I";
    String mensagem7 = "Obesidade grau II";
    String mensagem8 = "Obesidade grau III";
    
    if (imc < 16) {JOptionPane.showMessageDialog(null, mensagem1);}
    
    else if(imc >= 16.0 && < 17.0){JOptionPane.showMessageDialog(null, mensagem2);}
    else if(imc >= 17 && < 18.5) {JOptionPane.showMessageDialog(null, mensagem3);}
    else if(imc >= 18.5 && < 25) {JOptionPane.showMessageDialog(null, mensagem4);}
    else if(imc >= 25 && < 30) {JOptionPane.showMessageDialog(null, mensagem5);}
    else if(imc >= 30 && < 35){ JOptionPane.showMessageDialog(null, mensagem6);}
    else if(imc >= 35 && < 40) {JOptionPane.showMessageDialog(null, mensagem7);}
    
    else{JOptionPane.showMessageDialog(null, mensagem8);}
    
   }
    
}