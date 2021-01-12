package model;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.Informacoes;

/**
 *
 * @author Lucas
 */
public class QuickSort {
    
    // ===== Variáveis e Objetos ===== //
    
    private ArrayList<Informacoes> lista;
    private long tempo1, tempo2;
    
    // ===== Método Construtor ===== //
    
    public QuickSort(ArrayList<Informacoes> lista) {
        //quando instancia já referencia o arraylist
        this.lista = lista;
    }
    
    // ===== Métodos de Ordenação por Data ===== //
    
    public void quickDataCres() {
      quickDataCres(0, lista.size() - 1);
    }
    
    private void quickDataCres(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        long piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getLongDate();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getLongDate() >= piv) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getLongDate() <= piv) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickDataCres(aLef, aPiv - 1);
        if (aRig > aPiv) quickDataCres(aPiv + 1, aRig);
    }
     
    public void quickDataDecre() {
      quickDataDecre(0, lista.size() - 1);
    }
    
    private void quickDataDecre(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        long piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getLongDate();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getLongDate() <= piv) && (lef < rig)) {
                rig--;
            }
            if (lef!= rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getLongDate() >= piv) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickDataDecre(aLef, aPiv - 1);
        if (aRig > aPiv) quickDataDecre(aPiv + 1, aRig);
    }   
    
    // ===== Métodos de Ordenação por Satelite ===== //
    
    public void quickSateliteCres() {
      quickSateliteCres(0, lista.size() - 1);
    }
    
    private void quickSateliteCres(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        String piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getSatelite();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getSatelite().compareTo(piv) >= 0) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getSatelite().compareTo(piv) <= 0) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickSateliteCres(aLef, aPiv - 1);
        if (aRig > aPiv) quickSateliteCres(aPiv + 1, aRig);
    }
    
    public void quickSateliteDecre() {
      quickSateliteDecre(0, lista.size() - 1);
    }
    
    private void quickSateliteDecre(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        String piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getSatelite();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getSatelite().compareTo(piv) >= 0) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getSatelite().compareTo(piv) <= 0) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickSateliteDecre(aLef, aPiv - 1);
        if (aRig > aPiv) quickSateliteDecre(aPiv + 1, aRig);
    }
    
    // ===== Métodos de Ordenação por Pais ===== //
    
    public void quickPaisCres() {
      quickPaisCres(0, lista.size() - 1);
    }
    
    private void quickPaisCres(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        String piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getPais();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getPais().compareTo(piv) >= 0) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getPais().compareTo(piv) <= 0) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickPaisCres(aLef, aPiv - 1);
        if (aRig > aPiv) quickPaisCres(aPiv + 1, aRig);
    }
    
    public void quickPaisDecre() {
      quickPaisDecre(0, lista.size() - 1);
    }
    
    private void quickPaisDecre(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        String piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getPais();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getPais().compareTo(piv) <= 0) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getPais().compareTo(piv) >= 0) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef > aPiv) quickPaisDecre(aLef, aPiv - 1);
        if (aRig < aPiv) quickPaisDecre(aPiv + 1, aRig);
    }
    
    // ===== Métodos de Ordenação por Estado ===== //
    
    public void quickEstadoCres() {
      quickEstadoCres(0, lista.size() - 1);
    }
    
    private void quickEstadoCres(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        String piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getEstado();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getEstado().compareTo(piv) >= 0) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getEstado().compareTo(piv) <= 0) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickEstadoCres(aLef, aPiv - 1);
        if (aRig > aPiv) quickEstadoCres(aPiv + 1, aRig);
    }
    
    public void quickEstadoDecre() {
      quickEstadoDecre(0, lista.size() - 1);
    }
    
    private void quickEstadoDecre(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        String piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getEstado();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getEstado().compareTo(piv) >= 0) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getEstado().compareTo(piv) <= 0) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickEstadoDecre(aLef, aPiv - 1);
        if (aRig > aPiv) quickEstadoDecre(aPiv + 1, aRig);
    }
    
    // ===== Métodos de Ordenação por Municipio ===== //
    
    public void quickMunicipioCres() {
      quickMunicipioCres(0, lista.size() - 1);
    }
    
    private void quickMunicipioCres(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        String piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getMunicipio();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getMunicipio().compareTo(piv) >= 0) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getMunicipio().compareTo(piv) <= 0) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickMunicipioCres(aLef, aPiv - 1);
        if (aRig > aPiv) quickMunicipioCres(aPiv + 1, aRig);
    }
    
    public void quickMunicipioDecre() {
      quickMunicipioDecre(0, lista.size() - 1);
    }
    
    private void quickMunicipioDecre(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        String piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getMunicipio();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getMunicipio().compareTo(piv) >= 0) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getMunicipio().compareTo(piv) <= 0) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickEstadoDecre(aLef, aPiv - 1);
        if (aRig > aPiv) quickEstadoDecre(aPiv + 1, aRig);
    }
    
    // ===== Métodos de Ordenação por Bioma ===== //
    
    public void quickBiomaCres() {
      quickBiomaCres(0, lista.size() - 1);
    }
    
    private void quickBiomaCres(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        String piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getBioma();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getBioma().compareTo(piv) >= 0) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getBioma().compareTo(piv) <= 0) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickBiomaCres(aLef, aPiv - 1);
        if (aRig > aPiv) quickBiomaCres(aPiv + 1, aRig);
    }
    
    public void quickBiomaDecre() {
      quickBiomaDecre(0, lista.size() - 1);
    }
    
    private void quickBiomaDecre(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        String piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getBioma();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getBioma().compareTo(piv) >= 0) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getBioma().compareTo(piv) <= 0) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickBiomaDecre(aLef, aPiv - 1);
        if (aRig > aPiv) quickBiomaDecre(aPiv + 1, aRig);
    }
    
    // ===== Métodos de Ordenação por Dias sem Chuva ===== //
    
    public void quickDiasSemChuvaCres() {
      quickDiasSemChuvaCres(0, lista.size() - 1);
    }
    
    private void quickDiasSemChuvaCres(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        int piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getDiasSemChuva();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getDiasSemChuva() >= piv) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getDiasSemChuva() <= piv) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickDiasSemChuvaCres(aLef, aPiv - 1);
        if (aRig > aPiv) quickDiasSemChuvaCres(aPiv + 1, aRig);
    }
     
    public void quickDiasSemChuvaDecre() {
      quickDiasSemChuvaDecre(0, lista.size() - 1);
    }
    
    private void quickDiasSemChuvaDecre(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        long piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getDiasSemChuva();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getDiasSemChuva() <= piv) && (lef < rig)) {
                rig--;
            }
            if (lef!= rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getDiasSemChuva() >= piv) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickDiasSemChuvaDecre(aLef, aPiv - 1);
        if (aRig > aPiv) quickDiasSemChuvaDecre(aPiv + 1, aRig);
    }
    
    // ===== Métodos de Ordenação por Precipitação ===== //
    
    public void quickPrecipitacaoCres() {
      quickPrecipitacaoCres(0, lista.size() - 1);
    }
    
    private void quickPrecipitacaoCres(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        double piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getPrecipitacao();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getPrecipitacao() >= piv) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getPrecipitacao() <= piv) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickPrecipitacaoCres(aLef, aPiv - 1);
        if (aRig > aPiv) quickPrecipitacaoCres(aPiv + 1, aRig);
    }
     
    public void quickPrecipitacaoDecre() {
      quickPrecipitacaoDecre(0, lista.size() - 1);
    }
    
    private void quickPrecipitacaoDecre(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        double piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getPrecipitacao();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getPrecipitacao() <= piv) && (lef < rig)) {
                rig--;
            }
            if (lef!= rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getPrecipitacao() >= piv) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickPrecipitacaoDecre(aLef, aPiv - 1);
        if (aRig > aPiv) quickPrecipitacaoDecre(aPiv + 1, aRig);
    }
    
    // ===== Métodos de Ordenação por Risco de Fogo ===== //
    
    public void quickRiscoDeFogoCres() {
      quickRiscoDeFogoCres(0, lista.size() - 1);
    }
    
    private void quickRiscoDeFogoCres(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        double piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getRiscoFogo();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getRiscoFogo() >= piv) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getRiscoFogo() <= piv) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickRiscoDeFogoCres(aLef, aPiv - 1);
        if (aRig > aPiv) quickRiscoDeFogoCres(aPiv + 1, aRig);
    }
     
    public void quickRiscoDeFogoDecre() {
      quickRiscoDeFogoDecre(0, lista.size() - 1);
    }
    
    private void quickRiscoDeFogoDecre(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        double piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getRiscoFogo();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getRiscoFogo() <= piv) && (lef < rig)) {
                rig--;
            }
            if (lef!= rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getRiscoFogo() >= piv) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickRiscoDeFogoDecre(aLef, aPiv - 1);
        if (aRig > aPiv) quickRiscoDeFogoDecre(aPiv + 1, aRig);
    }
    
    // ===== Métodos de Ordenação por Latitude ===== //
    
    public void quickLatitudeCres() {
      quickLatitudeCres(0, lista.size() - 1);
    }
    
    private void quickLatitudeCres(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        double piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getLatitude();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getLatitude() >= piv) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getLatitude() <= piv) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickLatitudeCres(aLef, aPiv - 1);
        if (aRig > aPiv) quickLatitudeCres(aPiv + 1, aRig);
    }
     
    public void quickLatitudeDecre() {
      quickLatitudeDecre(0, lista.size() - 1);
    }
    
    private void quickLatitudeDecre(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        double piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getLatitude();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getLatitude() <= piv) && (lef < rig)) {
                rig--;
            }
            if (lef!= rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getLatitude() >= piv) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickLatitudeDecre(aLef, aPiv - 1);
        if (aRig > aPiv) quickLatitudeDecre(aPiv + 1, aRig);
    }
    
    // ===== Métodos de Ordenação por Longitude ===== //
    
    public void quickLongitudeCres() {
      quickLongitudeCres(0, lista.size() - 1);
    }
    
    private void quickLongitudeCres(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        double piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getLongitude();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getLongitude() >= piv) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getLongitude() <= piv) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickLongitudeCres(aLef, aPiv - 1);
        if (aRig > aPiv) quickLongitudeCres(aPiv + 1, aRig);
    }
     
    public void quickLongitudeDecre() {
      quickLongitudeDecre(0, lista.size() - 1);
    }
    
    private void quickLongitudeDecre(int lef, int rig) {
       
        // ===== Variáveis e Atributos ===== //
      
        int aLef, aRig, aPiv;
        double piv;
      
        aLef = lef;
        aRig = rig;
        piv  = lista.get(lef).getLongitude();
        Informacoes menorInfo = lista.get(lef);
      
        // ===== Método ===== //
      
        while (lef < rig) {
            while ((lista.get(rig).getLongitude() <= piv) && (lef < rig)) {
                rig--;
            }
            if (lef!= rig) {
                lista.set(lef, lista.get(rig));
                lef++;
            }
            
            while ((lista.get(lef).getLongitude() >= piv) && (lef < rig)) {
                lef++;
            }
            
            if (lef != rig) {
                lista.set(rig, lista.get(lef));
                rig--;
            }
        }
        
        lista.set(lef, menorInfo);
        aPiv = lef;
        if (aLef < aPiv) quickLongitudeDecre(aLef, aPiv - 1);
        if (aRig > aPiv) quickLongitudeDecre(aPiv + 1, aRig);
    }
    
    public void escreverTxt() throws IOException{
        
        //Esse método sempre escreve por cima do que já tem no .txt,
        //assim não prescisa apagar o conteúdo toda vez
        FileWriter arquivo = new FileWriter(Informacoes.caminho+"quick.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        for(int i = 0; i < lista.size(); i++) {
            gravar.print(lista.get(i) + "\n"); //usa o métotdo toString, não prescisa arruamr nada
        }
        
        arquivo.close();
    }
    
}

