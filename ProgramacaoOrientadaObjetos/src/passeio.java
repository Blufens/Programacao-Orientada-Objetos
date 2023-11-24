public class passeio extends carro {
    private int qtdpassageiros; 


    public float calvel ( float velmaxima){
       float velocidade;
       
      velocidade=  ((velmaxima * 1000)/3600 ); 
      System.out.println("essa é a velocidade em m/s " + velocidade);
            return velocidade;
       }


    public int getQtdpassageiros() {
        return qtdpassageiros;
    }


    public void setQtdpassageiros(int qtdpassageiros) {
        this.qtdpassageiros = qtdpassageiros;
    }


    
}
