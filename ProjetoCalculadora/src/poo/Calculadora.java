package poo;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora {  

	public static void main(String[] args) {
		
	JOptionPane.showMessageDialog(null, "Bem-vindo a calculadora");
	
        int opc;
        
        opc = JOptionPane.showConfirmDialog(null, "Deseja utlizar a calculadora?");
        
        while(opc == JOptionPane.YES_OPTION){
        	
        	JOptionPane.showMessageDialog(null, "Escolha o tipo de operação que deseja realizar");

        	int ope = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Adição 2- Subtração 3- Multiplicação 4- Divisão "
        	        + "5- Porcentagem 6- Resto da divisão 7- Potenciação 8- Raiz quadrada: "));

        	if(ope == 1 || ope == 2 || ope == 3 || ope == 4 || ope == 5 || ope == 6){
        	    
        	    float x = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro valor:"));

        	    float y = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo valor:"));
        	    
        	    float r;
        	    
        	    switch(ope) {

			    	case 1:
			    		
			    	   r = x + y;
			    	   
			    	   JOptionPane.showMessageDialog(null, "O resultado da adição é: "+ r);
			    	    
			    	   break;
			    	    
			    	case 2:
			    	   
			    	   r = x - y;
			    	   
			    	   JOptionPane.showMessageDialog(null, "O resultado da subtração é: "+ r);
			    	   
			    	   break;
			    	   
			    	case 3:
			    	   
			    	   r = x * y;
			    	   
			    	   JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: "+ r);
			    	   
			    	   break;
			    	   
			    	case 4:
			    	   
			    	   r = x / y;
			    	   
			    	   JOptionPane.showMessageDialog(null, "O resultado da divisão é: "+ r);
			    	   
			    	   break;
			    	   
			    	case 5:
			    	   
			    	   r = (x * y) / 100;
			    	   
			    	   JOptionPane.showMessageDialog(null, "O resultado da porcentagem é: "+ r);
			    	   
			    	   break;
			    	   
			    	case 6:
			    		
			    	    r = x % y;
			    	    
			    	    JOptionPane.showMessageDialog(null, "O resultado do resto da divisão é: "+ r);
			    	    
			    	    break;
			    	    
			    	}
        	    }
        	
        		switch(ope){
        	    
	        	    case 7:
	
	        	    float w = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a base da potência: "));
	
	        	    float v = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o expoente: "));
	
	        	    JOptionPane.showMessageDialog(null, "O resultado da potência é: "+ Math.pow(w, v));
	
	        	    break;
	
	        	case 8:
	
	        	    int z = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor que deseja descobrir a raiz: "));
	
	        	    JOptionPane.showMessageDialog(null, "O resultado da raiz é: "+ Math.sqrt(z));
	
	        	    break;
	        	}
        		
        opc = JOptionPane.showConfirmDialog(null, "Deseja utlizar novamente a calculadora?");
        		
		if(opc == JOptionPane.NO_OPTION || opc == JOptionPane.CANCEL_OPTION) {
			break;
		}
		
	}JOptionPane.showMessageDialog(null, "Você saiu da calculadora!");}
	
}