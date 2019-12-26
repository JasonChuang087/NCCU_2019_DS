public class KeywordList  {
	private LinkedList<Keyword> lst;
	
	public KeywordList(){
		this.lst = new LinkedList<Keyword>();
    }
	
	public void add(Keyword keyword){
		// add keyword to proper index base on its count
		
//		lst.add(keyword);
//		lst.printList();
		if(lst.size()==0) 
		{
			lst.add(keyword);
			System.out.println("@");
		} 
		else 
		{
			int now = 0;
			while(keyword.count<lst.get(now).getCount()) 
			{
				System.out.println("keycount="+keyword.count+"nowcount="+lst.get(now).getCount());
				now++;
				if(now>=lst.size())
				{
					break;
				}
			}
			System.out.println("@@@");
			lst.add(now,keyword);
		}
		lst.printList();
		lst.resetIndex();
    }
	
	public void outputIndex(int n)
	{
		if(n>lst.size()-1)
		{
		    System.out.println("InvalidOperation1");
		}
		
		LinkedList<Keyword> results = new LinkedList<>();
		Keyword k = lst.get(n);		    
		results.add(k);		    		
		
		printKeywordList(results);	
	}
	
	public void outputCount(int c){
		LinkedList<Keyword> results = new LinkedList<>();
		for(int i=0;i<lst.size();i++){
		    Keyword k = lst.get(i);
		    if(k.count == c){
		    	results.add(k);
		    }
		}
		if(results.isEmpty()){
		    System.out.println("NotFound");
		}else{
		    printKeywordList(results);
		}
    }
	
	public void outputHas(String pattern){
		LinkedList<Keyword> results = new LinkedList<>();
		for(int i=0;i<lst.size();i++){
		    Keyword k = lst.get(i);
		    if(k.name.contains(pattern)){
		    	results.add(k);
		    }
		}
		if(results.isEmpty()){
		    System.out.println("NotFound");
		}else{
		    printKeywordList(results);
		}
	}
	
	public void outputName(String pattern){
		LinkedList<Keyword> results = new LinkedList<>();
		for(int i=0;i<lst.size();i++){
		    Keyword k = lst.get(i);
		    if(k.name.equals(pattern)){
		    	results.add(k);
		    }
		}
		if(results.isEmpty()){
		    System.out.println("NotFound");
		}else{
		    printKeywordList(results);
		}
	}
	
	public void outputFirstN(int n)
	{
		if(n>lst.size())
		{
		    System.out.println("InvalidOperation");
		    return;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++)
		{
		    Keyword k = lst.get(i);
		    if(i>0)
		    {
		    	sb.append(" ");
		    }
		    sb.append(k.toString());   
		}
		System.out.println(sb.toString());
    }
	
	public void outputScore(){
		float results = 0;
		for(int i=0;i<lst.size();i++){
		    Keyword k = lst.get(i);
		    results += k.weight * k.count;
		}
		
		System.out.println(results);
	}
	
	public void deleteIndex(int n){
		if(n>=lst.size()){
		    System.out.println("InvalidOperation");
		    return;
		}
			
		lst.remove(n);
		
		System.out.println("Done");	
	}
	
	public void deleteCount(int cnt){
		// remove nodes that the count is equal to cnt
		for(int i = 0; i < lst.size();i++)
		{
			Keyword k = lst.get(i);
//			System.out.println("~"+k.count+ cnt);
			if(k.count == cnt)
			{
	//			System.out.println("~~");
				lst.remove(i);
				i--;
			}
			
		//	System.out.println("size="+lst.size());
			
			
		}
		
    }
	
	public void deleteHas(String name){
		// remove nodes that the name contains input name
		for(int i=0;i<lst.size();i++){
		    Keyword k = lst.get(i);
		    if(k.name.contains(name)){
		    	lst.remove(i);
		    }
		}
    }
	
	public void deleteName(String name){
		// remove nodes that the name is equal to input name
		for(int i=0;i<lst.size();i++){
		    Keyword k = lst.get(i);
		    if(k.name == name){
		    	lst.remove(i);
		    }
		}
    }
	
	public void deleteFirstN(int n){
		//remove first n nodes
		if(n>lst.size()){
		    System.out.println("InvalidOperation");
		    return;
		}
		if(n>0) {
			for(int i = 0; i < n;i++) {
				lst.remove(i);
			}
		}
	
    }	
	
	public void deleteAll(){
		lst = new LinkedList<Keyword>();
		System.out.println("Done");
    }
	
	private void printKeywordList(LinkedList<Keyword> kLst){
		kLst.printList();
    }
	
}