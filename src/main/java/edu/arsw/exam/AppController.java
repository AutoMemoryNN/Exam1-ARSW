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
        try {
            return "{\np    \"product\":"+ myService.getProduct(id) + "\n}";
        } catch (Exception e) {
            return e.toString();
        }

    }

    @PostMapping
    public String createProduct(@RequestParam Integer id){
        String product = this.myService.regProduct(new AppProduct(id, "", 0.0))
        if (product == null) {
            return "ERROR";
        }
        return product;
    }

}
