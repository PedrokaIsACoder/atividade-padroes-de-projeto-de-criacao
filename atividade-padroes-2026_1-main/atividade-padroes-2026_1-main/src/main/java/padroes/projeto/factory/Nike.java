package padroes.projeto.factory;

public class Nike implements EsportesUIFactory{
        
    @Override
    public ProdutoUI fabricarTenis(){
        return new TenisNike("Nike", 38);
    }

    @Override
    public ProdutoUI fabricarCamisa(){
        return new CamisaNike("Nike",36);
    }
    
}


