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
 * @author Bryan
 */
public class SelectionSort {
    private ArrayList<Informacoes> lista;
    long tempo1, tempo2;
    
    public SelectionSort(ArrayList<Informacoes> lista) {
        //quando instancia já referencia o arraylist
        this.lista= lista;
    }
    
   
    //--- Ordenar por data ---\\
    public long ordenarDataCres(){
        int ini = 0;
        long men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getLongDate();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objeto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getLongDate() < men) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getLongDate();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long ordenarDataDecre(){
        int ini = 0;
        long men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getLongDate();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objeto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getLongDate() > men) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getLongDate();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    //--- Ordenar por Satelite ---\\
    public long ordenarSateliteCres(){
        int ini = 0;
        String men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getSatelite();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getSatelite().compareTo(men) < 0) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getSatelite();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long ordenarSateliteDecre(){
       int ini = 0;
        String men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getSatelite();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getSatelite().compareTo(men) > 0) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getSatelite();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }

    //--- Ordenar por Pais ---\\
    public long ordenarPaisCres(){
        int ini = 0;
        String men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getPais();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getPais().compareTo(men) < 0) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getPais();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long ordenarPaisDecre(){
       int ini = 0;
        String men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getPais();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getPais().compareTo(men) > 0) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getPais();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    //--- Ordenar por Estado ---\\
    public long ordenarEstadoCres(){
        int ini = 0;
        String men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getEstado();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getEstado().compareTo(men) < 0) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getEstado();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long ordenarEstadoDecre(){
       int ini = 0;
        String men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getEstado();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getEstado().compareTo(men) > 0) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getEstado();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
     //--- Ordenar por Municipio ---\\
    public long ordenarMunicipioCres(){
        int ini = 0;
        String men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getMunicipio();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getMunicipio().compareTo(men) < 0) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getMunicipio();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long ordenarMunicipioDecre(){
       int ini = 0;
        String men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getMunicipio();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getMunicipio().compareTo(men) > 0) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getMunicipio();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    //--- Ordenar por bioma ---\\
    public long ordenarBiomaCres(){
        int ini = 0;
        String men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getBioma();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getBioma().compareTo(men) < 0) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getBioma();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long ordenarBiomaDecre(){
       int ini = 0;
        String men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getBioma();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getBioma().compareTo(men) > 0) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getBioma();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    //--- Ordenar por Dias sem chuva ---\\
    public long ordenarDiasCres(){
        int ini = 0;
        int men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getDiasSemChuva();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getDiasSemChuva() < men) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getDiasSemChuva();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long ordenarDiasDecre(){
        int ini = 0;
        int men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getDiasSemChuva();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getDiasSemChuva() > men) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getDiasSemChuva();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    //--- Ordenar por Precipitação ---\\
    public long ordenarPrecipitacaoCres(){
        int ini = 0;
        double men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getPrecipitacao();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getPrecipitacao() < men) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getPrecipitacao();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long ordenarPrecipitacaoDecre(){
        int ini = 0;
        double men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getPrecipitacao();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getPrecipitacao() > men) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getPrecipitacao();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    //--- Ordenar por Risco de fogo ---\\
    public long ordenarRiscoCres(){
        int ini = 0;
        double men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getRiscoFogo();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getRiscoFogo() < men) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getRiscoFogo();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long ordenarRiscoDecre(){
        int ini = 0;
        double men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getRiscoFogo();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getRiscoFogo() > men) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getRiscoFogo();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    //--- Ordenar por Latitude ---\\
    public long ordenarLatitudeCres(){
        int ini = 0;
        double men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getLatitude();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getLatitude() < men) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getLatitude();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long ordenarLatitudeDecre(){
        int ini = 0;
        double men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getLatitude();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getLatitude() > men) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getLatitude();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    //--- Ordenar por Longitude ---\\
    public long ordenarLongitudeCres(){
        int ini = 0;
        double men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getLongitude();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getLongitude()< men) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getLongitude();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public long ordenarLongitudeDecre(){
        int ini = 0;
        double men; //número a ser comparado
        int sch; //indice que vai procurar
        int chg; //indice de onde vai mudar
        tempo1 = System.currentTimeMillis();
        while (ini < lista.size() - 1) { //esse loop "while" basicamente escolhe o menor elemento
            chg = ini;
            men = lista.get(ini).getLongitude();     //pega a data que vai comparar
            Informacoes menorInfo = lista.get(ini); //guardar O OBJETO com a menor informação, "objto auxiliar"
            sch = ini + 1;                          //Muda índice de busca
            while (sch < lista.size()) {
                if (lista.get(sch).getLongitude() > men) {   //compara os valores de data
                    chg = sch;
                    men = lista.get(sch).getLongitude();
                    menorInfo = lista.get(sch);
                }
                sch++;;
            }
            lista.set(chg, lista.get(ini));
            lista.set(ini, menorInfo);                      //troca OS OBJETOS
            ini++;
        }
        tempo2 = System.currentTimeMillis();
        return tempo2 - tempo1;
    }
    
    public void escreverTxt() throws IOException{
        
        //Esse método sempre escreve por cima do que já tem no .txt,
        //assim não prescisa apagar o conteúdo toda vez
        FileWriter arquivo = new FileWriter(Informacoes.caminho+"selection.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        for(int i = 0; i < lista.size(); i++) {
            gravar.print(lista.get(i) + "\n"); //usa o métotdo toString, não prescisa arruamr nada
        }
        
        arquivo.close();
    }

}