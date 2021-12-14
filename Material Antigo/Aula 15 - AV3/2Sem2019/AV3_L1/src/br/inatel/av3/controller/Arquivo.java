package br.inatel.av3.controller;

import br.inatel.av3.model.Aluno;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arquivo {

    public Arquivo() {
        try {
            OutputStream os = new FileOutputStream("av3.txt", true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    public void salvar(ArrayList<Aluno> turma){
        
        Collections.sort(turma);
        
        FileOutputStream fout;
        ObjectOutputStream out;

        try {
            fout = new FileOutputStream("av3.txt", false);
            out = new ObjectOutputStream(fout);
            
            out.writeObject(turma);

            out.close();
            fout.close();

        } catch (IOException e) {
            System.err.println("IOException");
        }
    }
    
    public ArrayList<Aluno> ler(){
        ArrayList<Aluno> a = new ArrayList<>();
        
        FileInputStream fin;
        ObjectInputStream in;

        try {
            fin = new FileInputStream("av3.txt");
            in = new ObjectInputStream(fin);

            a = (ArrayList<Aluno>) in.readObject();

            fin.close();
            in.close();

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deu ruim ao ler!");
        }
        
        return a;
    }
}
