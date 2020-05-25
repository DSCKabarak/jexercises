package learning.udemy.refresher_course;

public class While_Loops {
    public static void main(String[] args) {
        int jvalue = 10;
        boolean loop = jvalue<20;
        //System.out.println(loop);
        while (loop == true) {
            System.out.println("trying while loop with a boolen comparison as condition");
            jvalue=jvalue+5;
            loop = jvalue<20;
        }
    }
}