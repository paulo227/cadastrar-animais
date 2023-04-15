package com.curso_poo;

public  class Cachorro extends Lobo{
    public void emitirSom() {
        System.out.println("Au! Au! Au");
    }
    //sobrecargas
    public void reagir(String frase) {
        if (frase.equals("Ola") || frase.equals("docinho"))
            System.out.println("Abanar e latir");

        else {
            System.out.println("Rosnar");
        }
    }

    public void reagir (float horario){
        if (horario < 12){
            System.out.println("Abanar");
        } else if (horario >= 18) {
            System.out.println("Ignorar");
        }else System.out.println("Abanar e latir");
        emitirSom();
    }
    public void reagir(boolean dono){
        if (dono == true){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int idade, float peso){
        if (idade <= 2){
            if (peso < 4.5){
                System.out.println("Abanar");
            }
        } else if (idade <= 2 ) {
            if (peso >= 5){
                System.out.println("Latir");
            }

        } else if (idade >= 3) {
            if (peso <= 2){
                System.out.println("Rosnar");
            }

        } else if (idade >= 3) {
            if (peso >= 5){
                System.out.println("Ignorar");
            }

        }

    }
}
