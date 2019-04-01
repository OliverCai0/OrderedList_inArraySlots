public class OrderedList_inArraySlots {
    
    private List_inArraySlots list;

    public OrderedList_inArraySlots(){
        list = new List_inArraySlots();
    }

    /**
     * Returns OrderedList_intArraySlots in toString Form
     */

    public String toString(){
        return list + "";
    }

    /**
     * Add as head
     */

    public void addAsHead(int element){
            list.add(0,element);
    }

    /**
     * Adds an element to the list
     */
    
     public boolean add(int element){
         if(list.size() == 0) {
             addAsHead(element);
             return true;
         }
         for(int index = 0; index < list.size(); index ++){
             if(element < list.get(index)){
                 list.add(index, element);
                 return true;
             }
         }
         list.add(element);
         return true;
     }

    /**
     * Returns the size of the ordered list
     */
    public int size(){
        return list.size();
    }

    /**
     * Returns a value at an index
     */

     public Object get(int index){
         return list.get(index);
     }

     /**
      * Removes a value at an index
      */

      public Object remove(int index){
          return list.remove(index);
      }

}