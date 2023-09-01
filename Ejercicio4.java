public class Main {
    public static void main(String[] args) {
        int numA = 5; // Cambia el valor de numA según sea necesario
        int numB = 3; // Cambia el valor de numB según sea necesario

        // Verifica si numA y numB tienen el mismo signo
        boolean tienenMismoSigno = (numA >= 0 && numB >= 0) || (numA < 0 && numB < 0);
          System.out.println(tienenMismoSigno);
    }
}
