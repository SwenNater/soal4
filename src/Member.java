public class Member {
    
    private String nama,team;
    private double nilaiP,nilaiS,nilaiA, nilai;
    private int umur;
    
    public void setnama(String a){
        this.nama = a;
    }
    public void setteam(String b){
        this.team = b;
    }
    public void setumur(int c){
        this.umur = c;
    }
    public void setnilaiP(double d){
        this.nilaiP = d;
    }
    public void setnilaiS(double e){
        this.nilaiS = e;
    }
    public void setnilaiA(double f){
        this.nilaiA = f;
    }
    public String getnama(){
        return nama;
    }
    public String getteam(){
        return team;
    }
    public int getumur(){
        return umur;
    }
    public double getnilai(){
        return nilai;
    }
    public void rata2(){
        nilai = ((nilaiP + nilaiS + nilaiA)/3);
    }
    
    
}
