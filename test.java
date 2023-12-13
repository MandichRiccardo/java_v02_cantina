public class test{
    public static void main(String args[]){
        Cantina c = new Cantina();
        BottigliaVino b1 = new BottigliaVino("cinque", "fermo", "rosso", "italia", 1954, 1250.50);
        BottigliaVino b2 = new BottigliaVino("Loraine", "frizzante", "rosè", "francia", 1854, 2500.50);
        BottigliaVino b3 = new BottigliaVino("Francia del sud", "fermo", "bianco", "francia", 1901, 1700.50);
        BottigliaVino b4 = new BottigliaVino("Francia del sud", "fermo", "bianco", "francia", 1901, 1700.50);
        BottigliaVino b5 = new BottigliaVino("Francia del sud", "frizzante", "bianco", "francia", 1901, 1700.50);
        Interazione.output(c.aggiungiBottiglia(b1));
        Interazione.output(c.aggiungiBottiglia(b2));
        Interazione.output(c.aggiungiBottiglia(b3));
        Interazione.output(c.aggiungiBottiglia(b4));
        Interazione.output(c.aggiungiBottiglia(b5));
        Interazione.output(c.toString());
    }
}