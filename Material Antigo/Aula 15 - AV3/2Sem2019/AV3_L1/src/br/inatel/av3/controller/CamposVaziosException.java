package br.inatel.av3.controller;

/**
 *
 * @author Samuel
 */
public class CamposVaziosException extends Exception{

    @Override
    public String toString() {
        return "CamposVaziosException: Preencha todos os campos!";
    }

}
