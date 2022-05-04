public class Quadrado {
    public static double area(double lado){
        try {
            if (lado < 0){
                throw new IllegalArgumentException();
            }
            return lado;
        } catch (IllegalArgumentException e){
            System.out.println("Lado deve possuir valor positivo");
        }

        return Double.parseDouble(String.valueOf(lado).substring(1));
    }
}
