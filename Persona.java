public class Persona{
    protected String nome;
    protected String cognome;
    protected String dataNascita;
    protected String codiceFiscale;
    
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    
    public Persona(Persona p){
        this.nome = p.nome;
        this.cognome = p.cognome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCognome(){
        return cognome;
    }
    
    public String getDataNascita(){
        return dataNascita;
    }
    public void setDataNascita(String dataNascita){
        this.dataNascita = dataNascita;
    }
    
    public String getCodiceFiscale(){
        return codiceFiscale;
    }
    public void setCodiceFiscale(String codiceFiscale){
        this.codiceFiscale = codiceFiscale;
    }
    
    public String toString(){
        String info = "";
        info += "\t\tnome:\t\t\t\t\t" + nome + "\n";
        info += "\t\tcognome:\t\t\t\t" + cognome + "\n";
        info += "\t\tdata di nascita:\t\t\t" + dataNascita + "\n";
        info += "\t\tcodice fiscale:\t\t\t\t" + codiceFiscale + "\n";
        return info;
    }
}