public class cmdinput {
    public static void main(String[] args) {
        System.out.println(args[0]);  // args[0] is first argument
        int age  = Integer.parseInt(args[1]); // String → int
        System.out.println("The age converted to integer from string is : "+age);
        int finalAge = age +2 ;
        System.out.println("Addintion with that age is now possible (+2): " +finalAge);
    }
}
// Run: java Main HelloWorld