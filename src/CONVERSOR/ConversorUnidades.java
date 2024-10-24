package CONVERSOR;

//Classe publica Conversor Unidades
public class ConversorUnidades {
    
    // Método para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
    	// Aqui retorna o calculo da conversão
        return (celsius * 9/5) + 32;
    }

    // Método para converter quilômetros para milhas
    public static double quilometrosParaMilhas(double quilometros) {
    	// Aqui retorna o calculo da conversão
        return quilometros * 0.621371;
    }

    // Método para converter gramas para libras
    public static double gramasParaLibras(double gramas) {
    	// Aqui retorna o calculo da conversão
        return gramas * 0.00220462;
    }
}