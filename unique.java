class test{
    public static boolean checkUniqueChar( String s) {
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++)
                if (s.charAt(i) == s.charAt(j)) return false;
         }
         return true;
    }

    public static void main(String[] args) {
        String ss = "helo";
        System.out.println("The string is " + ss);
        if (checkUniqueChar(ss)) System.out.println("all unique");
        else System.out.println("noop, has duplicated values");
        return;
    }
}