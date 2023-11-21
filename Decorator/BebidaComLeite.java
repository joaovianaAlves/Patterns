public class BebidaComLeite extends CondimentoDecorator
{
    BebidaComLeite(Bebida _bebida){
        super(_bebida);
    }
    
    public double preco(){
        return bebida.preco() + 2;
    }
    
    public String ingrediente(){
        return bebida.ingredientes() + "Leite";
    }
}
