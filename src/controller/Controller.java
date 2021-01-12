/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Informacoes;
import model.QuickSort;
import model.InsertionSort;
import model.SelectionSort;

/**
 *
 * @author Bryan
 */
public class Controller {
    
    /*
    Usamos 3 arraysList pois ao usar um dos métodos de ordenação ordenaria para
    todos os outros métodos se fosse apenas uma lista
    */
    private SelectionSort           selectionSort;
    private QuickSort               quickSort;
    private InsertionSort           insertionSort;
    private Informacoes             informacoes;
    long tempoGasto;

    public Controller(){ //Construtor
        try {
            informacoes = new Informacoes();
            informacoes.lerTxt();                       //le o txt e pega as informações
            
            quickSort       = new QuickSort(informacoes.getListaDeInfoQuick());
            selectionSort   = new SelectionSort(informacoes.getListaDeInfoSelection());
            insertionSort   = new InsertionSort(informacoes.getListaDeInfoInsertion());
            
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public ArrayList<Informacoes> getListaInsertion(){
        return informacoes.getListaDeInfoInsertion();
    }
    
    public ArrayList<Informacoes> getListaQuick(){
        return informacoes.getListaDeInfoQuick();
    }
    
    public ArrayList<Informacoes> getListaSelection(){
        return informacoes.getListaDeInfoSelection();
    }

    //As view vão chamar os métodos de ordenação pelo controller a partir do método abaixo
    public long ordenacao(int ordenacao, int ordenarPor, int cresOudecre) {
        long tempo = 0;
        switch (ordenacao) {
            case 0:
                tempo = doSelectionSort(ordenarPor, cresOudecre);
                break;
            case 1:
                tempo = doInsertionSort(ordenarPor, cresOudecre);
                break;
            case 2:
                tempo = doQuickSort(ordenarPor, cresOudecre);
                break;
        }
        return tempo;
    }
    
        /*
        OrdenarPor = 1 (Data)       6 (Bioma)           11 (latitude)
                     2 (Satelite)   7 (Dias sem chuva)
                     3 (País)       8 (Precipitação)
                     4 (Estado)     9 (risco de fogo)
                     5 (Município)  10 (Longitude)                                  
        CresOuDecre = 1 (crescente) / 2 (descrescente)
        */
    
    public long doSelectionSort(int ordenarPor, int crescOuDecr) {
        if          ((ordenarPor == 1) && (crescOuDecr == 1)) {
            tempoGasto = selectionSort.ordenarDataCres();
        } else if   ((ordenarPor == 1) && (crescOuDecr == 2)) {
            tempoGasto = selectionSort.ordenarDataCres();
        } else if   ((ordenarPor == 2) && (crescOuDecr == 1)) {
            tempoGasto = selectionSort.ordenarSateliteCres();
        } else if   ((ordenarPor == 2) && (crescOuDecr == 2)) {
            tempoGasto = selectionSort.ordenarSateliteDecre();
        } else if   ((ordenarPor == 3) && (crescOuDecr == 1)) {
            tempoGasto = selectionSort.ordenarPaisCres();
        } else if   ((ordenarPor == 3) && (crescOuDecr == 2)) {
            tempoGasto = selectionSort.ordenarPaisDecre();
        } else if   ((ordenarPor == 4) && (crescOuDecr == 1)) {
            tempoGasto = selectionSort.ordenarEstadoCres();
        } else if   ((ordenarPor == 4) && (crescOuDecr == 2)) {
            tempoGasto = selectionSort.ordenarEstadoDecre();
        } else if   ((ordenarPor == 5) && (crescOuDecr == 1)) {
            tempoGasto = selectionSort.ordenarMunicipioCres();
        } else if   ((ordenarPor == 5) && (crescOuDecr == 2)) {
            tempoGasto = selectionSort.ordenarMunicipioDecre();
        } else if   ((ordenarPor == 6) && (crescOuDecr == 1)) {
            tempoGasto = selectionSort.ordenarBiomaCres();
        } else if   ((ordenarPor == 6) && (crescOuDecr == 2)) {
            tempoGasto = selectionSort.ordenarBiomaDecre();
        } else if   ((ordenarPor == 7) && (crescOuDecr == 1)) {
            tempoGasto = selectionSort.ordenarDiasCres();
        } else if   ((ordenarPor == 7) && (crescOuDecr == 2)) {
            tempoGasto = selectionSort.ordenarDiasDecre();
        } else if   ((ordenarPor == 8) && (crescOuDecr == 1)) {
            tempoGasto = selectionSort.ordenarPrecipitacaoCres();
        } else if   ((ordenarPor == 8) && (crescOuDecr == 2)) {
            tempoGasto = selectionSort.ordenarPrecipitacaoDecre();
        } else if   ((ordenarPor == 9) && (crescOuDecr == 1)) {
            tempoGasto = selectionSort.ordenarRiscoCres();
        } else if   ((ordenarPor == 9) && (crescOuDecr == 2)) {
            tempoGasto = selectionSort.ordenarRiscoDecre();
        } else if   ((ordenarPor == 10) && (crescOuDecr == 1)) {
            tempoGasto = selectionSort.ordenarLatitudeCres();
        } else if   ((ordenarPor == 10) && (crescOuDecr == 2)) {
            tempoGasto = selectionSort.ordenarLatitudeDecre();
        } else if   ((ordenarPor == 11) && (crescOuDecr == 1)) {
            tempoGasto = selectionSort.ordenarLongitudeCres();
        } else if   ((ordenarPor == 11) && (crescOuDecr == 2)) {
            tempoGasto = selectionSort.ordenarLongitudeDecre();
        }
        try {
            selectionSort.escreverTxt();
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tempoGasto;
    }
    
    public long doInsertionSort(int ordenarPor, int crescOuDecr){
        if ((ordenarPor == 1) && (crescOuDecr == 1))        tempoGasto = insertionSort.organizaDataCres();
        else if   ((ordenarPor == 1) && (crescOuDecr == 2)) tempoGasto = insertionSort.organizaDataDecre();
        
        else if   ((ordenarPor == 2) && (crescOuDecr == 1)) tempoGasto = insertionSort.organizaSateliteCres();
        else if   ((ordenarPor == 2) && (crescOuDecr == 2)) tempoGasto = insertionSort.organizaSateliteDecre();
        
        else if   ((ordenarPor == 3) && (crescOuDecr == 1)) tempoGasto = insertionSort.organizaPaisCres();
        else if   ((ordenarPor == 3) && (crescOuDecr == 2)) tempoGasto = insertionSort.organizaPaisDecre();
        
        else if   ((ordenarPor == 4) && (crescOuDecr == 1)) tempoGasto = insertionSort.organizaEstadoCres();
        else if   ((ordenarPor == 4) && (crescOuDecr == 2)) tempoGasto = insertionSort.organizaEstadoDecre();
        
        else if   ((ordenarPor == 5) && (crescOuDecr == 1)) tempoGasto = insertionSort.organizaMunicipioCres();
        else if   ((ordenarPor == 5) && (crescOuDecr == 2)) tempoGasto = insertionSort.organizaMunicipioDecre();
        
        else if   ((ordenarPor == 6) && (crescOuDecr == 1)) tempoGasto = insertionSort.organizaBiomaCres();
        else if   ((ordenarPor == 6) && (crescOuDecr == 2)) tempoGasto = insertionSort.organizaBiomaDecre();
        
        else if   ((ordenarPor == 7) && (crescOuDecr == 1)) tempoGasto = insertionSort.organizaDiasCres();
        else if   ((ordenarPor == 7) && (crescOuDecr == 2)) tempoGasto = insertionSort.organizaDiasDecre();
        
        else if   ((ordenarPor == 8) && (crescOuDecr == 1)) tempoGasto = insertionSort.organizaPrecipitacaoCres();
        else if   ((ordenarPor == 8) && (crescOuDecr == 2)) tempoGasto = insertionSort.organizaPrecipitacaoDecre();
        
        else if   ((ordenarPor == 9) && (crescOuDecr == 1)) tempoGasto = insertionSort.organizaRiscoCres();
        else if   ((ordenarPor == 9) && (crescOuDecr == 2)) tempoGasto = insertionSort.organizaRiscoDecre();
        
        else if   ((ordenarPor == 10) && (crescOuDecr == 1)) tempoGasto = insertionSort.organizaLatitudeCres();
        else if   ((ordenarPor == 10) && (crescOuDecr == 2)) tempoGasto = insertionSort.organizaLatitudeDecre();
        
        else if   ((ordenarPor == 11) && (crescOuDecr == 1)) tempoGasto = insertionSort.organizaLongitudeCres();
        else if   ((ordenarPor == 11) && (crescOuDecr == 2)) tempoGasto = insertionSort.organizaLongitudeDecre();
        
        try {
            insertionSort.escreverTxt();
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tempoGasto;
    }
    
    public long doQuickSort(int ordenarPor, int crescOuDecr) {
        long tempo1;
        
        // Data
        if          ((ordenarPor == 1) && (crescOuDecr == 1)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickDataCres();
            tempoGasto = System.currentTimeMillis() - tempo1;
        } else if   ((ordenarPor == 1) && (crescOuDecr == 2)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickDataDecre();
            tempoGasto = System.currentTimeMillis() - tempo1;
            
        // Satelite
        } else if   ((ordenarPor == 2) && (crescOuDecr == 1)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickSateliteCres();
            tempoGasto = System.currentTimeMillis() - tempo1;   
        } else if   ((ordenarPor == 2) && (crescOuDecr == 2)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickSateliteDecre();
            tempoGasto = System.currentTimeMillis() - tempo1;
        
        // Pais
        } else if   ((ordenarPor == 3) && (crescOuDecr == 1)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickPaisCres();
            tempoGasto = System.currentTimeMillis() - tempo1;   
        } else if   ((ordenarPor == 3) && (crescOuDecr == 2)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickPaisDecre();
            tempoGasto = System.currentTimeMillis() - tempo1;
        
        // Estado
        } else if   ((ordenarPor == 4) && (crescOuDecr == 1)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickEstadoCres();
            tempoGasto = System.currentTimeMillis() - tempo1; 
        } else if   ((ordenarPor == 4) && (crescOuDecr == 2)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickEstadoDecre();
            tempoGasto = System.currentTimeMillis() - tempo1;
        
        // Municipio
        } else if   ((ordenarPor == 5) && (crescOuDecr == 1)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickMunicipioCres();
            tempoGasto = System.currentTimeMillis() - tempo1;
        } else if   ((ordenarPor == 5) && (crescOuDecr == 2)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickMunicipioDecre();
            tempoGasto = System.currentTimeMillis() - tempo1;
       
        // Bioma
        } else if   ((ordenarPor == 6) && (crescOuDecr == 1)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickBiomaCres();
            tempoGasto = System.currentTimeMillis() - tempo1;
        } else if   ((ordenarPor == 6) && (crescOuDecr == 2)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickBiomaDecre();
            tempoGasto = System.currentTimeMillis() - tempo1;
        
        // Dias Sem Chuva
        } else if   ((ordenarPor == 7) && (crescOuDecr == 1)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickDiasSemChuvaCres();
            tempoGasto = System.currentTimeMillis() - tempo1;
        } else if   ((ordenarPor == 7) && (crescOuDecr == 2)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickDiasSemChuvaDecre();
            tempoGasto = System.currentTimeMillis() - tempo1;
        
        // Precipitação
        } else if   ((ordenarPor == 8) && (crescOuDecr == 1)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickPrecipitacaoCres();
            tempoGasto = System.currentTimeMillis() - tempo1;
        } else if   ((ordenarPor == 8) && (crescOuDecr == 2)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickPrecipitacaoDecre();
            tempoGasto = System.currentTimeMillis() - tempo1;
        
        // Risco de Fogo
        } else if   ((ordenarPor == 9) && (crescOuDecr == 1)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickRiscoDeFogoCres();
            tempoGasto = System.currentTimeMillis() - tempo1;
        } else if   ((ordenarPor == 9) && (crescOuDecr == 2)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickRiscoDeFogoDecre();
            tempoGasto = System.currentTimeMillis() - tempo1;
        
        // Latitude
        } else if   ((ordenarPor == 10) && (crescOuDecr == 1)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickLatitudeCres();
            tempoGasto = System.currentTimeMillis() - tempo1;
        } else if   ((ordenarPor == 10) && (crescOuDecr == 2)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickLatitudeDecre();
            tempoGasto = System.currentTimeMillis() - tempo1;
        
        // Longitude
        } else if   ((ordenarPor == 11) && (crescOuDecr == 1)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickLongitudeCres();
            tempoGasto = System.currentTimeMillis() - tempo1;
        } else if   ((ordenarPor == 11) && (crescOuDecr == 2)) {
            tempo1 = System.currentTimeMillis();
            quickSort.quickLongitudeDecre();
            tempoGasto = System.currentTimeMillis() - tempo1;
        }
        
        try {
            quickSort.escreverTxt();
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tempoGasto;
    }
 
    public void inserirInformacao(Informacoes info) {
        informacoes.inserirInformacao(info);
    }
    
    public static void main(String[] args) {
        Controller con = new Controller();
    }
    
    
}
