import java.util.Scanner;

public class TriangleRunner {
    public static void main(String[] args) {




        Triangle t1 = new Triangle(), t2 = new Triangle(), t3 = new Triangle(), current = new Triangle();


        Scanner sc = new Scanner(System.in);

        int choice = 0;
        int choices=0;
        System.out.println("1) Default Triangle ");
        System.out.println("2) Own Triangle");
        System.out.println("Enter Choice:");
        choice = sc.nextInt();




        if (choice == 1) {
            while (true) {
                if (choice > 0) {
                    System.out.println("4)getArea");
                    System.out.println("5)height");
                    System.out.println("6)base");
                    System.out.println("7)angle1");
                    System.out.println("8)angle2");
                    System.out.println("9)angle3 ");
                    System.out.println("10)Quit");
                    choice = sc.nextInt();






                    } else if (choice == 4) {
                        System.out.println("The area is : " + t1.area());
                    } else if (choice == 5) {
                        System.out.println("The height is: " + t1.height());

                    } else if (choice == 6) {
                        System.out.println("The base is : " + t1.base());
                    } else if (choice == 7) {
                        System.out.println("The Angle1 is : " + t1.angle1());

                    } else if (choice == 8) {
                        System.out.println("The Angle2 is : " + t1.angle2());

                    } else if (choice == 9) {
                        System.out.println("The Angle3 is : " + t1.angle3());

                    } else if (choice == 10) {
                        break;
                    }
                }
            }

            else if(choice == 2) {
            System.out.println("1)Setbase");
            System.out.println("2)Setheight");
            System.out.println("3)SetAngles");
            System.out.println("4)getArea");
            System.out.println("5)height");
            System.out.println("6)base");
            System.out.println("7)angle1");
            System.out.println("8)angle2");
                System.out.println("9)angle3 ");
                System.out.println("10)Quit");
                choices = sc.nextInt();

            if (choices == 1) {
                System.out.println("Enter new base: ");
                int base = sc.nextInt();
                t1.setBase(base);
            }
            else if (choice == 2) {
                System.out.println("Enter new height: ");
                int height = sc.nextInt();
                t1.setheight(height);
                }
                else if (choice == 3) {
                System.out.println("Enter new angles: ");
                int angle1 = sc.nextInt();
                int angle2 = sc.nextInt();
                int angle3 = sc.nextInt();
                t1.setangle1(angle1);
                t1.setangle2(angle2);
                t1.setangle3(angle3);
                if (t1.angle1() + t1.angle2() >= 180) {
                    t1.setangle1(60);
                    t1.setangle2(60);
                }



            } else if (choice == 4) {
                System.out.println("The area is : " + t1.area());
            } else if (choice == 5) {
                System.out.println("The height is: " + t1.height());

            } else if (choice == 6) {
                System.out.println("The base is : " + t1.base());
            } else if (choice == 7) {
                System.out.println("The Angle1 is : " + t1.angle1());

            } else if (choice == 8) {
                System.out.println("The Angle2 is : " + t1.angle2());

            } else if (choice == 9) {
                System.out.println("The Angle3 is : " + t1.angle3());

            } else if (choice == 10) {
                System.out.println("QUIT");
            }


            }
        }


    }



