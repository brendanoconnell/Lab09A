
import java.awt.*;
import java.applet.*;

public class Lab09Ast extends Applet
{
    public void paint(Graphics g)
    {
        XmasTree myTree = new XmasTree();
        myTree.drawTrunk(g);
        myTree.drawLeaves(g);
        myTree.drawOrnaments(g);
        myTree.drawStar(g);
    }
}

class Tree 
{
    // Do NOT alter this Tree class in any way!
   
    
    public int x;
    public int y;
    
    public void drawTrunk(Graphics g)
    {
        Expo.setColor(g,Expo.brown);
        Expo.fillRectangle(g,475,395,525,600);
    }
    public void drawLeaves(Graphics g)
    {
        Expo.setColor(g,Expo.green);
        Expo.fillCircle(g,500,300,100);
    }
}

class PineTree extends Tree
{
    public void drawLeaves(Graphics g)
    {
       
        x = 500;
        y = 200;
        
        Expo.setColor(g,Expo.green);
        Expo.fillPolygon(g,x,y,x+75,y+75,x-75,y+75);
        Expo.fillPolygon(g,x,y+25,x+125,y+150,x-125,y+150);
        Expo.fillPolygon(g,x,y+75,x+150,y+225,x-150,y+225);
    }
}

class XmasTree extends PineTree
{

   
    public void drawOrnaments(Graphics g)
    {
        Expo.setColor(g,Expo.red);
        Expo.fillCircle(g,500,225,10);
        Expo.fillCircle(g,505,248,10);
        Expo.fillCircle(g,480,235,10);
        Expo.fillCircle(g,505,269,10);
        Expo.fillCircle(g,520,354,10);
        Expo.fillCircle(g,525,298,10);
        Expo.fillCircle(g,548,403,10);
        Expo.fillCircle(g,536,315,10);
        Expo.fillCircle(g,474,405,10);
        Expo.fillCircle(g,415,325,10);
    }
    
    public void drawStar(Graphics g){
        Expo.setColor(g,Expo.yellow);
        Expo.fillStar(g,500,180,50,5);
    }
    
  
    
}

