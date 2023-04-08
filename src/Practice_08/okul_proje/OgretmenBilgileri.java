package Practice_08.okul_proje;

public class OgretmenBilgileri {

    String isim;
    String soyIsim;
    int yas;
    String brans;
    String telNo;

    public OgretmenBilgileri(String isim, String soyIsim, int yas, String brans, String telNo) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
        this.brans = brans;
        this.telNo = telNo;
    }
    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "\nisim='" + isim + '\'' +
                "\nsoyIsim='" + soyIsim + '\'' +
                "\nyas=" + yas +
                "\nbrans='" + brans + '\'' +
                "\ntelNo='" + telNo + '\'';
    }
}
