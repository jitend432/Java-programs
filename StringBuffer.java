import java.lang.StringBuffer;

class StringBufferr {
    public static void main(String[] args) {
        // Create StringBuffer objects
        StringBuffer sb1 = new StringBuffer("ABC");
        StringBuffer sb2 = new StringBuffer("ABC");
        
        // Compare the objects
        
System.out.print("Prints:"+(sb1==sb2)+","+sb1.equals(sb2));
    }

}
