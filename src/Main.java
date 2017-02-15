
class Main {
    public static void main(String[] args) {
      
        Sinileva s = new Sinileva(null, null);
        System.out.println(s);
        s.yhteyta();
        Sinileva s2 = s.lisaannySuvuttomasti();
        System.out.println(s2);
        
        System.out.println("-----");
        
        Karpasloukku k = new Karpasloukku(null, null);
        System.out.println(k);
        k.liiku();
        k.yhteyta();
        
        System.out.println("-----");
        
        Limasieni l = new Limasieni(null, null);
        System.out.println(l);
        l.liiku();
        l.pakene();
        
        System.out.println("-----");
      
        Harka h = new Harka(null, null);
        System.out.println(h);
        h.liiku();
        
        System.out.println("-----");
        
        Ihminen i = new Ihminen(null, null);
        i.liiku();
        i.pakene();
        i.puhu();
        Ihminen i2 = new Ihminen(null, null);
        Ihminen i3 = i.lisaannySuvullisesti(i2);
        System.out.println(i3);
        
        System.out.println("-----");
        
        Minotaur m = i.lisaannySuvullisesti(h);
        System.out.println(m);
        m.liiku();
        m.puhu();
        
        System.out.println("-----");
        
        Kasvi kas = new Kasvi(null, null);
        Elain ela = new Elain(null, null);
        
        Alruuna a = new Alruuna(kas, ela); // Hankala!
        System.out.println(a);
        a.liiku();
        a.puhu();
    }
}








