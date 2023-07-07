package Programa;

import javax.swing.JOptionPane;

import ConversorMonedas.DatosConversorMonedas;
import ConversorTemperatura.DatosConversorTemperatura;

public class Programa {

public static void main(String[] args) {
	DatosConversorMonedas conversion = new DatosConversorMonedas();
	DatosConversorTemperatura conversionT = new DatosConversorTemperatura();
	
	while(true) {
		    String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
		    new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
		
		
		switch(opciones) {
		    case "Conversor de Monedas":
			String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
			double valorRecibido = Double.parseDouble(input);
			conversion.ConvertirMonedas(valorRecibido);
			
			
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
			if(JOptionPane.OK_OPTION == respuesta) {
			} else {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				System.exit(0);
			} break;
			
		    case "Conversor de Temperatura":
			String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
			double valorRecibidoT = Double.parseDouble(input1);
			conversionT.ConvertirTemperaturas(valorRecibidoT);
			
			
			int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
			if(JOptionPane.OK_OPTION == respuestaT) {
			} else {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				System.exit(0);
			} break;
					
	        }
	
         }

    }

}
