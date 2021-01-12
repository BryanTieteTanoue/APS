package controller;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;


/**
 *
 * @author Alef
 */
public class Conversor {
	private static String[] cabecalho = {"Data", "Satelite", "País", "Estado", 
            "Município" ,"Bioma", "Dias sem chuva", "Precipitação", 
            "Risco de fogo", "Latitude", "Longitude" };

	public static List<String> Ler(){ // metodo que retorna uma lista de strings lendo um arquivo .csv
		Reader reader = null;
		try {
			reader = Files.newBufferedReader(Paths.get("src\\\\.txt\\Informacoes.csv"));
		} catch (IOException e) {
			System.out.println("Erro ao importar");
		}
		CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

		List<String[]> informacoes = null;
		try {
			informacoes = csvReader.readAll();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> resultado = new ArrayList<String>();
		for (String[] informacao : informacoes) {
			for (int i = 0; i < informacao.length; i++) {
				resultado.add(informacao[i].replace(";",",")); // substitui os ; para posteriormente ser lido
			}
		}
		return resultado;
	}
}
