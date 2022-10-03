package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada Com Um Arquivo
		OutputStream fos = new FileOutputStream("texto2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("Não há céu sem tempestades, nem caminhos sem acidentes.");
		bw.newLine();
		bw.newLine();
		bw.write("Só é digno do pódio quem usa as derrotas para alcançá-lo.");

		bw.close();
	}
}
