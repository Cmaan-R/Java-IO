package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada Com Um Arquivo
//		OutputStream fos = new FileOutputStream("texto2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		BufferedWriter bw = new BufferedWriter(new FileWriter("texto2.txt"));
		bw.write("Não há céu sem tempestades, nem caminhos sem acidentes.");
		bw.newLine();
		bw.newLine();
		bw.write("Só é digno do pódio quem usa as derrotas para alcançá-lo.");

		bw.close();
	}
}
