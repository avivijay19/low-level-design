package creationalDesignPattern.factoryDesignPattern.solution;

import java.util.Scanner;

/**
 * @author : avinashvijayvargiya
 * @created : 01/11/25, Saturday
 **/

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the type of transport (bike, car, aeroplane, bus): ");
            String transportType = sc.nextLine();

            TransportFactory transportFactory = new TransportFactory();
            Transport transport = transportFactory.transport(transportType);
            transport.transport();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
