public class FireModel
{
    public static int SIZE = 47;
    private FireCell[][] myGrid;
    private FireView myView;
    private int startCol;

    public FireModel(FireView view)
    {
        myGrid = new FireCell[SIZE][SIZE];
        int setNum = 0;
        for (int r=0; r<SIZE; r++)
        {
            for (int c=0; c<SIZE; c++)
            {
                myGrid[r][c] = new FireCell();
                
            }
            if(r==SIZE-1)
            {
            	startCol = (int) ((Math.random() * 46));
            	myGrid[r][startCol].setStatus(2);
            }
        }
        
        myView = view;
        myView.updateView(myGrid);
        
    }

    public void recursiveFire(int r, int c)
    {
    	if(hasTreeSurrounding(r,c)==false)
    	{
    		System.out.println();
    	}
    	else
    	{
    		if(r != 0 && r!= myGrid.length-1 && c!=0 && c!=myGrid.length-1-1)
        	{
        		
            	//top mid
            	if(myGrid[r-1][c].getStatus()==1)
            	{
            		myGrid[r-1][c].setStatus(2);
            		recursiveFire(r-1,c);
            	}
            	
            	//left
            	if(myGrid[r][c-1].getStatus()==1)
            	{
            		myGrid[r][c-1].setStatus(2);
            		recursiveFire(r,c-1);
            	}
            	//right
            	if(myGrid[r][c+1].getStatus()==1)
            	{
            		myGrid[r][c+1].setStatus(2);
            		recursiveFire(r,c+1);
            	}
            	
            	//bottom mid
            	if(myGrid[r+1][c].getStatus()==1)
            	{
            		myGrid[r+1][c].setStatus(2);
            		recursiveFire(r+1,c);
            	}
            	
        	}
        	else if(r==0)
        	{
        		if(c!=0 && c!= myGrid.length-1)
        		{
        			//left
        			if(myGrid[r][c-1].getStatus()==1)
                	{
        				myGrid[r][c-1].setStatus(2);
        				recursiveFire(r,c-1);
                	}
        			
                	//bottom mid
                	if(myGrid[r+1][c].getStatus()==1)
                	{
                		myGrid[r+1][c].setStatus(2);
                		recursiveFire(r+1,c);
                	}
                	
                	//right
                	if(myGrid[r][c+1].getStatus()==1)
                	{
                		myGrid[r][c+1].setStatus(2);
                		recursiveFire(r,c+1);
                	}
        			
        		}
        		else if(c==0)
        		{
        			
                	//bottom mid
                	if(myGrid[r+1][c].getStatus()==1)
                	{
                		myGrid[r+1][c].setStatus(2);
                		recursiveFire(r+1,c);
                	}
                	//right
                	if(myGrid[r][c+1].getStatus()==1)
                	{
                		myGrid[r][c+1].setStatus(2);
                		recursiveFire(r,c+1);
                	}
        		}
        		else if(c==myGrid.length-1)
        		{
        			//left
        			if(myGrid[r][c-1].getStatus()==1)
                	{
        				myGrid[r][c-1].setStatus(2);
        				recursiveFire(r,c-1);
                	}
        			
                	//bottom mid
                	if(myGrid[r+1][c].getStatus()==1)
                	{
                		myGrid[r+1][c].setStatus(2);
                		recursiveFire(r+1,c);
                	}
        		}
        	}
        	else if(r==myGrid.length-1)
        	{
        		if(c!=0 && c!= myGrid.length-1)
        		{
        			
                	//top mid
                	if(myGrid[r-1][c].getStatus()==1)
                	{
                		myGrid[r-1][c].setStatus(2);
                		recursiveFire(r-1,c);
                	}
                	
                	//left
                	if(myGrid[r][c-1].getStatus()==1)
                	{
                		myGrid[r][c-1].setStatus(2);
                		recursiveFire(r,c-1);
                	}
                	//right
                	if(myGrid[r][c+1].getStatus()==1)
                	{
                		myGrid[r][c+1].setStatus(2);
                		recursiveFire(r,c+1);
                	}
        		}
        		else if (c==0)
        		{
        			//top mid
                	if(myGrid[r-1][c].getStatus()==1)
                	{
                		myGrid[r-1][c].setStatus(2);
                		recursiveFire(r-1,c);
                	}
                	
                	//right
                	if(myGrid[r][c+1].getStatus()==1)
                	{
                		myGrid[r][c+1].setStatus(2);
                		recursiveFire(r,c+1);
                	}
        		}
        		else if(c==myGrid.length-1)
        		{
        			
                	//left
                	if(myGrid[r][c-1].getStatus()==1)
                	{
                		myGrid[r][c-1].setStatus(2);
                		recursiveFire(r,c-1);
                	}
                	//top mid
                	if(myGrid[r-1][c].getStatus()==1)
                	{
                		myGrid[r-1][c].setStatus(2);
                		recursiveFire(r-1,c);
                	}
        		}
        	}
        	else if(c==0)
        	{
        		if(r!=0 && r!= myGrid.length-1)
        		{
        			//top mid
                	if(myGrid[r-1][c].getStatus()==1)
                	{
                		myGrid[r-1][c].setStatus(2);
                		recursiveFire(r-1,c);
                	}
                	
                	//right
                	if(myGrid[r][c+1].getStatus()==1)
                	{
                		myGrid[r][c+1].setStatus(2);
                		recursiveFire(r,c+1);
                	}
                	//bottom mid
                	if(myGrid[r+1][c].getStatus()==1)
                	{
                		myGrid[r+1][c].setStatus(2);
                		recursiveFire(r+1,c);
                	}
                	
        		}
        	}
        	else if (c==myGrid.length-1)
        	{
        		if(r!=0 && r!= myGrid.length-1)
        		{
        			
                	//top mid
                	if(myGrid[r-1][c].getStatus()==1)
                	{
                		myGrid[r-1][c].setStatus(2);
                		recursiveFire(r-1,c);
                	}
                	//left
                	if(myGrid[r][c-1].getStatus()==1)
                	{
                		myGrid[r][c-1].setStatus(2);
                		recursiveFire(r,c-1);
                	}
                	
                	
                	//bottom mid
                	if(myGrid[r+1][c].getStatus()==1)
                	{
                		myGrid[r+1][c].setStatus(2);
                		recursiveFire(r+1,c);
                	}
        		}
        	}
    	}
    }
    
    
    private boolean hasTreeSurrounding(int r, int c)
    {

    	if(r != 0 && r!= myGrid.length-1 && c!=0 && c!=myGrid.length-1)
    	{
        	//top mid
        	if(myGrid[r-1][c].getStatus()==1)
        	{
        		return true;
        	}
        	
        	//left
        	if(myGrid[r][c-1].getStatus()==1)
        	{
        		return true;
        	}
        	//right
        	if(myGrid[r][c+1].getStatus()==1)
        	{
        		return true;
        	}
        	
        	//bottom mid
        	if(myGrid[r+1][c].getStatus()==1)
        	{
        		return true;
        	}
        	
    	}
    	else if(r==0)
    	{
    		if(c!=0 && c!= myGrid.length)
    		{
    			//left
    			if(myGrid[r][c-1].getStatus()==1)
            	{
            		return true;
            	}
    			
            	//bottom mid
            	if(myGrid[r+1][c].getStatus()==1)
            	{
            		return true;
            	}
            	
            	//right
            	if(myGrid[r][c+1].getStatus()==1)
            	{
            		return true;
            	}
    			
    		}
    		else if(c==0)
    		{
    			
            	//bottom mid
            	if(myGrid[r+1][c].getStatus()==1)
            	{
            		return true;
            	}
            	//right
            	if(myGrid[r][c+1].getStatus()==1)
            	{
            		return true;
            	}
    		}
    		else if(c==myGrid.length-1)
    		{
    			//left
    			if(myGrid[r][c-1].getStatus()==1)
            	{
            		return true;
            	}
    			
            	//bottom mid
            	if(myGrid[r+1][c].getStatus()==1)
            	{
            		return true;
            	}
    		}
    	}
    	else if(r==myGrid.length-1)
    	{
    		
    		if(c!=0 && c!= myGrid.length-1)
    		{
    			
            	//top mid
            	if(myGrid[r-1][c].getStatus()==1)
            	{
            		return true;
            	}
            	
            	//left
            	if(myGrid[r][c-1].getStatus()==1)
            	{
            		return true;
            	}
            	//right
            	if(myGrid[r][c+1].getStatus()==1)
            	{
            		return true;
            	}
    		}
    		else if (c==0)
    		{
    			//top mid
            	if(myGrid[r-1][c].getStatus()==1)
            	{
            		return true;
            	}
            	
            	//right
            	if(myGrid[r][c+1].getStatus()==1)
            	{
            		return true;
            	}
    		}
    		else if(c==myGrid.length-1)
    		{
    			
            	//left
            	if(myGrid[r][c-1].getStatus()==1)
            	{
            		return true;
            	}
            	//top mid
            	if(myGrid[r-1][c].getStatus()==1)
            	{
            		return true;
            	}
    		}
    	}
    	else if(c==0)
    	{
    		if(r!=0 && r!= myGrid.length-1)
    		{
    			//top mid
            	if(myGrid[r-1][c].getStatus()==1)
            	{
            		return true;
            	}
            	
            	//right
            	if(myGrid[r][c+1].getStatus()==1)
            	{
            		return true;
            	}
            	//bottom mid
            	if(myGrid[r+1][c].getStatus()==1)
            	{
            		return true;
            	}
            	
    		}
    	}
    	else if (c==myGrid.length-1)
    	{
    		if(r!=0 && r!= myGrid.length-1)
    		{
    			
            	//top mid
            	if(myGrid[r-1][c].getStatus()==1)
            	{
            		return true;
            	}
            	//left
            	if(myGrid[r][c-1].getStatus()==1)
            	{
            		return true;
            	}
            	
            	
            	//bottom mid
            	if(myGrid[r+1][c].getStatus()==1)
            	{
            		return true;
            	}
    		}
    	}
    	return false;
    }


    public void solve()
    {
    	recursiveFire(SIZE-1,startCol);
    	boolean isSafe = true;
        for (int c=0; c<SIZE; c++)
        {
        	if(myGrid[0][c].getStatus()== 2)
        	{
        		isSafe = false; 
        	}
        }
        if(isSafe==true)
        {
        	System.out.println("Onnet is safe.");
        }
        else
        {
        	System.out.println("Onnet is in trouble!");
        }
    	myView.updateView(myGrid);
    }

}
