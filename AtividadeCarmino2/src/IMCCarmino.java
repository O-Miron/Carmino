    import javax.swing.JOptionPane;
public class IMCCarmino {
    public static void main(String[] args) {
        
        double peso, altura, imc;
        
        peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso em Kg?"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura em metros?"));
       (imc) = peso / (altura*altura);
       
        if(imc>=30){
            JOptionPane.showMessageDialog(null, "Seu IMC é: "+ Math.round(imc) + " - Obesidade.");
        }
        else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: "+ Math.round(imc) + " - Sobrepeso.");
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + Math.round(imc) + " - Peso Normal.");
        }
        else if (imc < 18.5) {
            JOptionPane.showMessageDialog(null,"Seu IMC é: " + Math.round(imc) + " - Abaixo do peso.");
        }
        
        
    }
}
