package CONVERSOR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	// Aqui está iniciando o scanner para armazenar o que o usuario digitar
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados para conversão de Celsius para Fahrenheit
        System.out.print("Digite a temperatura em Celsius: ");
        
        // Atribuindo o valor que o usuario digitar para a variavel tempCelsius
        double tempCelsius = scanner.nextDouble();
        
        //Aqui está chamando o metodo que converte o valor de celsius para fahrenheit
        double tempFahrenheit = ConversorUnidades.celsiusParaFahrenheit(tempCelsius);
        
        //Aqui exibe para o usuario o valor convertido
        System.out.printf("Resultado: %.2f°C é igual a %.2f°F\n", tempCelsius, tempFahrenheit);

        // Entrada de dados para conversão de Quilômetros para Milhas
        System.out.print("Digite a distância em quilômetros: ");
        
        // Atribuindo o valor que o usuario digitar para a variavel distanciaKm
        double distanciaKm = scanner.nextDouble();
        
        //Aqui está chamando o metodo que converte o valor da distancia em Km para milhas
        double distanciaMilhas = ConversorUnidades.quilometrosParaMilhas(distanciaKm);
        
        //Aqui exibe para o usuario o valor convertido
        System.out.printf("Resultado: %.2f km é igual a %.2f milhas\n", distanciaKm, distanciaMilhas);

        // Entrada de dados para conversão de Gramas para Libras
        System.out.print("Digite o peso em gramas: ");
        
        // Atribuindo o valor que o usuario digitar para a variavel pesoGramas
        double pesoGramas = scanner.nextDouble();
        
        //Aqui está chamando o metodo que converte o valor do peso em gramas para libras
        double pesoLibras = ConversorUnidades.gramasParaLibras(pesoGramas);
        
        //Aqui exibe para o usuario o valor convertido
        System.out.printf("Resultado: %.2f gramas é igual a %.2f libras\n", pesoGramas, pesoLibras);
        
        //Aqui fecha o scanner
        scanner.close();
    }
}
