package edu.arsw.exam;

public interface AppServiceInterface {
    public String getProducts();

    public String regProduct(AppProduct product);

    public String getProduct(Integer id);
}
