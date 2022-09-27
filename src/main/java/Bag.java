/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    /**
     * A bag.
     */

    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */

    // === Instance Variables ===

    // The color of this bag.
    private String color;
    // The number of contents of this bag.
    private int numberOfContents;
    // The capacity of this bag.
    private int capacity;
    // The contents of this bag.
    private  String[] contents;

    // === Representation Invariants ===
    // 0 <= numberOfContents <= capacity
    // contents.length == capacity

    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */

    /**
     * Creates a new Bag.
     *
     * @param color     the color of this Bag.
     * @param capacity  the capacity of this Bag.
     */
    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[this.capacity];
    }

    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */

    /**
     * Reports the color of this Bag.
     *
     * @return the color of this Bag.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Reports the number of contents of this Bag.
     *
     * @return the number of contents of this Bag.
     */
    public int getNumberOfContents() {
        return this.numberOfContents;
    }

    /**
     * Reports the capacity of this Bag.
     *
     * @return the capacity of this Bag.
     */
    public int getCapacity() {
        return this.capacity;
    }

    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */

    /**
     * Sets the color of this Bag to the given color.
     *
     * @param new_color  the new color of this Bag.
     */
    public void setColor(String new_color) {
        this.color = new_color;
    }
    
    /*
     * TODO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */

    /**
     * Adds the item into this Bag if the number of items in
     * this Bag is less than the capacity of this Bag.
     *
     * @param item  the item to be added into this Bag.
     * @return true iff the item was added into this Bag.
     */
    public boolean addItem(String item) {
        if (this.numberOfContents < this.capacity) {
            this.contents[this.numberOfContents] = item;
            this.numberOfContents++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * Remove and return the last item added to this Bag.
     * If there are no items in this Bag, return null.
     *
     * @return the last item added to this Bag or null if this Bag is empty.
     */
    public String popItem() {
        if (this.numberOfContents == 0) {
            return null;
        } else {
            String last_item = this.contents[this.numberOfContents - 1];
            this.contents[this.numberOfContents - 1] = null;
            this.numberOfContents--;
            return last_item;
        }
    }

    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        this.capacity = this.capacity + n;

    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return the details of this Bag
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}