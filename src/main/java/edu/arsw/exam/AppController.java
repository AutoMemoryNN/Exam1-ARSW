package edu.arsw.exam;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/productos")
public class AppController {

    @Autowired
    private AppServiceInterface myService;
    
    @GetMapping
    public String getProductList(){

        return "{\np    \"products\":"+ myService.getProducts() + "\n}";
    }

    @GetMapping
    public String getProduct(@RequestParam Integer id){

        return "{\np    \"product\":"+ myService.getProduct(id) + "\n}";
    }

    @PostMapping
    public String createProduct(){
        try {
            return "Ok";
        } catch (Exception e) {
            return "ERROR";
        }
    }




}
