public class MathDriver {
    public static void main(String[] args) {
        double[][] array1 = {
            {2,4,-2,2},
            {4,9,-3,8},
            {-2,-3,7,10}
        };
        GaussJordan example = new GaussJordan(array1);
        example.eliminate();
        System.out.println(example);
    }
}
