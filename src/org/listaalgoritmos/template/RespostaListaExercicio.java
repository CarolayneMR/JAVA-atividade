package org.listaalgoritmos.template;

import javax.print.attribute.standard.Media;

public class RespostaListaExercicio {
	
	/*
	 * Utilize apenas o método main para testar a implementação dos métodos. 
	 * Não se faz necessário implementar dentro do escopo do método.
	 */
	public static void main(String[] args) {
		System.out.println("Questão 1: " + calcularImc(1.60f, 55f));
		System.out.println("Questão 2: " + calcularAreaTrapezio(19, 10, 2));
		System.out.println("Questão 3: " + maiorEntreDoisInteiros(5, 3));
		float[] notas = {5 , 6 , 8}; 		
		System.out.println("Questão 4: " + calcularMediaNotas(notas));
		System.out.println("Questão 5: " + verificarParImpar(8));
		
		int[] array = {1 , 2 , 3, 4, 5, 6, 7, 8, 9, 10}; // Array universal para as demais questões //
		imprimirArrayInverso(array); //Questão 6
		imprimirElementosPrimos(array); //Questão 7
		imprimirMaiorMenorElemento(array); //Questão 8
		imprimirElementosImpares(array); //Questão 9
		imprimirElementosPares(array); // Questão 10
		System.out.println("Questão 11: " + calcularMediaAritmetica(array));

	}
	
	/**
	 * QUESTÃO 1: Método deve calcular o IMC utilizando peso e altura. Como resultado
	 * o método deve retornar uma variável resultado do tipo float.
	 * @param peso
	 * @param altura
	 * @return resultado
	 */
	public static float calcularImc(float peso, float altura) 
	{
		float resultado = peso/(altura*altura);
		return resultado;
	}
	
	/**
	 * QUESTÃO 2: Método deve calcular a área do trapézio independente da unidade de medida.
	 * Como resultado, o método deve retornar a área calculada.
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return areaTrapezio
	 */
	public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) 
	{	
		float areaTrapezio = (baseMaior+baseMenor*altura)/2;
		return areaTrapezio;
	}
	
	/**
	 * QUESTÃO 3: O método deve calcular o maior entre dois inteiros, que são fornecidos
	 * como argumento do método. O retorno deve ser o maior valor dado
	 * como entrada, sendo do tipo inteiro.
	 * @param a
	 * @param b
	 * @return maiorValor
	 */
	public static int maiorEntreDoisInteiros(int a, int b) 
	{
		int maiorValor;
		if (a > b) {
			maiorValor = a;
		} else {
			maiorValor = b;
		}
		return maiorValor;
	}
	
	/**
	 * QUESTÃO 4: Método verifica se o número apresentado como argumento é ímpar ou par.
	 * caso seja par, o retorno do método deve ser verdadeiro. Caso contrário,
	 * o valor retornado deve ser falso.
	 * @param numero
	 * @return condicao
	 */
	public static boolean verificarParImpar(int numero) 
	{
		boolean condicao; 
		if (numero % 2 == 0){
			condicao = true ;
		} else {
			condicao = false;
		}
		return condicao;		
	}
	
	/**
	 * QUESTÃO 5: Método calcula a média aritmetica dos elementos float a partir de um array. 
	 * O retorno deve ser o resultado do cálculo da média.
	 * @param notas
	 * @return media
	 */
	public static float calcularMediaNotas(float[] notas) {
		
		float contador = 0;
		for (int i = 0 ; i < notas.length ; i++ ){
			contador = contador + notas.length;
		}
		float media = contador/notas.length;
			return media;
	}
	
	/**
	 * QUESTÃO 6: Método imprime array de inteiros no sentido inverso, separando os elementos por vírgula.
	 * O último elemento impresso não deve preceder vírgula. Use o System.out.print() para imprimir os valores.
	 * Os elementos devem ser impresso numa única linha.
	 * @param array
	 */
	public static void imprimirArrayInverso(int[] array)
	{
		System.out.print("Questão 6: ");
		for ( int i = array.length - 1; i >= 0 ; i--){
			System.out.print(array[i]);
			if (i > 0) {
			System.out.print(" , ");
			}
		}
		System.out.println();
	}
	
	/**
	 * QUESTÃO 7: Método deve imprimir os elementos primos de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPrimos(int[] array) 
    {
		System.out.print("Questão 7: ");
        boolean ePrimo = true;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 0 || array[i] == 1) ePrimo = false;
                for(int j = 2; j < array[i]; j++) {
                    if(array[i] % j == 0) ePrimo = false;
                }

                if(ePrimo) System.out.print(array[i] + " ");
                ePrimo = true;
        }
		System.out.println();
    }
	
	
	/**
	 * QUESTÃO 8: Método deve imprimir os elementos ímpares de um array de inteiros. O formato da impressão 
	 * deve serfeito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosImpares(int[] array) 
	{
		System.out.print("Questão 8: ");
		for (int i = 0; i < array.length ; i++){
			if (array[i] % 2 != 0){
				System.out.print(array[i] + " ");
			}
		}
	}
	
	
	/**
	 * QUESTÃO 9: Método deve imprimir os elementos pares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPares(int[] array) 
	{
		System.out.println();
		System.out.print("Questão 9: ");
		for (int i = 0; i < array.length ; i++){
			if (array[i] % 2 == 0){
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}
	
	
	/**
	 * QUESTÃO 10: Método deve imprimir o maior e o menor elemento de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirMaiorMenorElemento(int[] array) 
	{
		int menorElemento = 0;
		int maiorElemento = 0;
		
		for (int i = 0; i < array.length; i++){
			if (array[i] > menorElemento) {
				menorElemento = array[i];
			}
			if (array[i] <= maiorElemento){
				maiorElemento = array[i];
			}
		}
		System.out.print("Questão 10: " + maiorElemento +" "+ menorElemento);
		System.out.println();
	}
	
	/**
	 * QUESTÃO 11: O método calcula a média aritmética dos elementos de um array de inteiros. 
	 * Como resultado, o valor da média deve ser retornado no método.
	 * @param array
	 * @return media
	 */
	public static float calcularMediaAritmetica(int[] array) 
	{
		int contador = 0;
		for (int i = 0 ; i < array.length ; i++){
			contador = contador + array[i];
		}
		float media = contador/array.length;
		return media;
	}
}