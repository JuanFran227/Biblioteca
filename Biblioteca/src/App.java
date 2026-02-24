public class App {
    public static void main(String[] args) throws Exception {
        Libro p = new Libro("el hobbit", "JuanFrancisco", "telenovela");
        Libro h = new Libro("la historia interminable", "Paco", "aventura");
         Libro f = new Libro("traficante de armas", "JuanFran", "violencia");
        Usuario z = new Usuario("Vicente", 1234);
        Usuario l = new Usuario("Quini", 34567);
        System.out.println(p);
        System.out.println(h);
        System.out.println(z);
        System.out.println(l);
        System.out.println(f);
    }
}
