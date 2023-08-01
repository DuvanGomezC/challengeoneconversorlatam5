package Principal;


import javax.swing.*;

import ConversorMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesConversionTemperatura;

public class Principal {

    public static void main(String[] args) {

        // Ventana de bienvenida        
        String mensaje = "<html><head><style>"
                + "h1 { text-align: center; color: #FF0000; margin: 0px; }"
                + "p { text-align: center; color: #000000; font-size: 16px; margin: 20px; }"
                + "</style></head><body>"
                + "<div class='imagen-container'>"
                + "<h1>Bienvenido a Nuestro Conversor</h1>"
                + "<p>Grupo G5 - Challenge Back End</p>"
                + "</div></body></html>";
        

        JOptionPane.showMessageDialog(null, mensaje, "Bienvenida", JOptionPane.PLAIN_MESSAGE);

        OpcionesConversion conversion = new OpcionesConversion();
        OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();

        boolean realizarOtraConversion = true;

        while (realizarOtraConversion) {
            String opciones = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                    "Menú", JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir");

            if (opciones == null) {
                JOptionPane.showMessageDialog(null, "Conversor finalizado");
                break;
            }

            switch (opciones) {
                case "Conversor de Monedas":
                    boolean errorMonedas = true;
                    while (errorMonedas) {
                        errorMonedas = false;
                        String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                        if (input == null) {
                            // Código para manejar el evento del botón "Cerrar"
                            int respuesta = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Opciones",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                    new Object[]{"Ir al menú principal", "Finalizar Conversor"}, "Ir al menú principal");

                            if (respuesta == JOptionPane.YES_OPTION) {
                                // Código para volver al menú principal
                            } else if (respuesta == JOptionPane.NO_OPTION) {
                                // Código para finalizar el programa y mostrar el mensaje de despedida
                                JOptionPane.showMessageDialog(null, "Conversor finalizado");
                                realizarOtraConversion = false;
                            }
                        } else if (input.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No se ha ingresado un valor. Por favor, ingrese uno.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            errorMonedas = true;
                        } else if (!esNumero(input)) {
                            JOptionPane.showMessageDialog(null, "Solo se permiten números. Por favor, ingrese un valor válido.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            errorMonedas = true;
                        } else {
                            double valorRecibido = Double.parseDouble(input);
                            conversion.ConvertirMonedas(valorRecibido);


                            int respuesta = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Opciones",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                    new Object[]{"Ir al menú principal", "Finalizar Conversor"}, "Ir al menú principal");

                            if (respuesta == JOptionPane.YES_OPTION) {
                                // Código para volver al menú principal
                            } else if (respuesta == JOptionPane.NO_OPTION) {
                                // Código para finalizar el programa y mostrar el mensaje de despedida
                                JOptionPane.showMessageDialog(null, "Conversor finalizado");
                                realizarOtraConversion = false;
                            }
                        }
                    }
                    break;

                case "Conversor de Temperatura":
                    boolean errorTemperatura = true;
                    while (errorTemperatura) {
                        errorTemperatura = false;
                        String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                        if (input1 == null) {
                            // Código para manejar el evento del botón "Cerrar"
                            int respuesta = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Opciones",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                    new Object[]{"Ir al menú principal", "Finalizar Conversor"}, "Ir al menú principal");

                            if (respuesta == JOptionPane.YES_OPTION) {
                                // Código para volver al menú principal
                            } else if (respuesta == JOptionPane.NO_OPTION) {
                                // Código para finalizar el programa y mostrar el mensaje de despedida
                                JOptionPane.showMessageDialog(null, "Conversor finalizado");
                                realizarOtraConversion = false;
                            }
                        } else if (input1.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No se ha ingresado un valor. Por favor, ingrese uno.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            errorTemperatura = true;
                        } else if (!esNumero(input1)) {
                            JOptionPane.showMessageDialog(null, "Solo se permiten números. Por favor, ingrese un valor válido.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            errorTemperatura = true;
                        } else {
                            double valorRecibido = Double.parseDouble(input1);
                            conversionT.ConvertirTemperaturas(valorRecibido);

                            int respuesta = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Opciones",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                    new Object[]{"Ir al menú principal", "Finalizar Conversor"}, "Ir al menú principal");

                            if (respuesta == JOptionPane.YES_OPTION) {
                                // Código para volver al menú principal
                            } else if (respuesta == JOptionPane.NO_OPTION) {
                                // Código para finalizar el programa y mostrar el mensaje de despedida
                                JOptionPane.showMessageDialog(null, "Conversor finalizado");
                                realizarOtraConversion = false;
                            }
                        }
                    }
                    break;
            }
        }
    }

    public static boolean esNumero(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}