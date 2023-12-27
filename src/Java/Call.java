package Java;

public class Call {

    int kmNew; //1. Way
    int kmOld;
    double litre;

    public Call(int kmNew, int kmOld, double litre){// 2.Way this is short way.But dont write, right click and generate ontructor,setter and getter
        this.kmNew=kmNew;
        this.kmOld=kmOld;
        this.litre=litre;
    }

    public Call() {

    }

    public void setKmNew(int kmNew) {
        this.kmNew = kmNew;
    }
    public void setKmOld(int kmOld) {
        this.kmOld = kmOld;
    }
    public void setLitre(double litre) {
        this.litre = litre;
    }
    public int getKmOld() {
        return kmOld;
    }
    public int getKmNew() {
        return kmNew;
    }
    public double getLitre() {
        return litre;
    }

    public double Benzin(){
        return (kmOld - kmNew)/litre;
    }

    public static String km(){
        return "100";
    }








}
