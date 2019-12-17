package com.example.coffee_new;

public class NameShop {
    private String coffeeShopName;
    private String coffeeShopURL;

    private void setCoffeeInfo(Integer coffeeCrowd){
        switch (coffeeCrowd){
            case 0: //the hill
                coffeeShopName="Illegal Petes";
                coffeeShopURL="https://www.illegalpetes.com";
                break;
            case 1: //29th Street
                coffeeShopName="Chipotle";
                coffeeShopURL="https://www.chipotle.com";
                break;

            case 2: //Pearl Street
                coffeeShopName="Bartaco";
                coffeeShopURL="https://bartaco.com";
                break;


        }
    }

    public String getCoffeeShopName(){
        return coffeeShopName;
    }

    public String getCoffeeShopURL(){
        return coffeeShopURL;
    }

    public void setCoffeeShopName(Integer coffeeCrowd){
        setCoffeeInfo(coffeeCrowd);
    }

    public void setCoffeeShopURL(Integer coffeeCrowd){
        setCoffeeInfo(coffeeCrowd);
    }

}
