public class Test {


    public static void main(String[] args) {
        testTheResult();
    }

    private static void testTheResult() {
        boolean isTheSame = false;

        if( Lettre.MERCURE== Lettre.MERCURE){
            isTheSame = true;
        }

        System.out.println(isTheSame);

        if( Lettre.MERCURE.equals(Lettre.MERCURE)){
            isTheSame = true;
        }

        System.out.println(isTheSame);
    }
}
