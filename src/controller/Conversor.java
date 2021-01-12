package controller;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import model.Informacoes;

/**
 *
 * @author Alef
 */
public class Conversor {
	private static String[] cabecalho = {"Satelite", "Pais", "Estado", "Municipio", "Bioma" ,"Dias Sem Chuva", "Precipitacao", "Risco Fogo", "Latitude", "Longitude" };

	public static void Escrever(Informacoes... informacoes)
			throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

		List<String[]> listaDeInformacoes = new ArrayList<>();

		for (Informacoes inf : informacoes)
			listaDeInformacoes.add(inf.retornarLista());

		Writer writer = Files.newBufferedWriter(Paths.get("Informacoes.csv"));
		CSVWriter csvWriter = new CSVWriter(writer);

		csvWriter.writeNext(cabecalho);
		csvWriter.writeAll(listaDeInformacoes);

		csvWriter.flush();
		writer.close();
	}

	public static void Ler() throws IOException, CsvException {
		Reader reader = Files.newBufferedReader(Paths.get("Informacoes.csv"));
		CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

		List<String[]> informacoes = csvReader.readAll();
		for (String[] informacao : informacoes) {
			for (int i = 0; i < informacao.length; i++) {
				System.out.println(cabecalho[i] + ": " + informacao[i]);
			}
		}
	}

//	public static void main(String[] args) throws IOException, CsvException {
//		Informacoes teste = new Informacoes(new Date(2020, 10, 28), "Satelite", "Brasil", "SP", "Carapicuiba", "Saara",
//				20, 50.1, 45.5, 15, 78);
//		Escrever(teste);
//		Ler();
//	}
}
