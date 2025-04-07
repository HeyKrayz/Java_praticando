package SistemaTv;
public class Usuario {
    public static void main (String[]args) {
        Tv tv = new Tv();
        tv.ligar();

        if (tv.EstadoDaTv == true) {
            System.out.println("tv ligada!");
            System.out.println ("Canal: " + tv.Canal);
            System.out.println("Volume: "+ tv.Volume);
        }else {
            System.out.println("sua tv esta desligada!");
        }
    }
}
