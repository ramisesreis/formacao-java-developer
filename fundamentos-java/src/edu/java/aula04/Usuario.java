package edu.java.aula04;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        
        smartTv.ligar();
        System.out.println("Novo Status:TV Ligada! " + smartTv.ligada);
        
        smartTv.diminurVolume();
        smartTv.diminurVolume();
        smartTv.diminurVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.descerCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(8);
        System.out.println("Canal Atual: " + smartTv.canal);
          
     
        smartTv.desligar();
        System.out.println("Novo Status:TV Ligada! " + smartTv.ligada);
       }
    
}
