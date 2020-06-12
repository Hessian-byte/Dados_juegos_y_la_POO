import java.util.Random;

public class Dado {
    private String color;
    private int[] valores_caras;
    private String material;

    Random rnum = new Random();

    public Dado(String color, int[] valores_caras, String material) { // Este método crea el objeto dado a partir de
        this.color = color;
        this.valores_caras = valores_caras;
        this.material = material;
    }

    public int lanzar() { // Este método retornará un valor al azar de una de las caras del dado
        int numero;
        numero = valores_caras[rnum.nextInt(5)];
        return numero;
    }

    public void cambiarColor(String color) {
        this.color = color;
    }

}
