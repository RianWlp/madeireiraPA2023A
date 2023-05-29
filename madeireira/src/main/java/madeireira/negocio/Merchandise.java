package madeireira.negocio;

/**
 *
 * @author rianwlp
 */
public class Merchandise {

    private int    id;
    private String name;
    private String description;
    private String brand;
    private double price;
    private int    stock;


    public Merchandise(){

    }
    
    public void setName(String name){

        this.name = name.trim();
    }
        
    public void setBrand(String brand){

        this.brand = brand.trim();
    }

    public void setDescription(String description){

        this.description = description.trim();
    }

    public void setPrice(double price){

        if(price > 0){

            this.price = price;

        }else{

            //O price do produto deve ser informado 
        }
    }

    public void setStock(int stock){

        this.stock = stock; 
    }

    public double getPrice(){

        return this.price;
    }

    public int getStock(){

        return this.stock;
    }
}
