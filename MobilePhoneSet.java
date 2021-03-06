public class MobilePhoneSet extends Myset{

    /*
	   stores MobilePhone objects in a Myset.
	*/

    public MobilePhoneSet(){
		super();
    }
    
    public MobilePhone searchPhone(int id) throws MobilePhoneNotFoundException{
        /*
            Returns mobile phone with identifier id.
            Throws exception if phone not found
        */
       
        MyLinkedList.Node itr = myset.head;
        MobilePhone mobile = null;
        
        if(itr!=null){
        	mobile = (MobilePhone) itr.data;
        }	
        
        while(itr!=null && (mobile.number() != id)){
            itr = itr.next;
            if(itr!=null){
        		mobile = (MobilePhone)itr.data;
        	}
        }
        
        if(mobile == null){
            throw new MobilePhoneNotFoundException("Error - No mobile phone with identifier "+id+" found in the network");
        }

        if(mobile.number() != id){
            throw new MobilePhoneNotFoundException("Error - No mobile phone with identifier "+id+" found in the network");
        }
        
        return mobile;
    
    }    

}