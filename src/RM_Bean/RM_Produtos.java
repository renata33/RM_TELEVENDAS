package RM_Bean;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_Produtos {

    protected String RM_Descricao;
    protected double RM_valor;
    protected int RM_quantidade;
    protected int RM_ID;
    protected String RM_Lote;
   
    
    public RM_Produtos(String Descricao, double valor, int quantidade, int ID, String Lote){
        this.RM_Descricao = Descricao;
        this.RM_valor = valor;
        this.RM_quantidade = quantidade;
        this.RM_ID = ID;
        this.RM_Lote = Lote;
        
       }

    public int getRM_ID() {
        return RM_ID;
    }

    public void setRM_ID(int RM_ID) {
        this.RM_ID = RM_ID;
    }
    
    public void setRM_Descricao(String Descricao){
    this.RM_Descricao = Descricao;
}
    public String getRM_Descricao(){
    return this.RM_Descricao;
}
    public void setRM_valor(double valor){
    this.RM_valor = valor;
}
    public double getRM_valor(){
    return this.RM_valor;
}
    
    public void setRM_quantidade(int quantidade){
    this.RM_quantidade = quantidade;
}
    public int getRM_quantidade(){
    return this.RM_quantidade;
}
    
    public void setRM_Lote(String Lote){
    this.RM_Lote = Lote;
}
    public String getRM_Lote(){
    return this.RM_Lote;
}
  
}
