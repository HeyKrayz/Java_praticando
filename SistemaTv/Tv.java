package SistemaTv;
public class Tv {
    boolean EstadoDaTv = false;
    int Canal = 1;
    int Volume = 10;

    public void ligar() {
        EstadoDaTv = true;
    }
    public void desligar() {
        EstadoDaTv = false;
    }

    public void AumentarVolume() {
        Volume ++;
    }
    public void DiminuirVolume() {
        Volume --;
    }
}