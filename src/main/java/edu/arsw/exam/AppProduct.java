package edu.arsw.exam;

public class AppProduct {
    public Integer id;
    public String name;
    public Double precio;

    public AppProduct(Integer id, String name, Double precio){
        this.id = id;
        this.name = name;
        this.precio = precio;

    }

    @Override
    public String toString(){
        return "id="+this.id+", name="+this.name+", price="+this.precio;
    }
}
