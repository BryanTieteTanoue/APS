/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Anthony Herbert Cruz de Souza
 */
public class InsertionSort {
    private ArrayList<Informacoes> lista;
    long tempo1, tempo2;
    
    public InsertionSort(ArrayList<Informacoes> lista) {
        //quando instancia já referencia o arraylist
        this.lista= lista;
    }
    
    // ------------ Organizar por Data ------------ \\   
            
    public long organizaDataCres(){
        int ini = 1,
            chg;
        long men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getLongDate();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && men < lista.get(chg).getLongDate()){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long organizaDataDecre(){
        int ini = 1,
            chg;
        long men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getLongDate();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && men > lista.get(chg).getLongDate()){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    // ------------------------------------------------ \\
    // ------------ Organizar por Satelite ------------ \\
    
    public long organizaSateliteCres(){
        int ini = 1, chg;
        String men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getSatelite();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && lista.get(chg).getSatelite().compareTo(men)>0){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long organizaSateliteDecre(){
        int ini = 1, chg;
        String men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getSatelite();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && lista.get(chg).getSatelite().compareTo(men)<0){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    // ------------------------------------------------ \\
    // ------------ Organizar por Pais ------------ \\
    
    public long organizaPaisCres(){
        int ini = 1, chg;
        String men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getPais();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && lista.get(chg).getPais().compareTo(men)>0){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long organizaPaisDecre(){
        int ini = 1, chg;
        String men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getPais();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && lista.get(chg).getPais().compareTo(men)<0){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    // ------------------------------------------------ \\
    // ------------ Organizar por Estado ------------ \\
    public long organizaEstadoCres(){
        int ini = 1,
            chg;
        String men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getEstado();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && lista.get(chg).getEstado().compareTo(men)>0){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
        }
    
    public long organizaEstadoDecre(){
        int ini = 1,
            chg;
        String men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getEstado();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && lista.get(chg).getEstado().compareTo(men)<0){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    // ------------------------------------------------ \\
    // ------------ Organizar por Municipio ------------ \\    
    public long organizaMunicipioCres(){
        int ini = 1,
            chg;
        String men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getMunicipio();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && lista.get(chg).getMunicipio().compareTo(men)>0){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long organizaMunicipioDecre(){
        int ini = 1,
            chg;
        String men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getMunicipio();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && lista.get(chg).getMunicipio().compareTo(men)<0){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    // ------------------------------------------------ \\
    // ------------ Organizar por Bioma ------------ \\
    public long organizaBiomaCres(){
        int ini = 1,
            chg;
        String men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getBioma();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && lista.get(chg).getBioma().compareTo(men)>0){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long organizaBiomaDecre(){
        int ini = 1,
            chg;
        String men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getBioma();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && lista.get(chg).getBioma().compareTo(men)<0){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    // ------------------------------------------------ \\
    // ------------ Organizar por Dias sem chuva ------------ \\
    public long organizaDiasCres(){
        int ini = 1,
            chg;
        int men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getDiasSemChuva();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && men < lista.get(chg).getDiasSemChuva()){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long organizaDiasDecre(){
        int ini = 1,
            chg;
        int men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getDiasSemChuva();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && men > lista.get(chg).getDiasSemChuva()){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    // ------------------------------------------------ \\
    // ------------ Organizar por precipitação ------------ \\
    public long organizaPrecipitacaoCres(){
        int ini = 1,
            chg;
        double men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getPrecipitacao();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && men < lista.get(chg).getPrecipitacao()){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long organizaPrecipitacaoDecre(){
        int ini = 1,
            chg;
        double men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getPrecipitacao();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && men > lista.get(chg).getPrecipitacao()){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
        }
    
    // ------------------------------------------------ \\
    // ------------ Organizar por Risco ------------ \\
    public long organizaRiscoCres(){
        int ini = 1,
            chg;
        double men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getRiscoFogo();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && men < lista.get(chg).getRiscoFogo()){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long organizaRiscoDecre(){
        int ini = 1,
            chg;
        double men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getRiscoFogo();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && men > lista.get(chg).getRiscoFogo()){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
        }
    
    // ------------------------------------------------ \\
    // ------------ Organizar por latitude ------------ \\
    public long organizaLatitudeCres(){
        int ini = 1,
            chg;
        double men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getLatitude();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && men < lista.get(chg).getLatitude()){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long organizaLatitudeDecre(){
        int ini = 1,
            chg;
        double men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getLatitude();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && men > lista.get(chg).getLatitude()){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    // ------------------------------------------------ \\
    // ------------ Organizar por Longitude ------------ \\
    public long organizaLongitudeCres(){
        int ini = 1,
            chg;
        double men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getLongitude();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && men < lista.get(chg).getLongitude()){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long organizaLongitudeDecre(){
        int ini = 1,
            chg;
        double men;
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size()){
            men = lista.get(ini).getLongitude();
            Informacoes Info = lista.get(ini);
            chg = ini - 1;
            while (chg>-1 && men > lista.get(chg).getLongitude()){
                lista.set(chg + 1, lista.get(chg));
                chg --;
            }
            lista.set(chg+1,Info);
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public void escreverTxt() throws IOException{
        
        //Esse método sempre escreve por cima do que já tem no .txt,
        //assim não prescisa apagar o conteúdo toda vez
        FileWriter arquivo = new FileWriter("C:\\Users\\Bryan\\Documents\\NetBeansProjects\\APS\\APS\\src\\.txt\\insertion.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        for(int i = 0; i < lista.size(); i++) {
            gravar.print(lista.get(i) + "\n"); //usa o métotdo toString, não prescisa arruamr nada
        }
        
        arquivo.close();
    }

}
