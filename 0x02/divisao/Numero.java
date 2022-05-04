public class Numero {
	public static void dividir(int a, int b){
        var result = 0;
        try {
            result = (a/b);
        } catch (ArithmeticException e){
            System.out.println("Nao eh possivel dividir por zero");
        } finally {
            System.out.println(a +" / "+ b +" = "+result);
        }
    }
}
