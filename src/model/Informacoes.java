/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import controller.Conversor;

/**
 *
 * @author Bryan
 */
public class Informacoes {

	// ----------------- Atributos da classe ----------------- \\

	private Date data;
	private String satelite;
	private String pais;
	private String estado;
	private String municipio;
	private String bioma;
	private int diasSemChuva;
	private double precipitacao;
	private double riscoFogo;
	private double latitude;
	private double longitude;
	
	final public static String caminho = "C:\\Users\\Bryan\\Documents\\NetBeansProjects\\APS\\APS\\src\\.txt";

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss");
	private SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm");

	private String[] informacaoSeparada;
	private String stringData;
	private ArrayList<Informacoes> listaDeInfoQuick;
	private ArrayList<Informacoes> listaDeInfoInsertion;
	private ArrayList<Informacoes> listaDeInfoSelection;

	// ----------------- Construtores ----------------- \\

	public Informacoes() {
	}

	public Informacoes(Date data, String satelite, String pais, String estado, String municipio, String bioma,
			int diasSemChuva, double precipitacao, double riscoFogo, double latitude, double longitude) {
		this.data = data;
		this.satelite = satelite;
		this.pais = pais;
		this.estado = estado;
		this.municipio = municipio;
		this.bioma = bioma;
		this.diasSemChuva = diasSemChuva;
		this.precipitacao = precipitacao;
		this.riscoFogo = riscoFogo;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	// ----------------- geters e setters ----------------- \\

	public void setData(Date data) {
		this.data = data;
	}

	public String getData() {
		return sdf.format(data);
	}

	public Long getLongDate() { // usado na hora de comparar as datas
		String num = sdf2.format(data);
		return Long.parseLong(num);
	}

	public String getSatelite() {
		return satelite;
	}

	public void setSatelite(String satelite) {
		this.satelite = satelite;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getBioma() {
		return bioma;
	}

	public void setBioma(String bioma) {
		this.bioma = bioma;
	}

	public int getDiasSemChuva() {
		return diasSemChuva;
	}

	public void setDiasSemChuva(int diasSemChuva) {
		this.diasSemChuva = diasSemChuva;
	}

	public double getPrecipitacao() {
		return precipitacao;
	}

	public void setPrecipitacao(double precipitacao) {
		this.precipitacao = precipitacao;
	}

	public double getRiscoFogo() {
		return riscoFogo;
	}

	public void setRiscoFogo(double riscoFogo) {
		this.riscoFogo = riscoFogo;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public ArrayList<Informacoes> getListaDeInfoQuick() {
		return listaDeInfoQuick;
	}

	public ArrayList<Informacoes> getListaDeInfoInsertion() {
		return listaDeInfoInsertion;
	}

	public ArrayList<Informacoes> getListaDeInfoSelection() {
		return listaDeInfoSelection;
	}

	// ----------------- Métodos ----------------- \\
	public void lerTxt() throws ParseException {
		listaDeInfoQuick = new ArrayList();
		listaDeInfoInsertion = new ArrayList();
		listaDeInfoSelection = new ArrayList();

		try { // ler o arquivos gera uma excessão, temos que tratar
			File arquivo = new File(Informacoes.caminho+"\\teste.txt");

			// BufferedREader serve para uma leitura melhor do arquivo, mas quem lê o .txt é
			// o FileReader
			BufferedReader bf = new BufferedReader(new FileReader(arquivo));

			String stringDeInfo = bf.readLine();
			// o programa lê cada linha e enquanto houver algum conteudo nela (diferente de
			// "null") ele continua lendo
			while (stringDeInfo != null) {
				informacaoSeparada = stringDeInfo.split(",");

				data = sdf.parse(informacaoSeparada[0]);
				satelite = informacaoSeparada[1];
				pais = informacaoSeparada[2];
				estado = informacaoSeparada[3];
				municipio = informacaoSeparada[4];
				bioma = informacaoSeparada[5];
                                if (informacaoSeparada[6].equals("")) diasSemChuva = -1;
                                else diasSemChuva = Integer.parseInt(informacaoSeparada[6]);
                                if (informacaoSeparada[7].equals("")) precipitacao = -1;
                                else precipitacao = Double.parseDouble(informacaoSeparada[7]);
                                if (informacaoSeparada[8].equals("")) riscoFogo = -1;
                                else precipitacao = Double.parseDouble(informacaoSeparada[8]);
				latitude = Double.parseDouble(informacaoSeparada[9]);
				longitude = Double.parseDouble(informacaoSeparada[10]);

				Informacoes informacoes = new Informacoes(data, satelite, pais, estado, municipio, bioma, diasSemChuva,
						precipitacao, riscoFogo, latitude, longitude);
				listaDeInfoQuick.add(informacoes);
				listaDeInfoInsertion.add(informacoes);
				listaDeInfoSelection.add(informacoes);

				stringDeInfo = bf.readLine(); // lê a próxima linha
			}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	public void lerCsv() throws ParseException{
		listaDeInfoQuick = new ArrayList();
		listaDeInfoInsertion = new ArrayList();
		listaDeInfoSelection = new ArrayList();
			
		for (String stringDeInfo : Conversor.Ler()) {
			informacaoSeparada = stringDeInfo.split(",");
			
			data = sdf.parse(informacaoSeparada[0]);
			satelite = informacaoSeparada[1];
			pais = informacaoSeparada[2];
			estado = informacaoSeparada[3];
			municipio = informacaoSeparada[4];
			bioma = informacaoSeparada[5];
			diasSemChuva = Integer.parseInt(informacaoSeparada[6]);
			precipitacao = Double.parseDouble(informacaoSeparada[7]);
			riscoFogo = Double.parseDouble(informacaoSeparada[8]);
			latitude = Double.parseDouble(informacaoSeparada[9]);
			longitude = Double.parseDouble(informacaoSeparada[10]);
			
			Informacoes informacoes = new Informacoes(data, satelite, pais, estado, municipio, bioma, diasSemChuva,
					precipitacao, riscoFogo, latitude, longitude);
			listaDeInfoQuick.add(informacoes);
			listaDeInfoInsertion.add(informacoes);
			listaDeInfoSelection.add(informacoes);
			
		}
	}

	@Override
	public String toString() {
		String msg = "";
                msg = sdf.format(this.data) + ","; 
                msg += getSatelite() + ","; 
                msg += getPais()+ ","; 
                msg += getEstado()+ ","; 
                msg += getMunicipio()+ ","; 
                msg += getBioma()+ ",";
		msg += getDiasSemChuva() + ",";
		msg += getPrecipitacao() + ",";
		msg += getRiscoFogo() + ",";
		msg += getLatitude() + ",";
		msg += getLongitude() + ",";

		return msg;
	}

	public String[] retornarLista() {
		return new String[] {
                    "" + getSatelite(),
                    "" + getPais(),
                    "" + getEstado(), 
                    "" + getMunicipio(),
                    "" + getBioma(),
                    "" + getDiasSemChuva(), 
                    "" + getPrecipitacao(),
                    "" + getRiscoFogo(), 
                    "" + getLatitude(), 
                    "" + getLongitude() };
	}
        
        public void inserirInformacao(Informacoes info) {
            try {
                FileWriter arquivo = new FileWriter(Informacoes.caminho+"teste.txt", true);
                PrintWriter gravar = new PrintWriter(arquivo);
                
                gravar.print("\n" +info);
                
                arquivo.close();
            } catch(IOException e) {
                System.out.println("Erro na inserção, verificar o caminho");
            }
        }
        
        
        
}
