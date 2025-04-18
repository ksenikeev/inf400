public class TestComparingString {
    public static void main(String[] args) {

        String varStr1 = "Строка 1";
        String varStr2 = "Строка 1";
        //String varStr2 = new String(new char[]{'С','т','р','о','к','а',' ','1'});

        varStr1 = varStr1.replace("1", "2");
        varStr2 = varStr2.replace("1", "2");
        
        System.out.println(varStr1);
        System.out.println(varStr2);

        System.out.println(varStr1.equals(varStr2));
        
        for (int i = 0; i < varStr1.length(); ++i) {
            System.out.print(varStr1.charAt(i));
        }
    }
}