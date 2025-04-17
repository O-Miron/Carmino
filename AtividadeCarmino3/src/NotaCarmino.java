import javax.swing.JOptionPane;
import java.lang.*;
public class NotaCarmino {
    public static void main(String[] args) {
        
        int nota1, nota2, nota3;
        double media;
        
        nota1 = Integer.parseInt(JOptionPane.showInputDialog(" Qual a sua primeira nota?"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog(" Qual a sua segunda nota?"));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog(" Qual a sua terceira nota?"));
        media = (nota1 + nota2+ nota3)/3.0;
        media = Math.round(media);
        
        
        if (media>=7){
            JOptionPane.showMessageDialog(null, "Sua média é: " + media + ". Aprovado!");
        }
        else if (media <6.9 && media >=5){
            JOptionPane.showMessageDialog(null, "Sua média é: " + media + ". Recuperação!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Sua média é: " + media + ". Reprovado");
            
             Object[] options = { "Enzo", "Miron", "Sei lá"};
 JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            
        } 
        
    }
}
