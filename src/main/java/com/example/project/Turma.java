package com.example.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Turma {
    List<Double> notas = new ArrayList<>();
    
    
    public void addNota(double nota) {
        notas.add(nota);
    }

    public int getQuantidadeNotas() {
        return notas.size();
    }

    public double getMediaDasNotas() {
        Double total = 0.0;
        
        for (Double nota : notas) {
            total += nota;
        }
        return total / notas.size();
    }

    public int getQuantidadeNotasMeioresQueAMedia() {
        Double media = this.getMediaDasNotas();
        int count = 0;
        for (Double nota : notas) {
            if(nota < media){
                count++;
            }
        }
        
        return count;
    }
}
