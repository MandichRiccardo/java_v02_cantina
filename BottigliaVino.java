public class BottigliaVino{
    protected String vigneto;
    protected String tipologia;             //fermo o frizzante
    protected String colore;                //rosso, rosè o bianco
    protected String luogoImbottigliamento;
    protected int annoImbottigliamento;
    protected double prezzoStimato;
    
    public BottigliaVino(String vigneto, String tipologia, String colore, String luogoImbottigliamento, int annoImbottigliamento, double prezzoStimato){
        this.vigneto = vigneto;
        this.tipologia = tipologia;
        this.colore = colore;
        this.luogoImbottigliamento = luogoImbottigliamento;
        this.annoImbottigliamento = annoImbottigliamento;
        this.prezzoStimato = prezzoStimato;
    }
    
    public BottigliaVino(BottigliaVino bot){
        this.vigneto = bot.vigneto;
        this.tipologia = bot.tipologia;
        this.colore = bot.colore;
        this.luogoImbottigliamento = bot.luogoImbottigliamento;
        this.annoImbottigliamento = bot.annoImbottigliamento;
        this.prezzoStimato = bot.prezzoStimato;
    }
    
    public String getVigneto(){
        return vigneto;
    }
    
    public String getTipologia(){
        return tipologia;
    }
    
    public String getColore(){
        return colore;
    }
    
    public String getLuogoImbottigliamento(){
        return luogoImbottigliamento;
    }
    
    public int getAnnoImbottigliamento(){
        return annoImbottigliamento;
    }
    
    public double getPrezzoStimato(){
        return prezzoStimato;
    }
    public void setPrezzoStimato(double prezzoStimato){
        this.prezzoStimato = prezzoStimato;
    }
    
    public String toString(){
        String info = "";
        info += "\t\t\tvigneto:\t\t\t" + vigneto + "\n";
        info += "\t\t\ttipologia:\t\t\t" + tipologia + "\n";
        info += "\t\t\tcolore:\t\t\t\t" + colore + "\n";
        info += "\t\t\tluogo di imbottigliamento:\t" + luogoImbottigliamento + "\n";
        info += "\t\t\tanno di imbottigliamento:\t" + annoImbottigliamento + "\n";
        info += "\t\t\tprezzo stimato:\t\t\t" + prezzoStimato + "\n";
        return info;
    }
    
    public boolean equals(BottigliaVino bot){
        if(this.vigneto != bot.vigneto){
            return false;
        }
        if(this.tipologia != bot.tipologia){
            return false;
        }
        if(this.colore != bot.colore){
            return false;
        }
        if(this.luogoImbottigliamento != bot.luogoImbottigliamento){
            return false;
        }
        if(this.annoImbottigliamento != bot.annoImbottigliamento){
            return false;
        }
        return true;
    }
}