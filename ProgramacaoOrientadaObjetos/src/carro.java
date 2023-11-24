public abstract class carro extends motor {
    private String placa;
    private String modelo;
    private String marca;
    private String cor;
    private Float velmax;
    private int qtdRodas;
    
   
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Float getVelmax() {
        return velmax;
    }

    public void setVelmax(Float velmax) {
        this.velmax = velmax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public float calvel ( float velmaxima){
     return   ((velmaxima * 1000)/3600 ); 
        
    }

}

