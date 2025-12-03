

public class Exercise4_2 { // program yuklenir

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {
        zippo("rattle", 13); // 1
    }

    public static void baffle(String blimp) {
        System.out.println(blimp); // 3
        zippo("ping", -5); // 4
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) { // 5
            System.out.println(quince + " zoop"); // 6
        } else { // 2
            System.out.println("ik"); // 2
            baffle(quince); // 3
            System.out.println("boo-wa-ha-ha"); // 7
        }
    }
}

/* ---------------------- AÇIKLAMA ----------------------

Programin Tam Ciktisi:
ik
rattle
ping zoop
boo-wa-ha-ha

baffle metoduna ilk gelen blimp parametresi:
rattle

-------------------------------------------------------------------------- */

