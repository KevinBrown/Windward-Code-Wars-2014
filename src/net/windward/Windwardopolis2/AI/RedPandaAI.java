package net.windward.Windwardopolis2.AI;

import net.windward.Windwardopolis2.api.CoffeeStore;

public class RedPandaAI extends MyPlayerBrain {
    public RedPandaAI(String name) {
		super(name);
	}

	private void runCoffeeLogic() {
    	
    }
    
    protected void getClosestCoffee() {
    	float closestStore = -1; 
    	
    	for ( CoffeeStore shop : this.getCoffeeStores() ) {
    		shop.getBusStop();
    	}
    }
    
    private void isShopOnRoute() {
    	
    }
}
