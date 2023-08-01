package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {

    ConvertirMonedas monedas = new ConvertirMonedas();

    public void ConvertirMonedas(double valor) {


        Object opcion = JOptionPane.showInputDialog(null,
                "Elije la moneda que deseas convertir tu dinero", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Pesos Colombianos a Dólar", "De Pesos Colombianos a Euro", "De Pesos Colombianos a Libras Esterlinas",
                                "De Pesos Colombianos a Yen Japonés", "De Pesos Colombianos a Won sub-coreano", "De Dólar a Pesos Colombianos",
                                "De Euro a Pesos Colombianos", "De Libras Esterlinas a Pesos Colombianos",
                                "De Yen Japonés a Pesos Colombianos", "De Won sub-coreano a Pesos Colombianos"},
                "De Pesos Colombianos a Dólar");

        if (opcion != null) { // Verifica si se seleccionó alguna opción
            String seleccion = opcion.toString(); // Convierte la opción seleccionada a String

            switch (seleccion) {
                case "De Pesos Colombianos a Dólar":
                    monedas.ConvertirPesosColombianosDolares(valor);
                    break;

                case "De Pesos Colombianos a Euro":
                    monedas.ConvertirPesosColombianosEuros(valor);
                    break;

                case "De Pesos Colombianos a Libras Esterlinas":
                    monedas.ConvertirPesosColombianosLibra(valor);
                    break;

                case "De Pesos Colombianos a Yen Japonés":
                    monedas.ConvertirPesosColombianosYen(valor);
                    break;

                case "De Pesos Colombianos a Won sub-coreano":
                    monedas.ConvertirPesosColombianosWon(valor);
                    break;

                case "De Dólar a Pesos Colombianos":
                    monedas.ConvertirDolaresPesosColombianos(valor);
                    break;

                case "De Euro a Pesos Colombianos":
                    monedas.ConvertirEurosPesosColombianos(valor);
                    break;

                case "De Libras Esterlinas a Pesos Colombianos":
                    monedas.ConvertirLibraPesosColombianos(valor);
                    break;

                case "De Yen Japonés a Pesos Colombianos":
                    monedas.ConvertirYenPesosColombianos(valor);
                    break;

                case "De Won sub-coreano a Pesos Colombianos":
                    monedas.ConvertirWonPesosColombianos(valor);
                    break;
            }
        }
    }
}
