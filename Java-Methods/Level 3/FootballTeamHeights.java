public class FootballTeamHeights { 
    public static void main(String[] args) { 
        int[] heights = new int[11]; 
        System.out.println("Heights of 11 players (in cm):"); 
            heights[i] = (int)(Math.random() * 101) + 150; 
            System.out.print(heights[i] + " "); 
        } 
        int sum = 0; 
            sum = sum + heights[i]; 
        } 
        double mean = (double)sum / heights.length; 
        int shortest = heights[0]; 
                shortest = heights[i]; 
            } 
        } 
        int tallest = heights[0]; 
            if(heights[i]  { 
                tallest = heights[i]; 
            } 
        } 
        System.out.println("\n\nShortest Height: " + shortest + " cm"); 
        System.out.println("Tallest Height: " + tallest + " cm"); 
        System.out.println("Mean Height: " + mean + " cm"); 
    } 
} 
