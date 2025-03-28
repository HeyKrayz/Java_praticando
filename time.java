public class time {
    public static void main (String[] args) {
        System.out.println("quais anos teve copa do mundo?");
        
        for (int Cup = 1930; Cup > 1; Cup += 4) {
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println ("copa do mundo " + Cup);
        }
    }
}
