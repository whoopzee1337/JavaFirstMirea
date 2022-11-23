package ru.mirea.task9;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class INN {
    String name , numberOfINN;
    public INN(String numberOfINN , String name) {
        this.numberOfINN = numberOfINN;
        this.name = name;
    }
    public void checkINN() throws BadINNException{
        try {
            if (this.numberOfINN.length() < 10 || this.numberOfINN.length() > 10){
                throw new BadINNException("ИНН недопустимой длины");
            }
            parseLong(numberOfINN);
            System.out.println("ИНН введен верно");

        } catch(NumberFormatException e){
            throw new BadINNException("ИНН содержит недопутимые символы");
        }
    }


}
