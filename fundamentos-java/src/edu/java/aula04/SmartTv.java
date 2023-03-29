package edu.java.aula04;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

public void mudarCanal (int novoCanal){
    canal = novoCanal;
    System.out.println("Mudando para canal: " + canal);
}
public void subirCanal(){
    canal++;
    System.out.println("Mudando para canal: " + canal);
}

public void descerCanal(){
    canal--;
    System.out.println("Mudando para canal: " + canal);
}


public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
}
public void diminurVolume(){
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);
}
public void ligar(){
    ligada = true;
}
public void desligar(){
    ligada = false;
}

}
