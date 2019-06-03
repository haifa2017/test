public class CodingGame {

    static boolean exists(int[] ints , int k){
        boolean result = false;

          result =  findeTheNumberTheWayClassic(ints,k);

        return result;
    }

    private static boolean findeTheNumberTheWayClassic(int[] ints, int k) {
        for(int i: ints ){
            if(i == k){
                return true;
            }
        }
        return false;
    }

    static boolean isFoo(String param){
       if(param.equals("foo")){
           return  true;
       }
       return  false;
    }

    static  String concat(String[] strings){

        String result = "";
        for(String s : strings){
            result = result + s;
        }
      return  result;

    }

    static int findLargest(int[] numbers) {
        int max = 0;
        for ( int i : numbers)
            if (i > max) {
                max = i;
            }

        return max;
    }

    static char scanChar(String s){
        return 'A';
    }
    /*public static void main(String[] args) {


        int [] ints = {-9, 14, 37, 102};
        int [] ints2 = {1, 0, 2, 3};
        System.out.println(CodingGame.exists(ints , 102));
        System.out.println(CodingGame.exists(ints , 36));
        System.out.println(CodingGame.isFoo("foo"));

        String [] a = {"f" , "o", "o", "bar"};
        System.out.println(CodingGame.concat(a));

        int result = (int) CodingGame.findLargest(ints2);
        System.out.println(result);

        String art = AsciiArt.printChar('A');
        System.out.println(art);
        char c = CodingGame.scanChar(art);
        System.out.println("Corresponds to " + c);

    }*/
}
