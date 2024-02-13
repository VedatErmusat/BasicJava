package İnheritance.Example3;

public class Arac { String marka;
    String model;
    String yakitTuru;
    int tekerlekSayisi;
    double motorGucu;

    public Arac(String marka, String model, String yakitTuru, int tekerlekSayisi, double motorGucu) {
        this.marka = marka;
        this.model = model;
        this.yakitTuru = yakitTuru;
        this.tekerlekSayisi = tekerlekSayisi;
        this.motorGucu = motorGucu;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    public void setTekerlekSayisi(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi;
    }

    public double getMotorGucu() {
        return motorGucu;
    }

    public void setMotorGucu(double motorGucu) {
        this.motorGucu = motorGucu;
    }

    @Override
    public String toString() {
        return "Aracın markası: " + getMarka() + "\n" + "Modeli: " + getModel() +   "\n" + "Yakıt Türü: " + getYakitTuru()  + "\n" + "Tekerlek Sayısı: " + getTekerlekSayisi() + "\n" + "Motor Gücü: " + getMotorGucu();
    }
}
