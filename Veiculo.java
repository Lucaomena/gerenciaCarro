import java.util.ArrayList;


/**
 * Veiculo
 */
public class Veiculo {

    private String modelo;
    private String marca;
    private double ano;
    private double valorIP;
    private double placa;
    private String combustivel;
    private double imposto;
    private String veiculo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
        
    }
    public void SetValor(double valorIP){
            this.valorIP = valorIP;
    }
    public String getVeiculo(){
        return veiculo;
    } 

    public String getModelo(){
        return modelo;
    }
    
    public String getmarca(){
        return marca;
    }
    
    public double getano(){
        return ano;
    }
    public double getvalor(){
        return valor;
    }
    public double getplaca(){
        return placa;
    }
    public String getcombustivel(){
        return combustivel;
    }
    public double getimposto(){
        return imposto;
    }



    public double calcularImposto(){

        if (ano <= 2001) {
            System.out.println("veículo isento de IPVA !");
            
        } else if ((combustivel.equals("gasolina")||(combustivel.equals("diesel")||(combustivel.equals("flex"))))){

            valorIP = (valor * 4 / 10);
            System.out.println("o valor a ser pago é:" + valorIP);

        } else if (combustivel.equals("GNV")||combustivel.equals("diesel")) {    
            
            valorIP = (valor * 3 / 10);
            System.out.println("o valor a ser pago é:" + valorIP);

        }
    return imposto;
    

}
public String imprimir(){
    return "Modelo:"+modelo+"Marca:"+marca+"Ano:"+ano+"Valor:"+valor+"Placa:"+placa+"Combustivel:"+combustivel+"Imposto"+
    imposto;

}
    
    
}