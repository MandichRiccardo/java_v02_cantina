public class Cantina{
    protected String nome;
    protected Persona proprietario;
    protected double metriQ;
    protected BottigliaVino[] elencoBottiglie;
    protected double prezzoTop;
    
    //costruttore per input da tastiera, prende come parametro la dimensione dell'elenco bottoglie
    public Cantina(){
        nome = Interazione.strput("come si chiama la cantina?");
        proprietario = new Persona("Mario", "Rossi");
        metriQ = Interazione.doubput("quanto è grande la cantina?\t(in metri quadri)");
        elencoBottiglie = new BottigliaVino[Interazione.input("qual'è il numero massimo di bottiglie contenute nella cantina?\t\t(inserire 4 per testare il tetto massimo della dimensione della cantina)")];
    }    
    //costruttore per parametro, sulla posizione dell'elenco delle bottiglie prendo la dimensione
    public Cantina(String nome, Persona proprietario, double metriQ, int dimensioneCantina, double prezzoTop){
        this.nome = nome;
        this.proprietario = proprietario;
        this.metriQ = metriQ;
        this.elencoBottiglie = new BottigliaVino[dimensioneCantina];
        this.prezzoTop = prezzoTop;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Persona getProprietario(){
        return proprietario;
    }
    
    public double getMetriQ(){
        return metriQ;
    }
    
    public String getElencoBottiglie(){
        String info = "";
        for(int i=0;i<elencoBottiglie.length && elencoBottiglie[i] != null;i++){
            info = info.concat("\t\tbottiglia " + (i+1) + ":\n" + elencoBottiglie[i].toString() + "\n");
        }
        return info;
    }
    
    public double getPrezzoTop(){
        return prezzoTop;
    }
    
    public String toString(){
        String info = "";
        info += "\tnome:\t\t\t\t\t\t" + nome + "\n";
        info += "\tproprietario:\n" + proprietario + "\n";
        info += "\tmetri quadri:\t\t\t\t\t" + metriQ + "\n";
        info += "\telenco delle mie bottiglie:\n" + getElencoBottiglie();
        info += "\tprezzo maggiore:\t\t\t\t" + prezzoTop + "\n";
        return info;
    }
    
    public String aggiungiBottiglia(BottigliaVino bot){
        int i=0;
        while(elencoBottiglie[i] != null){
            if(i == elencoBottiglie.length-1){
                return "non hai più spazio in cantina";
            }
            if(elencoBottiglie[i].equals(bot)){
                return "questo pezzo era già presente";
            }
            i++;
        }
        elencoBottiglie[i] = bot;
        cercaPiuPrezioso();
        return "ho inserito la bottiglia";
    }
    
    public String cercaPiuPrezioso(){
        int i=0;
        while(i<elencoBottiglie.length && elencoBottiglie[i] != null){
            if(elencoBottiglie[i].getPrezzoStimato()>prezzoTop){
                prezzoTop = elencoBottiglie[i].getPrezzoStimato();
                return "ho aggiornato il prezzo più alto";
            }
            i++;
        }
        return "il prezzo maggiore è rimasto lo stesso";
    }
}