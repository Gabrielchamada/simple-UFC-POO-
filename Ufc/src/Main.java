public class Main{
    static void main(String[] args){
        Lutador l[] = new Lutador[5]; // create the array of four fighters

        l[0] = new Lutador("Neymar", "Brasil", 36, 1.80f, 68.9f, 6, 3, 1); // fighter one
        l[1] = new Lutador("Steve vai", "Estados Unidos", 60, 1.85f, 57.8f, 80, 56, 60);
        l[3] = new Lutador("Daniel molo", "Brasil", 30, 1.70f, 99.8f, 0, 100, 0);
        l[4] = new Lutador("Vasemir", "Finlandia", 40, 1.65f, 75.7f, 67, 20, 35);

        Luta ufc01 = new Luta();
        ufc01.marcarLuta(l[0], l[1]);
        ufc01.lutar();
    }
}
