package model;
import javax.swing.*;
/**
 *
 * @author 1072419633
 */
public class Carro extends Veiculo {
    private String cor, modelo;
    
    public Carro(){
        this("","");
    }
    public Carro(String cor, String modelo){
        setCor(cor);
        setModelo(modelo);
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void leitura(){
        super.leitura();
        setCor(JOptionPane.showInputDialog("Digite a cor"));
        setModelo(JOptionPane.showInputDialog("Digite o modelo"));
    }
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null, "A cor e o modelo do carro são, respectivamente: "
        +getCor()+", "+getModelo());
    }
}
