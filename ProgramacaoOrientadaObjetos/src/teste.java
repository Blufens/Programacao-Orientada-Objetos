public class teste {
    public static void main(String[] args) throws Exception {
        passeio passeio1= new passeio();
passeio1.setCor("preto");
passeio1.setMarca("ford");
passeio1.setModelo("corsa");
passeio1.setPlaca("123456");
passeio1.setPotencia(10);
passeio1.setQtdRodas(4);
passeio1.setQtdpistao(3);
passeio1.setVelmax((float) 1);
   
passeio1.calvel(passeio1.getVelmax());   

carga carga1 = new carga();

carga1.setCor("preto");
carga1.setMarca("land rover");
carga1.setModelo("evoque");
carga1.setPlaca("123");
carga1.setPotencia(10);
carga1.setQtdRodas(4);
carga1.setQtdpistao(2);
carga1.setVelmax((float) 80);
carga1.setTara(1);
carga1.setCargamaxima(100);

carga1.calvel(carga1.getVelmax());
}
}
