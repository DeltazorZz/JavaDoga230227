
package aranyhal;

import java.util.Map;

public class Aranyhal {
    private final int KIVANSAGOKSZAMA = 3;
    int kor;
    Map<Integer, String> kivansagok;
    String kifogta;

    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
    }

    public Aranyhal(int kor, String kifogta) {
        this.kor = kor;
        this.kifogta = kifogta;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }

    public int kivansagokSzama(String kifogta){
    
        return 0;
    
    }
    public String[] kikkelTalalkozott(){
    
        return null;
    
    }
    public boolean kivansagotTeljesit(String kivansag){
    
        return false;
    
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "KIVANSAGOKSZAMA=" + KIVANSAGOKSZAMA + ", kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }
    
}
