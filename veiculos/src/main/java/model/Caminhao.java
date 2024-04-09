package model;
import javax.swing.*;
/**
 *
 * @author 1072419633
 */
public class Caminhao extends Veiculo{
    private int toneladas, altura, comprimento;
    
    public Caminhao(){
        this(0,0,0);
    }
    public Caminhao(int toneladas, int altura, int comprimento){
        setTon(toneladas);
        setAlt(altura);
        setComp(comprimento);
    }
    public int getTon(){
        return toneladas;
    }
    public void setTon(int toneladas){
        this.toneladas = toneladas;
    }
    public int getAlt(){
        return altura;
    }
    public void setAlt(int altura){
        this.altura = altura;
    }
    public int getComp(){
        return comprimento;
    }
    public void setComp(int comprimento){
        this.comprimento = comprimento;
    }
    public void leitura(){
        super.leitura();
        setTon(Integer.parseInt(JOptionPane.showInputDialog("Digite as toneladas")));
        setAlt(Integer.parseInt(JOptionPane.showInputDialog("Digite a altura")));
        setComp(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento")));
    }
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null, "O valor das toneladas, altura, e comprimento do caminhão são, respectivamente: "
        +getTon()+", "+getAlt()+", "+getComp());
    }
}
