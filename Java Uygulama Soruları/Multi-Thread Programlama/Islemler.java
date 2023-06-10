
public class Islemler {

//Thread kullan�lmadan.
	
    public static void main(String[] args) {
        uzunBirIslem();
        System.out.println("Merhaba Thread");
    }

    private static void uzunBirIslem() {
        try {
            // Burada uzun bir islem yap�l�yor.
            Thread.sleep(5 * 1000);
            System.out.println("Uzun islem sonucu");
        } catch (InterruptedException ex) {
            System.err.println(ex);
        } 
    }

}