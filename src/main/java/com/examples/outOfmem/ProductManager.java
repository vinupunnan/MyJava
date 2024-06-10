package com.examples.outOfmem;

public class ProductManager {
    private static ProductGroup regularItems = new ProductGroup();

    private static ProductGroup discountedItems = new ProductGroup();

    public void populateProducts() {

        int dummyArraySize = 1;
        for (int loop = 0; loop < Integer.MAX_VALUE; loop++) {
            if (loop % 2 == 0) {
                createObjects(regularItems, dummyArraySize);
            } else {
                createObjects(discountedItems, dummyArraySize);
            }
            System.out.println("Memory Consumed till now: " + loop + "::" + regularItems + " " + discountedItems);
            dummyArraySize *= dummyArraySize * 2;
        }
    }

    private void createObjects(ProductGroup productGroup, int dummyArraySize) {
        for (int i = 0; i < dummyArraySize; ) {
            productGroup.add(createProduct());
        }
    }

    private AbstractProduct createProduct() {
        int randomIndex = (int) Math.round(Math.random() * 10);
 //       switch (randomIndex) {
//            case 0:
//                return new ElectronicGood();
//            case 1:
//                return new BrandedProduct();
//            case 2:
//                return new GroceryProduct();
//            case 3:
//                return new LuxuryGood();
//            default:
//                return new BrandedProduct();
   //     }
return new AbstractProduct();
    }
}

