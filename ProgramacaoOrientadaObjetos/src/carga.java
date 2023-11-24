public class carga  extends carro{
    private int  tara;
    private int    cargamaxima;

    
public int getTara() {
        return tara;
    }


    public void setTara(int tara) {
        this.tara = tara;
    }


    public int getCargamaxima() {
        return cargamaxima;
    }


    public void setCargamaxima(int cargamaxima) {
        this.cargamaxima = cargamaxima;
    }


public float calvel ( float velmaxima){
    float velocidade;
    velocidade=   (((velmaxima * 1000)*100 )/3600 ); 
        System.out.println("essa é a velocidade em cm/m " + velocidade);
    return velocidade;
    }

}
