import java.util.Scanner;

import static java.lang.System.exit;


public class JuegoDados {

    public static Scanner teclado = new Scanner(System.in);
    Dado dado;


    public JuegoDados() { // Crea por defecto un dado de 6 caras de color negro y material negro
        int[] valores = new int[]{1,2,3,4,5,6};
        dado = new Dado(Dado.ANSI_BLACK, valores,Dado.ANSI_BLACK);

    }

    public void menu(){ // Principal método de la clase desde el cual se puede acceder al resto de métodos de la misma

        System.out.println(Dado.ANSI_GREEN+"//////////////////////////////////////"+Dado.ANSI_RESET+"\nBienvenido al juego de dados"+Dado.ANSI_GREEN+"\n//////////////////////////////////////"+Dado.ANSI_RESET+"\nColor de los dados: "+dado.getColor()+"  1  "+Dado.ANSI_RESET+"\nMaterial de los dados: "+dado.getMaterial()+"|   |"+Dado.ANSI_RESET+"\nEscriba el número de una de las siguientes opciones:\n(1)Jugar\n(2)Reglas\n(3)Cambiar color del dado\n(4)Cambiar material del dado\n(5)Salir");
        String opcion;
        opcion = teclado.nextLine();

        switch(opcion){
            case "1":
                Jugar();
                break;
            case "2":
                System.out.println(Dado.ANSI_GREEN+"//////////////////////////////////////"+Dado.ANSI_RESET);
                System.out.println("Reglas:");
                System.out.println("Despues de dos lanzamientos de dados");
                System.out.println("ganarás si los números de estos suman");
                System.out.println("7 o más.");

                menu();
                break;
            case "3":
                menu_cambiarColor();
                break;
            case "4":
                menu_cambiarMaterial();
                break;
            case "5":
                exit(0);
                break;

            default:
            System.out.println("Ha ingresado una entrada no válida, por favor inténtelo de nuevo");
            menu();
        }
    }
    public void Jugar(){ // Realiza una jugada y luego pregunta si se desea jugar nuevamente
        System.out.println(calcularResultado());
        repetirJuego();
    }
    public String calcularResultado(){ // Se calcula e imprime el resultado de dos lanzamientos de dados
        int primer_valor = dado.lanzar();
        int segundo_valor = dado.lanzar();
        System.out.println("Primer lanzamiento: "+dado.getMaterial()+"| "+Dado.ANSI_RESET+dado.getColor()+primer_valor+Dado.ANSI_RESET+dado.getMaterial()+" |"+Dado.ANSI_RESET);
        System.out.println("Segundo lanzamiento: "+dado.getMaterial()+"| "+Dado.ANSI_RESET+dado.getColor()+segundo_valor+Dado.ANSI_RESET+dado.getMaterial()+" |"+Dado.ANSI_RESET);
        return evaluarResultado(primer_valor,segundo_valor);
    }
    public String evaluarResultado(int valor_a,int valor_b){ // Comprueba que el valor de la suma de ambos lanzamientos significa una victoria, derrota o no es un valor válido
        if(valor_a+valor_b>=7 && valor_a + valor_b <=12){
            return "Has ganado la partida";
        }else{
            if(valor_a+valor_b>=2 && valor_a + valor_b <7) {
                return "Has perdido la partida";
            } else{
                return "La suma de los dados a arrojado un resultado no válido: "+(valor_a+valor_b);
            }
        }
    }
    public void repetirJuego(){ // Este método se ejecuta despues de cada juego y dará la opción de jugar otra vez o volver al menú principal
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
    public void menu_cambiarColor(){ // permite cambiar el color a cualquier otro disponible
        System.out.println("Los colores disponibles actualmente para el dado son:\n(1)Rojo\n(2)Negro\n(3)Amarillo\n(4)Azul");
        String opcion;
        opcion = teclado.nextLine();
        switch(opcion){
            case "1":
                dado.cambiarColor(Dado.ANSI_RED);
                menu();
                break;
            case "2":
                dado.cambiarColor(Dado.ANSI_BLACK);
                menu();
                break;
            case "3":
                dado.cambiarColor(Dado.ANSI_YELLOW);
                menu();
                break;
            case "4":
                dado.cambiarColor(Dado.ANSI_BLUE);
                menu();
                break;
            case "5":
                dado.cambiarColor(Dado.ANSI_GREEN);
                menu();
                break;
            default:
                System.out.println("Respuesta no válida");
                menu_cambiarColor();
        }
    }
    public void menu_cambiarMaterial(){ // Permite cambiar el material del dado a cualquiera disponible
        System.out.println("Los colores disponibles actualmente para el material son:\n(1)Rojo\n(2)Negro\n(3)Amarillo\n(4)Azul");
        String opcion;
        opcion = teclado.nextLine();
        switch(opcion){
            case "1":
                dado.cambiarMaterial(Dado.ANSI_RED);
                menu();
                break;
            case "2":
                dado.cambiarMaterial(Dado.ANSI_BLACK);
                menu();
                break;
            case "3":
                dado.cambiarMaterial(Dado.ANSI_YELLOW);
                menu();
                break;
            case "4":
                dado.cambiarMaterial(Dado.ANSI_BLUE);
                menu();
                break;
            case "5":
                dado.cambiarMaterial(Dado.ANSI_GREEN);
                menu();
                break;
            default:
                System.out.println("Respuesta no válida");
                menu_cambiarMaterial();
        }
    }
}
