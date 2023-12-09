package br.edu.ifsul.pokemao.apresentacao;

import javax.swing.UIManager;

import com.formdev.flatlaf.FlatLightLaf;
/*
 * Ponto inicial da execução do código. Aqui começa a interface.
 * 
 * 
 */
public class Main {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        new PokemaoLogin();
        

    }
}