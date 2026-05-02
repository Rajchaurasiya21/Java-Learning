public class StringMethods {
    public static void main(String[]args) {
        String a = "Wassup Guys, How are You All";
        String b="             Raj Chaurasiya                   "; // For Trim method
        int value = a.length();
        String lower = a.toLowerCase();
        String upper = a.toUpperCase();
        char Counts = a.charAt(12);
        String trim=b.trim();
        String SubString=a.substring(0,4);
        String Replace=a.replace('s','z');
        String Replacee=a.replace("Guys","Boys");
        Boolean Starting=a.startsWith("Raj"); // startsWith("") Declare as Boolean.
        Boolean ending=a.endsWith("All");
        int index= a.indexOf("G",5); // because counting integer (index count as int)
        int indexEnds=a.lastIndexOf("y",12);
        Boolean Equals=a.equals("");
        System.out.println(value);
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(Counts);
        System.out.println(trim);
        System.out.println(SubString);
        System.out.println(Replace);
        System.out.println(Replacee);
        System.out.println(Starting);
        System.out.println(ending);
        System.out.println(index);
        System.out.println(indexEnds);
        System.out.println(Equals);
    }
}
