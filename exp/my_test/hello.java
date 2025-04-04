
public class C1 {
    private String a = "Private";
    String b = "default";
    protected String c = "Proctected";
    public String d = "Public";

}

class C2 {
    void access() {
        System.out.println(a2);
    }
}

class hello {
    public static void main(String[] args)
        C2 obj = new C2();
        obj.access();
}