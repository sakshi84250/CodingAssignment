// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Asses {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String init, reg = "", fin, house = "", food = "", line, temp[];
        int size = 0, roll = -1;

        ArrayList<Integer> bV = new ArrayList<Integer>();
        ArrayList<Integer> aV = new ArrayList<Integer>();
        ArrayList<Integer> bNV = new ArrayList<Integer>();
        ArrayList<Integer> aNV = new ArrayList<Integer>();
        ArrayList<Integer> NA = new ArrayList<Integer>();
        ArrayList<Integer> arrSize = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        line = x.nextLine();
        temp = line.split(" ");

        try {
            init = temp[0];
            size = Integer.parseInt(temp[1]);

            if(!init.equals("init")) {
                System.out.println("Invalid Input");
                System.exit(0);
            } 
        } catch(Exception e) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        while(!(line = x.nextLine()).equals("fin")) {
            // line = x.nextLine();
            temp = line.split(" ");

            try {
                reg = temp[0];
                roll = Integer.parseInt(temp[1]);
                house = temp[2];
                food = temp[3];

                if(!reg.equals("reg")) {
                    System.out.println("Invalid Input");
                    System.exit(0);
                } 

            } catch(Exception e) {
                System.out.println("Invalid Input");
                System.exit(0);
            }

            if(set.contains(roll)) continue;

            switch(house) {
                case "A":
                    switch(food) {
                        case "V":
                            if(aV.size() == size/4) {
                                NA.add(roll);
                            } else {
                                aV.add(roll);
                                set.add(roll);
                            }
                            break;
                        case "NV":
                            if(aNV.size() == size/4) {
                                NA.add(roll);
                            } else {
                                aNV.add(roll);
                                set.add(roll);
                            }
                            break;
                        default:
                            System.out.println("Invalid Input");
                            System.exit(0);
                    }

                    break;
                case "B":
                    switch(food) {
                        case "V":
                            if(bV.size() == size/4) {
                                NA.add(roll);
                            } else {
                                bV.add(roll);
                                set.add(roll);
                            }
                            break;
                        case "NV":
                            if(bNV.size() == size/4) {
                                NA.add(roll);
                            } else {
                                bNV.add(roll);
                                set.add(roll);
                            }
                            break;
                        default:
                            System.out.println("Invalid Input");
                            System.exit(0);
                    }

                    break;

                default:
                    System.out.println("Invalid Input");
                    System.exit(0);
            }
        }

        System.out.print("BV : ");
        System.out.println(bV);

        System.out.print("AV : ");
        System.out.println(aV);

        System.out.print("BNV : ");
        System.out.println(bNV);

        System.out.print("ANV : ");
        System.out.println(aNV);

        System.out.print("NA : ");
        System.out.println(NA);
    }
}