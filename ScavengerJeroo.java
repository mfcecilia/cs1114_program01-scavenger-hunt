import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 * Places the Scavenger Jeroo in the world and adds
 * methods to help it navigate around the water 
 * and nets so it can pick all the flowers.
 *
 *  @author Mykayla Fernandes (mkaykay1)
 *  @version 2015.09.09
 */
public class ScavengerJeroo extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    
    // ----------------------------------------------------------
    /**
     * Creates a new ScavengerJeroo object facing east.
     * @param x         The x-coordinate of the Jeroo's location.
     * @param y         The y-coordinate of the Jeroo's location.
     * @param flowers   The number of flowers the Jeroo is holding.
     */
    public ScavengerJeroo(int x, int y, int flowers)
    {
        super(x, y, flowers);
        
    }


    //~ Methods ...............................................................
    
    /**
     * Move forward
     */
    
    public void moveAhead()
    {
        this.hop();
        this.hop();
    }
    
    /**
     * Avoid the first net obstacle
     */
    public void avoidFirstNet()
    {
        this.turn(RIGHT);
        this.moveAhead();
        this.turn(LEFT);
        this.hop();
        this.hop();
    }
        
    /**
     * Avoid second net obstacle
     */
    public void avoidSecondNet()
    {
        this.turn(LEFT);
        while (this.isClear(AHEAD) ) 
        {
            hop();
        }
        if (this.seesFlower(AHEAD) )
        {
            this.pickFlowers();
        }
        this.turn(RIGHT);
    }
        
    /**
     * Pick flowers
     */
    public void pickFlowers()
    {
        while (this.seesFlower(AHEAD) )
        {
            this.hop();
            this.pick();
        }
    }
    
    /**
     * Avoid first water obstacle
     */
    public void avoidFirstWater()
    {
        this.turn(RIGHT);
        this.hop();
        this.turn(LEFT);
        this.hop();
        this.turn(RIGHT);
    }
    
    /**
     * Avoid second water obstacle
     */
    public void avoidSecondWater()
    {
        this.turn(RIGHT);
        this.hop();
        this.turn(RIGHT);
        this.moveAhead();
        this.turn(LEFT);
        this.moveAhead();
    }
}
            
