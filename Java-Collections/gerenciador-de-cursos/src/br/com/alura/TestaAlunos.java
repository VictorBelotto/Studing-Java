package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Nico Steppat"); // outro Nico Steppat, exatamente igual ao anterior

        System.out.println(alunos);    
        
        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        
        Collection<String> alunos1 = new HashSet<>();
        
        List<String> alunosEmLista = new ArrayList<>(alunos1);
    }
}