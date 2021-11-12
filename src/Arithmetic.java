public class Arithmetic {
    //static fields
    // a static property
    public static double pi = 3.14159;

    public static int add(int x, int y){
        return x + y;
    }
    public static void main(String[] args) {
        // do not go down this road w/ static
//        Arithmetic.myMath = new Arithmetic();
//        System.out.println(myMath.pi); // still will work BUT WRONG

        System.out.println("Arithmetic.pi = " + Arithmetic.pi);

        System.out.println(("Arithmetic.add(2,2) = " + Arithmetic.add(2,2)));


    }
}
