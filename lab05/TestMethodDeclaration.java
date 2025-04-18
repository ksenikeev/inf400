/*
   Метод - всегда существуует в контексте некоторого класса
   описывается сигнатурой:
   - модификаторы доступа (public, private, protected)
   - область "существования" static
   - тип возвращаемого значения (void)
   - имя метода
   - список аргументов (может быть пустым)

   - если есть возвращаемое значение, то внутри должен вызов return возвращаемое_выражение;

 */

public class TestMethodDeclaration {

    public static int k = 0;
    
    public static void main(String[] args) {
        
        System.out.println(k);
    }

    public static double exponenta(double x) {
        double e = 1;
        double temp = 1;
        for (int i = 1; i < 100; ++i) {
            
            temp *= x/i;
            e += temp;
        }
        return e;
    }
}