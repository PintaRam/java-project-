public class Myclass {
    int num1 = 10;
    private static int num2 = 20;
    int sum1;
    String data;

    public static void main(String[] args) {
        Myclass obj = new Myclass();
        int sum = obj.num1 + Myclass.num2;
        System.out.println("num1 : " + obj.num1);
        System.out.println("num2 : " + Myclass.num2);
        System.out.println("sum = " + obj.num1 + "+" + Myclass.num2 + " = " + sum);
        System.out.println(
                "\n======================================================================================================");
        System.out.println(obj.sum1 + "\n" + obj.data);
    }

}
