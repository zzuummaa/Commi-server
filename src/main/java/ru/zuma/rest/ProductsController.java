package ru.zuma.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.zuma.rest.model.Product;
import ru.zuma.rest.model.ProductHits;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductsController {

    @RequestMapping(value = "/products/hits", method = RequestMethod.GET)
    @ResponseBody
    public ProductHits register(@RequestParam("category") String category, HttpServletResponse response) {
        List<Product> productList = new ArrayList<>();

        switch (category) {
            case "technics":
                productList.add(new Product(
                        1,
                        category,
                        "MacBook Air 13 MQD32RU/A 8GB",
                        61_190,
                        4,
                        false,
                        1
                ));
                productList.add(new Product(
                        1,
                        category,
                        "MacBook Air 13 MQD32RU/A 8GB",
                        61_190,
                        4,
                        false,
                        2
                ));
                break;
            default:
                break;
        }

        return new ProductHits(productList);
    }

}
