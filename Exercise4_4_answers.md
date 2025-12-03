# Exercise 4.4 – Derleyici Deneyleri Cevaplar

---

### ❓ 1) Bir değer döndüren metodu çağırıp sonucunu kullanmassak ne olur?

Metot çalışır fakat sonucu bir değişkene atanmadığı için **hiçbir çıktı oluşmaz.**  
Java buna hata vermez — sadece değeri üretip çöpe atmış olur.

---

### ❓ 2) Void metodu ifadenin içinde kullanırsak ne olur?

```java
System.out.println(sayHello() + 7);
