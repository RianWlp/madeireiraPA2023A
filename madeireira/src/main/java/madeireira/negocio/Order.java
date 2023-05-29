package madeireira.negocio;

import br.univates.raiz.Data;

/**
 *
 * @author rianwlp
 */

public class Order {
    
    private int    id;                    
    private int    id_people;
    private Data   orderDate;
    private Data   deliveryDate;
    private String observations;
    private int    quantity;

    // private int    id;                    
    // private int    id_cliente_fornecedor;
    // private Data   orderDate;
    // private Data   deliveryDate;
    // private String observacoes;    

    public Order(){

    }

    public void setOrderDate(Data date){

        this.orderDate = date;
    }

    public void setDeliveryDate(Data date){

        this.deliveryDate = date;
    }

    public void setQuantity(int quantity){

        //Verifica se tem o produto no estoque para poder ser vendido
        //Se sim diminui a quantidade que vai ser vendida
        // if(){}

        this.quantity = quantity;
    }
    
    public void setObservations(String observations){
        
        this.observations = observations;
    }

    public Data getOrderDate(){

        return this.orderDate;
    }

    public Data getDeliveryDate(){

        return this.deliveryDate;
    }
    
    public int getQuantity(){

        return this.quantity;
    }

    public String getObservations(){

        return this.observations;
    }
}
