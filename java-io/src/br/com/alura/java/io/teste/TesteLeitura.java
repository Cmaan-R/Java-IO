package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada Com Um Arquivo
		InputStream fis = new FileInputStream("texto.txt"); // Entrada do arquivo
		Reader isr = new InputStreamReader(fis); // Para Transformar os Bytes em Caracteres
		BufferedReader br = new BufferedReader(isr); // Para Juntar vários Caracteres e Ler Linha Por Linha

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();

	}
}
