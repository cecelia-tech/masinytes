
package newmasinytes;

public class Masina {
    
    protected String pavadinimas;
    protected int maxGreitis;
    protected int kelias;
    protected int greitis;
    
    
    //Konstruktorius
    
    public Masina (String pavadinimas, int maxGreitis){
    this.pavadinimas = pavadinimas;
    this.maxGreitis = maxGreitis;
        greitis = (int) (Math.random() * maxGreitis) + 1;
    }
    
    public int gazuok(int kiek){
    //negali virsyti maxGreitis
    
        if (greitis + kiek > maxGreitis) {
            return maxGreitis;
        }
        return greitis + kiek;
    }
    
    public int stabdyk (int kiek) {
    //negali vaziuoti atbulai
        if (greitis - kiek < 0) {
            return 0;
        }
        return greitis - kiek;
    }
    
    public int vaziuok (){
    return greitis;
    }

    
    
    // GETTERIAI IR SETTERIAI
    
    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getMaxGreitis() {
        return maxGreitis;
    }

    public void setMaxGreitis(int maxGreitis) {
        this.maxGreitis = maxGreitis;
    }

    public int getKelias() {
        return kelias;
    }

    public void setKelias(int kelias) {
        this.kelias = kelias;
    }

    public int getGreitis() {
        return greitis;
    }

    public void setGreitis(int greitis) {
        this.greitis = greitis;
    }
    
}
