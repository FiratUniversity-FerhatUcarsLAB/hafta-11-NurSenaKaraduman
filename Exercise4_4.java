//.
public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();  // Kod derlenir, fakat sonuc kullanilmadigi icin bir cikti olmaz.
          // Derleyici genelde uyari vermez (Java), sadece sonuc bosuna uretilmis olur.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);  
        // derleme hatasi verir. -> "void type not allowed here"
        // Cunku sayHello() bir deger dondurmuyor, toplama isleminde kullanilamaz.

       
    }
}
