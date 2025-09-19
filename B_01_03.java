public class B_01_03 {  
    /* 
     * Підрахувати добуток аргументів командного рядка. Якщо аргументи не є 
     * цілими числами, вивести про це повідомлення. 
     */
    public static void main(String[] args) {  
        double s = 1;
        for (int i = 0; i < args.length; i++) {  
            try {  
                s *= Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {  
                System.out.println("Args aren't valid :( "); 
                System.exit(0); 
            }  
        }  
        System.out.println(s); 
    }  
}


