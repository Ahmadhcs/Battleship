package battleshipfinal;


import java.util.Random;
import java.util.ArrayList;
        
public class ShipCreator 
    {
    int[] shipsizes = new int[]{2,3,4,5};
    int[] xcoord = new int[4];
    // int[] ycoord = new int[4];
    // for now i will make ycoord static to test
    int[] ycoord = new int[]{2,4,7,9};
    int[][] yz = {{2,2},{4,4,4},{7,7,7,7},{9,9,9,9,9}};
    
    ArrayList<Integer>[] ymap = new ArrayList[4];
    ArrayList<Integer>[] xmap = new ArrayList[4];
    
    boolean[] xycheck = new boolean[4];

    int shipsize; 
    int randnum;
    int x;
    int y;
    Random rand = new Random();
    ShipCreator()
    {
        for (int i =0; i<4; i++) 
        {
        xmap[i] = new ArrayList<Integer>();
        ymap[i] = new ArrayList<Integer>();
        }
        coordinatefinder();
        themapper(xmap);
        
    }
    String shipname(int i)
    {
        if (i == 2)
            return "Destroyer";
        if (i == 3)
            return "Submarine";
        if (i == 4)
            return "Cruiser";
        if (i == 5)
            return "Carrier";
        
        return "Destroyer";
    }
    boolean panetruth(int i, int j)
    {
        for (int g =0; g <xmap.length ; g++)
        {
            for (int z =0;z < xmap[g].size(); z++)
                if (xmap[g].get(z)==i)
                    if (yz[g][z]==j)
                        return true;
            
                
        }
        return false;
    }
    
    void coordinatefinder()
    {
        int xory=0;
        int xstart;
        int ystart;
        for (int i = 0; i<4;i++)
        {
            // this is for the x or y
            // for now i will make it only x
            //xory = rand.nextInt(2);
            
            if (xory==0)
            {
                xycheck[i]=true;
                xstart = rand.nextInt(10 - shipsizes[i]);
                if (xstart < 1)
                    xstart +=1;
                xcoord[i] = xstart;
            }
            if (xory==1)
            {
                xycheck[i]=false;
                ystart = rand.nextInt(10 - shipsizes[i]);
                ycoord[i] = ystart;
            }
        }
    }
    void themapper(ArrayList<Integer>[] list)
    {
        
        
        if (list==xmap)
        {
        for (int i = 0; i<4; i++)
        {
           for (int z = 0; z<(shipsizes[i]); z++)
               xmap[i].add(z+xcoord[i]);
        }
        }
    }
    public static void main(String[] args)
    {
        
        ShipCreator s = new ShipCreator();
        for (int i: s.ycoord)
            System.out.println(i);
        for (int i: s.xcoord)
            System.out.println(i);
        for (int i = 0; i < 4; i++)
        {
            System.out.println("xmap test");
            for (int z = 0; z < s.xmap[i].size(); z++)
                System.out.println(s.xmap[i].get(z));
            
        
        }
        System.out.println("xcoord");
            for (int j : s.xcoord)
                System.out.println(j);
        System.out.println(s.panetruth(1,4));
    }
    
}
