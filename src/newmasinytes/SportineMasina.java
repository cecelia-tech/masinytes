package newmasinytes;

/*
  Sukurti klase SportineMasina (pavedeta nuo Masina)        X
papildomai turi savybe:
spoileris (pakeltas - true/ nuleistas - false)

 

jei spoileris pakeltas - masina stabdo 2x greiciau
jei spoileris nuleistas- masina stabdo kaip eiline masina

 

jei spoileris pakeltas - masina gazuoja kaip eiline masina
jei spoileris nuleistas- masina gazuoja 2x greiciau
 */
public class SportineMasina extends Masina{
    
    boolean spoileris;
    
    public SportineMasina (String pavadinimas, int maxGreitis, boolean spoileris){
    super(pavadinimas, maxGreitis);
    this.spoileris = spoileris;
    
    }
    
    public int stabdyk (int kiek) {
    //negali vaziuoti atbulai
    //jei pakeltas spoleris
        if (spoileris == true) {
            if (greitis - (kiek * 2 ) < 0) {
            return 0;
        }
            return greitis - kiek * 2;
        }
        //jei spoleris nuleistas
        if (greitis - kiek < 0) {
            return 0;
        }
        return greitis - kiek;
    }
    
    
    public int gazuok(int kiek){
    //negali virsyti maxGreitis
        if (spoileris == true) {
            if (greitis + (kiek * 2 ) < 0) {
            return 0;
        }
            return greitis + kiek * 2;
        }
        
        if (greitis + kiek * 2 > maxGreitis) {
            return maxGreitis;
        }
        return greitis + kiek;
    }
    
    
}
