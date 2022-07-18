public class Calculo {
    private int montoBase;
    private int bono;
    private int impuestos;

    public Calculo( int montoBase, int bono ){
        this.montoBase = montoBase;
        this.bono = bono;
        this.impuestos = (montoBase - bono)/montoBase;
    }

    public int calcular(){
        return ( (this.bono + this.montoBase) - impuestos );
    }

}
