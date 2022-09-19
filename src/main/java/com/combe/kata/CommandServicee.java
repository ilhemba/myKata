package com.combe.kata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@service
public class CommandServicee {

    private static Logger log = LoggerFactory.getLogger(CommandServicee.class);
    public static final String COMMAND_SEPARATOR = ":";
    public static final String TOUILLETTE = "0";
    public static final String HOT = "h";
    public static boolean empty;

    public static String command(Drink drink,double amount) throws Exception {

        if(empty){
            log.info("The coffee machine can not deliver the drink because of shortage");
            return ("The coffee machine can not deliver the drink because of shortage");
        }
        int sugar = drink.getSugar();
        if(sugar > 2 || sugar < 0){
            log.info("The sugar number is not supported : " + sugar);
            throw new Exception("The sugar number is not supported : " + sugar);
        }

        String type = drink.getType();
        if(drink.isHot()){
            type = type + HOT;
        }
        double difference = amount -  drink.getPrice();

        if(difference >= 0){
            drink.increaseSold();
            Drink.increaseTotalAmount(drink.getPrice());
            if(sugar == 0){
                return type + COMMAND_SEPARATOR + COMMAND_SEPARATOR;
            }
            else {
                return type + COMMAND_SEPARATOR + sugar + COMMAND_SEPARATOR + TOUILLETTE;
            }
        }
        else {
            return "M: you need to add " + ( -difference ) + " euro";
        }
    }
}