import java.util.Scanner;

public class ConditionalGame {
    public static void main (String[] args) {
        boolean shower = false;
        boolean clothes = false; 
        boolean teethBrushed = false;
        boolean breakfast = false;
        boolean keys = false;
        boolean wallet = false;
        boolean phone= false;
        boolean shoes = false;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Good morning. It's time to get ready to leave for the day.");

        System.out.print("Alright, let's get this day started! Have you take a shower? (enter true or false) ");
        shower = keyboard.nextBoolean();

        if (!shower) {
            System.out.println("What are you waiting on? It's time to rinse!");
        } else {
            System.out.println("Awesome. Time to get dressed!");
        }

        System.out.print("Are you dressed? (enter true or false) ");
        clothes = keyboard.nextBoolean();

        if (!clothes) {
            System.out.println("You need to get dressed!");
        } else {
            clothes = true;
            System.out.println("Great! Let's be sure to extinguish that morning breath!");
        }

        System.out.print("You have brushed your teeth, right? (Enter true or false) ");
        teethBrushed = keyboard.nextBoolean();

        if (!teethBrushed) {
            System.out.println("Brush em while you got em!");
        } else {
            System.out.println("Check out those sparkling pearls. Remember the mouth wash!");
        }

        System.out.print("Start the day with nutritous energy. Have you had breakfast? (Enter true or false) ");
        breakfast = keyboard.nextBoolean();

        if (!breakfast) {
            System.out.println("Oh no! you've got a lot of learning ahead of you. It's harder to focus without nutrition in the morning. (True or false) ");
        } else {
            System.out.println("That's great! You're almost ready to seize this day. (true or false) ");
        }

        System.out.println("We're almost ready to head out the door.");
        System.out.println("Let's check your personal inventory. (answer true or false ");
        System.out.println("do you have your wallet or purse? ");
        wallet = keyboard.nextBoolean();
        System.out.print("Do you have your keys? ");
        keys = keyboard.nextBoolean();
        System.out.print("Do you have your phone? I know you don't want to leave without your phone. ");
        phone = keyboard.nextBoolean();

        if (!keys && !phone && !wallet) {
            System.out.print("You're clearly not ready to head out yet. ");
        } else if(!wallet && !keys) {
            System.out.print("Whoa! Not so fast, be sure to get your wallet and keys. ");
        } else if (!wallet && !phone) {
            System.out.print("Are you going about town incognio today? ");
        } else if (!keys && !phone) {
            System.out.print("No keys and no phone? You don't plan on doing much today, do you? ");
        } else if (!wallet) {
            System.out.print("You probably want to grab your wallet. ");
        } else if (!keys) {
            System.out.print("You're not likely to get very far without your keys...unless you're taking the bus or fare. ");
        } else if (!phone) {
            System.out.print("Has your phoen got you feeling exhausted or did you just forget to remember? ");
        } else if (wallet && keys && phone) {
            System.out.println("Awesome! Let's get our shoes on and make this day! ");
        }

        System.out.println("It's about time to put on your shoes. I hope you know how to tie you're shoes. :P Just joking, lets get those on now. ");
        System.out.print("Are your shoes on your feet? ");
        shoes = keyboard.nextBoolean();

        if (shoes) {
            System.out.println("Let's Carpe the Diem out of this day! "); 
        } else {
            System.out.println("Mabye it's a nice day, maybe you're a hippy. I don't know, but unless you're going to be on the beach all day, I doubt you're readlly head to head out. ");
        }

        if (shower && clothes && teethBrushed && breakfast && keys && wallet && phone && shoes) {
            System.out.println("Congratulations! you are 100% ready for the day. You made this program very happpy. ");
        } else {
            System.out.println("What can we say? You're not ready for the day yet, and it's just about time to go. What have you been doing all morning? Playing silly computer games? ");
        }

     }
}