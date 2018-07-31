package Lavel2;

public class Solution_58 {
    public static void main(String[] args) {
        {
            Zerg zerg1 = new Zerg( );
            Zerg zerg2 = new Zerg( );
            Zerg zerg3 = new Zerg( );
            Zerg zerg4 = new Zerg( );
            Zerg zerg5 = new Zerg( );
            zerg1.name = "Vaska";
            zerg2.name = "Petka";
            zerg3.name = "Kolyn";
            zerg4.name = "Bomj";
            zerg5.name = "Ivan";
        }
        {
            Protoss protoss1 = new Protoss( );
            Protoss protoss2 = new Protoss( );
            Protoss protoss3 = new Protoss( );
            protoss1.name = "Raz";
            protoss2.name = "Dva";
            protoss3.name = "Tri";
        }
        {
            Terran terran1 = new Terran( );
            Terran terran2 = new Terran( );
            Terran terran3 = new Terran( );
            Terran terran4 = new Terran( );
            terran1.name = "Rakot";
            terran2.name = "Odin";
            terran3.name = "Hedin";
            terran4.name = "Julik";
            //напишите тут ваш код
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
