package ba.unsa.etf.rpr;

public class Sat {
    private int sati, minute, sekunde;
    Sat(int sati, int minute, int sekunde){
        Postavi(sati, minute, sekunde);
    }

    public void Postavi(int sati, int minute, int sekunde){
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }

    public void Sljedeci(){
        sekunde = sekunde + 1;
        if (sekunde == 60) {
            sekunde = 0;
            minute = minute + 1;
        }
        if (minute == 60){
            minute = 0;
            sati = sati + 1;
        }
        if (sati == 24) sati = 0;
    }

    public void Prethodni(){
        sekunde = sekunde - 1;
        if (sekunde == -1){
            sekunde = 59;
            minute = minute - 1;
        }
        if (minute == -1){
            minute = 59;
            sati = sati - 1;
        }
        if (sati == -1) sati = 23;
    }

    public void PomjeriZa(int pomak){
        if (pomak > 0) for (int i = 0; i < pomak; i++) Sljedeci();
        else for (int i = 0; i < -pomak; i++) Prethodni();
    }

    public int DajSate() {
        return sati;
    }

    public int DajMinute() {
        return minute;
    }

    public int DajSekunde() {
        return sekunde;
    }

    public final void Ispisi() {
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }

}








