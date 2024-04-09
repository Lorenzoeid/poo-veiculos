package principal;
import model.Carro;
import model.Caminhao;
/**
 *
 * @author 1072419633
 */
public class Principal {
    public static void main(String[]args){
        Carro carro = new Carro();
        carro.leitura();
        carro.imprimir();
        
        Caminhao caminhao = new Caminhao();
        caminhao.leitura();
        caminhao.imprimir();
    }
}
