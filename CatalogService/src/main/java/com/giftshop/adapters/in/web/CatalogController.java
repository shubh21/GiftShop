package com.giftshop.adapters.in.web;

import com.giftshop.domain.model.Product;
import com.giftshop.domain.usecase.AddProductUseCase;
import com.giftshop.domain.usecase.DeleteProductUseCase;
import com.giftshop.domain.usecase.UpdateProductUseCase;

public class CatalogController implements AddProductUseCase, DeleteProductUseCase, UpdateProductUseCase {
    @Override
    public String addProduct(Product product) {
        return "";
    }

    @Override
    public String deleteProduct(Product product) {
        return "";
    }

    @Override
    public String update(Product product) {
        return "";
    }
}
