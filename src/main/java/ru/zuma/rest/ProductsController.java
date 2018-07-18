package ru.zuma.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.zuma.rest.model.BuyerAccountInfo;
import ru.zuma.rest.model.Product;
import ru.zuma.rest.model.ProductHits;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


@Controller
public class ProductsController {

    @RequestMapping(value = "/products/hits", method = RequestMethod.GET)
    public ResponseEntity<ProductHits> register(@RequestParam("category") String category, HttpServletResponse response) {
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
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(new ProductHits(productList), HttpStatus.OK);
    }

}
