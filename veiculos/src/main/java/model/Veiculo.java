package model;
import javax.swing.*;
/**
 *
 * @author 1072419633
 */
public class Veiculo {
    private int peso, velocidade;
    private double preço;
    
    public Veiculo(){
        this(0,0,0);
    }
    public Veiculo(int peso, int velocidade, double preço){
        setPeso(peso);
        setVel(velocidade);
        setPreço(preço);
    }
    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getVel(){
        return velocidade;
    }
    public void setVel(int velocidade){
        this.velocidade = velocidade;
    }
    public double getPreço(){
        return preço;
    }
    public void setPreço(double preço){
        this.preço = preço;
    }
    public void leitura(){
        setPeso(Integer.parseInt(JOptionPane.showInputDialog("Digite o peso")));
        setVel(Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade")));
        setPreço(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço")));
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "O peso do veículo, sua velocidade média, e seu preço são, respectivamente: "
        +getPeso()+", "+getVel()+", "+getPreço());
    }
}
