package com.curso_poo;

public class Ave extends Animais{
    private String corPena;

    //sobreposição ou @override
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    public void fazerNinho(){
        System.out.println("Ninho construido");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
