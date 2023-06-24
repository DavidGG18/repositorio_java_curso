public class sessao6_problema3 {
    

  public static void createRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void createTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso dos métodos
        System.out.println("Retângulo:");
        createRectangle(5, 3);

        System.out.println("\n Triângulo:");
        createTriangle(5);

    }}