import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarVeiculo {
    private ArrayList<Veiculo> lista;
    private ArrayList<Veiculo> placa;
    private ArrayList<Veiculo> combustivel;


    public GerenciarVeiculo(){
        lista = new ArrayList<>();
    }

    public void novoVeiculo(String modelo, String marca){
        lista.add(new Veiculo(modelo, marca));
    }

    public boolean retirarPlaca(String placa){
        for (Veiculo modelo : lista) {
            if (placa.getVeiculo().equalsIgnoreCase(modelo)) {
                lista.remove(placa);
                return true;
            }
        }
    }
    public String listaPlaca (){
        return "Placa:" + placa;

    }
    public String exibirTodos (){
        return "Veiculos:" + lista;
    }
    public double obterValorImposto(String placa){
        
        return -1;

    }
    public String listarVeiculoPorCombustivel(String combustivel, String veiculo){
        System.out.println("veiculo por combustivel"+ calcular(combustivel,veiculo));
        return veiculo;
    }        
} 


