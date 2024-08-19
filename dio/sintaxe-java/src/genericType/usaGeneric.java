package genericType;

public class usaGeneric {
    public static void main(String[] args) {
        Generic<String> genStr = new Generic<String>();
        genStr.setT("Lucas");
        System.out.println(genStr.getT());        
    }
}