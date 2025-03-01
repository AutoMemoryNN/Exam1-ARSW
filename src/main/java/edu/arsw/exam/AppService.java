package edu.arsw.exam;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class AppService implements AppServiceInterface{
    private ArrayList<AppProduct> products = new ArrayList<>();

    public String getProducts(){

        StringBuffer sb = new StringBuffer();
        for (AppProduct appProduct : products) {
            sb.append(appProduct);
        }
        return sb.toString();
    }

    public String regProduct(AppProduct product){

        return this.products.toString();

    }

    public String getProduct(Integer id){
        return this.products.toString();
        
    }
}
