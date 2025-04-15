import java.util.Scanner;
public class MoodDairy{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hey love, how are you feeling?");
        String mood =scanner.nextLine().toLowerCase();

        if (mood.contains("sad")){
            System.out.println("It's okay to feel sad, even clouds need to cry sometimes ");

        }else if(mood.contains("happy")){
            System.out.println("Yay! Soak in every bit of this joy.");
        }else if(mood.contains("tired")){
            System.out.println("Rest, love. Doing your best also means knowing when to pause");
        }else{
            System.out.println("Whatever you are feeling, its valid. I am proud of you for showing up");
        }
        scanner.close();
    }
}