package newmasinytes;

public class NewMasinytes {

    /*
    Masinyciu lenktynes

 

Sukurti klase Masina su tokiom savybem:   X
pavadinimas (String)    X
maxGreitis (int)    X
kelias (int)    X
greitis (int)   X
metodai:
gaziuok(kiek)  negali virsyti maxGreitis     X
stabdyk(kiek)  negali vaziuoti atbulai      X
vaziuok() - pavaziuoja tiek, koks siuo metu yra greitis
getteriai/setteriai (kue reikia)        X

 

main:
lenktynes (8 masinos)       X
kiekvieno ciklo metu
kiekvienai masinai nusprendiam ar ji gazuos (0.8) ar stabdys (0.2)  X
gazuoja 1..10       X
stabdo 1..5         X
kas 100 km atspausdinti lyderi      X
lenktynes baigiasi, kai kuri nors masina pasiekia 1000 km       X

 

surusiuoti visas masinas pagal nuvaziuota kelia     X
ir atspausdinti turnyrine lentele       X

 

*******
Sukurti klase SportineMasina (pavedeta nuo Masina)      X
papildomai turi savybe:
spoileris (pakeltas - true/ nuleistas - false)      X

 

jei spoileris pakeltas - masina stabdo 2x greiciau      X
jei spoileris nuleistas- masina stabdo kaip eiline masina       X

 

jei spoileris pakeltas - masina gazuoja kaip eiline masina      X
jei spoileris nuleistas- masina gazuoja 2x greiciau     X

 

main:
lenktyniauja 6 paprastos ir 2 sportine masinos
kiekvieno ciklo metu
jei tai  yra sportine masina:
50/50 turi pakelti arba nuleist spoileri
    */
    public static void main(String[] args) {
        //masinu objektu masyvas, paprastos masinos
        Masina [] m = new Masina[8];
        //kiekvienos masinos pavadinimas ir maxGreitis
        m[0] = new Masina("Pirma", 250);
        m[1] = new Masina("Antra", 200);
        m[2] = new Masina("Trecia", 190);
        m[3] = new Masina("Ketvirta", 245);
        m[4] = new Masina("Penkta", 150);
        m[5] = new Masina("Sesta", 255);
        //m[6] = new Masina("Septinta", 240);
        //m[7] = new Masina("Astunta", 250);
        //pridedam 2 sportines masinas
        
        
        //pasizymim laimetoja
        int laimetojas = -1;
        int km = 1;
        
        do {
            int lyderis = 0;
            for (int i = 0; i < m.length; i++) {
               m[i].vaziuok(); //iskviecia Math.random
                if (((double) m[i].getGreitis()) / m[i].getMaxGreitis() < 0.8) {
                   m[i].kelias += m[i].gazuok((int) (Math.random() * 10) + 1);
                    System.out.println("gazuoja");
                }
                if (((double) m[i].getGreitis()) / m[i].getMaxGreitis() > 0.8){
                m[i].kelias += m[i].stabdyk((int) (Math.random() * 5) + 1);
                    System.out.println("stabdo");
                }
                if (m[i].getKelias() > m[lyderis].getKelias()) {
                    lyderis = i;
                }
                System.out.println(m[i].kelias + " " + m[i].getPavadinimas());
                
            }
            if (m[lyderis].getKelias() /100 >=km) {
                    System.out.println("lyderis "+lyderis + " " + m[lyderis].getKelias());
                //System.out.println();
                System.out.println("----");
                km++;
                }
            for (int i = 0; i < m.length; i++) {
             if (m[i].kelias >= 1000 ) {
                    //cia tikrinam kas daugiau nuvaziavo, tas ir laimetojas
                    if (laimetojas < 0 || m[laimetojas].kelias < m[i].kelias) {
                    laimetojas = i;
                    }
                }   
            }
            
            System.out.println("============");
            //laimetojas++;
        } while (laimetojas == -1);
        
        System.out.println(laimetojas + " " + m[laimetojas].getPavadinimas());
        
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i].getKelias() > m[j].getKelias()) {
                    int tmp = m[i].getKelias();
                    m[i].kelias = m[j].getKelias();
                    m[j].kelias = tmp;
                }
            }
        }
         for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].getKelias() + " " + m[i].getPavadinimas());
        }
        /*
        for (int i = 0; i < m.length; i++) {
            int temp = 0;
            
            if (m[i].getKelias() > m[i+1].getKelias()) {
                
            }
        }
        */
        /*
        int[] masinytes = new int[8];
        //sukuriam nauja masinyciu masyva 

        int laimetojas = -1;
        //deklaruojam laimetoja

        
        //do ciklas, nes norim, kad pirma jos pavaziuotu
        do {
            //per kiekviena cikla masinytes pajuda tarp 1 ir 5;
            for (int i = 0; i < masinytes.length; i++) {
                //prie kiekvienos masinytes is kart sumuojam kiek ji nuvaziavo
                masinytes[i] += (int) (Math.random() * 5) + 1;
            }
            // cia ieskom ar jau yra laimetojas
            for (int i = 0; i < masinytes.length; i++) {
                //einam per kiekviena ir ziureim ar jau nuvaziavo 1000
                if (masinytes[i] > 1000) {
                    //jei laimetojo dar nebuvo
                    //arba jei kita masinyte nuvaziavo toliau, tada ji tampa laimetoja
                    if (laimetojas < 0 || masinytes[laimetojas] < masinytes[i]) {
                        laimetojas = i;
                        //pvz laimetojas yra nr 5
                    }
                }
            }
            //while sukasi kol nera laimetojo
        } while (laimetojas == -1);
        
        
        //cia tiesiog atspausdinam kiek nuvaziavo visos masineles
        System.out.println("pabaiga");
        for (int i = 0; i < masinytes.length; i++) {
            System.out.println(masinytes[i]);
        }
        
        //atspausdinam laimetoja
        System.out.println("laimetojas");
        //atspausdina numeri
        System.out.println(laimetojas);
        //is array isima tos masinytes nuvaziuota atstuma
        System.out.println(masinytes[laimetojas]);

        */
        
        /*int t = ((int) (Math.random() * 5) + 1);
        System.out.println(t);
        if (t < 3) {
            System.out.println(t);
            System.out.println("maziau");
        }else{
            System.out.println(t);
            System.out.println("daugiau");}*/
    }
    
}
