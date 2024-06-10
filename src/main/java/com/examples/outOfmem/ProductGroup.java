package com.examples.outOfmem;

import java.util.ArrayList;
import java.util.List;

public class ProductGroup {
    private List<AbstractProduct> products = new ArrayList<AbstractProduct>();

    public void add(AbstractProduct product) {
        products.add(product);
    }
}
