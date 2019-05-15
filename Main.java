public class Main {
    static ArvuSisestaja sisestus = new ArvuSisestaja();

    public static void main(String[] args) {

        System.out.println("Arvude sisestus ja välja lugemine");
        int[] arvud = sisestus.sisestaArvud();

        for(int i = 0; i < arvud.length; i++){
            if(arvud[i] != 0) {
                System.out.println(arvud[i]);
            }
        }
    }
}
