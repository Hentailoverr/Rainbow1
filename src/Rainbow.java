public class Rainbow {
    private String k = "krasniy";
    private String o = "orange";
    private String zh = "zheltiy";
    private String z = "zeleniy";
    private String gl = "goluboi";
    private String s = "siniy";
    private String f = "fioletoviy";
    private String num;
    private float n;
    public void setNum(String num){
         this.num = num;
         n = Float.parseFloat(num + "F");
    }
    public float getNum(){
        if ( n == 1) {
            System.out.println(k);
        } else if ( n > 1 && n < 2) {
            System.out.println(k + " " + o);
        } else if (n == 2) {
            System.out.println(o);
        } else if (n > 2 && n < 3) {
            System.out.println(o + " " + zh);
        } else if (n == 3) {
            System.out.println(zh);
        } else if (n > 3 && n < 4) {
            System.out.println(zh + " " + z);
        } else if (n == 4) {
            System.out.println(z);
        } else if (n > 4 && n < 5) {
            System.out.println(z + " " + gl);
        } else if (n == 5) {
            System.out.println(gl);
        } else if (n > 5 && n < 6) {
            System.out.println(gl + " " + s);
        } else if (n == 6) {
            System.out.println(s);
        } else if (n > 6 && n < 7) {
            System.out.println(s + " " + f);
        } else if ( n == 7) {
            System.out.println(f);
        } else {
            System.out.println("Wrong Number");
        }
        return n;
    }

}
