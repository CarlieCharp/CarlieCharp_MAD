package com.example.lab8;

public class Drink {
    private String drinkName;
    private String drinkURL;

    private void setDrinkInfo(Integer alcohol){
        switch (alcohol){
            case 0:
                drinkName="Mimosa";
                drinkURL="https://www.gimmesomeoven.com/mimosa-recipe/";
                break;
            case 1:
                drinkName="Margarita";
                drinkURL="https://www.gimmesomeoven.com/margarita-recipe/";
                break;
            case 2:
                drinkName="Moscow Mule";
                drinkURL="https://www.gimmesomeoven.com/moscow-mule-recipe/";
                break;
            case 3: //
                drinkName="Gin and Tonic";
                drinkURL="https://www.gimmesomeoven.com/spanish-gin-tonics/";
                break;
            default:
                drinkName="none";
                drinkURL="https://www.townandcountrymag.com/leisure/drinks/g13092298/popular-bar-drinks-to-order/";
        }
    }

    public String getDrinkName(){
        return drinkName;
    }

    public String getDrinkURL(){
        return drinkURL;
    }

    public void setDrinkName(Integer alcohol){
        setDrinkInfo(alcohol);
    }

    public void setDrinkURL(Integer alcohol){
        setDrinkInfo(alcohol);
    }

}
