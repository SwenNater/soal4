import java.util.ArrayList;

public class MainMember {
    
     static ArrayList<Member> member = new ArrayList<>();
    
    public static void main(String[] args) {
        Member x1 = new Member();
        x1.setnama("Akai");
        x1.setteam("TIK LAN GROUP");
        x1.setumur(19);
        x1.setnilaiP(90);
        x1.setnilaiS(90);
        x1.setnilaiA(90);
        x1.rata2();
        member.add(x1); 
        member.get(0);
        Member x2 = new Member();
        x2.setnama("Frost");
        x2.setteam("TIK LAN GROUP");
        x2.setumur(19);
        x2.setnilaiP(80);
        x2.setnilaiS(100);
        x2.setnilaiA(95);
        x2.rata2();
        member.add(x2); 
        member.get(1);
        Member x3 = new Member();
        x3.setnama("Bot");
        x3.setteam("TIK LAN GROUP");
        x3.setumur(18);
        x3.setnilaiP(75);
        x3.setnilaiS(85);
        x3.setnilaiA(65);
        x3.rata2();
        member.add(x3);
        member.get(2);
        Member x4 = new Member();
        x4.setnama("Kyuri");
        x4.setteam("TIK LAN GROUP");
        x4.setumur(18);
        x4.setnilaiP(95);
        x4.setnilaiS(95);
        x4.setnilaiA(90);
        x4.rata2();
        member.add(x4);
        member.get(3);
        
        Tampilan();
        
    }
        public static void Tampilan(){
            System.out.println("---------Daftar Member---------");
            for (int i = 0 ; i < member.size(); i++){
                System.out.println("Nama : " + member.get(i).getnama());
                System.out.println("Team : " +member.get(i).getteam());
                System.out.println("Umur : " +member.get(i).getumur());
                System.out.println("Rata - rata nilai : " +member.get(i).getnilai());
                System.out.println("---------------------------------");
        }
        
        
   
        
}
    
}
