public class Main {
    static char lastChar;
    static boolean isEndWith;
    static boolean isStartsWith;
    static boolean isContains;
    static int indexOf;
    static String replaceAll;
    static String upperCase;
    static String lowerCase;
    public static void main(String[] args) {
        String java = "I like Java!!!";
        stringCalc(java);
        System.out.println(lastChar);
        System.out.println(isEndWith);
        System.out.println(isStartsWith);
        System.out.println(isContains);
        System.out.println(indexOf);
        System.out.println(replaceAll);
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println("Original String because String class is immutable:");
        System.out.println(java);
    }

    public static void stringCalc(String s){
        lastChar = s.charAt(s.length() - 1);
        isEndWith = s.endsWith("!!!");
        isStartsWith = s.startsWith("I like");
        isContains = s.contains("Java");
        indexOf = s.indexOf("Java");
        replaceAll = s.replaceAll("a","o");
        upperCase = s.toUpperCase();
        lowerCase = s.toLowerCase();
    }
}
