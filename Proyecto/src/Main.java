public class Main {

    public static void main(String[] args) {
        String participantes[8] = {"Diego", "Edu", "Iván", "Javi", "Manuel", "Marta", "Pedro", "Roberto"};
        
        System.out.println("Inicio del programa.\nMiembros del curso:");

        for (int i=0; i<8; i++){
            System.out.println(i+ ". " + participantes[i] + "\n");
        }

        System.out.println("\nFinal del programa.");
    }
}
