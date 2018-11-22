
public class FirstDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,4, 3,3,4, 5,2, 1};
		System.out.println(firstDuplicate(A));
	}

	public static int firstDuplicate(int[] a) {
	    int val;
	    int dupinx=0;
	    for(int i=0; i<a.length;i++){
	        val = a[i];
	        for(int j=i+1; j<a.length;j++){
	            if(val==a[j]){
	                
	                if(dupinx >= i ) {
	                	dupinx =j;
	                	 //System.out.println(dupinx);
	                }
	               
	            }
	            
	        }
	    }
	    if(dupinx == 0) {
	    	return -1;
	    }else {
	    	return a[dupinx];
	    }
	    
	
	}
	
	
}
