import java.util.Scanner;

import static java.lang.System.exit;


public class JuegoDados {

    public static Scanner teclado = new Scanner(System.in);
    Dado dado;


    public JuegoDados() {
        int[] valores = new int[]{1,2,3,4,5,6};
        dado = new Dado("Azul", valores,"Plastico");

    }

    public JuegoDados(String color, int[] valores_caras, String material) {
        Dado dado = new Dado(color, valores_caras,material);


    }
    public void menu(){

        System.out.println("///////////////////////////\nBienvenido al juego de dados\n///////////////////////////\nEscriba el número de una de las siguientes opciones:\n(1)Jugar\n(2)Reglas\n(3)Salir");
        String opcion;
        opcion = teclado.nextLine();

        switch(opcion){
            case "1":
                Jugar();
                break;
            case "2":
                System.out.println("//////////////////////////////////////");
                System.out.println("Reglas:");
                System.out.println("Despues de dos lanzamientos de dados");
                System.out.println("ganarás si los números de estos suman");
                System.out.println("7 o más.");

                menu();
                break;
            case "3":
                exit(0);
                break;
            default:
            System.out.println("Ha ingresado una entrada no válida, por favor inténtelo de nuevo");
            menu();
        }
    }
    public void Jugar(){
        System.out.println(calcularResultado());
        repetirJuego();
    }
    public String calcularResultado(){
        int primer_valor = dado.lanzar();
        int segundo_valor = dado.lanzar();
        System.out.println("Primer lanzamiento: "+"| "+primer_valor+" |");
        System.out.println("Segundo lanzamiento: "+"| "+segundo_valor+" |");
        return evaluarResultado(primer_valor,segundo_valor);
    }
    public String evaluarResultado(int valor_a,int valor_b){
        if(valor_a+valor_b>=7){
            return "Has ganado la partida";
        }else{
            return "Has perdido la partida";
        }
    }
    public void repetirJuego(){
        String opcion;

        System.out.println("¿Desea jugar de nuevo?");
        System.out.println("Escriba si o no en el terminal");
        opcion = teclado.nextLine();

        switch (opcion){
            case "si":
                Jugar();
                break;
            case "no":
                menu();
                break;
            default:
                System.out.println("Respuesta no válida, escriba si o no en el terminal");
                repetirJuego();
        }
    }

}
