import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  The Jeroo is added to a world containing nets to avoid and flowers to pick
 *
 *  @author Mykayla Fernandes (mkaykay1)
 *  @version 2015.09.09
 */
public class ScavengerHunt extends LongIsland
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ScavengerHunt object.
     */
    public ScavengerHunt()
    {
        // Nothing to initialize, leaving the world a default size
    }


    //~ Methods ...............................................................

   
    /**
     * Adds ScavengerJeroo to world and lets it navigate 
     * around the nets and water to pick all the flowers.
     */
    public void myProgram()
    {
        ScavengerJeroo mykayla = new ScavengerJeroo(2, 2, 0);
        this.add(mykayla);
        mykayla.moveAhead();
        mykayla.avoidFirstNet();
        mykayla.avoidSecondNet();
        mykayla.pickFlowers();
        mykayla.hop();
        mykayla.pickFlowers();
        mykayla.moveAhead();
        mykayla.hop();
        mykayla.pickFlowers();
        mykayla.avoidFirstWater();
        mykayla.moveAhead();
        mykayla.moveAhead();
        mykayla.moveAhead();
        mykayla.pickFlowers();
        mykayla.turn(RIGHT);
        mykayla.moveAhead();
        mykayla.pickFlowers();
        mykayla.moveAhead();
        mykayla.pickFlowers();
        mykayla.avoidSecondWater();
        mykayla.pickFlowers();
    }
}
