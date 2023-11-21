public abstract class CondimentoDecorator implements Bebida
{
    Bebida bebida;
    
    CondimentoDecorator(Bebida _bebida){
        bebida = _bebida;
    }
    
    public double preco(){
        return bebida.preco();
    }
    
    public String ingredientes(){
        return bebida.ingredientes();
    }
}
