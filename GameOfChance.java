import java.util.Scanner;

public class GameOfChance {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bet = 0;
        int dice = 0;
        int winNum = 0;
        boolean wantToPlay = true;
        System.out.println("Initial Balance: ");
        int balance = sc.nextInt();
        while (balance < 0) {
            System.out.println("You can't play with negative or 0 balance ");
            System.out.println("Enter the balance again: ");
            balance = sc.nextInt();
        }
        while (wantToPlay && balance > 0) {
            bet = 0;
            System.out.println("Your Bet: ");
            bet = sc.nextInt();
            while ((bet > balance) || (bet < 0)) {
                System.out.println(" You can not bet more than your balance  or less than 0 buddy ");
                System.out.print("Enter your bet again : ");
                bet = sc.nextInt();
            }
            System.out.println("Current balance : " + balance);
            System.out.println("bet is " + bet);
            dice = roll();
            System.out.println("Dice rolls " + dice);
            if ((dice == 2) || (dice == 3) || (dice == 12)) {
                System.out.println("Initial Balance: " + balance);
                balance -= bet;
                System.out.println("You lost because your dice total is " + dice);
                System.out.println("Current Balance: " + balance);

                wantToPlay = askToPlay(balance, bet);
                System.out.println("Your current balance is " + balance);
            } else if ((dice == 7) || (dice == 11)) {
                System.out.println("Initial Balance: " + balance);
                balance += 2 * (bet);
                System.out.println("Dice = " + dice);
                System.out.println("You Won !!!!!");
                System.out.println("Current Balance: " + balance);
                wantToPlay = askToPlay(balance, bet);
            } else {

                System.out.println("Your current balance is " + balance);
                boolean k = askToPlay(balance, bet);
                boolean a;
                if (k) {
                    boolean play = true;
                    winNum = dice;
                    System.out.println(" Winning number now is  " + winNum);
                    while (play) {
                        System.out.println("Your Bet is " + bet);
                        bet = enterYourBet(bet, balance);
                        System.out.println(" Your total bet is " + bet);
                        dice = roll();
                        System.out.println("Dice Rolled " + dice);
                        if (dice == 7) {
                            System.out.println("You lose");
                            balance -= bet;
                            System.out.println("Your current balance is " + balance);
                            wantToPlay = askToPlay(balance, bet);
                            break;
                        } else if (dice != winNum) {
                            System.out.println("You Lose :( ");
                            System.out.println("Your Current Balance is " + balance);

                            a = askToPlay(balance, bet);
                            if (a) {
                                play = true;
                            } else if (!a) {
                                play = false;
                                wantToPlay = false;
                                balance -= bet;
                                System.out.println("Curr Balance is " + balance);
                            }
                        } else if (dice == winNum) {
                            System.out.println("You won!!!!");
                            balance += 2 * (bet);
                            System.out.println("Your current balance is " + balance);
                            wantToPlay = askToPlay(balance, bet);
                            break;
                        }
                    }
                } else if (!k) {
                    balance -= bet;
                    wantToPlay = false;
                    break;
                }
            }
        }
        System.out.println(" Current Balance : " + balance);
        System.out.println("Thanks for playing ! See you soon :) ");
    }

    public static int roll() {
        int X = (int) (Math.random() * 6) + 1;
        int Y = (int) (Math.random() * 6) + 1;
        return X + Y;
    }

    public static boolean askToPlay(int f, int c) {
        if((f-c)==0) {
            System.out.println("You can't play anymore");
            return false;
        }
        System.out.print(" Want to roll again ? ");
        String answer = sc.next();
        String ans1 = answer.toUpperCase();
        while (!(ans1.equals("YES") || ans1.equals("NO"))) {
            System.out.print("Yes or no :");
            answer = sc.next();
            ans1 = answer.toUpperCase();
        }
        if (ans1.equals("NO")) {
            return false;
        } else
            return true;

    }

    public static int enterYourBet(int c, int f) {
        int TotalBet = 0;
        if((c-f)==0) {
            System.out.println("You can't bet anymore");
        }
        System.out.println("How much would you like to increase your bet by ");
        int increasePoints = sc.nextInt();
        int x = c + increasePoints;

        if (x <= f && increasePoints > 0) {
            TotalBet = x;
        } else {
            while (!(x < f && increasePoints > 0)) {

                System.out.println("Invalid Input -_- ");
                System.out.print("Enter a valid increasing point :");
                increasePoints = sc.nextInt();
                x = increasePoints + c;
            }
            TotalBet = x;
        }

        return TotalBet;
    }
}

