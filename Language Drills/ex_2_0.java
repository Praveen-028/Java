public class ex_2_0 {
    public static void main(String[] args) {
        boolean finished = false;
        boolean again = false;
        // My goodness! Look at this one...!
        System.out.println((finished || !again) && (finished || (again || !again)));
        
}
}
