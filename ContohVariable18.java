public class ContohVariable18{
    public static void main(String[] args){
        //deklarasi
        String hobi = "Bermain petak umpet";
        boolean Pandai = true;
        char jenisKelamin = 'P';
        byte umur = 18;
        double ipk = 3.24, tinggi = 1.78;

        //output
        System.out.println(hobi);
        System.out.println("Apakah pandai? " + Pandai);
        System.out.println("Jenis kelamin: " +jenisKelamin);
        System.out.println("Umurku saat ini: " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}