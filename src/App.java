import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String num1 = JOptionPane.showInputDialog(null, "Digite um número: ", "Digite um número:", JOptionPane.INFORMATION_MESSAGE);
        String num2 = JOptionPane.showInputDialog(null, "Digite outro número: ", "Digite um número:", JOptionPane.INFORMATION_MESSAGE);
        int number1 =  Integer.parseInt(num1);
        int number2 =  Integer.parseInt(num2);
        String oper = JOptionPane.showInputDialog(null, "Qual operação você deseja fazer? Soma, Subtração, Divisão ou Multiplicação?: ", "Operação", JOptionPane.INFORMATION_MESSAGE);
        int somar = number1 + number2;
        int subt = number1 - number2;
        int divi = number1 / number2;
        int multii = number1 * number2;
        if (oper.equals("Soma")){
            JOptionPane.showMessageDialog(null, "A soma entre " + number1 + " e " + number2 + " é igual a: " + somar, "Soma", JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (oper.equals("Subtração")){
            JOptionPane.showMessageDialog(null, "A subtração entre " + number1 + " e " + number2 + " é igua a: "+ subt, "Subtração", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (oper.equals("Divisão")){
            JOptionPane.showMessageDialog(null, "A divisão entre " + number1 + " e " + number2 + " é igua  a: " + divi , "Divisão", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (oper.equals("Multiplicação")){
            JOptionPane.showMessageDialog(null, "A multiplicação entre " + number1 + " e " + number2 + " é igual a: " + multii, "Multiplicação", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor digite uma operação valida", "Operação invalida", JOptionPane.INFORMATION_MESSAGE);
        }

        
    
    }
}
