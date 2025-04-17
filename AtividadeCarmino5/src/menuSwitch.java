import javax.swing.JOptionPane;
public class menuSwitch {
    public static void main(String[] args) {
        
        testeSwitch();
       
    }
    public static void menuIf(){
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU DE ATENDIMENTO \n"
                + "1- Suporte técnico"
                + "\n2 - Financeiro"
                + "\n3 - Falar com atendente"
                + "\n4 - Cancelar serviço"
                + "\n5 - Encerrar atendimento"));
        
        if (opcao == 1){
            JOptionPane.showMessageDialog(null, "SUPORTE TÉCNICO");
        }
        else if (opcao == 2){
            JOptionPane.showMessageDialog(null, "FINANCEIRO");
        }
        else if (opcao == 3){
            JOptionPane.showMessageDialog(null, "FALAR COM ATENDENTE");
        }
        else if (opcao == 4){
            JOptionPane.showMessageDialog(null, "CANCELAR SERVIÇO");
        }
        else if (opcao == 5){
            JOptionPane.showMessageDialog(null, "ENCERRAR ATENDIMENTO");
        }
        else {
            JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente");
        }
        
    }
    public static void testeSwitch(){
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU DE ATENDIMENTO \n"
                + "1- Suporte técnico"
                + "\n2 - Financeiro"
                + "\n3 - Falar com atendente"
                + "\n4 - Cancelar serviço"
                + "\n5 - Encerrar atendimento"));
        
        switch (opcao){
            case 1:
                JOptionPane.showMessageDialog(null, "SUPORTE TÉCNICO");
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "FINANCEIRO");
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "FALAR COM ATENDENTE");
                break;
             
            case 4:
                JOptionPane.showMessageDialog(null, "CANCELAR SERVIÇO");
                break;
                
            case 5:
                JOptionPane.showMessageDialog(null, "ENCERRAR ATENDIMENTO");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente");
                
        }
    }
    
}
