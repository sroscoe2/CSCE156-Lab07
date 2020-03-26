package unl.cse.trucks;

import java.util.LinkedList;

public class TruckList {
	
	//TODO: add the head of your list here
	LinkedList<Truck> t = new LinkedList<>();

	/**
	 * This function returns the size of the list, the number of
	 * elements currently stored in it.
	 * @return
	 */
	public int getSize() { 
		return this.t.size();
	}

	/**
	 * This function clears out the contents of the list, making it an
	 * empty list.
	 */
    public void clear() {
    	this.t.clear();
    }

    /**
     * This method adds the given {@link Truck} instance to the beginning
     * of the list.
     * @param t
     */
    public void addToStart(Truck t) {
    	this.t.add(0, t);
    }

    /**
     * This method adds the given {@link Truck} instance to the end of
     * the list.
     * @param t
     */
    public void addToEnd(Truck t) {
    	this.t.add(t);
    }

    /**
     * This method removes the {@link Truck} from the given 
     * <code>position</code>, indices start at 0.  Implicitly, the 
     * remaining elements' indices are reduced.
     * @param position
     */
    public void remove(int position) {
    	this.t.remove(position);
    }
    
    /**
     * This is a private helper method that returns a {@link TruckListNode}
     * corresponding to the given position.  Implementing this method
     * is optional but may help you with other methods.
     * @param position
     * @return
     */
    private TruckListNode getTruckListNode(int position) {
    	throw new UnsupportedOperationException("Not yet implemented.");
    }

    /**
     * Returns the {@link Truck} element stored at the given 
     * <code>position</code>.
     * @param position
     * @return
     */
    public Truck getTruck(int position) {
    	return this.t.get(position);
    }

    /**
     * Prints this list to the standard output.
     */
    public void print() {
    	System.out.println(this.t);
    }

}

