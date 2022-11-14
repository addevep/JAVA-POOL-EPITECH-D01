import java.util.ArrayList;

public class Ex06 {

    public static void sequence(int nbr) {
        String start = "1";
        if(nbr >= 0) {
            System.out.println(start);
        }
        if (nbr >= 1) {
            for (int i = 0; i < nbr; i++) {
                int carac = 0;
                int num = 0;
                String result = "";
                String[] nombres = start.split("");
                for (String chiffre : nombres) {
                    int nb = Integer.parseInt(chiffre);
                    if (carac != nb) {
                        if (num != 0) {
                            result = result + num + carac;
                        }
                        carac = nb;
                        num = 1;
                    } else {
                        num = num + 1;
                    }
                }
                result = result + num + carac;
                System.out.println(result);
                start = result;
            }
        }
    }

    public static void main(String[] args) {
        Ex_06.sequence(5);
    }
}
