
import java.util.Random;

public class Dado {
    private String color;
    private int[] valores_caras;
    private String material;

    private Random rnum = new Random();

    public Dado(String color, int[] valores_caras, String material) { // Este método crea el objeto dado a partir de
        this.color = color;
        this.valores_caras = valores_caras;
        this.material = material;
    }

    public int lanzar() { // Este método retornará un valor al azar de una de las caras del dado
        return valores_caras[rnum.nextInt(valores_caras.length)];
    }

    public void cambiarColor(String color) {
        this.color = color;
    }

    public int[] getValores_caras() {
        return valores_caras;
    }
    public boolean comprobarLanzamiento(int lanzamiento){
        if(valores_caras[0]==lanzamiento ||valores_caras[1]==lanzamiento ||valores_caras[2]==lanzamiento ||valores_caras[3]==lanzamiento ||valores_caras[4]==lanzamiento ||valores_caras[5]==lanzamiento){
            return true;
        }else{
            return false;
        }
    }
}
