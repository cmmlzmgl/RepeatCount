public class RepeatCount {

    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};


        for (int i = 0; i < dizi.length; i++) {
            int sayi = dizi[i];
            int frekans = 1;
            if (sayi != -1) {
                for (int j = i + 1; j < dizi.length; j++) {
                    if (sayi == dizi[j]) {
                        frekans++;
                        dizi[j] = -1;
                    }
                }
                System.out.println(sayi + " sayısı " + frekans + " kere tekrar edildi.");
            }
        }
    }
}
