package projetos;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CalculadoraGUI {
    public static void main (String[] args){
        double gradeValue, gradeValue2, total;
        double avarage;
        String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        
        ImageIcon icon = new ImageIcon("CalculadoraIcon.png");
        JLabel label = new JLabel("Enter the first number: ");
        label.setFont(new Font("arial", Font.CENTER_BASELINE, 30));
        JLabel label2 = new JLabel("Enter the second number: ");
        label2.setFont(new Font("arial", Font.CENTER_BASELINE, 30));
        JLabel label3 = new JLabel("Choose your operation: ");
        label3.setFont(new Font("arial", Font.CENTER_BASELINE, 30));
        
        total = 0;
        
        String input1 = (String) JOptionPane.showInputDialog(
                null,
                label,
                "Calculadora",
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                null,
                null
                );
        gradeValue = Double.parseDouble(input1);
        
        String input2 = (String) JOptionPane.showInputDialog(
                null,
                label2,
                "Calculadora",
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                null,
                null
                );
        gradeValue2 = Double.parseDouble(input2);
        
        String op = (String) JOptionPane.showInputDialog(
                null,
                label3,
                "Calculadora",
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                operacoes,
                operacoes[0]
        );
        
        if (op == operacoes[0]){
            total = gradeValue + gradeValue2;
        }
        else if (op == operacoes[1]){
            total = gradeValue - gradeValue2;
        }
        else if (op == operacoes[2]){
            total = gradeValue * gradeValue2;
        }
        else if (op == operacoes[3]){
            total = gradeValue/gradeValue2;
        }
        
        JLabel label4 = new JLabel("The result of your operation is:\n " + total);
        label4.setFont(new Font("arial", Font.PLAIN, 30));
        
        JOptionPane.showMessageDialog(
                null,
                label4,
                "Calculadora",
                JOptionPane.INFORMATION_MESSAGE,
                icon
        );
        /*
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(op);
        System.out.println(total);
        */
        System.exit(0);
        //400 largura ?
        //variável da operação
        //
    }
}
