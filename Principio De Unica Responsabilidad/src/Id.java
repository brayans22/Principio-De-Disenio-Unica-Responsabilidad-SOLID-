public class Id {
    private String valor;
    public Id( String valor ){
        this.valor = valor;
    }

    boolean sosIgual(Id id){
        return id.equals( this );
    }
}
