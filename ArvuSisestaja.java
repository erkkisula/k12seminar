import java.util.Scanner;

public class ArvuSisestaja implements Sisestus{

    @Override
    public int[] sisestaArvud() {
        Scanner input = new Scanner(System.in);
        int[] arvud = new int[1000];
        boolean sisestus = true;
        int i = 0;
        while(sisestus){
            System.out.println("Sisestage arv: ");
            arvud[i] = input.nextInt();
            System.out.println("Kas soovite veel sisestada? y/n");
            input.nextLine();
            String temp = input.nextLine();
            if(temp.equals("n")){
                sisestus = false;
            }
            i++;
        }
        return arvud;
    }
}
