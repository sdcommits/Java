public class string_method {
    public static void  main(String args[]){
        // concatinate
        String name = "Sheenam";
        String name2 = "Aman";
        System.out.println(name + " and " + name2);

        // CharAt
        System.out.println(name.charAt(0));

        // length 
        System.out.println(name.length());

        // Replace
        String replaceName = name.replace("a","Y");
        System.out.println(replaceName);

        // substring
        String name3 = "Sheenam Dubey";
        System.out.println(name3.substring(0,4));


    }
    
}
