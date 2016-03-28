package backend;

class Train {
	
	int trainid;
	
	int length;
	float weight;
	float oprcost;
	int maxppl;
	
	Locomotive[] locos;
	Bogey[] Bogeys;
	

	void update(){
		weight = wtsum(locos) + wtsum(Bogeys);
		length = lensum(locos) + lensum(Bogeys);
		//Put other attributes to update here//
	}
	float wtsum(Unit[] array){
		float wt = 0;
		for(int i=0; i<array.length; i++){
			wt = wt + array[i].weight;
		}
		return wt;
	}
	int lensum(Unit[] array){
		int len = 0;
		for(int i=0; i<array.length; i++){
			len = len + array[i].length;
		}
		return len;
	}
}
