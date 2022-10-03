package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada Com Um Arquivo
//		OutputStream fos = new FileOutputStream("texto2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		BufferedWriter bw = new BufferedWriter(new FileWriter("texto2.txt"));
//		PrintStream ps = new PrintStream(new File("texto2.txt"));
		PrintWriter ps = new PrintWriter("texto2.txt");

		ps.println("Não há céu sem tempestades, nem caminhos sem acidentes. \n");
		ps.print("Só é digno do pódio quem usa as derrotas para alcançá-lo.");

		ps.close();
	}
}
