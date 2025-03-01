package edu.arsw.exam;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class AppService implements AppServiceInterface{
    private ArrayList<AppProduct> products = new ArrayList<>();

    public String getProducts(){
        if (this.products.size() == 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (AppProduct appProduct : products) {
            sb.append(appProduct);
        }
        return sb.toString();
    }

    public String regProduct(AppProduct product){

        try {
            this.products.add(product);
            return product.toString();
        } catch (Exception e) {
            return null;
        }
    }

    public String getProduct(Integer id){

        for (AppProduct appProduct : products) {
            if (appProduct.id == id){
                return appProduct.toString();
            }
        }
        return null;

        //throw new Exception("That product does not exist");
    }
}
